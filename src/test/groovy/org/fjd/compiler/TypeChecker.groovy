package org.fjd.compiler

@Typed class TypeChecker extends AbstractTypeChecker {
 
    String result = ''

    @Override
    void visit(String name) {
        result = result + ', ' + name
        println name
    }

}