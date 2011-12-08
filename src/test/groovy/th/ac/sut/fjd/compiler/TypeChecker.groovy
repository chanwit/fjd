package th.ac.sut.fjd.compiler

import th.ac.sut.fjd.compiler.AbstractClassVisitor;

class TypeChecker extends AbstractClassVisitor {

    String result = ''

    @Override
    void visit(String name) {
        result = result + ', ' + name
        println name
    }

}