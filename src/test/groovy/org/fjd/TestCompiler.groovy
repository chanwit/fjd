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
        def input = new ANTLRStringStream(program1)

        def lex = new FJDLexer(input)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def tree = parser.program().tree as Tree;

        def CT = new ClassTable()
        def programNode = new Generator(CT).visit(tree) as ProgramNode

        def c = programNode.classes[0]
        assert c.name == 'A'
        c.superClass.name == 'Object'
        assert c.fields.size() == 1
        def x = c.fields[0]
        assert x.type.name == 'Object'
        assert x.name == 'x'        
        assert programNode.expr instanceof ExprNode
    }
    
}