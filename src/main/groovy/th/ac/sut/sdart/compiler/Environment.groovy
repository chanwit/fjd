package th.ac.sut.sdart.compiler

import java.util.HashMap
import java.util.Stack

import th.ac.sut.sdart.ast.ClassNode
import th.ac.sut.sdart.ast.ExprNode
import th.ac.sut.sdart.ast.FunctionNode

class Environment extends HashMap<ExprNode, ClassNode> {

    private Stack<ClassNode>  classStack  = new Stack<ClassNode>()
    private Stack<FunctionNode> methodStack = new Stack<FunctionNode>()

    ClassNode getCurrentClass() {
        classStack.peek()
    }

    FunctionNode getCurrentMethod() {
        methodStack.peek()
    }

    void push(ClassNode c) {
        classStack.push(c)
    }
    void pop() {
        classStack.pop()
    }

    void pushMethod(FunctionNode m) {
        methodStack.push(m)
    }

    void popMethod() {
        methodStack.pop()
    }
}
