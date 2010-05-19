package org.fjd

import groovy.util.*
import org.antlr.runtime.*
import org.antlr.runtime.tree.*
import org.fjd.*
import org.fjd.compiler.*
import org.fjd.ast.*

@Typed abstract class FJDTestCase extends GroovyTestCase {

     protected ProgramNode compile(String str, ClassTable CT, Environment TT) {
        def input = new ANTLRStringStream(str)
        def lex = new FJDLexer(input)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def tree = parser.program().tree as Tree

        return new Generator(CT, TT).visit(tree) as ProgramNode        
    }

}