package org.fjd.ast

@Typed class ConstructorNode {

    String name
    List<ArgNode> arguments = []
    ConstructorBodyNode body

}