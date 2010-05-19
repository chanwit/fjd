package org.fjd

import groovy.util.*

import org.antlr.runtime.*
import org.antlr.runtime.*
import org.fjd.FJDLexer
import org.fjd.FJDParser
import org.antlr.runtime.tree.*

import org.fjd.ast.*
import org.fjd.compiler.*

@Typed class TestCompiler extends FJDTestCase {
    
    void test_1_Class_1_Expression() {
        def program1 = '''
    class A extends Object {
      Object x;
      A() {
        super();
      }
    }
    
    new A()
'''
        def CT = new ClassTable()
        def programNode = compile(program1, CT)

        def c = programNode.classes[0]
        assert c.name == 'A'
        c.superClass.name == 'Object'
        assert c.fields.size() == 1
        def x = c.fields[0]
        assert x.type.name == 'Object'
        assert x.name == 'x'
        
        def expr = programNode.expr
        assert expr instanceof ExprNode
        assert expr.children[0] instanceof NewExprNode
        def newExpr = expr.children[0] as NewExprNode
        assert newExpr.type.name == 'A'
        assert newExpr.arguments.size() == 0
    }
    
    void test_2_Class_1_Expression() {
        def program2 = '''
    class A extends Object {
        A() {
            super();
        }
    }
    
    class B extends A {
        Object x;
        B(Object x) {
            super();
            this.x = x;
        }
    }
    
    new B(new Object())
'''
        def CT = new ClassTable()
        def programNode = compile(program2, CT)

        assert programNode.classes.size() == 2
        assert programNode.expr != null

        def A = programNode.classes[0]
        assert A.name == 'A'

        //
        // it should be the same object in ClassTable
        //
        assert CT[A.name] == A
        def B = programNode.classes[1]
        assert B.name == 'B'
        
        assert B.fields[0].name == 'x'
        assert B.fields[0].type == CT["Object"]
        assert B.ctor instanceof ConstructorNode
        assert B.ctor.arguments.size() == 1
        assert B.ctor.arguments[0].name == 'x'
        assert B.ctor.arguments[0].type == CT['Object']
        
        def ctorBody = B.ctor.body
        assert ctorBody instanceof ConstructorBodyNode
        assert ctorBody.superStmt.arguments.size() == 0
        assert ctorBody.fieldInits.size() == 1
        assert ctorBody.fieldInits[0].field == 'x'
        assert ctorBody.fieldInits[0].value == 'x'
        
        def expr = programNode.expr
        assert expr.children[0] instanceof NewExprNode
        def newExpr = expr.children[0] as NewExprNode
        assert newExpr.type == CT['B']
        assert newExpr.arguments[0] instanceof NewExprNode
        assert (newExpr.arguments[0] as NewExprNode).type == CT['Object']
    }
    
    void test_MethodCall_and_FieldAccess() {
        def program = '''
    class A extends Object {
        A() {
            super();
        }
        Object method() {
            return new Object();
        }
    }
    
    new A().method((Object)new A()).field
'''
        def CT = new ClassTable()
        def p = compile(program, CT)

        def A = p.classes[0]
        assert A == CT['A']
        assert A.fields.size() == 0
        assert A.ctor != null
        assert A.methods.size() == 1
        def method = A.methods[0]
        assert method.name == 'method'
        assert method.returnType == CT['Object']
        assert method.arguments.size() == 0
        assert method.body != null
        def body = method.body
        assert body.expr.children[0] instanceof NewExprNode
        def newExpr = body.expr.children[0] as NewExprNode
        assert newExpr.type == CT['Object']
        assert newExpr.arguments.size() == 0

        def evalExpr = p.expr
        assert evalExpr.children[0] instanceof FieldAccessExprNode
        def f = (evalExpr.children[0] as FieldAccessExprNode)
        assert f.field == 'field'
               
        assert f.children[0] instanceof MethodCallExprNode
        def m = f.children[0] as MethodCallExprNode
        assert m.name == 'method'
        assert m.exprList[0] instanceof CastExprNode

        assert m.children[0] instanceof NewExprNode
    }
}