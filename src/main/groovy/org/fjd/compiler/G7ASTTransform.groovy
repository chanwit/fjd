package org.fjd.compiler

import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation
import org.objectweb.asm.Opcodes

import org.codehaus.groovy.ast.*

import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit

import java.util.List
import java.util.LinkedList

import org.mbte.groovypp.compiler.*

@GroovyASTTransformation(phase = CompilePhase.CONVERSION)
class G7ASTTransform implements ASTTransformation, Opcodes {

	static final String FJD_EXT = ".fjd"
	static final String G7_EXT  = ".g7"
	
    void visit(ASTNode[] nodes, SourceUnit source) {
        ModuleNode module = nodes[0]
        def toProcess     = new LinkedList<ClassNode>()
        final fileName    = source.name
        final forceTyped  = fileName.endsWith(FJD_EXT) || fileName.endsWith(G7_EXT)

        if(forceTyped) {
            for(c in module.classes) {
                c.addAnnotation new AnnotationNode(TypeUtil.TYPED)
                toProcess.add c
            }
        }
    }

}
