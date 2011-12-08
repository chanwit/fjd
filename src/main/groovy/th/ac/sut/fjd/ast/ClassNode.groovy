package th.ac.sut.fjd.ast

class ClassNode {

    boolean resolved = false

    String name
    ClassNode superClass = null
    List<FieldNode> fields = []
    ConstructorNode ctor = null
    List<MethodNode> methods = []

}
