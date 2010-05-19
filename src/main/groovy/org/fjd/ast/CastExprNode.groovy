package org.fjd.ast

@Typed class CastExprNode extends ExprNode {
    ClassNode type
    ExprNode  expr
}