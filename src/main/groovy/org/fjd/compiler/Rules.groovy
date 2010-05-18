package org.fjd.compiler

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
    
    List<FieldNode> fields(Class c) {
        if(c == CT['Object']) return []
        def d = c.superClass
        return fields(d) + c.fields
    }
    
    def mbody(String m, ClassNode c) {
        if(c == CT['Object']) return null
        def M = c.methods.find { it.name == m }
        if(M) {
            return [M.arguments, M.body.expr]
        }
        return mbody(m, c.superClass)        
    }
    
    def mtype(String m, ClassNode c) {
        if(c == CT['Object']) return null
        def M = c.methods.find { it.name == m }
        if(M) {            
            return [M.arguments.collect { it.type }, M.returnType]
        }
        return mtype(m, c.superClass)
    }
}