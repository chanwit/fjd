package th.ac.sut.fjd.compiler

import org.antlr.runtime.ANTLRFileStream
import org.antlr.runtime.ANTLRStringStream
import org.antlr.runtime.CharStream
import org.antlr.runtime.CommonTokenStream
import org.antlr.runtime.tree.*

import th.ac.sut.fjd.FJDLexer
import th.ac.sut.fjd.FJDParser
import th.ac.sut.fjd.ast.ProgramNode

class Compiler {

    Configuration config = new Configuration()

    ProgramNode compile(String src) {
        return compile(new ANTLRStringStream(src))
    }

    ProgramNode compile(File file) {
        return compile(new ANTLRFileStream(file.getAbsoluteFile(),"UTF-8"))
    }

    ProgramNode compile(CharStream stream) {
        def lex = new FJDLexer(stream)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def tree = parser.program().tree as Tree

        return new TreeWalker(config.CT, config.TT).visit(tree) as ProgramNode
    }

    static void main(String[] args) {
        def input = new ANTLRFileStream(args[0], "UTF-8")
        def lex = new FJDLexer(input)
        def tokens = new CommonTokenStream(lex)
        def parser = new FJDParser(tokens)
        def r = parser.program();
        println "tree ${(r.tree as Tree).toStringTree()}"
    }

}
