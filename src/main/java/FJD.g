grammar FJD;

program	: classDecl+
	  expr
	;

classDecl
	: 'class' ID 'extends' ID '{' fieldDecls ctorDecl methodDecls '}'
	;

fieldDecls	
	: (type ID ';')*
	;

ctorDecl
	: ID '(' argList? ')' '{' ctorBody '}'
	;

argList	: type ID (',' type ID)+
	;
	
type	: ID	
	;

ctorBody
	: superStmt
	  fieldInits?
	;
	
superStmt
	: 'super' '(' argList? ')' ';'	
	;

fieldInits
	: 'this' '.' ID '=' ID ';'
	;
	
methodDecls
	: methodDecl*
	;
	
methodDecl
	: type ID '(' argList? ')' '{' methBody '}'
	;	
	
methBody
	: 'return' expr ';'
	;	

exprList
  : expr (',' expr)*
  ;

expr
  : ID
  | 'new' ID '(' exprList? ')'
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
