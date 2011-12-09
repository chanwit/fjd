package th.ac.sut.fjd.classgen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import th.ac.sut.fjd.ast.ClassNode;
import th.ac.sut.fjd.ast.FieldNode;
import th.ac.sut.fjd.compiler.AbstractClassVisitor;

public class AsmGenerator extends AbstractClassVisitor implements Opcodes {

    private byte[] byteArray;
    private ClassVisitor cv;

    protected String I(Class<?> c) {
        return Type.getInternalName(c);
    }

    protected String L(Class<?> c) {
        return Type.getDescriptor(c);
    }

    protected String L(String s) {
        if(s.startsWith("L") && s.endsWith(";"))
            return s;
        else
            return "L" + s + ";";
    }

    protected String L(ClassNode type) {
        return L(type.getName());
    }


    @Override
    public void visit(ClassNode classNode) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        ClassNode superClassNode = classNode.getSuperClass();
        if(superClassNode != null) {
            cw.visit(Opcodes.V1_7, ACC_PUBLIC, classNode.getName(), null, superClassNode.getName(), null);
        } else {
            cw.visit(Opcodes.V1_7, ACC_PUBLIC, classNode.getName(), null, I(Object.class), null);
        }

        cv = cw;

        super.visit(classNode);

        cw.visitEnd();

        this.byteArray = cw.toByteArray();

        try {
            FileOutputStream fos = new FileOutputStream("out/" + classNode.getName() + ".class");
            fos.write(this.byteArray);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void visit(FieldNode f) {
        super.visit(f);
        cv.visitField(ACC_PUBLIC, f.getName(), L(f.getType()), null, null);
    }


    public byte[] getByteArray() {
        return this.byteArray;
    }



}
