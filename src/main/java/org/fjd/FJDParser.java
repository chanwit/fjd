// $ANTLR 3.2 Sep 23, 2009 14:05:07 D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g 2010-05-17 15:36:45
 package org.fjd; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class FJDParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "CLASS", "SUPER_CLASS", "FIELD", "FIELDS", "CTOR", "SUPER_STMT", "FIELD_INIT", "METHODS", "METHOD", "TYPE", "ARGS", "ARG", "METH_BODY", "THIS", "VALUE", "NEW", "CAST", "FIELD_ACCESS", "METH_CALL", "ID", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'class'", "'extends'", "'{'", "'}'", "';'", "'('", "')'", "','", "'super'", "'this'", "'.'", "'='", "'return'", "'new'"
    };
    public static final int CAST=21;
    public static final int CLASS=5;
    public static final int OCTAL_ESC=31;
    public static final int SUPER_STMT=10;
    public static final int NEW=20;
    public static final int CHAR=28;
    public static final int ID=24;
    public static final int EOF=-1;
    public static final int TYPE=14;
    public static final int FIELD_ACCESS=22;
    public static final int ESC_SEQ=26;
    public static final int FIELD_INIT=11;
    public static final int METHODS=12;
    public static final int ARG=16;
    public static final int CTOR=9;
    public static final int THIS=18;
    public static final int ARGS=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int UNICODE_ESC=30;
    public static final int SUPER_CLASS=6;
    public static final int METH_CALL=23;
    public static final int HEX_DIGIT=29;
    public static final int FIELDS=8;
    public static final int VALUE=19;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=25;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int METH_BODY=17;
    public static final int PROGRAM=4;
    public static final int FIELD=7;
    public static final int METHOD=13;
    public static final int STRING=27;

    // delegates
    // delegators


        public FJDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FJDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return FJDParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:35:1: program : ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ expr ) ;
    public final FJDParser.program_return program() throws RecognitionException {
        FJDParser.program_return retval = new FJDParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.classDecl_return classDecl1 = null;

        FJDParser.expr_return expr2 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_classDecl=new RewriteRuleSubtreeStream(adaptor,"rule classDecl");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:36:3: ( ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ expr ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:36:5: ( classDecl )+ expr
            {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:36:5: ( classDecl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:36:5: classDecl
            	    {
            	    pushFollow(FOLLOW_classDecl_in_program162);
            	    classDecl1=classDecl();

            	    state._fsp--;

            	    stream_classDecl.add(classDecl1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            pushFollow(FOLLOW_expr_in_program170);
            expr2=expr();

            state._fsp--;

            stream_expr.add(expr2.getTree());


            // AST REWRITE
            // elements: classDecl, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 38:4: -> ^( PROGRAM ( classDecl )+ expr )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:38:7: ^( PROGRAM ( classDecl )+ expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                if ( !(stream_classDecl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_classDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDecl.nextTree());

                }
                stream_classDecl.reset();
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class classDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:41:1: classDecl : 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) ;
    public final FJDParser.classDecl_return classDecl() throws RecognitionException {
        FJDParser.classDecl_return retval = new FJDParser.classDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token className=null;
        Token superClass=null;
        Token string_literal3=null;
        Token string_literal4=null;
        Token char_literal5=null;
        Token char_literal9=null;
        FJDParser.fieldDecls_return fieldDecls6 = null;

        FJDParser.ctorDecl_return ctorDecl7 = null;

        FJDParser.methodDecls_return methodDecls8 = null;


        CommonTree className_tree=null;
        CommonTree superClass_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal9_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_fieldDecls=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecls");
        RewriteRuleSubtreeStream stream_ctorDecl=new RewriteRuleSubtreeStream(adaptor,"rule ctorDecl");
        RewriteRuleSubtreeStream stream_methodDecls=new RewriteRuleSubtreeStream(adaptor,"rule methodDecls");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:42:2: ( 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:42:4: 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}'
            {
            string_literal3=(Token)match(input,32,FOLLOW_32_in_classDecl196);  
            stream_32.add(string_literal3);

            className=(Token)match(input,ID,FOLLOW_ID_in_classDecl200);  
            stream_ID.add(className);

            string_literal4=(Token)match(input,33,FOLLOW_33_in_classDecl202);  
            stream_33.add(string_literal4);

            superClass=(Token)match(input,ID,FOLLOW_ID_in_classDecl206);  
            stream_ID.add(superClass);

            char_literal5=(Token)match(input,34,FOLLOW_34_in_classDecl208);  
            stream_34.add(char_literal5);

            pushFollow(FOLLOW_fieldDecls_in_classDecl210);
            fieldDecls6=fieldDecls();

            state._fsp--;

            stream_fieldDecls.add(fieldDecls6.getTree());
            pushFollow(FOLLOW_ctorDecl_in_classDecl212);
            ctorDecl7=ctorDecl();

            state._fsp--;

            stream_ctorDecl.add(ctorDecl7.getTree());
            pushFollow(FOLLOW_methodDecls_in_classDecl214);
            methodDecls8=methodDecls();

            state._fsp--;

            stream_methodDecls.add(methodDecls8.getTree());
            char_literal9=(Token)match(input,35,FOLLOW_35_in_classDecl216);  
            stream_35.add(char_literal9);



            // AST REWRITE
            // elements: superClass, methodDecls, ctorDecl, fieldDecls, className
            // token labels: superClass, className
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_superClass=new RewriteRuleTokenStream(adaptor,"token superClass",superClass);
            RewriteRuleTokenStream stream_className=new RewriteRuleTokenStream(adaptor,"token className",className);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:4: -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:43:7: ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS, "CLASS"), root_1);

                adaptor.addChild(root_1, stream_className.nextNode());
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:43:26: ^( SUPER_CLASS $superClass)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_CLASS, "SUPER_CLASS"), root_2);

                adaptor.addChild(root_2, stream_superClass.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_fieldDecls.nextTree());
                adaptor.addChild(root_1, stream_ctorDecl.nextTree());
                adaptor.addChild(root_1, stream_methodDecls.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class fieldDecls_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDecls"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:46:1: fieldDecls : ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) ;
    public final FJDParser.fieldDecls_return fieldDecls() throws RecognitionException {
        FJDParser.fieldDecls_return retval = new FJDParser.fieldDecls_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.fieldDecl_return fieldDecl10 = null;


        RewriteRuleSubtreeStream stream_fieldDecl=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecl");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:47:2: ( ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:47:4: ( fieldDecl )*
            {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:47:4: ( fieldDecl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:47:4: fieldDecl
            	    {
            	    pushFollow(FOLLOW_fieldDecl_in_fieldDecls253);
            	    fieldDecl10=fieldDecl();

            	    state._fsp--;

            	    stream_fieldDecl.add(fieldDecl10.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: fieldDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 48:4: -> ^( FIELDS ( fieldDecl )* )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:48:7: ^( FIELDS ( fieldDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELDS, "FIELDS"), root_1);

                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:48:16: ( fieldDecl )*
                while ( stream_fieldDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_fieldDecl.nextTree());

                }
                stream_fieldDecl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldDecls"

    public static class fieldDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDecl"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:51:1: fieldDecl : type ID ';' -> ^( FIELD type ID ) ;
    public final FJDParser.fieldDecl_return fieldDecl() throws RecognitionException {
        FJDParser.fieldDecl_return retval = new FJDParser.fieldDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        FJDParser.type_return type11 = null;


        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:52:3: ( type ID ';' -> ^( FIELD type ID ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:52:5: type ID ';'
            {
            pushFollow(FOLLOW_type_in_fieldDecl280);
            type11=type();

            state._fsp--;

            stream_type.add(type11.getTree());
            ID12=(Token)match(input,ID,FOLLOW_ID_in_fieldDecl282);  
            stream_ID.add(ID12);

            char_literal13=(Token)match(input,36,FOLLOW_36_in_fieldDecl284);  
            stream_36.add(char_literal13);



            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:5: -> ^( FIELD type ID )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:53:8: ^( FIELD type ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldDecl"

    public static class ctorDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorDecl"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:56:1: ctorDecl : name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) ;
    public final FJDParser.ctorDecl_return ctorDecl() throws RecognitionException {
        FJDParser.ctorDecl_return retval = new FJDParser.ctorDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        FJDParser.argList_return argList15 = null;

        FJDParser.ctorBody_return ctorBody18 = null;


        CommonTree name_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_ctorBody=new RewriteRuleSubtreeStream(adaptor,"rule ctorBody");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:57:2: (name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:57:4: name= ID '(' ( argList )? ')' '{' ctorBody '}'
            {
            name=(Token)match(input,ID,FOLLOW_ID_in_ctorDecl312);  
            stream_ID.add(name);

            char_literal14=(Token)match(input,37,FOLLOW_37_in_ctorDecl314);  
            stream_37.add(char_literal14);

            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:57:16: ( argList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:57:16: argList
                    {
                    pushFollow(FOLLOW_argList_in_ctorDecl316);
                    argList15=argList();

                    state._fsp--;

                    stream_argList.add(argList15.getTree());

                    }
                    break;

            }

            char_literal16=(Token)match(input,38,FOLLOW_38_in_ctorDecl319);  
            stream_38.add(char_literal16);

            char_literal17=(Token)match(input,34,FOLLOW_34_in_ctorDecl321);  
            stream_34.add(char_literal17);

            pushFollow(FOLLOW_ctorBody_in_ctorDecl323);
            ctorBody18=ctorBody();

            state._fsp--;

            stream_ctorBody.add(ctorBody18.getTree());
            char_literal19=(Token)match(input,35,FOLLOW_35_in_ctorDecl325);  
            stream_35.add(char_literal19);



            // AST REWRITE
            // elements: ctorBody, argList, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 58:4: -> ^( CTOR $name ( argList )? ctorBody )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:58:7: ^( CTOR $name ( argList )? ctorBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CTOR, "CTOR"), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:58:20: ( argList )?
                if ( stream_argList.hasNext() ) {
                    adaptor.addChild(root_1, stream_argList.nextTree());

                }
                stream_argList.reset();
                adaptor.addChild(root_1, stream_ctorBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ctorDecl"

    public static class argList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argList"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:61:1: argList : arg ( ',' arg )* -> ^( ARGS ( arg )+ ) ;
    public final FJDParser.argList_return argList() throws RecognitionException {
        FJDParser.argList_return retval = new FJDParser.argList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        FJDParser.arg_return arg20 = null;

        FJDParser.arg_return arg22 = null;


        CommonTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:3: ( arg ( ',' arg )* -> ^( ARGS ( arg )+ ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:5: arg ( ',' arg )*
            {
            pushFollow(FOLLOW_arg_in_argList354);
            arg20=arg();

            state._fsp--;

            stream_arg.add(arg20.getTree());
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:9: ( ',' arg )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:10: ',' arg
            	    {
            	    char_literal21=(Token)match(input,39,FOLLOW_39_in_argList357);  
            	    stream_39.add(char_literal21);

            	    pushFollow(FOLLOW_arg_in_argList359);
            	    arg22=arg();

            	    state._fsp--;

            	    stream_arg.add(arg22.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            // AST REWRITE
            // elements: arg
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:5: -> ^( ARGS ( arg )+ )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:63:8: ^( ARGS ( arg )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                if ( !(stream_arg.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_arg.hasNext() ) {
                    adaptor.addChild(root_1, stream_arg.nextTree());

                }
                stream_arg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argList"

    public static class arg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:66:1: arg : type ID -> ^( ARG type ID ) ;
    public final FJDParser.arg_return arg() throws RecognitionException {
        FJDParser.arg_return retval = new FJDParser.arg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID24=null;
        FJDParser.type_return type23 = null;


        CommonTree ID24_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:67:3: ( type ID -> ^( ARG type ID ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:67:5: type ID
            {
            pushFollow(FOLLOW_type_in_arg387);
            type23=type();

            state._fsp--;

            stream_type.add(type23.getTree());
            ID24=(Token)match(input,ID,FOLLOW_ID_in_arg389);  
            stream_ID.add(ID24);



            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:13: -> ^( ARG type ID )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:67:16: ^( ARG type ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, "ARG"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:70:1: type : ID -> ^( TYPE ID ) ;
    public final FJDParser.type_return type() throws RecognitionException {
        FJDParser.type_return retval = new FJDParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID25=null;

        CommonTree ID25_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:71:3: ( ID -> ^( TYPE ID ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:71:5: ID
            {
            ID25=(Token)match(input,ID,FOLLOW_ID_in_type413);  
            stream_ID.add(ID25);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 72:5: -> ^( TYPE ID )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:72:8: ^( TYPE ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class ctorBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorBody"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:75:1: ctorBody : superStmt ( fieldInits )? ;
    public final FJDParser.ctorBody_return ctorBody() throws RecognitionException {
        FJDParser.ctorBody_return retval = new FJDParser.ctorBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.superStmt_return superStmt26 = null;

        FJDParser.fieldInits_return fieldInits27 = null;



        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:76:2: ( superStmt ( fieldInits )? )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:76:4: superStmt ( fieldInits )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_superStmt_in_ctorBody437);
            superStmt26=superStmt();

            state._fsp--;

            adaptor.addChild(root_0, superStmt26.getTree());
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:77:4: ( fieldInits )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:77:4: fieldInits
                    {
                    pushFollow(FOLLOW_fieldInits_in_ctorBody442);
                    fieldInits27=fieldInits();

                    state._fsp--;

                    adaptor.addChild(root_0, fieldInits27.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ctorBody"

    public static class superStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superStmt"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:1: superStmt : 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) ;
    public final FJDParser.superStmt_return superStmt() throws RecognitionException {
        FJDParser.superStmt_return retval = new FJDParser.superStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal28=null;
        Token char_literal29=null;
        Token char_literal31=null;
        Token char_literal32=null;
        FJDParser.argList_return argList30 = null;


        CommonTree string_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:81:2: ( 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:81:4: 'super' '(' ( argList )? ')' ';'
            {
            string_literal28=(Token)match(input,40,FOLLOW_40_in_superStmt455);  
            stream_40.add(string_literal28);

            char_literal29=(Token)match(input,37,FOLLOW_37_in_superStmt457);  
            stream_37.add(char_literal29);

            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:81:16: ( argList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:81:16: argList
                    {
                    pushFollow(FOLLOW_argList_in_superStmt459);
                    argList30=argList();

                    state._fsp--;

                    stream_argList.add(argList30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,38,FOLLOW_38_in_superStmt462);  
            stream_38.add(char_literal31);

            char_literal32=(Token)match(input,36,FOLLOW_36_in_superStmt464);  
            stream_36.add(char_literal32);



            // AST REWRITE
            // elements: argList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 82:4: -> ^( SUPER_STMT ( argList )? )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:82:7: ^( SUPER_STMT ( argList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_STMT, "SUPER_STMT"), root_1);

                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:82:20: ( argList )?
                if ( stream_argList.hasNext() ) {
                    adaptor.addChild(root_1, stream_argList.nextTree());

                }
                stream_argList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "superStmt"

    public static class fieldInits_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldInits"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:85:1: fieldInits : 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) ;
    public final FJDParser.fieldInits_return fieldInits() throws RecognitionException {
        FJDParser.fieldInits_return retval = new FJDParser.fieldInits_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token field=null;
        Token value=null;
        Token string_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        Token char_literal36=null;

        CommonTree field_tree=null;
        CommonTree value_tree=null;
        CommonTree string_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");

        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:86:2: ( 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:86:4: 'this' '.' field= ID '=' value= ID ';'
            {
            string_literal33=(Token)match(input,41,FOLLOW_41_in_fieldInits488);  
            stream_41.add(string_literal33);

            char_literal34=(Token)match(input,42,FOLLOW_42_in_fieldInits490);  
            stream_42.add(char_literal34);

            field=(Token)match(input,ID,FOLLOW_ID_in_fieldInits494);  
            stream_ID.add(field);

            char_literal35=(Token)match(input,43,FOLLOW_43_in_fieldInits496);  
            stream_43.add(char_literal35);

            value=(Token)match(input,ID,FOLLOW_ID_in_fieldInits500);  
            stream_ID.add(value);

            char_literal36=(Token)match(input,36,FOLLOW_36_in_fieldInits502);  
            stream_36.add(char_literal36);



            // AST REWRITE
            // elements: field, value
            // token labels: field, value
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_field=new RewriteRuleTokenStream(adaptor,"token field",field);
            RewriteRuleTokenStream stream_value=new RewriteRuleTokenStream(adaptor,"token value",value);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 87:4: -> ^( FIELD_INIT $field $value)
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:87:7: ^( FIELD_INIT $field $value)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_INIT, "FIELD_INIT"), root_1);

                adaptor.addChild(root_1, stream_field.nextNode());
                adaptor.addChild(root_1, stream_value.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldInits"

    public static class methodDecls_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDecls"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:90:1: methodDecls : ( methodDecl )* -> ^( METHODS ( methodDecl )* ) ;
    public final FJDParser.methodDecls_return methodDecls() throws RecognitionException {
        FJDParser.methodDecls_return retval = new FJDParser.methodDecls_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.methodDecl_return methodDecl37 = null;


        RewriteRuleSubtreeStream stream_methodDecl=new RewriteRuleSubtreeStream(adaptor,"rule methodDecl");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:91:2: ( ( methodDecl )* -> ^( METHODS ( methodDecl )* ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:91:4: ( methodDecl )*
            {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:91:4: ( methodDecl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:91:4: methodDecl
            	    {
            	    pushFollow(FOLLOW_methodDecl_in_methodDecls529);
            	    methodDecl37=methodDecl();

            	    state._fsp--;

            	    stream_methodDecl.add(methodDecl37.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: methodDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 92:4: -> ^( METHODS ( methodDecl )* )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:92:7: ^( METHODS ( methodDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODS, "METHODS"), root_1);

                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:92:17: ( methodDecl )*
                while ( stream_methodDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodDecl.nextTree());

                }
                stream_methodDecl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDecls"

    public static class methodDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDecl"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:95:1: methodDecl : type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) ;
    public final FJDParser.methodDecl_return methodDecl() throws RecognitionException {
        FJDParser.methodDecl_return retval = new FJDParser.methodDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        FJDParser.type_return type38 = null;

        FJDParser.argList_return argList40 = null;

        FJDParser.methBody_return methBody43 = null;


        CommonTree name_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_methBody=new RewriteRuleSubtreeStream(adaptor,"rule methBody");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:96:2: ( type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:96:4: type name= ID '(' ( argList )? ')' '{' methBody '}'
            {
            pushFollow(FOLLOW_type_in_methodDecl554);
            type38=type();

            state._fsp--;

            stream_type.add(type38.getTree());
            name=(Token)match(input,ID,FOLLOW_ID_in_methodDecl558);  
            stream_ID.add(name);

            char_literal39=(Token)match(input,37,FOLLOW_37_in_methodDecl560);  
            stream_37.add(char_literal39);

            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:96:21: ( argList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:96:21: argList
                    {
                    pushFollow(FOLLOW_argList_in_methodDecl562);
                    argList40=argList();

                    state._fsp--;

                    stream_argList.add(argList40.getTree());

                    }
                    break;

            }

            char_literal41=(Token)match(input,38,FOLLOW_38_in_methodDecl565);  
            stream_38.add(char_literal41);

            char_literal42=(Token)match(input,34,FOLLOW_34_in_methodDecl567);  
            stream_34.add(char_literal42);

            pushFollow(FOLLOW_methBody_in_methodDecl569);
            methBody43=methBody();

            state._fsp--;

            stream_methBody.add(methBody43.getTree());
            char_literal44=(Token)match(input,35,FOLLOW_35_in_methodDecl571);  
            stream_35.add(char_literal44);



            // AST REWRITE
            // elements: argList, name, type, methBody
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:4: -> ^( METHOD type $name ( argList )? methBody )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:97:7: ^( METHOD type $name ( argList )? methBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD, "METHOD"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_name.nextNode());
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:97:27: ( argList )?
                if ( stream_argList.hasNext() ) {
                    adaptor.addChild(root_1, stream_argList.nextTree());

                }
                stream_argList.reset();
                adaptor.addChild(root_1, stream_methBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDecl"

    public static class methBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methBody"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:100:1: methBody : 'return' expr ';' -> ^( METH_BODY expr ) ;
    public final FJDParser.methBody_return methBody() throws RecognitionException {
        FJDParser.methBody_return retval = new FJDParser.methBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal45=null;
        Token char_literal47=null;
        FJDParser.expr_return expr46 = null;


        CommonTree string_literal45_tree=null;
        CommonTree char_literal47_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:101:2: ( 'return' expr ';' -> ^( METH_BODY expr ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:101:4: 'return' expr ';'
            {
            string_literal45=(Token)match(input,44,FOLLOW_44_in_methBody603);  
            stream_44.add(string_literal45);

            pushFollow(FOLLOW_expr_in_methBody605);
            expr46=expr();

            state._fsp--;

            stream_expr.add(expr46.getTree());
            char_literal47=(Token)match(input,36,FOLLOW_36_in_methBody607);  
            stream_36.add(char_literal47);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:4: -> ^( METH_BODY expr )
            {
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:102:7: ^( METH_BODY expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH_BODY, "METH_BODY"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methBody"

    public static class exprList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:105:1: exprList : expr ( ',' expr )* ;
    public final FJDParser.exprList_return exprList() throws RecognitionException {
        FJDParser.exprList_return retval = new FJDParser.exprList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        FJDParser.expr_return expr48 = null;

        FJDParser.expr_return expr50 = null;


        CommonTree char_literal49_tree=null;

        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:106:3: ( expr ( ',' expr )* )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:106:5: expr ( ',' expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList631);
            expr48=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr48.getTree());
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:106:10: ( ',' expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:106:11: ',' expr
            	    {
            	    char_literal49=(Token)match(input,39,FOLLOW_39_in_exprList634); 
            	    pushFollow(FOLLOW_expr_in_exprList637);
            	    expr50=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:109:1: expr : ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' ID '(' ( exprList )? ')' -> ^( NEW ID ( exprList )? ) | '(' ID ')' expr -> ^( CAST ID expr ) ) ( fieldAccessOrMethCall )* ;
    public final FJDParser.expr_return expr() throws RecognitionException {
        FJDParser.expr_return retval = new FJDParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal51=null;
        Token ID52=null;
        Token string_literal53=null;
        Token ID54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token ID59=null;
        Token char_literal60=null;
        FJDParser.exprList_return exprList56 = null;

        FJDParser.expr_return expr61 = null;

        FJDParser.fieldAccessOrMethCall_return fieldAccessOrMethCall62 = null;


        CommonTree string_literal51_tree=null;
        CommonTree ID52_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree ID54_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree ID59_tree=null;
        CommonTree char_literal60_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_fieldAccessOrMethCall=new RewriteRuleSubtreeStream(adaptor,"rule fieldAccessOrMethCall");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:110:3: ( ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' ID '(' ( exprList )? ')' -> ^( NEW ID ( exprList )? ) | '(' ID ')' expr -> ^( CAST ID expr ) ) ( fieldAccessOrMethCall )* )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:111:3: ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' ID '(' ( exprList )? ')' -> ^( NEW ID ( exprList )? ) | '(' ID ')' expr -> ^( CAST ID expr ) ) ( fieldAccessOrMethCall )*
            {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:111:3: ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' ID '(' ( exprList )? ')' -> ^( NEW ID ( exprList )? ) | '(' ID ')' expr -> ^( CAST ID expr ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case ID:
                {
                alt11=2;
                }
                break;
            case 45:
                {
                alt11=3;
                }
                break;
            case 37:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:111:7: 'this'
                    {
                    string_literal51=(Token)match(input,41,FOLLOW_41_in_expr658);  
                    stream_41.add(string_literal51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:14: -> ^( THIS )
                    {
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:111:17: ^( THIS )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THIS, "THIS"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:112:6: ID
                    {
                    ID52=(Token)match(input,ID,FOLLOW_ID_in_expr671);  
                    stream_ID.add(ID52);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 112:13: -> ^( VALUE ID )
                    {
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:112:16: ^( VALUE ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:6: 'new' ID '(' ( exprList )? ')'
                    {
                    string_literal53=(Token)match(input,45,FOLLOW_45_in_expr690);  
                    stream_45.add(string_literal53);

                    ID54=(Token)match(input,ID,FOLLOW_ID_in_expr692);  
                    stream_ID.add(ID54);

                    char_literal55=(Token)match(input,37,FOLLOW_37_in_expr694);  
                    stream_37.add(char_literal55);

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:19: ( exprList )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID||LA10_0==37||LA10_0==41||LA10_0==45) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:19: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_expr696);
                            exprList56=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList56.getTree());

                            }
                            break;

                    }

                    char_literal57=(Token)match(input,38,FOLLOW_38_in_expr699);  
                    stream_38.add(char_literal57);



                    // AST REWRITE
                    // elements: exprList, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 113:34: -> ^( NEW ID ( exprList )? )
                    {
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:37: ^( NEW ID ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:46: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:114:6: '(' ID ')' expr
                    {
                    char_literal58=(Token)match(input,37,FOLLOW_37_in_expr718);  
                    stream_37.add(char_literal58);

                    ID59=(Token)match(input,ID,FOLLOW_ID_in_expr720);  
                    stream_ID.add(ID59);

                    char_literal60=(Token)match(input,38,FOLLOW_38_in_expr722);  
                    stream_38.add(char_literal60);

                    pushFollow(FOLLOW_expr_in_expr724);
                    expr61=expr();

                    state._fsp--;

                    stream_expr.add(expr61.getTree());


                    // AST REWRITE
                    // elements: ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 114:22: -> ^( CAST ID expr )
                    {
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:114:25: ^( CAST ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAST, "CAST"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }

            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:115:5: ( fieldAccessOrMethCall )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:115:5: fieldAccessOrMethCall
            	    {
            	    pushFollow(FOLLOW_fieldAccessOrMethCall_in_expr740);
            	    fieldAccessOrMethCall62=fieldAccessOrMethCall();

            	    state._fsp--;

            	    stream_fieldAccessOrMethCall.add(fieldAccessOrMethCall62.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class fieldAccessOrMethCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldAccessOrMethCall"
    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:118:1: fieldAccessOrMethCall : ( '.' ID -> ^( FIELD_ACCESS ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL ID ( exprList )? ) );
    public final FJDParser.fieldAccessOrMethCall_return fieldAccessOrMethCall() throws RecognitionException {
        FJDParser.fieldAccessOrMethCall_return retval = new FJDParser.fieldAccessOrMethCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal63=null;
        Token ID64=null;
        Token char_literal65=null;
        Token ID66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        FJDParser.exprList_return exprList68 = null;


        CommonTree char_literal63_tree=null;
        CommonTree ID64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree ID66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal69_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:119:3: ( '.' ID -> ^( FIELD_ACCESS ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL ID ( exprList )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==37) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==EOF||LA14_2==36||(LA14_2>=38 && LA14_2<=39)||LA14_2==42) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:119:5: '.' ID
                    {
                    char_literal63=(Token)match(input,42,FOLLOW_42_in_fieldAccessOrMethCall755);  
                    stream_42.add(char_literal63);

                    ID64=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall757);  
                    stream_ID.add(ID64);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:13: -> ^( FIELD_ACCESS ID )
                    {
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:119:16: ^( FIELD_ACCESS ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:120:5: '.' ID '(' ( exprList )? ')'
                    {
                    char_literal65=(Token)match(input,42,FOLLOW_42_in_fieldAccessOrMethCall772);  
                    stream_42.add(char_literal65);

                    ID66=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall774);  
                    stream_ID.add(ID66);

                    char_literal67=(Token)match(input,37,FOLLOW_37_in_fieldAccessOrMethCall776);  
                    stream_37.add(char_literal67);

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:120:16: ( exprList )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ID||LA13_0==37||LA13_0==41||LA13_0==45) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:120:16: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_fieldAccessOrMethCall778);
                            exprList68=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList68.getTree());

                            }
                            break;

                    }

                    char_literal69=(Token)match(input,38,FOLLOW_38_in_fieldAccessOrMethCall781);  
                    stream_38.add(char_literal69);



                    // AST REWRITE
                    // elements: ID, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:30: -> ^( METH_CALL ID ( exprList )? )
                    {
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:120:33: ^( METH_CALL ID ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH_CALL, "METH_CALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:120:48: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldAccessOrMethCall"

    // Delegated rules


 

    public static final BitSet FOLLOW_classDecl_in_program162 = new BitSet(new long[]{0x0000222101000000L});
    public static final BitSet FOLLOW_expr_in_program170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_classDecl196 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_classDecl200 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_classDecl202 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_classDecl206 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_classDecl208 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_fieldDecls_in_classDecl210 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ctorDecl_in_classDecl212 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_methodDecls_in_classDecl214 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_classDecl216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDecl_in_fieldDecls253 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_type_in_fieldDecl280 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_fieldDecl282 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldDecl284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ctorDecl312 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ctorDecl314 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_argList_in_ctorDecl316 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ctorDecl319 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ctorDecl321 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ctorBody_in_ctorDecl323 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ctorDecl325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_argList354 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_argList357 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_arg_in_argList359 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_type_in_arg387 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_arg389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superStmt_in_ctorBody437 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_fieldInits_in_ctorBody442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_superStmt455 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_superStmt457 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_argList_in_superStmt459 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_superStmt462 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_superStmt464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_fieldInits488 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_fieldInits490 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_fieldInits494 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_fieldInits496 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_fieldInits500 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldInits502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDecl_in_methodDecls529 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_type_in_methodDecl554 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_methodDecl558 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_methodDecl560 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_argList_in_methodDecl562 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_methodDecl565 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_methodDecl567 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_methBody_in_methodDecl569 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_methodDecl571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_methBody603 = new BitSet(new long[]{0x0000222001000000L});
    public static final BitSet FOLLOW_expr_in_methBody605 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_methBody607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList631 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_exprList634 = new BitSet(new long[]{0x0000222001000000L});
    public static final BitSet FOLLOW_expr_in_exprList637 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41_in_expr658 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ID_in_expr671 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_45_in_expr690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_expr692 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_expr694 = new BitSet(new long[]{0x0000226001000000L});
    public static final BitSet FOLLOW_exprList_in_expr696 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_expr699 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_37_in_expr718 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_expr720 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_expr722 = new BitSet(new long[]{0x0000222001000000L});
    public static final BitSet FOLLOW_expr_in_expr724 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_fieldAccessOrMethCall_in_expr740 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_fieldAccessOrMethCall755 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_fieldAccessOrMethCall772 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall774 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_fieldAccessOrMethCall776 = new BitSet(new long[]{0x0000226001000000L});
    public static final BitSet FOLLOW_exprList_in_fieldAccessOrMethCall778 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fieldAccessOrMethCall781 = new BitSet(new long[]{0x0000000000000002L});

}