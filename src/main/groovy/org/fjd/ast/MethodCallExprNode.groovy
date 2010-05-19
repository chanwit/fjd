package org.fjd.ast

@Typed class MethodCallExprNode extends ExprNode {
    String name
    List<ExprNode> exprList = []
}