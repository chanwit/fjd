package org.fjd.ast

@Typed class ClassNode {

    boolean resolved = false

    String name
    ClassNode superClass
    FieldsNode fields = []
    ConstructorNode ctor
    MethodsNode methods = []

}
