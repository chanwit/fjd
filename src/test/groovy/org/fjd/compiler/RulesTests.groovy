package org.fjd.compiler

import groovy.util.*
import org.antlr.runtime.*
import org.antlr.runtime.tree.*
import org.fjd.*
import org.fjd.ast.*

@Typed class RulesTests extends GroovyTestCase {
    
    private ProgramNode compile(String str, ClassTable CT) {
        def input = new ANTLRStringStream(str)
        def lex = new FJDLexer(input)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def tree = parser.program().tree as Tree

        return new Generator(CT).visit(tree) as ProgramNode        
    }    
    
    void testSubClassOf() {
        def program = '''
    class A extends Object {
        A() {
            super();
        }
    }
    
    class B extends A {
        B() {
            super();
        }
    }
    
    class C extends B {
        C() {
            super();
        }
    }
    
    new A()
'''

        def CT = new ClassTable()
        def programNode = compile(program, CT)
        def r = new Rules(CT: CT)
        def A = CT['A']
        def B = CT['B']
        def C = CT['C']
        assert r.subClassOf(B, A) == true
        assert r.subClassOf(A, A) == true
        assert r.subClassOf(C, A) == true
        assert r.subClassOf(C, CT['Object']) == true

    }
}