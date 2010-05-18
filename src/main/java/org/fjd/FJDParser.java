// $ANTLR 3.2 Sep 23, 2009 14:05:07 C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g 2010-05-18 19:34:07
 package org.fjd; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class FJDParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "CLASS", "SUPER_CLASS", "FIELD", "FIELDS", "CTOR", "CTOR_BODY", "SUPER_STMT", "FIELD_INIT", "FIELD_INIT_LIST", "METHODS", "METHOD", "TYPE", "ARGS", "ARG", "METH_BODY", "EXPR", "EXPR_LIST", "THIS", "VALUE", "NEW_EXPR", "CAST_EXPR", "FIELD_ACCESS_EXPR", "METH_CALL_EXPR", "ID", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'class'", "'extends'", "'{'", "'}'", "';'", "'('", "')'", "','", "'super'", "'this'", "'.'", "'='", "'return'", "'new'"
    };
    public static final int CLASS=5;
    public static final int FIELD_ACCESS_EXPR=26;
    public static final int OCTAL_ESC=35;
    public static final int CHAR=32;
    public static final int SUPER_STMT=11;
    public static final int ID=28;
    public static final int EOF=-1;
    public static final int TYPE=16;
    public static final int EXPR_LIST=21;
    public static final int CTOR_BODY=10;
    public static final int ESC_SEQ=30;
    public static final int EXPR=20;
    public static final int FIELD_INIT=12;
    public static final int METHODS=14;
    public static final int ARG=18;
    public static final int CTOR=9;
    public static final int CAST_EXPR=25;
    public static final int THIS=22;
    public static final int ARGS=17;
    public static final int FIELD_INIT_LIST=13;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int METH_CALL_EXPR=27;
    public static final int T__49=49;
    public static final int UNICODE_ESC=34;
    public static final int SUPER_CLASS=6;
    public static final int HEX_DIGIT=33;
    public static final int FIELDS=8;
    public static final int VALUE=23;
    public static final int WS=29;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int NEW_EXPR=24;
    public static final int METH_BODY=19;
    public static final int PROGRAM=4;
    public static final int FIELD=7;
    public static final int METHOD=15;
    public static final int STRING=31;

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
    public String getGrammarFileName() { return "C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:40:1: program : ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) ) ;
    public final FJDParser.program_return program() throws RecognitionException {
        FJDParser.program_return retval = new FJDParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.classDecl_return classDecl1 = null;

        FJDParser.expr_return expr2 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_classDecl=new RewriteRuleSubtreeStream(adaptor,"rule classDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:41:5: ( ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:41:7: ( classDecl )+ expr
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:41:7: ( classDecl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:41:7: classDecl
            	    {
            	    pushFollow(FOLLOW_classDecl_in_program185);
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

            pushFollow(FOLLOW_expr_in_program196);
            expr2=expr();

            state._fsp--;

            stream_expr.add(expr2.getTree());


            // AST REWRITE
            // elements: expr, classDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:7: -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:43:10: ^( PROGRAM ( classDecl )+ ^( EXPR expr ) )
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
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:43:31: ^( EXPR expr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:46:1: classDecl : 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) ;
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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_fieldDecls=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecls");
        RewriteRuleSubtreeStream stream_ctorDecl=new RewriteRuleSubtreeStream(adaptor,"rule ctorDecl");
        RewriteRuleSubtreeStream stream_methodDecls=new RewriteRuleSubtreeStream(adaptor,"rule methodDecls");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:47:5: ( 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:47:7: 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}'
            {
            string_literal3=(Token)match(input,36,FOLLOW_36_in_classDecl235);  
            stream_36.add(string_literal3);

            className=(Token)match(input,ID,FOLLOW_ID_in_classDecl239);  
            stream_ID.add(className);

            string_literal4=(Token)match(input,37,FOLLOW_37_in_classDecl241);  
            stream_37.add(string_literal4);

            superClass=(Token)match(input,ID,FOLLOW_ID_in_classDecl245);  
            stream_ID.add(superClass);

            char_literal5=(Token)match(input,38,FOLLOW_38_in_classDecl247);  
            stream_38.add(char_literal5);

            pushFollow(FOLLOW_fieldDecls_in_classDecl249);
            fieldDecls6=fieldDecls();

            state._fsp--;

            stream_fieldDecls.add(fieldDecls6.getTree());
            pushFollow(FOLLOW_ctorDecl_in_classDecl251);
            ctorDecl7=ctorDecl();

            state._fsp--;

            stream_ctorDecl.add(ctorDecl7.getTree());
            pushFollow(FOLLOW_methodDecls_in_classDecl253);
            methodDecls8=methodDecls();

            state._fsp--;

            stream_methodDecls.add(methodDecls8.getTree());
            char_literal9=(Token)match(input,39,FOLLOW_39_in_classDecl255);  
            stream_39.add(char_literal9);



            // AST REWRITE
            // elements: methodDecls, superClass, className, fieldDecls, ctorDecl
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
            // 48:7: -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:48:10: ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS, "CLASS"), root_1);

                adaptor.addChild(root_1, stream_className.nextNode());
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:48:29: ^( SUPER_CLASS $superClass)
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:51:1: fieldDecls : ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) ;
    public final FJDParser.fieldDecls_return fieldDecls() throws RecognitionException {
        FJDParser.fieldDecls_return retval = new FJDParser.fieldDecls_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.fieldDecl_return fieldDecl10 = null;


        RewriteRuleSubtreeStream stream_fieldDecl=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:52:5: ( ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:52:7: ( fieldDecl )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:52:7: ( fieldDecl )*
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
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:52:7: fieldDecl
            	    {
            	    pushFollow(FOLLOW_fieldDecl_in_fieldDecls301);
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
            // 53:7: -> ^( FIELDS ( fieldDecl )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:53:10: ^( FIELDS ( fieldDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELDS, "FIELDS"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:53:19: ( fieldDecl )*
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:56:1: fieldDecl : type ID ';' -> ^( FIELD type ID ) ;
    public final FJDParser.fieldDecl_return fieldDecl() throws RecognitionException {
        FJDParser.fieldDecl_return retval = new FJDParser.fieldDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        FJDParser.type_return type11 = null;


        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:57:5: ( type ID ';' -> ^( FIELD type ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:57:7: type ID ';'
            {
            pushFollow(FOLLOW_type_in_fieldDecl339);
            type11=type();

            state._fsp--;

            stream_type.add(type11.getTree());
            ID12=(Token)match(input,ID,FOLLOW_ID_in_fieldDecl341);  
            stream_ID.add(ID12);

            char_literal13=(Token)match(input,40,FOLLOW_40_in_fieldDecl343);  
            stream_40.add(char_literal13);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 58:7: -> ^( FIELD type ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:58:10: ^( FIELD type ID )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:61:1: ctorDecl : name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) ;
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
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_ctorBody=new RewriteRuleSubtreeStream(adaptor,"rule ctorBody");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:5: (name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:7: name= ID '(' ( argList )? ')' '{' ctorBody '}'
            {
            name=(Token)match(input,ID,FOLLOW_ID_in_ctorDecl378);  
            stream_ID.add(name);

            char_literal14=(Token)match(input,41,FOLLOW_41_in_ctorDecl380);  
            stream_41.add(char_literal14);

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:19: ( argList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:62:19: argList
                    {
                    pushFollow(FOLLOW_argList_in_ctorDecl382);
                    argList15=argList();

                    state._fsp--;

                    stream_argList.add(argList15.getTree());

                    }
                    break;

            }

            char_literal16=(Token)match(input,42,FOLLOW_42_in_ctorDecl385);  
            stream_42.add(char_literal16);

            char_literal17=(Token)match(input,38,FOLLOW_38_in_ctorDecl387);  
            stream_38.add(char_literal17);

            pushFollow(FOLLOW_ctorBody_in_ctorDecl389);
            ctorBody18=ctorBody();

            state._fsp--;

            stream_ctorBody.add(ctorBody18.getTree());
            char_literal19=(Token)match(input,39,FOLLOW_39_in_ctorDecl391);  
            stream_39.add(char_literal19);



            // AST REWRITE
            // elements: ctorBody, name, argList
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:7: -> ^( CTOR $name ( argList )? ctorBody )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:63:10: ^( CTOR $name ( argList )? ctorBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CTOR, "CTOR"), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:63:23: ( argList )?
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:66:1: argList : arg ( ',' arg )* -> ^( ARGS ( arg )+ ) ;
    public final FJDParser.argList_return argList() throws RecognitionException {
        FJDParser.argList_return retval = new FJDParser.argList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        FJDParser.arg_return arg20 = null;

        FJDParser.arg_return arg22 = null;


        CommonTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:67:5: ( arg ( ',' arg )* -> ^( ARGS ( arg )+ ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:67:7: arg ( ',' arg )*
            {
            pushFollow(FOLLOW_arg_in_argList428);
            arg20=arg();

            state._fsp--;

            stream_arg.add(arg20.getTree());
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:67:11: ( ',' arg )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:67:12: ',' arg
            	    {
            	    char_literal21=(Token)match(input,43,FOLLOW_43_in_argList431);  
            	    stream_43.add(char_literal21);

            	    pushFollow(FOLLOW_arg_in_argList433);
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
            // 68:7: -> ^( ARGS ( arg )+ )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:68:10: ^( ARGS ( arg )+ )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:71:1: arg : type ID -> ^( ARG type ID ) ;
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
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:72:5: ( type ID -> ^( ARG type ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:72:7: type ID
            {
            pushFollow(FOLLOW_type_in_arg467);
            type23=type();

            state._fsp--;

            stream_type.add(type23.getTree());
            ID24=(Token)match(input,ID,FOLLOW_ID_in_arg469);  
            stream_ID.add(ID24);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:7: -> ^( ARG type ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:73:10: ^( ARG type ID )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:76:1: type : ID -> ^( TYPE ID ) ;
    public final FJDParser.type_return type() throws RecognitionException {
        FJDParser.type_return retval = new FJDParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID25=null;

        CommonTree ID25_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:77:5: ( ID -> ^( TYPE ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:77:7: ID
            {
            ID25=(Token)match(input,ID,FOLLOW_ID_in_type503);  
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
            // 78:7: -> ^( TYPE ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:78:10: ^( TYPE ID )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:81:1: ctorBody : superStmt fieldInits -> ^( CTOR_BODY superStmt fieldInits ) ;
    public final FJDParser.ctorBody_return ctorBody() throws RecognitionException {
        FJDParser.ctorBody_return retval = new FJDParser.ctorBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.superStmt_return superStmt26 = null;

        FJDParser.fieldInits_return fieldInits27 = null;


        RewriteRuleSubtreeStream stream_superStmt=new RewriteRuleSubtreeStream(adaptor,"rule superStmt");
        RewriteRuleSubtreeStream stream_fieldInits=new RewriteRuleSubtreeStream(adaptor,"rule fieldInits");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:82:5: ( superStmt fieldInits -> ^( CTOR_BODY superStmt fieldInits ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:82:7: superStmt fieldInits
            {
            pushFollow(FOLLOW_superStmt_in_ctorBody534);
            superStmt26=superStmt();

            state._fsp--;

            stream_superStmt.add(superStmt26.getTree());
            pushFollow(FOLLOW_fieldInits_in_ctorBody542);
            fieldInits27=fieldInits();

            state._fsp--;

            stream_fieldInits.add(fieldInits27.getTree());


            // AST REWRITE
            // elements: superStmt, fieldInits
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 84:7: -> ^( CTOR_BODY superStmt fieldInits )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:84:10: ^( CTOR_BODY superStmt fieldInits )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CTOR_BODY, "CTOR_BODY"), root_1);

                adaptor.addChild(root_1, stream_superStmt.nextTree());
                adaptor.addChild(root_1, stream_fieldInits.nextTree());

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
    // $ANTLR end "ctorBody"

    public static class superStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superStmt"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:87:1: superStmt : 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) ;
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:88:5: ( 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:88:7: 'super' '(' ( argList )? ')' ';'
            {
            string_literal28=(Token)match(input,44,FOLLOW_44_in_superStmt579);  
            stream_44.add(string_literal28);

            char_literal29=(Token)match(input,41,FOLLOW_41_in_superStmt581);  
            stream_41.add(char_literal29);

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:88:19: ( argList )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:88:19: argList
                    {
                    pushFollow(FOLLOW_argList_in_superStmt583);
                    argList30=argList();

                    state._fsp--;

                    stream_argList.add(argList30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,42,FOLLOW_42_in_superStmt586);  
            stream_42.add(char_literal31);

            char_literal32=(Token)match(input,40,FOLLOW_40_in_superStmt588);  
            stream_40.add(char_literal32);



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
            // 89:7: -> ^( SUPER_STMT ( argList )? )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:89:10: ^( SUPER_STMT ( argList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_STMT, "SUPER_STMT"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:89:23: ( argList )?
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:92:1: fieldInits : ( fieldInit )* -> ^( FIELD_INIT_LIST ( fieldInit )* ) ;
    public final FJDParser.fieldInits_return fieldInits() throws RecognitionException {
        FJDParser.fieldInits_return retval = new FJDParser.fieldInits_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.fieldInit_return fieldInit33 = null;


        RewriteRuleSubtreeStream stream_fieldInit=new RewriteRuleSubtreeStream(adaptor,"rule fieldInit");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:93:5: ( ( fieldInit )* -> ^( FIELD_INIT_LIST ( fieldInit )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:93:7: ( fieldInit )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:93:7: ( fieldInit )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:93:7: fieldInit
            	    {
            	    pushFollow(FOLLOW_fieldInit_in_fieldInits621);
            	    fieldInit33=fieldInit();

            	    state._fsp--;

            	    stream_fieldInit.add(fieldInit33.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: fieldInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:7: -> ^( FIELD_INIT_LIST ( fieldInit )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:94:10: ^( FIELD_INIT_LIST ( fieldInit )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_INIT_LIST, "FIELD_INIT_LIST"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:94:28: ( fieldInit )*
                while ( stream_fieldInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_fieldInit.nextTree());

                }
                stream_fieldInit.reset();

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

    public static class fieldInit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldInit"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:97:1: fieldInit : 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) ;
    public final FJDParser.fieldInit_return fieldInit() throws RecognitionException {
        FJDParser.fieldInit_return retval = new FJDParser.fieldInit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token field=null;
        Token value=null;
        Token string_literal34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token char_literal37=null;

        CommonTree field_tree=null;
        CommonTree value_tree=null;
        CommonTree string_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:5: ( 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:7: 'this' '.' field= ID '=' value= ID ';'
            {
            string_literal34=(Token)match(input,45,FOLLOW_45_in_fieldInit654);  
            stream_45.add(string_literal34);

            char_literal35=(Token)match(input,46,FOLLOW_46_in_fieldInit656);  
            stream_46.add(char_literal35);

            field=(Token)match(input,ID,FOLLOW_ID_in_fieldInit660);  
            stream_ID.add(field);

            char_literal36=(Token)match(input,47,FOLLOW_47_in_fieldInit662);  
            stream_47.add(char_literal36);

            value=(Token)match(input,ID,FOLLOW_ID_in_fieldInit666);  
            stream_ID.add(value);

            char_literal37=(Token)match(input,40,FOLLOW_40_in_fieldInit668);  
            stream_40.add(char_literal37);



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
            // 99:7: -> ^( FIELD_INIT $field $value)
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:10: ^( FIELD_INIT $field $value)
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
    // $ANTLR end "fieldInit"

    public static class methodDecls_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDecls"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:102:1: methodDecls : ( methodDecl )* -> ^( METHODS ( methodDecl )* ) ;
    public final FJDParser.methodDecls_return methodDecls() throws RecognitionException {
        FJDParser.methodDecls_return retval = new FJDParser.methodDecls_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.methodDecl_return methodDecl38 = null;


        RewriteRuleSubtreeStream stream_methodDecl=new RewriteRuleSubtreeStream(adaptor,"rule methodDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:103:5: ( ( methodDecl )* -> ^( METHODS ( methodDecl )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:103:7: ( methodDecl )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:103:7: ( methodDecl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:103:7: methodDecl
            	    {
            	    pushFollow(FOLLOW_methodDecl_in_methodDecls707);
            	    methodDecl38=methodDecl();

            	    state._fsp--;

            	    stream_methodDecl.add(methodDecl38.getTree());

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
            // 104:7: -> ^( METHODS ( methodDecl )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:104:10: ^( METHODS ( methodDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODS, "METHODS"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:104:20: ( methodDecl )*
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:107:1: methodDecl : type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) ;
    public final FJDParser.methodDecl_return methodDecl() throws RecognitionException {
        FJDParser.methodDecl_return retval = new FJDParser.methodDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token char_literal45=null;
        FJDParser.type_return type39 = null;

        FJDParser.argList_return argList41 = null;

        FJDParser.methBody_return methBody44 = null;


        CommonTree name_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_methBody=new RewriteRuleSubtreeStream(adaptor,"rule methBody");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:108:5: ( type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:108:7: type name= ID '(' ( argList )? ')' '{' methBody '}'
            {
            pushFollow(FOLLOW_type_in_methodDecl744);
            type39=type();

            state._fsp--;

            stream_type.add(type39.getTree());
            name=(Token)match(input,ID,FOLLOW_ID_in_methodDecl748);  
            stream_ID.add(name);

            char_literal40=(Token)match(input,41,FOLLOW_41_in_methodDecl750);  
            stream_41.add(char_literal40);

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:108:24: ( argList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:108:24: argList
                    {
                    pushFollow(FOLLOW_argList_in_methodDecl752);
                    argList41=argList();

                    state._fsp--;

                    stream_argList.add(argList41.getTree());

                    }
                    break;

            }

            char_literal42=(Token)match(input,42,FOLLOW_42_in_methodDecl755);  
            stream_42.add(char_literal42);

            char_literal43=(Token)match(input,38,FOLLOW_38_in_methodDecl757);  
            stream_38.add(char_literal43);

            pushFollow(FOLLOW_methBody_in_methodDecl759);
            methBody44=methBody();

            state._fsp--;

            stream_methBody.add(methBody44.getTree());
            char_literal45=(Token)match(input,39,FOLLOW_39_in_methodDecl761);  
            stream_39.add(char_literal45);



            // AST REWRITE
            // elements: argList, name, methBody, type
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:7: -> ^( METHOD type $name ( argList )? methBody )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:109:10: ^( METHOD type $name ( argList )? methBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD, "METHOD"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_name.nextNode());
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:109:30: ( argList )?
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:112:1: methBody : 'return' expr ';' -> ^( METH_BODY ^( EXPR expr ) ) ;
    public final FJDParser.methBody_return methBody() throws RecognitionException {
        FJDParser.methBody_return retval = new FJDParser.methBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        Token char_literal48=null;
        FJDParser.expr_return expr47 = null;


        CommonTree string_literal46_tree=null;
        CommonTree char_literal48_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:5: ( 'return' expr ';' -> ^( METH_BODY ^( EXPR expr ) ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:7: 'return' expr ';'
            {
            string_literal46=(Token)match(input,48,FOLLOW_48_in_methBody805);  
            stream_48.add(string_literal46);

            pushFollow(FOLLOW_expr_in_methBody807);
            expr47=expr();

            state._fsp--;

            stream_expr.add(expr47.getTree());
            char_literal48=(Token)match(input,40,FOLLOW_40_in_methBody809);  
            stream_40.add(char_literal48);



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
            // 114:7: -> ^( METH_BODY ^( EXPR expr ) )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:114:10: ^( METH_BODY ^( EXPR expr ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH_BODY, "METH_BODY"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:114:22: ^( EXPR expr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:117:1: exprList : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final FJDParser.exprList_return exprList() throws RecognitionException {
        FJDParser.exprList_return retval = new FJDParser.exprList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal50=null;
        FJDParser.expr_return expr49 = null;

        FJDParser.expr_return expr51 = null;


        CommonTree char_literal50_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:118:5: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:118:7: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_exprList845);
            expr49=expr();

            state._fsp--;

            stream_expr.add(expr49.getTree());
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:118:12: ( ',' expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:118:13: ',' expr
            	    {
            	    char_literal50=(Token)match(input,43,FOLLOW_43_in_exprList848);  
            	    stream_43.add(char_literal50);

            	    pushFollow(FOLLOW_expr_in_exprList850);
            	    expr51=expr();

            	    state._fsp--;

            	    stream_expr.add(expr51.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



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
            // 119:7: -> ^( EXPR_LIST ( expr )+ )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:119:10: ^( EXPR_LIST ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LIST, "EXPR_LIST"), root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // $ANTLR end "exprList"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:122:1: expr : ( ID | thisExpr ) ( fieldAccessOrMethCall )* ;
    public final FJDParser.expr_return expr() throws RecognitionException {
        FJDParser.expr_return retval = new FJDParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID52=null;
        FJDParser.thisExpr_return thisExpr53 = null;

        FJDParser.fieldAccessOrMethCall_return fieldAccessOrMethCall54 = null;


        CommonTree ID52_tree=null;

        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:5: ( ( ID | thisExpr ) ( fieldAccessOrMethCall )* )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:7: ( ID | thisExpr ) ( fieldAccessOrMethCall )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:7: ( ID | thisExpr )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==41||LA10_0==45||LA10_0==49) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:8: ID
                    {
                    ID52=(Token)match(input,ID,FOLLOW_ID_in_expr885); 
                    ID52_tree = (CommonTree)adaptor.create(ID52);
                    adaptor.addChild(root_0, ID52_tree);


                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:13: thisExpr
                    {
                    pushFollow(FOLLOW_thisExpr_in_expr889);
                    thisExpr53=thisExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, thisExpr53.getTree());

                    }
                    break;

            }

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:23: ( fieldAccessOrMethCall )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:23: fieldAccessOrMethCall
            	    {
            	    pushFollow(FOLLOW_fieldAccessOrMethCall_in_expr892);
            	    fieldAccessOrMethCall54=fieldAccessOrMethCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldAccessOrMethCall54.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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

    public static class thisExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "thisExpr"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:126:1: thisExpr : ( 'this' -> ^( THIS ) | newExpr );
    public final FJDParser.thisExpr_return thisExpr() throws RecognitionException {
        FJDParser.thisExpr_return retval = new FJDParser.thisExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal55=null;
        FJDParser.newExpr_return newExpr56 = null;


        CommonTree string_literal55_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:127:5: ( 'this' -> ^( THIS ) | newExpr )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            else if ( (LA12_0==41||LA12_0==49) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:127:7: 'this'
                    {
                    string_literal55=(Token)match(input,45,FOLLOW_45_in_thisExpr914);  
                    stream_45.add(string_literal55);



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
                    // 128:7: -> ^( THIS )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:128:10: ^( THIS )
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
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:129:7: newExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_thisExpr935);
                    newExpr56=newExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, newExpr56.getTree());

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
    // $ANTLR end "thisExpr"

    public static class newExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:132:1: newExpr : ( 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | castExpr );
    public final FJDParser.newExpr_return newExpr() throws RecognitionException {
        FJDParser.newExpr_return retval = new FJDParser.newExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal57=null;
        Token char_literal59=null;
        Token char_literal61=null;
        FJDParser.type_return type58 = null;

        FJDParser.exprList_return exprList60 = null;

        FJDParser.castExpr_return castExpr62 = null;


        CommonTree string_literal57_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal61_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:133:5: ( 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | castExpr )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            else if ( (LA14_0==41) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:133:7: 'new' type '(' ( exprList )? ')'
                    {
                    string_literal57=(Token)match(input,49,FOLLOW_49_in_newExpr952);  
                    stream_49.add(string_literal57);

                    pushFollow(FOLLOW_type_in_newExpr954);
                    type58=type();

                    state._fsp--;

                    stream_type.add(type58.getTree());
                    char_literal59=(Token)match(input,41,FOLLOW_41_in_newExpr956);  
                    stream_41.add(char_literal59);

                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:133:22: ( exprList )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ID||LA13_0==41||LA13_0==45||LA13_0==49) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:133:22: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_newExpr958);
                            exprList60=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList60.getTree());

                            }
                            break;

                    }

                    char_literal61=(Token)match(input,42,FOLLOW_42_in_newExpr961);  
                    stream_42.add(char_literal61);



                    // AST REWRITE
                    // elements: type, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 134:8: -> ^( NEW_EXPR type ( exprList )? )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:134:11: ^( NEW_EXPR type ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW_EXPR, "NEW_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:134:27: ( exprList )?
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
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:135:7: castExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_newExpr988);
                    castExpr62=castExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, castExpr62.getTree());

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
    // $ANTLR end "newExpr"

    public static class castExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpr"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:138:1: castExpr : '(' type ')' expr -> ^( CAST_EXPR type expr ) ;
    public final FJDParser.castExpr_return castExpr() throws RecognitionException {
        FJDParser.castExpr_return retval = new FJDParser.castExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal63=null;
        Token char_literal65=null;
        FJDParser.type_return type64 = null;

        FJDParser.expr_return expr66 = null;


        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:139:5: ( '(' type ')' expr -> ^( CAST_EXPR type expr ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:139:7: '(' type ')' expr
            {
            char_literal63=(Token)match(input,41,FOLLOW_41_in_castExpr1005);  
            stream_41.add(char_literal63);

            pushFollow(FOLLOW_type_in_castExpr1007);
            type64=type();

            state._fsp--;

            stream_type.add(type64.getTree());
            char_literal65=(Token)match(input,42,FOLLOW_42_in_castExpr1009);  
            stream_42.add(char_literal65);

            pushFollow(FOLLOW_expr_in_castExpr1011);
            expr66=expr();

            state._fsp--;

            stream_expr.add(expr66.getTree());


            // AST REWRITE
            // elements: expr, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:7: -> ^( CAST_EXPR type expr )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:140:10: ^( CAST_EXPR type expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAST_EXPR, "CAST_EXPR"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
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
    // $ANTLR end "castExpr"

    public static class fieldAccessOrMethCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldAccessOrMethCall"
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:143:1: fieldAccessOrMethCall : ( '.' ID -> ^( FIELD_ACCESS_EXPR ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL_EXPR ID ( exprList )? ) );
    public final FJDParser.fieldAccessOrMethCall_return fieldAccessOrMethCall() throws RecognitionException {
        FJDParser.fieldAccessOrMethCall_return retval = new FJDParser.fieldAccessOrMethCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal67=null;
        Token ID68=null;
        Token char_literal69=null;
        Token ID70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        FJDParser.exprList_return exprList72 = null;


        CommonTree char_literal67_tree=null;
        CommonTree ID68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree ID70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:144:5: ( '.' ID -> ^( FIELD_ACCESS_EXPR ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL_EXPR ID ( exprList )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==ID) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==41) ) {
                        alt16=2;
                    }
                    else if ( (LA16_2==EOF||LA16_2==40||(LA16_2>=42 && LA16_2<=43)||LA16_2==46) ) {
                        alt16=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:144:7: '.' ID
                    {
                    char_literal67=(Token)match(input,46,FOLLOW_46_in_fieldAccessOrMethCall1044);  
                    stream_46.add(char_literal67);

                    ID68=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall1046);  
                    stream_ID.add(ID68);



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
                    // 144:15: -> ^( FIELD_ACCESS_EXPR ID )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:144:18: ^( FIELD_ACCESS_EXPR ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_ACCESS_EXPR, "FIELD_ACCESS_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:145:7: '.' ID '(' ( exprList )? ')'
                    {
                    char_literal69=(Token)match(input,46,FOLLOW_46_in_fieldAccessOrMethCall1063);  
                    stream_46.add(char_literal69);

                    ID70=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall1065);  
                    stream_ID.add(ID70);

                    char_literal71=(Token)match(input,41,FOLLOW_41_in_fieldAccessOrMethCall1067);  
                    stream_41.add(char_literal71);

                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:145:18: ( exprList )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ID||LA15_0==41||LA15_0==45||LA15_0==49) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:145:18: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_fieldAccessOrMethCall1069);
                            exprList72=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList72.getTree());

                            }
                            break;

                    }

                    char_literal73=(Token)match(input,42,FOLLOW_42_in_fieldAccessOrMethCall1072);  
                    stream_42.add(char_literal73);



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
                    // 145:32: -> ^( METH_CALL_EXPR ID ( exprList )? )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:145:35: ^( METH_CALL_EXPR ID ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH_CALL_EXPR, "METH_CALL_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:145:55: ( exprList )?
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


 

    public static final BitSet FOLLOW_classDecl_in_program185 = new BitSet(new long[]{0x0002221010000000L});
    public static final BitSet FOLLOW_expr_in_program196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_classDecl235 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_classDecl239 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_classDecl241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_classDecl245 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_classDecl247 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_fieldDecls_in_classDecl249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ctorDecl_in_classDecl251 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_methodDecls_in_classDecl253 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_classDecl255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDecl_in_fieldDecls301 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_type_in_fieldDecl339 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_fieldDecl341 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fieldDecl343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ctorDecl378 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ctorDecl380 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_argList_in_ctorDecl382 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ctorDecl385 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ctorDecl387 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ctorBody_in_ctorDecl389 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ctorDecl391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_argList428 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_argList431 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_arg_in_argList433 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_type_in_arg467 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_arg469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superStmt_in_ctorBody534 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_fieldInits_in_ctorBody542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_superStmt579 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_superStmt581 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_argList_in_superStmt583 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_superStmt586 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_superStmt588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldInit_in_fieldInits621 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_fieldInit654 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_fieldInit656 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_fieldInit660 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_fieldInit662 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_fieldInit666 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fieldInit668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDecl_in_methodDecls707 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_type_in_methodDecl744 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_methodDecl748 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_methodDecl750 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_argList_in_methodDecl752 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_methodDecl755 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_methodDecl757 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_methBody_in_methodDecl759 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_methodDecl761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_methBody805 = new BitSet(new long[]{0x0002220010000000L});
    public static final BitSet FOLLOW_expr_in_methBody807 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_methBody809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList845 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_exprList848 = new BitSet(new long[]{0x0002220010000000L});
    public static final BitSet FOLLOW_expr_in_exprList850 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ID_in_expr885 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_thisExpr_in_expr889 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_fieldAccessOrMethCall_in_expr892 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_45_in_thisExpr914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_thisExpr935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_newExpr952 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_type_in_newExpr954 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_newExpr956 = new BitSet(new long[]{0x0002260010000000L});
    public static final BitSet FOLLOW_exprList_in_newExpr958 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_newExpr961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_newExpr988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_castExpr1005 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_type_in_castExpr1007 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_castExpr1009 = new BitSet(new long[]{0x0002220010000000L});
    public static final BitSet FOLLOW_expr_in_castExpr1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_fieldAccessOrMethCall1044 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_fieldAccessOrMethCall1063 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall1065 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_fieldAccessOrMethCall1067 = new BitSet(new long[]{0x0002260010000000L});
    public static final BitSet FOLLOW_exprList_in_fieldAccessOrMethCall1069 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_fieldAccessOrMethCall1072 = new BitSet(new long[]{0x0000000000000002L});

}