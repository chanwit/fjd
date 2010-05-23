module org/fjd/fjtype

/*
 * Model of the Java type system. The TypeSoundness assertion
 * claims that if a Java program type checks successfully,
 * then a field will cannot be assigned an incorrect type.
 *
 * author: Daniel Jackson
 */

//sig ProgramNode {
//  classes: set ClassNode
  // expr: ExprNode
//}

abstract sig TypeNode {
}

one sig Dynamic extends TypeNode {
}

sig ClassNode extends TypeNode {
  superClass: one ClassNode,
  fields: set FieldNode
//  ctor: ConstructorNode
//  methods: set MethodNode
}

sig FieldNode {
	type: TypeNode
}

pred subClass[c, d: ClassNode] {
  c in ClassNode => d in (c & ClassNode).*(ClassNode <: superClass)
}

fun fieldsOf[c: ClassNode] : set FieldNode {
	(c.*superClass).fields + c.fields
}

one sig Object extends ClassNode {}

fact {
  all c: ClassNode | subClass[c, Object]
}

fact {
  Object.superClass = Object
}
fact {
  #Object.fields = 0
}

assert selfIsSubClassOfSelf {
    all c: ClassNode | subClass[c, c]
}
assert subClassIsTransitive {
    all c: ClassNode | 
	some d: ClassNode | 
    some e: ClassNode | 
    subClass[c,d] && subClass[d, e] && subClass[c,e]
}

assert ObjectHasNoField {
	all c: ClassNode | #fieldsOf[c] <= 1
}

check ObjectHasNoField
check selfIsSubClassOfSelf
check subClassIsTransitive

// 
// abstract sig ExprNode {}
// 
// assert MethodOKinClass {
// }
// 
// assert ClassOK {
// }
// 
// assert TypeSoundness {
// }
// 
// check TypeSoundness for 2 State expect 0

