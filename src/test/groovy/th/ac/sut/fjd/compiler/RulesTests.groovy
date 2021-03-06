package th.ac.sut.fjd.compiler

import th.ac.sut.fjd.FJDTestCase
import th.ac.sut.fjd.ast.ClassNode
import th.ac.sut.fjd.ast.NewExprNode

import th.ac.sut.fjd.RejectException
import th.ac.sut.fjd.compiler.ClassTable
import th.ac.sut.fjd.compiler.Environment
import th.ac.sut.fjd.compiler.Rules

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
        def TT = new Environment()
        def programNode = compile(program, CT, TT)
        def r = new Rules(CT: CT)
        def A = CT['A']
        def B = CT['B']
        def C = CT['C']
        assert r.subClassOf(B, A) == true
        assert r.subClassOf(A, A) == true
        assert r.subClassOf(C, A) == true
        assert r.subClassOf(C, CT['Object']) == true
    }

    void test_subClassOf_List() {
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
        def TT = new Environment()
        def programNode = compile(program, CT, TT)
        def r = new Rules(CT: CT)
        def A = CT['A']
        def B = CT['B']
        def C = CT['C']
        def O = ClassTable.object
        assert r.subClassOf([B,  B], [A,  A]) == true
        assert r.subClassOf([A,B,C], [A,B,C]) == true
        assert r.subClassOf([B,C,B], [O,O,O]) == true
        assert r.subClassOf([B,C,B], [A,B,C]) == false
        assert r.subClassOf([B,C,B], [A,A,A]) == true
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
        def TT = new Environment()
        def programNode = compile(program, CT, TT)
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
        def TT = new Environment()
        def programNode = compile(program, CT, TT)
        def r = new Rules(CT: CT)
        def A = CT['A']
        def B = CT['B']
        def method = B.methods.find { it.name == 'method' }
        def (x, e) = r.mbody(method, B)
        assert x == ['a','b']
        assert e.children[0] instanceof NewExprNode
        def n = e.children[0] as NewExprNode
        assert n.type == CT['Object']
        assert n.arguments.size() == 0
    }

    void test_T_EXPR_and_T_METHOD() {
        def program = '''
    class A extends Object {
        A() {
            super();
        }
        A getThis() {
            return this;
        }
    }

    new A().getThis()
'''
        def CT = new ClassTable()
        def TT = new Environment()
        def programNode = compile(program, CT, TT)
        def r = new Rules(CT: CT, TT: TT)
        def A = CT['A'] as ClassNode

        ClassNode c = r.T_EXPR(programNode.expr.children[0])
        assert c == A

        def getThis = A.methods.find { it.name = 'getThis' }
        r.T_METHOD(getThis, A)
        r.T_CLASS(A)
    }

    void test_T_METHOD_should_fail() {
        def program = '''
    class A extends Object {
        A() {
            super();
        }
        X getThis() {
            return this;
        }
    }

    new A()
'''
        def CT = new ClassTable()
        def TT = new Environment()
        def programNode = compile(program, CT, TT)
        def r = new Rules(CT: CT, TT: TT)

        def A = CT['A'] as ClassNode
        def getThis = A.methods.find { it.name = 'getThis' }
        try {
            r.T_METHOD(getThis, A)
            fail("Fail here")
        }catch(RejectException e) {
            assert e != null
        }
        try { r.T_CLASS(A); fail("Fail here") } catch(RejectException e) {}
    }
}