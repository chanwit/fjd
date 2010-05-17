package org.fjd.ast

@Typed class ClassNode {

    String name
    ClassNode superClass
    List<FieldNode> fields = []
    ConstructorNode ctor
    List<MethodNode> methods = []

}
