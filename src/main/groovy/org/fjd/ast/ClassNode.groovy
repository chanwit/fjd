package org.fjd.ast

@Typed class ClassNode {

    boolean resolved = false

    String name
    ClassNode superClass
    List<FieldNode> fields = []
    ConstructorNode ctor
    List<MethodNode> methods = []

}
