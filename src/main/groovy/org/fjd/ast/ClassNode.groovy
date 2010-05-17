package org.fjd.ast

@Typed class ClassNode {

    String name
    ClassNode superClass
    FieldsNode fields = []
    ConstructorNode ctor
    MethodsNode methods = []

}
