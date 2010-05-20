grammar FJD;

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
  FIELD_INIT;
  FIELD_INIT_LIST;
  METHODS;
  METHOD;
  TYPE;
  ARGS;
  ARG;
  METH_BODY;

  EXPR_LIST;
  EXPR;
  THIS_EXPR;
  VALUE_EXPR;
  NEW_EXPR;
  CAST_EXPR;
  FIELD_ACCESS_EXPR;
  METH_CALL_EXPR;
}

@parser::header { package org.fjd; }
@lexer::header  { package org.fjd; }

program	
    : classDecl+
      expr
      -> ^(PROGRAM classDecl+ ^(EXPR expr)) 
    ;

classDecl
    :   'class' className=ID 'extends' superClass=ID '{' 
            fieldDecls ctorDecl methodDecls 
        '}'
    ->  ^(CLASS $className ^(SUPER_CLASS $superClass)
            fieldDecls ctorDecl methodDecls
        )
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
    : name=ID '(' argList? ')' '{' ctorBody '}'
      -> ^(CTOR $name argList? ctorBody)
    ;

argList
    : arg (',' arg)*
      -> ^(ARGS arg+)
    ;

arg
    : type ID 
      -> ^(ARG type ID)
    ;

type
    : ID
      -> ^(TYPE ID)
    ;

ctorBody
    : superStmt
      fieldInits
      -> ^(CTOR_BODY superStmt fieldInits)
    ;
    
superStmt
    : 'super' '(' argList? ')' ';'	
      -> ^(SUPER_STMT argList?)
    ;

fieldInits
    : fieldInit*
      -> ^(FIELD_INIT_LIST fieldInit*)
    ;

fieldInit
    : 'this' '.' field=ID '=' value=ID ';'
      -> ^(FIELD_INIT $field $value)
    ;
    
methodDecls
    : methodDecl*
      -> ^(METHODS methodDecl*)
    ;
    
methodDecl
    : type name=ID '(' argList? ')' '{' methBody '}'
      -> ^(METHOD type $name argList? methBody)
    ;	
    
methBody
    : 'return' expr ';'
      -> ^(METH_BODY ^(EXPR expr))
    ;	

exprList
    : expr (',' expr)*
      -> ^(EXPR_LIST expr+)
    ;

expr
    : ( valueExpr | thisExpr) fieldAccessOrMethCall*    
    ;

valueExpr
    : ID
      -> ^(VALUE_EXPR ID)
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

fieldAccessOrMethCall
    : '.' ID  -> ^(FIELD_ACCESS_EXPR ID)
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
