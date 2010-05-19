package org.fjd.compiler

import org.fjd.ast.*

@Typed class Rules {
    
    ClassTable CT

    boolean subClassOf(ClassNode c, ClassNode d) {
        //
        // ---------
        //  C <: C
        //
        if(c == d) return true
        
        // CT(C) = class C extend D { ... }
        // --------------------------------
        //             C <: D        
        if(CT[c.name] == c && c.superClass == d) return true
        
        return subClassOf(c.superClass, d)
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

    def override(String m, ClassNode D, List methTypeOfC) {
        def CBar, C0 = methTypeOfC
        def DBar, D0 = mtype(m, D)        
        return CBar == DBar && C0 == D0
        // else
        /// return true
    }
}