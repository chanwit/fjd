package th.ac.sut.fjd.compiler

import th.ac.sut.fjd.compiler.AbstractTypeChecker;

class TypeChecker extends AbstractTypeChecker {

    String result = ''

    @Override
    void visit(String name) {
        result = result + ', ' + name
        println name
    }

}