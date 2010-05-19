package org.fjd.compiler

import groovy.util.*
import org.antlr.runtime.*
import org.antlr.runtime.tree.*
import org.fjd.*
import org.fjd.ast.*

@Typed class TestTypeChecker extends FJDTestCase {
    
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