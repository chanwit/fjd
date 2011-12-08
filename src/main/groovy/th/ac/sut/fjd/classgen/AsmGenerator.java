package th.ac.sut.fjd.classgen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import th.ac.sut.fjd.ast.ClassNode;
import th.ac.sut.fjd.compiler.AbstractClassVisitor;

public class AsmGenerator extends AbstractClassVisitor implements Opcodes {

    @Override
    public void visit(ClassNode classNode) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        ClassNode superClassNode = classNode.getSuperClass();
        if(superClassNode != null) {
            cw.visit(Opcodes.V1_7, ACC_PUBLIC, classNode.getName(), null, superClassNode.getName(), null);
        } else {
            cw.visit(Opcodes.V1_7, ACC_PUBLIC, classNode.getName(), null, Type.getInternalName(Object.class), null);
        }

        super.visit(classNode);

        cw.visitEnd();
        try {
            FileOutputStream fos = new FileOutputStream("out/" + classNode.getName() + ".class");
            fos.write(cw.toByteArray());
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
