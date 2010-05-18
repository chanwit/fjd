// $ANTLR 3.2 Sep 23, 2009 14:05:07 C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g 2010-05-18 14:26:32
 package org.fjd; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class FJDParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "CLASS", "SUPER_CLASS", "FIELD", "FIELDS", "CTOR", "SUPER_STMT", "FIELD_INIT", "METHODS", "METHOD", "TYPE", "ARGS", "ARG", "METH_BODY", "EXPR", "EXPR_LIST", "THIS", "VALUE", "NEW_EXPR", "CAST_EXPR", "FIELD_ACCESS_EXPR", "METH_CALL_EXPR", "ID", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'class'", "'extends'", "'{'", "'}'", "';'", "'('", "')'", "','", "'super'", "'this'", "'.'", "'='", "'return'", "'new'"
    };
    public static final int CLASS=5;
    public static final int FIELD_ACCESS_EXPR=24;
    public static final int OCTAL_ESC=33;
    public static final int CHAR=30;
    public static final int SUPER_STMT=10;
    public static final int ID=26;
    public static final int EOF=-1;
    public static final int TYPE=14;
    public static final int EXPR_LIST=19;
    public static final int EXPR=18;
    public static final int ESC_SEQ=28;
    public static final int FIELD_INIT=11;
    public static final int METHODS=12;
    public static final int ARG=16;
    public static final int CTOR=9;
    public static final int CAST_EXPR=23;
    public static final int THIS=20;
    public static final int ARGS=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int METH_CALL_EXPR=25;
    public static final int UNICODE_ESC=32;
    public static final int SUPER_CLASS=6;
    public static final int HEX_DIGIT=31;
    public static final int FIELDS=8;
    public static final int VALUE=21;
    public static final int WS=27;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int NEW_EXPR=22;
    public static final int METH_BODY=17;
    public static final int PROGRAM=4;
    public static final int FIELD=7;
    public static final int METHOD=13;
    public static final int STRING=29;

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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:38:1: program : ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) ) ;
    public final FJDParser.program_return program() throws RecognitionException {
        FJDParser.program_return retval = new FJDParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.classDecl_return classDecl1 = null;

        FJDParser.expr_return expr2 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_classDecl=new RewriteRuleSubtreeStream(adaptor,"rule classDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:39:5: ( ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:39:7: ( classDecl )+ expr
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:39:7: ( classDecl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:39:7: classDecl
            	    {
            	    pushFollow(FOLLOW_classDecl_in_program175);
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

            pushFollow(FOLLOW_expr_in_program186);
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
            // 41:7: -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:41:10: ^( PROGRAM ( classDecl )+ ^( EXPR expr ) )
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
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:41:31: ^( EXPR expr )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:44:1: classDecl : 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) ;
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
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_fieldDecls=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecls");
        RewriteRuleSubtreeStream stream_ctorDecl=new RewriteRuleSubtreeStream(adaptor,"rule ctorDecl");
        RewriteRuleSubtreeStream stream_methodDecls=new RewriteRuleSubtreeStream(adaptor,"rule methodDecls");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:45:5: ( 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:45:7: 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}'
            {
            string_literal3=(Token)match(input,34,FOLLOW_34_in_classDecl225);  
            stream_34.add(string_literal3);

            className=(Token)match(input,ID,FOLLOW_ID_in_classDecl229);  
            stream_ID.add(className);

            string_literal4=(Token)match(input,35,FOLLOW_35_in_classDecl231);  
            stream_35.add(string_literal4);

            superClass=(Token)match(input,ID,FOLLOW_ID_in_classDecl235);  
            stream_ID.add(superClass);

            char_literal5=(Token)match(input,36,FOLLOW_36_in_classDecl237);  
            stream_36.add(char_literal5);

            pushFollow(FOLLOW_fieldDecls_in_classDecl239);
            fieldDecls6=fieldDecls();

            state._fsp--;

            stream_fieldDecls.add(fieldDecls6.getTree());
            pushFollow(FOLLOW_ctorDecl_in_classDecl241);
            ctorDecl7=ctorDecl();

            state._fsp--;

            stream_ctorDecl.add(ctorDecl7.getTree());
            pushFollow(FOLLOW_methodDecls_in_classDecl243);
            methodDecls8=methodDecls();

            state._fsp--;

            stream_methodDecls.add(methodDecls8.getTree());
            char_literal9=(Token)match(input,37,FOLLOW_37_in_classDecl245);  
            stream_37.add(char_literal9);



            // AST REWRITE
            // elements: fieldDecls, superClass, ctorDecl, className, methodDecls
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
            // 46:7: -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:46:10: ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS, "CLASS"), root_1);

                adaptor.addChild(root_1, stream_className.nextNode());
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:46:29: ^( SUPER_CLASS $superClass)
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:49:1: fieldDecls : ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) ;
    public final FJDParser.fieldDecls_return fieldDecls() throws RecognitionException {
        FJDParser.fieldDecls_return retval = new FJDParser.fieldDecls_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.fieldDecl_return fieldDecl10 = null;


        RewriteRuleSubtreeStream stream_fieldDecl=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:50:5: ( ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:50:7: ( fieldDecl )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:50:7: ( fieldDecl )*
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
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:50:7: fieldDecl
            	    {
            	    pushFollow(FOLLOW_fieldDecl_in_fieldDecls291);
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
            // 51:7: -> ^( FIELDS ( fieldDecl )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:51:10: ^( FIELDS ( fieldDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELDS, "FIELDS"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:51:19: ( fieldDecl )*
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:54:1: fieldDecl : type ID ';' -> ^( FIELD type ID ) ;
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
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:55:5: ( type ID ';' -> ^( FIELD type ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:55:7: type ID ';'
            {
            pushFollow(FOLLOW_type_in_fieldDecl329);
            type11=type();

            state._fsp--;

            stream_type.add(type11.getTree());
            ID12=(Token)match(input,ID,FOLLOW_ID_in_fieldDecl331);  
            stream_ID.add(ID12);

            char_literal13=(Token)match(input,38,FOLLOW_38_in_fieldDecl333);  
            stream_38.add(char_literal13);



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
            // 56:7: -> ^( FIELD type ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:56:10: ^( FIELD type ID )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:59:1: ctorDecl : name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) ;
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
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_ctorBody=new RewriteRuleSubtreeStream(adaptor,"rule ctorBody");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:60:5: (name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:60:7: name= ID '(' ( argList )? ')' '{' ctorBody '}'
            {
            name=(Token)match(input,ID,FOLLOW_ID_in_ctorDecl368);  
            stream_ID.add(name);

            char_literal14=(Token)match(input,39,FOLLOW_39_in_ctorDecl370);  
            stream_39.add(char_literal14);

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:60:19: ( argList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:60:19: argList
                    {
                    pushFollow(FOLLOW_argList_in_ctorDecl372);
                    argList15=argList();

                    state._fsp--;

                    stream_argList.add(argList15.getTree());

                    }
                    break;

            }

            char_literal16=(Token)match(input,40,FOLLOW_40_in_ctorDecl375);  
            stream_40.add(char_literal16);

            char_literal17=(Token)match(input,36,FOLLOW_36_in_ctorDecl377);  
            stream_36.add(char_literal17);

            pushFollow(FOLLOW_ctorBody_in_ctorDecl379);
            ctorBody18=ctorBody();

            state._fsp--;

            stream_ctorBody.add(ctorBody18.getTree());
            char_literal19=(Token)match(input,37,FOLLOW_37_in_ctorDecl381);  
            stream_37.add(char_literal19);



            // AST REWRITE
            // elements: name, argList, ctorBody
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 61:7: -> ^( CTOR $name ( argList )? ctorBody )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:61:10: ^( CTOR $name ( argList )? ctorBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CTOR, "CTOR"), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:61:23: ( argList )?
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:64:1: argList : arg ( ',' arg )* -> ^( ARGS ( arg )+ ) ;
    public final FJDParser.argList_return argList() throws RecognitionException {
        FJDParser.argList_return retval = new FJDParser.argList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        FJDParser.arg_return arg20 = null;

        FJDParser.arg_return arg22 = null;


        CommonTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:65:5: ( arg ( ',' arg )* -> ^( ARGS ( arg )+ ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:65:7: arg ( ',' arg )*
            {
            pushFollow(FOLLOW_arg_in_argList418);
            arg20=arg();

            state._fsp--;

            stream_arg.add(arg20.getTree());
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:65:11: ( ',' arg )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==41) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:65:12: ',' arg
            	    {
            	    char_literal21=(Token)match(input,41,FOLLOW_41_in_argList421);  
            	    stream_41.add(char_literal21);

            	    pushFollow(FOLLOW_arg_in_argList423);
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
            // 66:7: -> ^( ARGS ( arg )+ )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:66:10: ^( ARGS ( arg )+ )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:69:1: arg : type ID -> ^( ARG type ID ) ;
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
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:70:5: ( type ID -> ^( ARG type ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:70:7: type ID
            {
            pushFollow(FOLLOW_type_in_arg461);
            type23=type();

            state._fsp--;

            stream_type.add(type23.getTree());
            ID24=(Token)match(input,ID,FOLLOW_ID_in_arg463);  
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
            // 70:15: -> ^( ARG type ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:70:18: ^( ARG type ID )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:73:1: type : ID -> ^( TYPE ID ) ;
    public final FJDParser.type_return type() throws RecognitionException {
        FJDParser.type_return retval = new FJDParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID25=null;

        CommonTree ID25_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:74:5: ( ID -> ^( TYPE ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:74:7: ID
            {
            ID25=(Token)match(input,ID,FOLLOW_ID_in_type494);  
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
            // 75:5: -> ^( TYPE ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:75:8: ^( TYPE ID )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:78:1: ctorBody : superStmt ( fieldInits )? ;
    public final FJDParser.ctorBody_return ctorBody() throws RecognitionException {
        FJDParser.ctorBody_return retval = new FJDParser.ctorBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.superStmt_return superStmt26 = null;

        FJDParser.fieldInits_return fieldInits27 = null;



        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:79:5: ( superStmt ( fieldInits )? )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:79:7: superStmt ( fieldInits )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_superStmt_in_ctorBody523);
            superStmt26=superStmt();

            state._fsp--;

            adaptor.addChild(root_0, superStmt26.getTree());
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:7: ( fieldInits )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:7: fieldInits
                    {
                    pushFollow(FOLLOW_fieldInits_in_ctorBody531);
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:83:1: superStmt : 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) ;
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
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:84:5: ( 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:84:7: 'super' '(' ( argList )? ')' ';'
            {
            string_literal28=(Token)match(input,42,FOLLOW_42_in_superStmt553);  
            stream_42.add(string_literal28);

            char_literal29=(Token)match(input,39,FOLLOW_39_in_superStmt555);  
            stream_39.add(char_literal29);

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:84:19: ( argList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:84:19: argList
                    {
                    pushFollow(FOLLOW_argList_in_superStmt557);
                    argList30=argList();

                    state._fsp--;

                    stream_argList.add(argList30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,40,FOLLOW_40_in_superStmt560);  
            stream_40.add(char_literal31);

            char_literal32=(Token)match(input,38,FOLLOW_38_in_superStmt562);  
            stream_38.add(char_literal32);



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
            // 85:7: -> ^( SUPER_STMT ( argList )? )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:85:10: ^( SUPER_STMT ( argList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_STMT, "SUPER_STMT"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:85:23: ( argList )?
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:88:1: fieldInits : 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) ;
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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:89:5: ( 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:89:7: 'this' '.' field= ID '=' value= ID ';'
            {
            string_literal33=(Token)match(input,43,FOLLOW_43_in_fieldInits595);  
            stream_43.add(string_literal33);

            char_literal34=(Token)match(input,44,FOLLOW_44_in_fieldInits597);  
            stream_44.add(char_literal34);

            field=(Token)match(input,ID,FOLLOW_ID_in_fieldInits601);  
            stream_ID.add(field);

            char_literal35=(Token)match(input,45,FOLLOW_45_in_fieldInits603);  
            stream_45.add(char_literal35);

            value=(Token)match(input,ID,FOLLOW_ID_in_fieldInits607);  
            stream_ID.add(value);

            char_literal36=(Token)match(input,38,FOLLOW_38_in_fieldInits609);  
            stream_38.add(char_literal36);



            // AST REWRITE
            // elements: value, field
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
            // 90:7: -> ^( FIELD_INIT $field $value)
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:90:10: ^( FIELD_INIT $field $value)
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:93:1: methodDecls : ( methodDecl )* -> ^( METHODS ( methodDecl )* ) ;
    public final FJDParser.methodDecls_return methodDecls() throws RecognitionException {
        FJDParser.methodDecls_return retval = new FJDParser.methodDecls_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FJDParser.methodDecl_return methodDecl37 = null;


        RewriteRuleSubtreeStream stream_methodDecl=new RewriteRuleSubtreeStream(adaptor,"rule methodDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:94:5: ( ( methodDecl )* -> ^( METHODS ( methodDecl )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:94:7: ( methodDecl )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:94:7: ( methodDecl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:94:7: methodDecl
            	    {
            	    pushFollow(FOLLOW_methodDecl_in_methodDecls648);
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
            // 95:7: -> ^( METHODS ( methodDecl )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:95:10: ^( METHODS ( methodDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODS, "METHODS"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:95:20: ( methodDecl )*
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:1: methodDecl : type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) ;
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
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_methBody=new RewriteRuleSubtreeStream(adaptor,"rule methBody");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:5: ( type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:7: type name= ID '(' ( argList )? ')' '{' methBody '}'
            {
            pushFollow(FOLLOW_type_in_methodDecl685);
            type38=type();

            state._fsp--;

            stream_type.add(type38.getTree());
            name=(Token)match(input,ID,FOLLOW_ID_in_methodDecl689);  
            stream_ID.add(name);

            char_literal39=(Token)match(input,39,FOLLOW_39_in_methodDecl691);  
            stream_39.add(char_literal39);

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:24: ( argList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:24: argList
                    {
                    pushFollow(FOLLOW_argList_in_methodDecl693);
                    argList40=argList();

                    state._fsp--;

                    stream_argList.add(argList40.getTree());

                    }
                    break;

            }

            char_literal41=(Token)match(input,40,FOLLOW_40_in_methodDecl696);  
            stream_40.add(char_literal41);

            char_literal42=(Token)match(input,36,FOLLOW_36_in_methodDecl698);  
            stream_36.add(char_literal42);

            pushFollow(FOLLOW_methBody_in_methodDecl700);
            methBody43=methBody();

            state._fsp--;

            stream_methBody.add(methBody43.getTree());
            char_literal44=(Token)match(input,37,FOLLOW_37_in_methodDecl702);  
            stream_37.add(char_literal44);



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
            // 100:7: -> ^( METHOD type $name ( argList )? methBody )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:100:10: ^( METHOD type $name ( argList )? methBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD, "METHOD"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_name.nextNode());
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:100:30: ( argList )?
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:103:1: methBody : 'return' expr ';' -> ^( METH_BODY ^( EXPR expr ) ) ;
    public final FJDParser.methBody_return methBody() throws RecognitionException {
        FJDParser.methBody_return retval = new FJDParser.methBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal45=null;
        Token char_literal47=null;
        FJDParser.expr_return expr46 = null;


        CommonTree string_literal45_tree=null;
        CommonTree char_literal47_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:104:5: ( 'return' expr ';' -> ^( METH_BODY ^( EXPR expr ) ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:104:7: 'return' expr ';'
            {
            string_literal45=(Token)match(input,46,FOLLOW_46_in_methBody746);  
            stream_46.add(string_literal45);

            pushFollow(FOLLOW_expr_in_methBody748);
            expr46=expr();

            state._fsp--;

            stream_expr.add(expr46.getTree());
            char_literal47=(Token)match(input,38,FOLLOW_38_in_methBody750);  
            stream_38.add(char_literal47);



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
            // 105:7: -> ^( METH_BODY ^( EXPR expr ) )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:105:10: ^( METH_BODY ^( EXPR expr ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH_BODY, "METH_BODY"), root_1);

                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:105:22: ^( EXPR expr )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:108:1: exprList : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final FJDParser.exprList_return exprList() throws RecognitionException {
        FJDParser.exprList_return retval = new FJDParser.exprList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        FJDParser.expr_return expr48 = null;

        FJDParser.expr_return expr50 = null;


        CommonTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:109:5: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:109:7: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_exprList786);
            expr48=expr();

            state._fsp--;

            stream_expr.add(expr48.getTree());
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:109:12: ( ',' expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:109:13: ',' expr
            	    {
            	    char_literal49=(Token)match(input,41,FOLLOW_41_in_exprList789);  
            	    stream_41.add(char_literal49);

            	    pushFollow(FOLLOW_expr_in_exprList791);
            	    expr50=expr();

            	    state._fsp--;

            	    stream_expr.add(expr50.getTree());

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
            // 110:5: -> ^( EXPR_LIST ( expr )+ )
            {
                // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:110:8: ^( EXPR_LIST ( expr )+ )
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:113:1: expr : ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | '(' type ')' expr -> ^( CAST_EXPR type expr ) ) ( fieldAccessOrMethCall )* ;
    public final FJDParser.expr_return expr() throws RecognitionException {
        FJDParser.expr_return retval = new FJDParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal51=null;
        Token ID52=null;
        Token string_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        FJDParser.type_return type54 = null;

        FJDParser.exprList_return exprList56 = null;

        FJDParser.type_return type59 = null;

        FJDParser.expr_return expr61 = null;

        FJDParser.fieldAccessOrMethCall_return fieldAccessOrMethCall62 = null;


        CommonTree string_literal51_tree=null;
        CommonTree ID52_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal60_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_fieldAccessOrMethCall=new RewriteRuleSubtreeStream(adaptor,"rule fieldAccessOrMethCall");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:114:5: ( ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | '(' type ')' expr -> ^( CAST_EXPR type expr ) ) ( fieldAccessOrMethCall )* )
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:115:5: ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | '(' type ')' expr -> ^( CAST_EXPR type expr ) ) ( fieldAccessOrMethCall )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:115:5: ( 'this' -> ^( THIS ) | ID -> ^( VALUE ID ) | 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | '(' type ')' expr -> ^( CAST_EXPR type expr ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt11=1;
                }
                break;
            case ID:
                {
                alt11=2;
                }
                break;
            case 47:
                {
                alt11=3;
                }
                break;
            case 39:
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
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:115:9: 'this'
                    {
                    string_literal51=(Token)match(input,43,FOLLOW_43_in_expr831);  
                    stream_43.add(string_literal51);



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
                    // 115:16: -> ^( THIS )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:115:19: ^( THIS )
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
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:116:9: ID
                    {
                    ID52=(Token)match(input,ID,FOLLOW_ID_in_expr847);  
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
                    // 116:16: -> ^( VALUE ID )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:116:19: ^( VALUE ID )
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
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:117:9: 'new' type '(' ( exprList )? ')'
                    {
                    string_literal53=(Token)match(input,47,FOLLOW_47_in_expr869);  
                    stream_47.add(string_literal53);

                    pushFollow(FOLLOW_type_in_expr871);
                    type54=type();

                    state._fsp--;

                    stream_type.add(type54.getTree());
                    char_literal55=(Token)match(input,39,FOLLOW_39_in_expr873);  
                    stream_39.add(char_literal55);

                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:117:24: ( exprList )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID||LA10_0==39||LA10_0==43||LA10_0==47) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:117:24: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_expr875);
                            exprList56=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList56.getTree());

                            }
                            break;

                    }

                    char_literal57=(Token)match(input,40,FOLLOW_40_in_expr878);  
                    stream_40.add(char_literal57);



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
                    // 117:39: -> ^( NEW_EXPR type ( exprList )? )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:117:42: ^( NEW_EXPR type ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW_EXPR, "NEW_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:117:58: ( exprList )?
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
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:118:9: '(' type ')' expr
                    {
                    char_literal58=(Token)match(input,39,FOLLOW_39_in_expr900);  
                    stream_39.add(char_literal58);

                    pushFollow(FOLLOW_type_in_expr902);
                    type59=type();

                    state._fsp--;

                    stream_type.add(type59.getTree());
                    char_literal60=(Token)match(input,40,FOLLOW_40_in_expr904);  
                    stream_40.add(char_literal60);

                    pushFollow(FOLLOW_expr_in_expr906);
                    expr61=expr();

                    state._fsp--;

                    stream_expr.add(expr61.getTree());


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
                    // 118:27: -> ^( CAST_EXPR type expr )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:118:30: ^( CAST_EXPR type expr )
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
                    break;

            }

            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:119:7: ( fieldAccessOrMethCall )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:119:7: fieldAccessOrMethCall
            	    {
            	    pushFollow(FOLLOW_fieldAccessOrMethCall_in_expr924);
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
    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:122:1: fieldAccessOrMethCall : ( '.' ID -> ^( FIELD_ACCESS_EXPR ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL_EXPR ID ( exprList )? ) );
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:5: ( '.' ID -> ^( FIELD_ACCESS_EXPR ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL_EXPR ID ( exprList )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==39) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==EOF||LA14_2==38||(LA14_2>=40 && LA14_2<=41)||LA14_2==44) ) {
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
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:7: '.' ID
                    {
                    char_literal63=(Token)match(input,44,FOLLOW_44_in_fieldAccessOrMethCall946);  
                    stream_44.add(char_literal63);

                    ID64=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall948);  
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
                    // 123:15: -> ^( FIELD_ACCESS_EXPR ID )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:123:18: ^( FIELD_ACCESS_EXPR ID )
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
                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:124:7: '.' ID '(' ( exprList )? ')'
                    {
                    char_literal65=(Token)match(input,44,FOLLOW_44_in_fieldAccessOrMethCall965);  
                    stream_44.add(char_literal65);

                    ID66=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall967);  
                    stream_ID.add(ID66);

                    char_literal67=(Token)match(input,39,FOLLOW_39_in_fieldAccessOrMethCall969);  
                    stream_39.add(char_literal67);

                    // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:124:18: ( exprList )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ID||LA13_0==39||LA13_0==43||LA13_0==47) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:124:18: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_fieldAccessOrMethCall971);
                            exprList68=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList68.getTree());

                            }
                            break;

                    }

                    char_literal69=(Token)match(input,40,FOLLOW_40_in_fieldAccessOrMethCall974);  
                    stream_40.add(char_literal69);



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
                    // 124:32: -> ^( METH_CALL_EXPR ID ( exprList )? )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:124:35: ^( METH_CALL_EXPR ID ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH_CALL_EXPR, "METH_CALL_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:124:55: ( exprList )?
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


 

    public static final BitSet FOLLOW_classDecl_in_program175 = new BitSet(new long[]{0x0000888404000000L});
    public static final BitSet FOLLOW_expr_in_program186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_classDecl225 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_classDecl229 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_classDecl231 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_classDecl235 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_classDecl237 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_fieldDecls_in_classDecl239 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ctorDecl_in_classDecl241 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_methodDecls_in_classDecl243 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_classDecl245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDecl_in_fieldDecls291 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_fieldDecl329 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_fieldDecl331 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fieldDecl333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ctorDecl368 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ctorDecl370 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_argList_in_ctorDecl372 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ctorDecl375 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ctorDecl377 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ctorBody_in_ctorDecl379 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ctorDecl381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_argList418 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_argList421 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_arg_in_argList423 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_type_in_arg461 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_arg463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superStmt_in_ctorBody523 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_fieldInits_in_ctorBody531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_superStmt553 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_superStmt555 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_argList_in_superStmt557 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_superStmt560 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_superStmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_fieldInits595 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_fieldInits597 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_fieldInits601 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_fieldInits603 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_fieldInits607 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fieldInits609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDecl_in_methodDecls648 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_methodDecl685 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_methodDecl689 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_methodDecl691 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_argList_in_methodDecl693 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_methodDecl696 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_methodDecl698 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_methBody_in_methodDecl700 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_methodDecl702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_methBody746 = new BitSet(new long[]{0x0000888004000000L});
    public static final BitSet FOLLOW_expr_in_methBody748 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_methBody750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList786 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_exprList789 = new BitSet(new long[]{0x0000888004000000L});
    public static final BitSet FOLLOW_expr_in_exprList791 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_43_in_expr831 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ID_in_expr847 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_47_in_expr869 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_expr871 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_expr873 = new BitSet(new long[]{0x0000898004000000L});
    public static final BitSet FOLLOW_exprList_in_expr875 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr878 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_39_in_expr900 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_expr902 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr904 = new BitSet(new long[]{0x0000888004000000L});
    public static final BitSet FOLLOW_expr_in_expr906 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_fieldAccessOrMethCall_in_expr924 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_fieldAccessOrMethCall946 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_fieldAccessOrMethCall965 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall967 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_fieldAccessOrMethCall969 = new BitSet(new long[]{0x0000898004000000L});
    public static final BitSet FOLLOW_exprList_in_fieldAccessOrMethCall971 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fieldAccessOrMethCall974 = new BitSet(new long[]{0x0000000000000002L});

}