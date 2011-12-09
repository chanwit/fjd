package th.ac.sut.fjd.classgen

import java.io.PrintWriter
import java.io.StringWriter

import org.junit.Test
import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.ClassNode as CN
import org.objectweb.asm.util.CheckClassAdapter

import th.ac.sut.fjd.FJDTestCase
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

        def result = verifyGeneratedClass(gen.byteArray)
        assertTrue(result, result.length()==0)

        def cr = new ClassReader(gen.byteArray)

        CN cn = new CN()
        cr.accept(new CheckClassAdapter(cn, false), ClassReader.SKIP_DEBUG)
        assert cn.name == 'A'
        assert cn.superName == 'Object'
        assert cn.fields.size() == 1
        assert cn.fields.get(0).name == 'x'
        assert cn.fields.get(0).desc == 'LObject;'
    }

}
