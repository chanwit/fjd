package th.ac.sut.fjd.compiler

import java.util.HashMap
import java.util.Stack

import th.ac.sut.fjd.ast.ClassNode
import th.ac.sut.fjd.ast.ExprNode
import th.ac.sut.fjd.ast.MethodNode

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