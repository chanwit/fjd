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
            case PROGRAM: return visitProgram(node)
            case CLASS:   return visitClass(node)
            case EXPR :   return visitExpr(node)
            case FIELDS:  return visitFields(node)
        }
    }
    
    ProgramNode visitProgram(Tree node) {
        assert node.text == 'PROGRAM'
        def ast = new ProgramNode()
        
        for(i in 0..node.childCount-1) {
            Object result = visit(node.getChild(i))
            switch(result) {
                case ClassNode:
                    ast.addClass(result as ClassNode)
                    break
                case ExprNode:
                    ast.expr = result as ExprNode
                    break
            }
        }

        return ast
    }

    ExprNode visitExpr(Tree node) {
        new ExprNode()
    }

    String visitID(Tree node) {
        assert node.type == ID
        return node.text
    }
    
    FieldsNode visitFields(Tree node) {
        FieldsNode result = []
        for(i in 0..node.getChildCount()-1) {
            result << visitField(node.getChild(i))
        }
        return result
    }
    
    FieldNode visitField(Tree node) {
        assert node.text == 'FIELD'
        ClassNode type = visitType(node.getChild(0))
        String name = visitID(node.getChild(1))

        return new FieldNode(type: type, name: name)
    }
    
    ClassNode visitType(Tree node) {
        assert node.text == 'TYPE'
        String name = visitID(node.getChild(0))

        if(CT.containsKey(name)) {
            return CT[name]
        }

        return new ClassNode(
            name: name,
            resolved: false
        )
    }

    ClassNode visitClass(Tree node) {
        assert node.text == "CLASS"
        String name = visitID(node.getChild(0))

        ClassNode c = null
        if(CT.containsKey(name)) {
            c = CT[name]
            if(c.resolved) return c // already resolved, can be return
        }
        ClassNode superClassNode = visitSuperClass(node.getChild(1))
        if(c == null) {
            c = new ClassNode(
                name: name,
                superClass: superClassNode,
                resolved: true
            )
        } else {
            c.superClass = superClassNode
            c.resolved = true
        }

        for(i in 2..node.getChildCount()-1) {

            Object result = visit(node.getChild(i))
            switch(result) {
                case FieldsNode:
                    c.fields = result as FieldsNode
                    break
                case ConstructorNode:
                    c.ctor = result as ConstructorNode
                    break
                case MethodsNode: 
                    c.methods = result as MethodsNode
                    break
            }

        }
        
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
