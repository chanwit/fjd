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
            //            
            // structure group
            //
            case PROGRAM:   return visitProgram(node)
            case CLASS:     return visitClass(node)
            case FIELDS:    return visitFields(node)
            case CTOR:      return visitCtor(node)
            
            case ARGS:      return visitArgs(node)
            case ARG:       return visitArg(node)
            case CTOR_BODY: return visitCtorBody(node)
            
            case METHODS:   return null

            //
            // expression group
            //
            case EXPR :     return visitExpr(node)
            case NEW_EXPR:  return visitNewExpr(node)
            case CAST_EXPR: return visitCastExpr(node)
            case FIELD_ACCESS_EXPR:
                            return visitFieldAccessExpr(node)
            case METH_CALL_EXPR:
                            return visitMethodCallExpr(node)

            default: throw new Exception("NIY ${node.text}")
        }
    }
    
    ProgramNode visitProgram(Tree node) {
        assert node.text == 'PROGRAM'
        def ast = new ProgramNode()
        
        for(i in 0..<node.childCount) {
            def result = visit(node.getChild(i))
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

    ArgsNode visitArgs(Tree node) {
        ArgsNode args = []
        if(node==null) return args

        for(i in 0..<node.childCount) {
            args << visitArg(node.getChild(0))
        }
        return args
    }

    ArgNode visitArg(Tree node) {
        new ArgNode(
            type: visitType(node.getChild(0)),
            name: visitID(node.getChild(1))
        )
    }

    SuperStmtNode visitSuperStmt(Tree node) {
        // -> ^(SUPER_STMT argList?)
        new SuperStmtNode(
            arguments: visitArgs(node.getChild(0))
        )
    }
    
    FieldInitNode visitFieldInit(Tree node) {
        // -> ^(FIELD_INIT $field $value)
        new FieldInitNode(
            field: visitID(node.getChild(0)),
            value: visitID(node.getChild(1))
        )
    }
    
    List<FieldInitNode> visitFieldInits(Tree node) {
        List<FieldInitNode> fieldInits = []
        for(i in 0..<node.childCount) {
            fieldInits << visitFieldInit(node.getChild(i))
        }
        return fieldInits
    }

    ConstructorBodyNode visitCtorBody(Tree node) {
        // -> ^(CTOR_BODY superStmt fieldInits)   
        new ConstructorBodyNode(
            superStmt: visitSuperStmt(node.getChild(0)),
            fieldInits: visitFieldInits(node.getChild(1))
        )
    }

    ExprNode visitExpr(Tree node) {
        def expr = new ExprNode()
        for(i in 0..<node.childCount) {
            def result = visit(node.getChild(i))
            switch(result) {
                case ExprNode:
                    expr.add( result as ExprNode )
                    break
            }
        }
        return expr
    }
    
    //
    // never return null
    //
    ExprListNode visitExprList(Tree node) {                
        def result = new ExprListNode()
        if(node == null) return result

        for(i in 0..<node.childCount) {
            result << visit(node.getChild(i))
        }
        return result
    }

    NewExprNode visitNewExpr(Tree node) {
        ClassNode type = visitType(node.getChild(0))
        ExprListNode exprList = visitExprList(node.getChild(1))
        return new NewExprNode(
            type: type,
            arguments: exprList
        )        
    }

    CastExprNode visitCastExpr(Tree node) {
        return new CastExprNode()
    }

    FieldAccessExprNode visitFieldAccessExpr(Tree node) {
        return new FieldAccessExprNode()
    }

    MethodCallExprNode visitMethodCallExpr(Tree node) {
        return new MethodCallExprNode()
    }

    String visitID(Tree node) {
        assert node.type == ID
        return node.text
    }
    
    FieldsNode visitFields(Tree node) {
        FieldsNode result = []
        if(node.childCount==0) return result

        for(i in 0 ..< node.childCount) {
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
    
    ConstructorNode visitCtor(Tree node) {
        def ctorNode = new ConstructorNode()
        //
        // -> ^(CTOR $name argList? ctorBody)
        //
        
        //
        // constructor name
        //
        ctorNode.name = visitID(node.getChild(0))

        for(i in 1..<node.childCount) {
            def result = visit(node.getChild(i))
            switch(result) {
                case ArgsNode:
                    ctorNode.arguments = result as ArgsNode
                    break
                case ConstructorBodyNode:
                    ctorNode.body = result as ConstructorBodyNode
                    break
            }
        }

        return ctorNode
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

        for(i in 2..<node.childCount) {

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
            name: name,
            resolved: false
        )
    }

}
