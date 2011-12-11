grammar SDart;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
  PROGRAM;
  CLASS;

  SUPER_CLASS;
  FIELD;
  FIELDS;
  CTOR;
  CTOR_BODY;
  SUPER_STMT;
  FIELD_INIT_STMT;
  FIELD_INIT_STMT_LIST;
  MEMBERS;
  FUNCTION;
  TYPE;
  DYNAMIC;
  ARGS;
  ARG;
  FUNC_BODY;

  EXPR_LIST;
  EXPR;
  THIS_EXPR;
  VALUE_EXPR;
  NEW_EXPR;
  CAST_EXPR;
  FIELD_ACCESS_EXPR;
  METH_CALL_EXPR;
  FUNC_CALL_EXPR;
  
  GETTER;
  SETTER;
  
  STMT;
  RETURN_STMT;
  ASSIGN_STMT;
}

@parser::header { package th.ac.sut.sdart; }
@lexer::header  { package th.ac.sut.sdart; }

program
    : functionOrClassDecl+
      expr?
      -> ^(PROGRAM functionOrClassDecl+ expr?)
    ;

functionOrClassDecl
	: functionDecl 
	| classDecl
	;

classDecl
    : 'class' className=ID 'extends' superClass=ID '{'
        fieldDecls
        ctorDecl
        memberDecls
      '}'
      ->  ^(CLASS $className ^(SUPER_CLASS $superClass) fieldDecls ctorDecl memberDecls )
    ;

fieldDecls
    : fieldDecl*
      -> ^(FIELDS fieldDecl*)
    ;

fieldDecl
    : type ID ';'
      -> ^(FIELD type ID)
    ;

ctorDecl
    : name=ID '(' argList? ')' ctorBody
      -> ^(CTOR $name argList? ctorBody)
    ;

argList
    : arg (',' arg)*
      -> ^(ARGS arg+)
    ;

arg
    : type? ID
      -> ^(ARG type? ID)
    ;

type
    : 'var'
      -> ^(TYPE DYNAMIC)
    | ID
      -> ^(TYPE ID)
    ;

ctorBody
    : ':' superStmt '{' fieldInitStmts '}'
      -> ^(CTOR_BODY superStmt fieldInitStmts)
    ;

superStmt
    : 'super' '(' argList? ')'
      -> ^(SUPER_STMT argList?)
    ;

fieldInitStmts
    : fieldInitStmt*
      -> ^(FIELD_INIT_STMT_LIST fieldInitStmt*)
    ;

fieldInitStmt
    : 'this' '.' ID '=' expr ';'
      -> ^(FIELD_INIT_STMT ID expr)
    ;
    
memberDecls
    : memberDecl*
      -> ^(MEMBERS memberDecl*)
	;
	
memberDecl
	: functionDecl
	| getterDecl
	| setterDecl
	;	

returnType
	: 'void'
	| type
    ;

functionDecl
    : returnType? name=ID '(' argList? ')' '=>' funcBody
      -> ^(FUNCTION returnType? $name argList? funcBody)
    ;

funcBody
    : stmt
      -> ^(FUNC_BODY ^(STMT stmt))
    ;
    
stmt
	: returnStmt	
	| assignmentStmt
	;

returnStmt
	: 'return' expr ';'
	  -> ^(RETURN_STMT expr)
	;

assignmentStmt
	: expr '=' expr ';'
	  -> ^(ASSIGN_STMT expr expr)
	;
        
getterDecl
	: returnType? 'get' name=ID '(' ')' '=>' funcBody
	  -> ^(GETTER returnType? $name funcBody)
	;
	
setterDecl
	: 'void'? 'set' name=ID '(' arg ')' '=>' funcBody
	  -> ^(SETTER 'void'? $name arg funcBody)
	;

exprList
    : expr (',' expr)*
      -> ^(EXPR_LIST expr+)
    ;

expr
    : valueExpr fieldAccessOrFuncCall*
      -> ^(EXPR valueExpr fieldAccessOrFuncCall*)
    ;

valueExpr
    : ID
      -> ^(VALUE_EXPR ID)
    | funcCallExpr
    ;

funcCallExpr
	: ID '(' exprList? ')'
	  -> ^(FUNC_CALL_EXPR ID exprList? )
	| thisExpr
	;

thisExpr
    : 'this'
      -> ^(THIS_EXPR)
    | newExpr
    ;

newExpr
    : 'new' type '(' exprList? ')'
       -> ^(NEW_EXPR type exprList?)
    | castExpr
    ;

castExpr
    : '(' type ')' expr
      -> ^(CAST_EXPR type expr)
    ;

fieldAccessOrFuncCall
    : '.' ID                   -> ^(FIELD_ACCESS_EXPR ID)
    | '.' ID '(' exprList? ')' -> ^(METH_CALL_EXPR ID exprList?)
    ;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
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
