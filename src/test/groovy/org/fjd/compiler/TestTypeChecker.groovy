package org.fjd.compiler

import org.fjd.FJDTestCase

class TestTypeChecker extends FJDTestCase {

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
        def TT = new Environment()
        def CT = new ClassTable()
        def programNode = compile(program1, CT, TT)
        def tc = new TypeChecker()
        tc.visit(programNode)
        assert tc.result == ', A, Object, Object, x, A'
    }
}