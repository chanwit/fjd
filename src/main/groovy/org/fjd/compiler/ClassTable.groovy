package org.fjd.compiler

import java.util.*
import org.fjd.ast.*

@Typed class ClassTable extends HashMap<String, ClassNode>{

    static final object  =  new ClassNode(
                                name: "Object",
                                resolved: true
                            )

    static final dynamic =  new ClassNode(
                                name: "Dynamic",
                                resolved: true
                            )

    ClassTable() {
        super()
        this["Object"]  = object
        this['Dynamic'] = dynamic
    }

}