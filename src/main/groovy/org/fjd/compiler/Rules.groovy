package org.fjd.compiler

import org.fjd.RejectException
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

    List mbody(MethodNode m, ClassNode c) {
        if(c == CT['Object']) return null
        def M = c.methods.find { it == m }
        if(M) {
            return [M.arguments.collect { it.name } as String[], M.body.expr]
        }
        return mbody(m, c.superClass)
    }

    List mtype(MethodNode m, ClassNode c) {
        if(c == CT['Object'])
            return null

        def M = c.methods.find { it == m }
        if(M) {
            return [M.arguments.collect { it.type } as List<ClassNode>, M.returnType]
        }
        return mtype(m, c.superClass)
    }

    @Typed(TypePolicy.DYNAMIC)
    def override(MethodNode m, ClassNode D, List methTypeOfC) {

        if(mtype(m, D) == null) return true

        def (CBar, C0) = methTypeOfC
        def (DBar, D0) = mtype(m, D)

        return (CBar == DBar) && (C0 == D0)

    }

    ClassNode T_EXPR(ExprNode e) {
        switch(e) {
            case ThisExprNode:
                    return T_VAR(e)
            case ValueExprNode:
                    return T_VAR(e)
            case NewExprNode:
                    return T_NEW(e)
            case FieldAccessExprNode:
                    return T_FIELD(e)
            case MethodCallExprNode:
                    return T_INVK(e)
            case CastExprNode:
                    return T_CAST(e)
        }
    }

    ClassNode T_VAR(ExprNode x) {
        def c = TT.get(x)
        if(c)
            return c

        throw new RejectException("Variable ${x} is not in the environment TT.")
    }

    @Typed(TypePolicy.DYNAMIC)
    ClassNode T_NEW(NewExprNode e) {
        def C = e.type
        def eBar = e.arguments
        def fields = fields(C)
        def DBar = fields.collect { it.type    }
        def CBar = eBar.collect   { T_EXPR(it) }

        if(subClassOf(CBar, DBar))
            return C

        throw new RejectException("T_NEW: Type of ${e} not correct: ${C.name}.")
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

        throw new RejectException("T_CAST: Type of ${c} not correct: ${C.name}.")
    }

    ClassNode T_FIELD(FieldAccessExprNode f) {
        def C = T_EXPR(f.children[0])
        def fields = fields(C)
        def field  = fields.find { it.name == f.field }
        if(field)
            return field.type

        throw new RejectException("T_FIELD: Type of ${f} not correct: ${field.type.name}")
    }

    @Typed(TypePolicy.DYNAMIC)
    ClassNode T_INVK(MethodCallExprNode m) {
        //
        // e.m(eBar) : Cr
        //
        // m.children[0] is e
        // m.exprList is eBar
        //
        def C = T_EXPR(m.children[0])
        def M = C.methods.find { it.name == m.name }
        if(M) {
            def (DBar, Cr) = mtype(M, C)
            def CBar = m.exprList.collect { T_EXPR(it) }
            if(subClassOf(CBar, DBar))
                return Cr
        }

        throw new Exception("T_INVK: Type of method ${m} not correct: ${Cr.name}")
    }

    //
    // M OK in C ?
    //
    void T_METHOD(MethodNode mn, ClassNode C) {

        if (C.methods.find { it == mn } != mn)
            throw new Exception("Reject ${mn}, ${C}")

        def CBar = mn.arguments.collect { it.type }
        def e  = mn.body.expr.children[0]
        def Ce = T_EXPR(e)
        def Cr = mn.returnType
        def D  = C.superClass

        if(subClassOf(Ce, Cr)) {
            if(override(mn, D, [CBar, Cr])) {
                return
            }
        }

        throw new RejectException("Method ${mn.name} not OK in ${C.name}")
    }
 
    //
    // C OK ?   
    //
    @Typed(TypePolicy.DYNAMIC)
    void T_CLASS(ClassNode C) {
        def D = C.superClass
        def K = C.ctor
        if(K.name != C.name)
            throw new RejectException("Constructor name is not correct ${K.name}")

        def Kbody = C.ctor.body
        def DBar_CBar = Kbody.superStmt.arguments.collect { it.type }
        def gBar_fBar = Kbody.superStmt.arguments.collect { it.name }
        
        def DBar = fields(D).collect { it.type }
        def gBar = fields(D).collect { it.name }
        
        def CBar = C.fields.collect  { it.type }
        def fBar = C.fields.collect  { it.name }

        Kbody.fieldInits.inject(0) { i, fi ->
            if(fi.field != fi.value)     
                throw new RejectException("Reject ${C}")
            if(fi.field != fBar[i].name)
                throw new RejectException("Reject ${C}")
            i + 1
        }
        if(DBar_CBar != (DBar + CBar))
            throw new RejectException("Reject ${C}")
        if(gBar_fBar != (gBar + fBar))
            throw new RejectException("Reject ${C}")

        C.methods.each {
            T_METHOD(it, C)
        }
    }
}