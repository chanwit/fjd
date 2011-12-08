package org.fjd.ast

class ExprNode {

    List<ExprNode> children = []

    void add(ExprNode node) {
        children << node
    }

}
