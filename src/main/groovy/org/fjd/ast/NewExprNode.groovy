package org.fjd.ast

@Typed class NewExprNode extends ExprNode {

    ClassNode type
    List<ExprNode> arguments = []

}