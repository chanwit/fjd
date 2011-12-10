package th.ac.sut.sdart.compiler

import th.ac.sut.sdart.ast.ClassNode

class ClassTable {

    static ClassNode Dynamic = new ClassNode(name:"Dynamic", resolved: true)
    static ClassNode Object  = new ClassNode(name:"Object",  resolved: true)

}
