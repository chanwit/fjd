package org.fjd.compiler

import java.util.HashMap

import org.fjd.ast.ClassNode

class ClassTable extends HashMap<String, ClassNode>{

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