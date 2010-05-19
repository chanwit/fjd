package org.fjd.compiler

import groovy.util.*
import org.antlr.runtime.*
import org.antlr.runtime.tree.*
import org.fjd.*
import org.fjd.ast.*

class RulesTests extends FJDTestCase {

    void test_subClassOf() {
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
    
    void test_fields() {
        def program = '''
    class A extends Object {
        Object f1;
        A f2;
        A(Object f1, A f2) {
            super();
            this.f1 = f1;
            this.f2 = f2;
        }
    }
    
    class B extends A {
        A f3;
        Object f4;
        B(Object f1, A f2, A f3, Object f4) {
            super(f1, f2);
            this.f3 = f3;
            this.f4 = f4;
        }
    }
    
    new A()
'''
        def CT = new ClassTable()
        def programNode = compile(program, CT)
        def r = new Rules(CT: CT)
        def A = CT['A']
        def B = CT['B']

        assert r.fields(CT['Object']) == []
        def f_b = r.fields(B)
        assert f_b[0].name == 'f1'
        assert f_b[0].type == CT['Object']        
        assert f_b[1].name == 'f2'
        assert f_b[1].type == A
        assert f_b[2].name == 'f3'
        assert f_b[2].type == A        
        assert f_b[3].name == 'f4'
        assert f_b[3].type == CT['Object']
        
        def f_a = r.fields(A)        
        assert f_a[0].name == 'f1'
        assert f_a[1].name == 'f2'
    }

    void test_mbody() {
        def program = '''
    class A extends Object {
        Object f1;
        A f2;
        A(Object f1, A f2) {
            super();
            this.f1 = f1;
            this.f2 = f2;
        }
    }
    
    class B extends A {
        A f3;
        Object f4;
        B(Object f1, A f2, A f3, Object f4) {
            super(f1, f2);
            this.f3 = f3;
            this.f4 = f4;
        }
        Object method(A a, B b) {
            return new Object();
        }
    }
    
    new A()
'''
        def CT = new ClassTable()
        def programNode = compile(program, CT)
        def r = new Rules(CT: CT)
        def A = CT['A']
        def B = CT['B']

        def (x, e) = r.mbody('method', B)
        assert x == ['a','b']
        assert e.children[0] instanceof NewExprNode
        def n = e.children[0]
        assert n.type == CT['Object']
        assert n.arguments.size() == 0
    }
}