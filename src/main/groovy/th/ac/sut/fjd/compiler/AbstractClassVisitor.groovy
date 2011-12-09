package th.ac.sut.fjd.compiler

import th.ac.sut.fjd.ast.*

abstract class AbstractClassVisitor {

    void visit(ProgramNode program) {
        for(c in program.classes) {
            visit(c)
        }
        visit(program.expr)
    }

    void visit(ClassNode c) {
        visit(c.name)
        if(c.name != "Object") visit(c.superClass.name)
        for(f in c.fields) {
            visit(f)
        }
        if(c.ctor) visit(c.ctor)
        for(m in c.methods) {
            visit(m)
        }
    }

    void visit(FieldNode f) {
        if(f==null) return
        visit(f.type.name)
        visit(f.name)
    }

    void visit(ConstructorNode c) {
        if(c==null) return
        visit(c.name)
        for(a in c.arguments) {
            visit(a)
        }
        visit(c.body)
    }

    void visit(ConstructorBodyNode c) {
        if(c==null) return
        visit(c.superStmt)
        for(f in c.fieldInits) {
            visit(f)
        }
    }

    void visit(FieldInitNode f) {
        if(f==null) return
        visit(f.field)
        visit(f.value)
    }

    void visit(ArgNode a) {
        if(a==null) return
        visit(a.type.name)
        visit(a.name)
    }

    void visit(SuperStmtNode s) {
        if(s==null) return
        for(a in s.arguments) {
            visit(a)
        }
    }

    void visit(MethodNode m) {
        if(m==null) return
        visit(m.returnType)
        visit(m.name)
        for(a in m.arguments) {
            visit(a)
        }
        visit(m.body)
    }

    void visit(MethodBodyNode m) {
        if(m==null) return
        visit(m.expr)
    }

    void visit(ExprNode e) {
        if(e==null) return
        for(c in e.children) {
            switch(c) {
                case NewExprNode:
                    visit(c as NewExprNode)
                    break

                default: throw new Exception("NIY ${c.class}")
            }
        }
    }

    void visit(String name) {
    }

}