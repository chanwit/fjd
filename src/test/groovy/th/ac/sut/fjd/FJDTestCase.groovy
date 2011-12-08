package th.ac.sut.fjd

import groovy.util.GroovyTestCase

import org.antlr.runtime.ANTLRStringStream
import org.antlr.runtime.CommonTokenStream
import org.antlr.runtime.tree.Tree
import th.ac.sut.fjd.ast.ProgramNode
import th.ac.sut.fjd.compiler.ClassTable
import th.ac.sut.fjd.compiler.Compiler;
import th.ac.sut.fjd.compiler.Configuration;
import th.ac.sut.fjd.compiler.Environment
import th.ac.sut.fjd.compiler.TreeWalker

import th.ac.sut.fjd.FJDLexer
import th.ac.sut.fjd.FJDParser

abstract class FJDTestCase extends GroovyTestCase {

     protected ProgramNode compile(String str, ClassTable CT, Environment TT) {
         Configuration config = new Configuration(CT: CT, TT: TT)
         Compiler compiler = new Compiler(config: config)
         return compiler.compile(str)
    }

}