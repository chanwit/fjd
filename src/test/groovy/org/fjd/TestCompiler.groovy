package org.fjd

import groovy.util.*

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.fjd.FJDLexer;
import org.fjd.FJDParser;
import org.antlr.runtime.tree.*;

import org.fjd.compiler.*;

@Typed class TestCompiler extends GroovyTestCase {
    
    void testSomething() {
		def input = new ANTLRFileStream("src/test/groovy/org/fjd/Program1.fjd", "UTF-8")
		def lex = new FJDLexer(input)
		def tokens = new CommonTokenStream(lex)
		def parser = new FJDParser(tokens)
		def tree = parser.program().tree as Tree;
		new Generator(tree).visit();
    }
    
}