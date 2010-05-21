package org.fjd.compiler

import org.fjd.ast.*

@Typed class Rules {

    ClassTable CT
    Environment TT

    boolean subClassOf(ClassNode c, ClassNode d) {
        //
        // special cases
        //
        if (c == ClassTable.object && c == d) return true        
        if (c == ClassTable.object && c != d) return false
        
        //
        // ---------
        //  C <: C
        //
        if(c == d) return true

        // CT(C) = class C extend D { ... }
        // --------------------------------
        //             C <: D
        
        ClassNode superClass = c.superClass? c.superClass: ClassTable.object
        if(CT[c.name] == c && superClass == d) return true

        return subClassOf(superClass, d)
    }

    boolean subClassOf(List<ClassNode> CBar, List<ClassNode> DBar) {
        for(i in 0..<CBar.size()) {
            def C = CBar[i]
            def D = DBar[i]
            if(subClassOf(C, D)==false) return false
        }
        return true
    }

    List<FieldNode> fields(ClassNode c) {
        if(c == CT['Object']) return []
        def d = c.superClass
        return fields(d) + c.fields
    }

    List mbody(String m, ClassNode c) {
        if(c == CT['Object']) return null
        def M = c.methods.find { it.name == m }
        if(M) {
            return [M.arguments.collect { it.name } as String[], M.body.expr]
        }
        return mbody(m, c.superClass)
    }

    List mtype(String m, ClassNode c) {
        if(c == CT['Object']) return null
        def M = c.methods.find { it.name == m }
        if(M) {
            return [M.arguments.collect { it.type } as ClassNode[], M.returnType]
        }
        return mtype(m, c.superClass)
    }

    @Typed(TypePolicy.DYNAMIC)
    def override(String m, ClassNode D, methTypeOfC) {

        if(mtype(m, D) == null) return true

        def (CBar, C0) = methTypeOfC
        def (DBar, D0) = mtype(m, D)

        return (CBar == DBar) && (C0 == D0)

    }

    ClassNode T_EXPR(ExprNode e) {
        switch(e) {
            case ThisExprNode: return T_VAR(e)
            case ValueExprNode: return T_VAR(e)
            case NewExprNode: return T_NEW(e)
            case FieldAccessExprNode: return T_FIELD(e)
            case MethodCallExprNode: return T_INVK(e)
            case CastExprNode: return T_CAST(e)
        }
    }

    ClassNode T_VAR(ExprNode x) {
        return TT.get(x)
    }
    
    @Typed(TypePolicy.DYNAMIC)    
    ClassNode T_NEW(NewExprNode e) {
        def C = e.type
        def eBar = e.arguments
        def fields = fields(C)
        def DBar = fields.collect { it.type }
        def CBar = eBar.collect { T_EXPR(it) }
        if(subClassOf(CBar, DBar)) {
            return C
        }
    }
    
    ClassNode T_CAST(CastExprNode c) {
        //
        // (C)e: C
        //
        def e = c.expr
        def C = c.type   
             
        def D = T_EXPR(e)
        if(subClassOf(C, D) || subClassOf(D, C)) {
            return C
        }
    }

    @Typed(TypePolicy.DYNAMIC)
    ClassNode T_FIELD(FieldAccessExprNode f) {
        ClassNode C = T_EXPR(f.children[0])
        List<FieldNode> fields = fields(C)
        return (fields.find { it.name == f })?.type
    }

    @Typed(TypePolicy.DYNAMIC)
    ClassNode T_INVK(MethodCallExprNode m) {
        //
        // e.m(eBar) : Cr
        // 
        // m.children[0] is e
        // m.exprList is eBar
        //
        ClassNode C = T_EXPR(m.children[0])
        def (DBar, Cr) = mtype(m.name, C)
        def CBar = m.exprList.collect { T_EXPR(it) }
        if(subClass(CBar, DBar))
            return Cr
        else 
            return null    
    }
}