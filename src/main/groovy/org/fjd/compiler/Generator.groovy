package org.fjd.compiler

import org.antlr.runtime.tree.Tree

class Generator {
	
	private Tree tree;

	public Generator(Tree tree) {
		this.tree = tree;
	}
	
	void visitProgram() {
		println tree.text
	}

}
