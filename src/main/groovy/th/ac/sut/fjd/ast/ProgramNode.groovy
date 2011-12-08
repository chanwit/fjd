package th.ac.sut.fjd.ast

class ProgramNode {

	List<ClassNode> classes = []
	ExprNode expr
	
	def addClass(ClassNode n) {
	    classes << n
	}
}
