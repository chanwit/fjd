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
    
    void testSomething() {
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
        assert newExpr.type.name == "A"
        assert newExpr.arguments.size() == 0
    }

}