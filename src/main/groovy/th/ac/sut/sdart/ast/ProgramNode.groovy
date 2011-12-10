package th.ac.sut.sdart.ast

class ProgramNode {

    List<ClassNode> classes = []
    List<FunctionNode> functions = []
    ExprNode expr = null

    void addClass(ClassNode node) {
        classes.add(node)
    }

    void addFunction(FunctionNode node) {
        functions.add(node)
    }
}
