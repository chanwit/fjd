package th.ac.sut.fjd.compiler

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.*;

import th.ac.sut.fjd.FJDLexer;
import th.ac.sut.fjd.FJDParser;

class Compiler {

	static void main(String[] args) {
		def input = new ANTLRFileStream(args[0], "UTF-8")
		def lex = new FJDLexer(input)
		def tokens = new CommonTokenStream(lex)
		def parser = new FJDParser(tokens)
		def r = parser.program();
		println "tree ${(r.tree as Tree).toStringTree()}"
	}
	
}
