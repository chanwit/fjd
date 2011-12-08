package th.ac.sut.fjd

import groovy.util.GroovyTestCase

import org.antlr.runtime.ANTLRStringStream
import org.antlr.runtime.CommonTokenStream
import org.antlr.runtime.tree.Tree
import th.ac.sut.fjd.ast.ProgramNode
import th.ac.sut.fjd.compiler.ClassTable
import th.ac.sut.fjd.compiler.Environment
import th.ac.sut.fjd.compiler.Generator

import th.ac.sut.fjd.FJDLexer
import th.ac.sut.fjd.FJDParser

abstract class FJDTestCase extends GroovyTestCase {

     protected ProgramNode compile(String str, ClassTable CT, Environment TT) {
        def input = new ANTLRStringStream(str)
        def lex = new FJDLexer(input)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def tree = parser.program().tree as Tree

        return new Generator(CT, TT).visit(tree) as ProgramNode
    }

}