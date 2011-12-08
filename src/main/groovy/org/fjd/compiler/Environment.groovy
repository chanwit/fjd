package org.fjd.compiler

import java.util.HashMap
import java.util.Stack

import org.fjd.ast.ClassNode
import org.fjd.ast.ExprNode
import org.fjd.ast.MethodNode

class Environment extends HashMap<ExprNode, ClassNode> {

    private Stack<ClassNode>  classStack  = new Stack<ClassNode>()
    private Stack<MethodNode> methodStack = new Stack<MethodNode>()

    ClassNode getCurrentClass() {
        classStack.peek()
    }
    MethodNode getCurrentMethod() {
        methodStack.peek()
    }
    void push(ClassNode c) {
        classStack.push(c)
    }
    void pop() {
        classStack.pop()
    }

    void pushMethod(MethodNode m) {
        methodStack.push(m)
    }
    void popMethod() {
        methodStack.pop()
    }
}