package org.fjd.compiler;

import org.codehaus.groovy.transform.ASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;
import org.objectweb.asm.Opcodes;

import org.codehaus.groovy.ast.*;

import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;

import java.util.List;
import java.util.LinkedList;

@GroovyASTTransformation(phase = CompilePhase.CONVERSION)
public class G7ASTTransform implements ASTTransformation, Opcodes {

    public void visit(ASTNode[] nodes, final SourceUnit source) {
        ModuleNode module = (ModuleNode)nodes[0];
        List<ClassNode> toProcess = new LinkedList<ClassNode>();
        final boolean forceTyped = source.getName().endsWith(".fjd") || source.getName().endsWith(".g7");
        
        if(forceTyped) {
        	System.out.println("OK");
        }
    }

}
