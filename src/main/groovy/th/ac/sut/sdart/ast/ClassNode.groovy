package th.ac.sut.sdart.ast

class ClassNode {

    boolean resolved = false

    String name

    ClassNode superClass

    List<FieldNode>    fields  = []
    ConstructorNode    ctor
    List<FunctionNode> methods = []

}
