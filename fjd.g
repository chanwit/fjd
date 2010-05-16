grammar fjd;

program	: classDecl+
	  expr	
	;

classDecl
	: 'class' ID 'extends' ID '{' fieldDecls constructor methodDecls '}'
	;

fieldDecls	
	: (ID ID ';')*
	;

constructor
	: ID '(' argList ')' '{' ctorBody '}'
	;

argList	:	
	;

ctorBody
	: superStmt
	  fieldInits
	;
	
superStmt
	: 'super' '(' argList ')' ';'	
	;

fieldInits
	:	
	;
	
methodDecls
	: methodDecl*
	;
	
methodDecl
	: ID ID '(' argList ')' '{' methBody '}'
	;	
	
methBody
	: 'return' expr ';'
	;	

expr	:
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
