package org.fjd.compiler

import java.util.*
import org.fjd.ast.*

@Typed class ClassTable extends HashMap<String, ClassNode>{
    
    static final object = new ClassNode(name: "Object", superClass: object)
    
    ClassTable() {
        super()
        this["Object"] = object
    }
    
}