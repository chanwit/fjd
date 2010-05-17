grammar FJD;

options {
  output = AST;
}

tokens {
  PROGRAM;
  CLASS;
  FIELD;
  CTOR;
  SUPER_STMT;
  FIELD_INIT;
  METHOD;
  TYPE;
  ARG;
  METH_BODY;

  THIS;
  VALUE;
  NEW;
  CAST;
  FIELD_ACCESS;
  METH_CALL;
}

@parser::header { package org.fjd; }
@lexer::header  { package org.fjd; }

program	
  : classDecl+  
	  expr
	  -> ^(PROGRAM classDecl+ expr) 
	;

classDecl
	: 'class' className=ID 'extends' superClass=ID '{' fieldDecls ctorDecl methodDecls '}'
	  -> ^(CLASS $className $superClass fieldDecls ctorDecl methodDecls)
	;

fieldDecls	
	: (fieldDecl)*
	;
	
fieldDecl
  : type ID ';'
    -> ^(FIELD type ID)
  ;

ctorDecl
	: name=ID '(' argList? ')' '{' ctorBody '}'
	  -> ^(CTOR $name argList? ctorBody)
	;

argList
  : arg (','! arg)*
	;
	
arg
  : type ID -> ^(ARG type ID)
  ;
	
type
  : ID
    -> ^(TYPE ID)	
	;

ctorBody
	: superStmt
	  fieldInits?
	;
	
superStmt
	: 'super' '(' argList? ')' ';'	
	  -> ^(SUPER_STMT argList?)
	;

fieldInits
	: 'this' '.' field=ID '=' value=ID ';'
	  -> ^(FIELD_INIT $field $value)
	;
	
methodDecls
	: methodDecl*
	;
	
methodDecl
	: type name=ID '(' argList? ')' '{' methBody '}'
	  -> ^(METHOD type $name argList? methBody)
	;	
	
methBody
	: 'return' expr ';'
	  -> ^(METH_BODY expr)
	;	

exprList
  : expr (','! expr)*
  ;

expr
  :
  (   'this' -> ^(THIS)
	  | ID     -> ^(VALUE ID)
	  | 'new' ID '(' exprList? ')'  -> ^(NEW ID exprList?)
	  | '(' ID ')' expr -> ^(CAST ID expr)
  ) fieldAccessOrMethCall*
	;	
	
fieldAccessOrMethCall
  : '.' ID  -> ^(FIELD_ACCESS ID)
  | '.' ID '(' exprList? ')' -> ^(METH_CALL ID exprList? )
  ;	

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
