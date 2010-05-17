package org.fjd.ast

@Typed class ProgramNode {

	List<ClassNode> classes = []
	ExprNode expr
	
	def addClass(ClassNode n) {
	    classes << n
	}
}
