package th.ac.sut.sdart.compiler

import java.util.List;

import org.antlr.runtime.tree.Tree

import th.ac.sut.fjd.ast.ClassNode;
import th.ac.sut.fjd.compiler.ClassTable
import th.ac.sut.sdart.ast.*

import static th.ac.sut.sdart.SDartParser.*

class TreeWalker {

    ClassTable  CT
    Environment TT

    TreeWalker(ClassTable CT, Environment TT) {
        this.CT = CT
        this.TT = TT
    }

    def visit(Tree node) {
        switch(node.type) {
            case PROGRAM:     return visitProgram(node)
            case FUNCTION:    return visitFunction(node)
            case CLASS:       return visitClass(node)
            case ID:	      return visitID(node)
            case SUPER_CLASS: return visitSuperClass(node)

            case FIELDS:      return visitFields(node)
            case FIELD:       return visitField(node)

            case ARG: 		  return visitArg(node)
            case ARGS: 		  return visitArgs(node)

            case CTOR: 		  return visitCtor(node)
            case CTOR_BODY:   return visitCtorBody(node)

            case EXPR_LIST:   return visitExprList(node)
            case FIELD_INIT_STMT:
                              return visitFieldInit(node)
            case FIELD_INIT_STMT_LIST:
                              return visitFieldInitList(node)
            case FUNC_BODY:   return visitFunctionBody(node)

            case TYPE: 		  return visitType(node)

            case SETTER: 	  return visitSetter(node)
            case GETTER: 	  return visitGetter(node)

            case MEMBERS: 	  return visitMembers(node)

            case STMT: 		  return visitStmt(node)
            case SUPER_STMT:  return visitSuperStmt(node)
            case RETURN_STMT: return visitReturnStmt(node)
            case ASSIGN_STMT: return visitAssignStmt(node)

            case EXPR: 		  return visitExpr(node)
            case THIS_EXPR:   return visitThisExpr(node)
            case CAST_EXPR:   return visitCastExpr(node)
            case METH_CALL_EXPR:
                              return visitMethodCallExpr(node)
            case FUNC_CALL_EXPR:
                              return visitFunctionCallExpr(node)
            case NEW_EXPR:    return visitNewExpr(node)
            case FIELD_ACCESS_EXPR:
                              return visitFieldAccessExpr(node)
            case VALUE_EXPR:  return visitValueExpr(node)

            default:
                throw new Exception("NIY ${node.text}")
        }
    }

    //program
    //    : functionOrClassDecl+
    //      expr?
    //      -> ^(PROGRAM functionOrClassDecl+ ^(EXPR expr?))
    //    ;
    ProgramNode visitProgram(Tree node) {
        assert node.text == 'PROGRAM'
        def ast = new ProgramNode()
        for(i in 0..<node.childCount) {
            def result = visit(node.getChild(i))
            switch(result) {
                case ClassNode:
                    ast.addClass(result as ClassNode)
                case FunctionNode:
                    ast.addFunction(result as FunctionNode)
                case ExprNode:
                    ast.expr = result as ExprNode
            }
        }
    }

    //	functionDecl
    //	: returnType? name=ID '(' argList? ')' '=>' funcBody
    //	  -> ^(FUNCTION returnType? $name argList? funcBody)
    //	;
    FunctionNode visitFunction(Tree node) {
        assert node.text == 'FUNCTION'
        def ast = new FunctionNode()
        ast.returnType = ClassTable.Dynamic
        for(i in 0..<node.childCount) {
            Tree child = node.getChild(i)
            switch(child.type) {
                case TYPE:
                    ast.returnType = visit(child)
                case ID:
                    ast.name = visit(child)
                case ARGS:
                    ast.arguments = visit(child)
                case FUNC_BODY:
                    ast.body = visit(child)
            }
        }
    }

    //	classDecl
    //	: 'class' className=ID 'extends' superClass=ID '{'
    //		fieldDecls
    //		ctorDecl
    //		memberDecls
    //	  '}'
    //	  ->  ^(CLASS $className ^(SUPER_CLASS $superClass) fieldDecls ctorDecl memberDecls )
    //	;
    ClassNode visitClass(Tree node) {
        assert node.text == 'CLASS'

        String name = visit(node.getChild(0))
        ClassNode ast = getFromCT(CT, name)
        if(ast.resolved) return ast
        ast.superClass = visit(node.getChild(1))

        TT.push(ast)
        ast.fields  = visit(node.getChild(2)) as List<FieldNode>
        ast.ctor    = visit(node.getChild(3)) as ConstructorNode
        ast.methods = visit(node.getChild(4)) as List<FunctionNode>
        TT.pop()
        ast.resolved = true

        return ast
    }

    // ^(SUPER_CLASS $superClass)
    ClassNode visitSuperClass(Tree node) {
        assert node.text == "SUPER_CLASS"
        String name = visitID(node.getChild(0))
        return getFromCT(CT, name)
    }

    List<FieldNode> visitFields(Tree node) {
        List<FieldNode> result = []
        if(node.childCount==0) return result

        for(i in 0 ..< node.childCount) {
            result << visitField(node.getChild(i))
        }
        return result
    }

    FieldNode visitField(Tree node) {
        new FieldNode(
            type: visitType(node.getChild(0)),
            name: visitID(node.getChild(1))
        )
    }

    ClassNode visitType(Tree node) {
        assert node.text == 'TYPE'
        String name = visit(node.getChild(0)) as String
        return getFromCT(CT, name)
    }

    String visitID(Tree node) {
        assert node.type == ID
        return node.text
    }

    private ClassNode getFromCT(ClassTable CT, String name) {
        ClassNode cn
        if(CT.containsKey(name)) {
            cn = CT[name]
        } else {
            cn = new ClassNode(name: name, resolved: false)
            CT[name] = cn
        }
        return cn
    }

}
