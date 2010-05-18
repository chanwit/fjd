package org.fjd

import groovy.util.*

import org.antlr.runtime.*
import org.antlr.runtime.*
import org.fjd.FJDLexer
import org.fjd.FJDParser
import org.antlr.runtime.tree.*

import org.fjd.ast.*
import org.fjd.compiler.*

@Typed class TestCompiler extends GroovyTestCase {
    
    private ProgramNode compile(String str, ClassTable CT) {
        def input = new ANTLRStringStream(str)
        def lex = new FJDLexer(input)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def tree = parser.program().tree as Tree

        return new Generator(CT).visit(tree) as ProgramNode        
    }
    
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
            this x = x;
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
    }

}