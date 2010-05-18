package org.fjd.ast

@Typed class MethodNode {

    ClassNode returnType
    String name
    List<ArgNode> arguments = []
    MethodBodyNode body

}