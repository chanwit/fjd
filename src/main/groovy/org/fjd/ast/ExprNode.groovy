package org.fjd.ast

@Typed class ExprNode {

    List<ExprNode> children = []

    void add(ExprNode node) {
        children << node
    }

}
