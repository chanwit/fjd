package th.ac.sut.fjd.classgen

import org.junit.Test

import th.ac.sut.fjd.FJDTestCase;
import th.ac.sut.fjd.compiler.ClassTable
import th.ac.sut.fjd.compiler.Environment

class AsmGenTests extends FJDTestCase {

    @Test
    void testGenCodes() {
        def gen = new AsmGenerator()
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
        gen.visit(programNode.classes[0])
    }

}
