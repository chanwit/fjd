package org.fjd.compiler

import org.fjd.ast.*
import org.antlr.runtime.tree.Tree
import static org.fjd.FJDParser.*

@Typed class Generator {

    private ClassTable CT
    private ProgramNode ast
    private def parent
    
    Generator(ClassTable CT) {
        this.CT = CT
    }
    
    Object visit(Tree node) {
        switch(node.type) {
            case PROGRAM: return visitProgram(node);
            case CLASS:   return visitClass(node);
            case EXPR :   return visitExpr(node);
        }
    }
    
    ProgramNode visitProgram(Tree node) {
        assert node.text == 'PROGRAM'
        def ast = new ProgramNode()
        
        for(i in 0..node.childCount-1) {
            Object result = visit(node.getChild(i))
            switch(result) {
                case ClassNode: ast.addClass(result as ClassNode)
                case ExprNode : ast.expr = result as ExprNode
            }
        }

        return ast
    }

    ExprNode visitExpr(Tree node) {
        new ExprNode()
    }

    String visitID(Tree node) {
        assert node.type == 'ID'
        return node.text
    }
    
    ClassNode visitClass(Tree node) {
        assert node.text == "CLASS"
        String name = visitID(node.getChild(0))
        
        if(CT.containsKey(name)) {
            def c = CT[name]
            if(c.superClass) return c // already resolved, can be return
        }

        ClassNode superClassNode = visitSuperClass(node.getChild(1))
        def c = new ClassNode(
            name: name,
            superClass: superClassNode
        )
        CT[name] = c
        return c
    }
    
    ClassNode visitSuperClass(Tree node) {
        assert node.text == "SUPER_CLASS"
        String name = visitID(node.getChild(0))

        if(CT.containsKey(name)) {
            return CT[name]
        }

        return new ClassNode(
            name: name // information is not known until everything resolved
        )
    }

}
