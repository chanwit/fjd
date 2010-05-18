package org.fjd.compiler

import groovy.util.*
import org.antlr.runtime.*
import org.antlr.runtime.tree.*
import org.fjd.*
import org.fjd.ast.*

@Typed class TestTypeChecker extends GroovyTestCase {

    private ProgramNode compile(String str, ClassTable CT) {
        def input = new ANTLRStringStream(str)
        def lex = new FJDLexer(input)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def tree = parser.program().tree as Tree

        return new Generator(CT).visit(tree) as ProgramNode        
    }
    
    void testRunTypeChecker() {
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
        def tc = new TypeChecker()
        tc.visit(programNode)
        assert tc.result == ', A, Object, Object, x, A'
    }       
}