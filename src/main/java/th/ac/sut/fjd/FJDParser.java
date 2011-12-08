// $ANTLR 3.4 C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g 2011-12-08 23:52:55
 package th.ac.sut.fjd; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FJDParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ARGS", "CAST_EXPR", "CHAR", "CLASS", "CTOR", "CTOR_BODY", "DYNAMIC", "ESC_SEQ", "EXPR", "EXPR_LIST", "FIELD", "FIELDS", "FIELD_ACCESS_EXPR", "FIELD_INIT", "FIELD_INIT_LIST", "HEX_DIGIT", "ID", "METHOD", "METHODS", "METH_BODY", "METH_CALL_EXPR", "NEW_EXPR", "OCTAL_ESC", "PROGRAM", "STRING", "SUPER_CLASS", "SUPER_STMT", "THIS_EXPR", "TYPE", "UNICODE_ESC", "VALUE_EXPR", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'class'", "'def'", "'extends'", "'new'", "'return'", "'super'", "'this'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int ARG=4;
    public static final int ARGS=5;
    public static final int CAST_EXPR=6;
    public static final int CHAR=7;
    public static final int CLASS=8;
    public static final int CTOR=9;
    public static final int CTOR_BODY=10;
    public static final int DYNAMIC=11;
    public static final int ESC_SEQ=12;
    public static final int EXPR=13;
    public static final int EXPR_LIST=14;
    public static final int FIELD=15;
    public static final int FIELDS=16;
    public static final int FIELD_ACCESS_EXPR=17;
    public static final int FIELD_INIT=18;
    public static final int FIELD_INIT_LIST=19;
    public static final int HEX_DIGIT=20;
    public static final int ID=21;
    public static final int METHOD=22;
    public static final int METHODS=23;
    public static final int METH_BODY=24;
    public static final int METH_CALL_EXPR=25;
    public static final int NEW_EXPR=26;
    public static final int OCTAL_ESC=27;
    public static final int PROGRAM=28;
    public static final int STRING=29;
    public static final int SUPER_CLASS=30;
    public static final int SUPER_STMT=31;
    public static final int THIS_EXPR=32;
    public static final int TYPE=33;
    public static final int UNICODE_ESC=34;
    public static final int VALUE_EXPR=35;
    public static final int WS=36;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

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
    public String getGrammarFileName() { return "C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:41:1: program : ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) ) ;
    public final FJDParser.program_return program() throws RecognitionException {
        FJDParser.program_return retval = new FJDParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FJDParser.classDecl_return classDecl1 =null;

        FJDParser.expr_return expr2 =null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_classDecl=new RewriteRuleSubtreeStream(adaptor,"rule classDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:42:5: ( ( classDecl )+ expr -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:42:7: ( classDecl )+ expr
            {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:42:7: ( classDecl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:42:7: classDecl
            	    {
            	    pushFollow(FOLLOW_classDecl_in_program187);
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
            // 44:7: -> ^( PROGRAM ( classDecl )+ ^( EXPR expr ) )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:44:10: ^( PROGRAM ( classDecl )+ ^( EXPR expr ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                if ( !(stream_classDecl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_classDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDecl.nextTree());

                }
                stream_classDecl.reset();

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:44:31: ^( EXPR expr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPR, "EXPR")
                , root_2);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class classDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:47:1: classDecl : 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) ;
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
        FJDParser.fieldDecls_return fieldDecls6 =null;

        FJDParser.ctorDecl_return ctorDecl7 =null;

        FJDParser.methodDecls_return methodDecls8 =null;


        CommonTree className_tree=null;
        CommonTree superClass_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal9_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_fieldDecls=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecls");
        RewriteRuleSubtreeStream stream_ctorDecl=new RewriteRuleSubtreeStream(adaptor,"rule ctorDecl");
        RewriteRuleSubtreeStream stream_methodDecls=new RewriteRuleSubtreeStream(adaptor,"rule methodDecls");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:48:5: ( 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}' -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:48:9: 'class' className= ID 'extends' superClass= ID '{' fieldDecls ctorDecl methodDecls '}'
            {
            string_literal3=(Token)match(input,43,FOLLOW_43_in_classDecl236);  
            stream_43.add(string_literal3);


            className=(Token)match(input,ID,FOLLOW_ID_in_classDecl240);  
            stream_ID.add(className);


            string_literal4=(Token)match(input,45,FOLLOW_45_in_classDecl242);  
            stream_45.add(string_literal4);


            superClass=(Token)match(input,ID,FOLLOW_ID_in_classDecl246);  
            stream_ID.add(superClass);


            char_literal5=(Token)match(input,50,FOLLOW_50_in_classDecl248);  
            stream_50.add(char_literal5);


            pushFollow(FOLLOW_fieldDecls_in_classDecl262);
            fieldDecls6=fieldDecls();

            state._fsp--;

            stream_fieldDecls.add(fieldDecls6.getTree());

            pushFollow(FOLLOW_ctorDecl_in_classDecl264);
            ctorDecl7=ctorDecl();

            state._fsp--;

            stream_ctorDecl.add(ctorDecl7.getTree());

            pushFollow(FOLLOW_methodDecls_in_classDecl266);
            methodDecls8=methodDecls();

            state._fsp--;

            stream_methodDecls.add(methodDecls8.getTree());

            char_literal9=(Token)match(input,51,FOLLOW_51_in_classDecl276);  
            stream_51.add(char_literal9);


            // AST REWRITE
            // elements: ctorDecl, className, methodDecls, fieldDecls, superClass
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
            // 51:5: -> ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:51:9: ^( CLASS $className ^( SUPER_CLASS $superClass) fieldDecls ctorDecl methodDecls )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASS, "CLASS")
                , root_1);

                adaptor.addChild(root_1, stream_className.nextNode());

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:51:28: ^( SUPER_CLASS $superClass)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SUPER_CLASS, "SUPER_CLASS")
                , root_2);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class fieldDecls_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDecls"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:56:1: fieldDecls : ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) ;
    public final FJDParser.fieldDecls_return fieldDecls() throws RecognitionException {
        FJDParser.fieldDecls_return retval = new FJDParser.fieldDecls_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FJDParser.fieldDecl_return fieldDecl10 =null;


        RewriteRuleSubtreeStream stream_fieldDecl=new RewriteRuleSubtreeStream(adaptor,"rule fieldDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:57:5: ( ( fieldDecl )* -> ^( FIELDS ( fieldDecl )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:57:7: ( fieldDecl )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:57:7: ( fieldDecl )*
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
                else if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:57:7: fieldDecl
            	    {
            	    pushFollow(FOLLOW_fieldDecl_in_fieldDecls341);
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
            // 58:7: -> ^( FIELDS ( fieldDecl )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:58:10: ^( FIELDS ( fieldDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FIELDS, "FIELDS")
                , root_1);

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:58:19: ( fieldDecl )*
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldDecls"


    public static class fieldDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDecl"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:61:1: fieldDecl : type ID ';' -> ^( FIELD type ID ) ;
    public final FJDParser.fieldDecl_return fieldDecl() throws RecognitionException {
        FJDParser.fieldDecl_return retval = new FJDParser.fieldDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        FJDParser.type_return type11 =null;


        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:62:5: ( type ID ';' -> ^( FIELD type ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:62:7: type ID ';'
            {
            pushFollow(FOLLOW_type_in_fieldDecl374);
            type11=type();

            state._fsp--;

            stream_type.add(type11.getTree());

            ID12=(Token)match(input,ID,FOLLOW_ID_in_fieldDecl376);  
            stream_ID.add(ID12);


            char_literal13=(Token)match(input,41,FOLLOW_41_in_fieldDecl378);  
            stream_41.add(char_literal13);


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
            // 63:7: -> ^( FIELD type ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:63:10: ^( FIELD type ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FIELD, "FIELD")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldDecl"


    public static class ctorDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctorDecl"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:66:1: ctorDecl : name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) ;
    public final FJDParser.ctorDecl_return ctorDecl() throws RecognitionException {
        FJDParser.ctorDecl_return retval = new FJDParser.ctorDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token name=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        FJDParser.argList_return argList15 =null;

        FJDParser.ctorBody_return ctorBody18 =null;


        CommonTree name_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_ctorBody=new RewriteRuleSubtreeStream(adaptor,"rule ctorBody");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:67:5: (name= ID '(' ( argList )? ')' '{' ctorBody '}' -> ^( CTOR $name ( argList )? ctorBody ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:67:7: name= ID '(' ( argList )? ')' '{' ctorBody '}'
            {
            name=(Token)match(input,ID,FOLLOW_ID_in_ctorDecl413);  
            stream_ID.add(name);


            char_literal14=(Token)match(input,37,FOLLOW_37_in_ctorDecl415);  
            stream_37.add(char_literal14);


            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:67:19: ( argList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==44) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:67:19: argList
                    {
                    pushFollow(FOLLOW_argList_in_ctorDecl417);
                    argList15=argList();

                    state._fsp--;

                    stream_argList.add(argList15.getTree());

                    }
                    break;

            }


            char_literal16=(Token)match(input,38,FOLLOW_38_in_ctorDecl420);  
            stream_38.add(char_literal16);


            char_literal17=(Token)match(input,50,FOLLOW_50_in_ctorDecl422);  
            stream_50.add(char_literal17);


            pushFollow(FOLLOW_ctorBody_in_ctorDecl424);
            ctorBody18=ctorBody();

            state._fsp--;

            stream_ctorBody.add(ctorBody18.getTree());

            char_literal19=(Token)match(input,51,FOLLOW_51_in_ctorDecl426);  
            stream_51.add(char_literal19);


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
            // 68:7: -> ^( CTOR $name ( argList )? ctorBody )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:68:10: ^( CTOR $name ( argList )? ctorBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CTOR, "CTOR")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:68:23: ( argList )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctorDecl"


    public static class argList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argList"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:71:1: argList : arg ( ',' arg )* -> ^( ARGS ( arg )+ ) ;
    public final FJDParser.argList_return argList() throws RecognitionException {
        FJDParser.argList_return retval = new FJDParser.argList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal21=null;
        FJDParser.arg_return arg20 =null;

        FJDParser.arg_return arg22 =null;


        CommonTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:72:5: ( arg ( ',' arg )* -> ^( ARGS ( arg )+ ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:72:7: arg ( ',' arg )*
            {
            pushFollow(FOLLOW_arg_in_argList463);
            arg20=arg();

            state._fsp--;

            stream_arg.add(arg20.getTree());

            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:72:11: ( ',' arg )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:72:12: ',' arg
            	    {
            	    char_literal21=(Token)match(input,39,FOLLOW_39_in_argList466);  
            	    stream_39.add(char_literal21);


            	    pushFollow(FOLLOW_arg_in_argList468);
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
            // 73:7: -> ^( ARGS ( arg )+ )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:73:10: ^( ARGS ( arg )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGS, "ARGS")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argList"


    public static class arg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arg"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:76:1: arg : type ID -> ^( ARG type ID ) ;
    public final FJDParser.arg_return arg() throws RecognitionException {
        FJDParser.arg_return retval = new FJDParser.arg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID24=null;
        FJDParser.type_return type23 =null;


        CommonTree ID24_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:77:5: ( type ID -> ^( ARG type ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:77:7: type ID
            {
            pushFollow(FOLLOW_type_in_arg502);
            type23=type();

            state._fsp--;

            stream_type.add(type23.getTree());

            ID24=(Token)match(input,ID,FOLLOW_ID_in_arg504);  
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
            // 78:7: -> ^( ARG type ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:78:10: ^( ARG type ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARG, "ARG")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arg"


    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:81:1: type : ( ID -> ^( TYPE ID ) | 'def' -> ^( TYPE DYNAMIC ) );
    public final FJDParser.type_return type() throws RecognitionException {
        FJDParser.type_return retval = new FJDParser.type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID25=null;
        Token string_literal26=null;

        CommonTree ID25_tree=null;
        CommonTree string_literal26_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:82:5: ( ID -> ^( TYPE ID ) | 'def' -> ^( TYPE DYNAMIC ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:82:7: ID
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_type537);  
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
                    // 83:7: -> ^( TYPE ID )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:83:10: ^( TYPE ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TYPE, "TYPE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:84:7: 'def'
                    {
                    string_literal26=(Token)match(input,44,FOLLOW_44_in_type559);  
                    stream_44.add(string_literal26);


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
                    // 85:7: -> ^( TYPE DYNAMIC )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:85:10: ^( TYPE DYNAMIC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TYPE, "TYPE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DYNAMIC, "DYNAMIC")
                        );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class ctorBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctorBody"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:88:1: ctorBody : superStmt fieldInits -> ^( CTOR_BODY superStmt fieldInits ) ;
    public final FJDParser.ctorBody_return ctorBody() throws RecognitionException {
        FJDParser.ctorBody_return retval = new FJDParser.ctorBody_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FJDParser.superStmt_return superStmt27 =null;

        FJDParser.fieldInits_return fieldInits28 =null;


        RewriteRuleSubtreeStream stream_superStmt=new RewriteRuleSubtreeStream(adaptor,"rule superStmt");
        RewriteRuleSubtreeStream stream_fieldInits=new RewriteRuleSubtreeStream(adaptor,"rule fieldInits");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:89:5: ( superStmt fieldInits -> ^( CTOR_BODY superStmt fieldInits ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:89:7: superStmt fieldInits
            {
            pushFollow(FOLLOW_superStmt_in_ctorBody590);
            superStmt27=superStmt();

            state._fsp--;

            stream_superStmt.add(superStmt27.getTree());

            pushFollow(FOLLOW_fieldInits_in_ctorBody598);
            fieldInits28=fieldInits();

            state._fsp--;

            stream_fieldInits.add(fieldInits28.getTree());

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
            // 91:7: -> ^( CTOR_BODY superStmt fieldInits )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:91:10: ^( CTOR_BODY superStmt fieldInits )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CTOR_BODY, "CTOR_BODY")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctorBody"


    public static class superStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superStmt"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:94:1: superStmt : 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) ;
    public final FJDParser.superStmt_return superStmt() throws RecognitionException {
        FJDParser.superStmt_return retval = new FJDParser.superStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal33=null;
        FJDParser.argList_return argList31 =null;


        CommonTree string_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:95:5: ( 'super' '(' ( argList )? ')' ';' -> ^( SUPER_STMT ( argList )? ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:95:7: 'super' '(' ( argList )? ')' ';'
            {
            string_literal29=(Token)match(input,48,FOLLOW_48_in_superStmt631);  
            stream_48.add(string_literal29);


            char_literal30=(Token)match(input,37,FOLLOW_37_in_superStmt633);  
            stream_37.add(char_literal30);


            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:95:19: ( argList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==44) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:95:19: argList
                    {
                    pushFollow(FOLLOW_argList_in_superStmt635);
                    argList31=argList();

                    state._fsp--;

                    stream_argList.add(argList31.getTree());

                    }
                    break;

            }


            char_literal32=(Token)match(input,38,FOLLOW_38_in_superStmt638);  
            stream_38.add(char_literal32);


            char_literal33=(Token)match(input,41,FOLLOW_41_in_superStmt640);  
            stream_41.add(char_literal33);


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
            // 96:7: -> ^( SUPER_STMT ( argList )? )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:96:10: ^( SUPER_STMT ( argList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SUPER_STMT, "SUPER_STMT")
                , root_1);

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:96:23: ( argList )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "superStmt"


    public static class fieldInits_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInits"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:99:1: fieldInits : ( fieldInit )* -> ^( FIELD_INIT_LIST ( fieldInit )* ) ;
    public final FJDParser.fieldInits_return fieldInits() throws RecognitionException {
        FJDParser.fieldInits_return retval = new FJDParser.fieldInits_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FJDParser.fieldInit_return fieldInit34 =null;


        RewriteRuleSubtreeStream stream_fieldInit=new RewriteRuleSubtreeStream(adaptor,"rule fieldInit");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:100:5: ( ( fieldInit )* -> ^( FIELD_INIT_LIST ( fieldInit )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:100:7: ( fieldInit )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:100:7: ( fieldInit )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==49) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:100:7: fieldInit
            	    {
            	    pushFollow(FOLLOW_fieldInit_in_fieldInits672);
            	    fieldInit34=fieldInit();

            	    state._fsp--;

            	    stream_fieldInit.add(fieldInit34.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // 101:7: -> ^( FIELD_INIT_LIST ( fieldInit )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:101:10: ^( FIELD_INIT_LIST ( fieldInit )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FIELD_INIT_LIST, "FIELD_INIT_LIST")
                , root_1);

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:101:28: ( fieldInit )*
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldInits"


    public static class fieldInit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInit"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:104:1: fieldInit : 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) ;
    public final FJDParser.fieldInit_return fieldInit() throws RecognitionException {
        FJDParser.fieldInit_return retval = new FJDParser.fieldInit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token field=null;
        Token value=null;
        Token string_literal35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        Token char_literal38=null;

        CommonTree field_tree=null;
        CommonTree value_tree=null;
        CommonTree string_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:105:5: ( 'this' '.' field= ID '=' value= ID ';' -> ^( FIELD_INIT $field $value) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:105:7: 'this' '.' field= ID '=' value= ID ';'
            {
            string_literal35=(Token)match(input,49,FOLLOW_49_in_fieldInit705);  
            stream_49.add(string_literal35);


            char_literal36=(Token)match(input,40,FOLLOW_40_in_fieldInit707);  
            stream_40.add(char_literal36);


            field=(Token)match(input,ID,FOLLOW_ID_in_fieldInit711);  
            stream_ID.add(field);


            char_literal37=(Token)match(input,42,FOLLOW_42_in_fieldInit713);  
            stream_42.add(char_literal37);


            value=(Token)match(input,ID,FOLLOW_ID_in_fieldInit717);  
            stream_ID.add(value);


            char_literal38=(Token)match(input,41,FOLLOW_41_in_fieldInit719);  
            stream_41.add(char_literal38);


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
            // 106:7: -> ^( FIELD_INIT $field $value)
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:106:10: ^( FIELD_INIT $field $value)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FIELD_INIT, "FIELD_INIT")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldInit"


    public static class methodDecls_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDecls"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:109:1: methodDecls : ( methodDecl )* -> ^( METHODS ( methodDecl )* ) ;
    public final FJDParser.methodDecls_return methodDecls() throws RecognitionException {
        FJDParser.methodDecls_return retval = new FJDParser.methodDecls_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FJDParser.methodDecl_return methodDecl39 =null;


        RewriteRuleSubtreeStream stream_methodDecl=new RewriteRuleSubtreeStream(adaptor,"rule methodDecl");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:110:5: ( ( methodDecl )* -> ^( METHODS ( methodDecl )* ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:110:7: ( methodDecl )*
            {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:110:7: ( methodDecl )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||LA8_0==44) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:110:7: methodDecl
            	    {
            	    pushFollow(FOLLOW_methodDecl_in_methodDecls754);
            	    methodDecl39=methodDecl();

            	    state._fsp--;

            	    stream_methodDecl.add(methodDecl39.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 111:7: -> ^( METHODS ( methodDecl )* )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:111:10: ^( METHODS ( methodDecl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(METHODS, "METHODS")
                , root_1);

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:111:20: ( methodDecl )*
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDecls"


    public static class methodDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDecl"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:114:1: methodDecl : type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) ;
    public final FJDParser.methodDecl_return methodDecl() throws RecognitionException {
        FJDParser.methodDecl_return retval = new FJDParser.methodDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token name=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        FJDParser.type_return type40 =null;

        FJDParser.argList_return argList42 =null;

        FJDParser.methBody_return methBody45 =null;


        CommonTree name_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_methBody=new RewriteRuleSubtreeStream(adaptor,"rule methBody");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:115:5: ( type name= ID '(' ( argList )? ')' '{' methBody '}' -> ^( METHOD type $name ( argList )? methBody ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:115:7: type name= ID '(' ( argList )? ')' '{' methBody '}'
            {
            pushFollow(FOLLOW_type_in_methodDecl787);
            type40=type();

            state._fsp--;

            stream_type.add(type40.getTree());

            name=(Token)match(input,ID,FOLLOW_ID_in_methodDecl791);  
            stream_ID.add(name);


            char_literal41=(Token)match(input,37,FOLLOW_37_in_methodDecl793);  
            stream_37.add(char_literal41);


            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:115:24: ( argList )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID||LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:115:24: argList
                    {
                    pushFollow(FOLLOW_argList_in_methodDecl795);
                    argList42=argList();

                    state._fsp--;

                    stream_argList.add(argList42.getTree());

                    }
                    break;

            }


            char_literal43=(Token)match(input,38,FOLLOW_38_in_methodDecl798);  
            stream_38.add(char_literal43);


            char_literal44=(Token)match(input,50,FOLLOW_50_in_methodDecl800);  
            stream_50.add(char_literal44);


            pushFollow(FOLLOW_methBody_in_methodDecl802);
            methBody45=methBody();

            state._fsp--;

            stream_methBody.add(methBody45.getTree());

            char_literal46=(Token)match(input,51,FOLLOW_51_in_methodDecl804);  
            stream_51.add(char_literal46);


            // AST REWRITE
            // elements: name, methBody, type, argList
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:7: -> ^( METHOD type $name ( argList )? methBody )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:116:10: ^( METHOD type $name ( argList )? methBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(METHOD, "METHOD")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, stream_name.nextNode());

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:116:30: ( argList )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDecl"


    public static class methBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methBody"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:119:1: methBody : 'return' expr ';' -> ^( METH_BODY ^( EXPR expr ) ) ;
    public final FJDParser.methBody_return methBody() throws RecognitionException {
        FJDParser.methBody_return retval = new FJDParser.methBody_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal47=null;
        Token char_literal49=null;
        FJDParser.expr_return expr48 =null;


        CommonTree string_literal47_tree=null;
        CommonTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:120:5: ( 'return' expr ';' -> ^( METH_BODY ^( EXPR expr ) ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:120:7: 'return' expr ';'
            {
            string_literal47=(Token)match(input,47,FOLLOW_47_in_methBody843);  
            stream_47.add(string_literal47);


            pushFollow(FOLLOW_expr_in_methBody845);
            expr48=expr();

            state._fsp--;

            stream_expr.add(expr48.getTree());

            char_literal49=(Token)match(input,41,FOLLOW_41_in_methBody847);  
            stream_41.add(char_literal49);


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
            // 121:7: -> ^( METH_BODY ^( EXPR expr ) )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:121:10: ^( METH_BODY ^( EXPR expr ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(METH_BODY, "METH_BODY")
                , root_1);

                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:121:22: ^( EXPR expr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPR, "EXPR")
                , root_2);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methBody"


    public static class exprList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:124:1: exprList : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final FJDParser.exprList_return exprList() throws RecognitionException {
        FJDParser.exprList_return retval = new FJDParser.exprList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal51=null;
        FJDParser.expr_return expr50 =null;

        FJDParser.expr_return expr52 =null;


        CommonTree char_literal51_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:125:5: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:125:7: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_exprList882);
            expr50=expr();

            state._fsp--;

            stream_expr.add(expr50.getTree());

            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:125:12: ( ',' expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:125:13: ',' expr
            	    {
            	    char_literal51=(Token)match(input,39,FOLLOW_39_in_exprList885);  
            	    stream_39.add(char_literal51);


            	    pushFollow(FOLLOW_expr_in_exprList887);
            	    expr52=expr();

            	    state._fsp--;

            	    stream_expr.add(expr52.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // 126:7: -> ^( EXPR_LIST ( expr )+ )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:126:10: ^( EXPR_LIST ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPR_LIST, "EXPR_LIST")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:129:1: expr : ( valueExpr | thisExpr ) ( fieldAccessOrMethCall )* ;
    public final FJDParser.expr_return expr() throws RecognitionException {
        FJDParser.expr_return retval = new FJDParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FJDParser.valueExpr_return valueExpr53 =null;

        FJDParser.thisExpr_return thisExpr54 =null;

        FJDParser.fieldAccessOrMethCall_return fieldAccessOrMethCall55 =null;



        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:130:5: ( ( valueExpr | thisExpr ) ( fieldAccessOrMethCall )* )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:130:7: ( valueExpr | thisExpr ) ( fieldAccessOrMethCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:130:7: ( valueExpr | thisExpr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==37||LA11_0==46||LA11_0==49) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:130:9: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_expr923);
                    valueExpr53=valueExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, valueExpr53.getTree());

                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:130:21: thisExpr
                    {
                    pushFollow(FOLLOW_thisExpr_in_expr927);
                    thisExpr54=thisExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, thisExpr54.getTree());

                    }
                    break;

            }


            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:130:32: ( fieldAccessOrMethCall )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:130:32: fieldAccessOrMethCall
            	    {
            	    pushFollow(FOLLOW_fieldAccessOrMethCall_in_expr931);
            	    fieldAccessOrMethCall55=fieldAccessOrMethCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldAccessOrMethCall55.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class valueExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valueExpr"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:133:1: valueExpr : ID -> ^( VALUE_EXPR ID ) ;
    public final FJDParser.valueExpr_return valueExpr() throws RecognitionException {
        FJDParser.valueExpr_return retval = new FJDParser.valueExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID56=null;

        CommonTree ID56_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:134:5: ( ID -> ^( VALUE_EXPR ID ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:134:7: ID
            {
            ID56=(Token)match(input,ID,FOLLOW_ID_in_valueExpr949);  
            stream_ID.add(ID56);


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
            // 135:7: -> ^( VALUE_EXPR ID )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:135:10: ^( VALUE_EXPR ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VALUE_EXPR, "VALUE_EXPR")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "valueExpr"


    public static class thisExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "thisExpr"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:138:1: thisExpr : ( 'this' -> ^( THIS_EXPR ) | newExpr );
    public final FJDParser.thisExpr_return thisExpr() throws RecognitionException {
        FJDParser.thisExpr_return retval = new FJDParser.thisExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal57=null;
        FJDParser.newExpr_return newExpr58 =null;


        CommonTree string_literal57_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");

        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:139:5: ( 'this' -> ^( THIS_EXPR ) | newExpr )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            else if ( (LA13_0==37||LA13_0==46) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:139:7: 'this'
                    {
                    string_literal57=(Token)match(input,49,FOLLOW_49_in_thisExpr980);  
                    stream_49.add(string_literal57);


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
                    // 140:7: -> ^( THIS_EXPR )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:140:10: ^( THIS_EXPR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(THIS_EXPR, "THIS_EXPR")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:141:7: newExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_newExpr_in_thisExpr1000);
                    newExpr58=newExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, newExpr58.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "thisExpr"


    public static class newExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "newExpr"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:144:1: newExpr : ( 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | castExpr );
    public final FJDParser.newExpr_return newExpr() throws RecognitionException {
        FJDParser.newExpr_return retval = new FJDParser.newExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        FJDParser.type_return type60 =null;

        FJDParser.exprList_return exprList62 =null;

        FJDParser.castExpr_return castExpr64 =null;


        CommonTree string_literal59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:145:5: ( 'new' type '(' ( exprList )? ')' -> ^( NEW_EXPR type ( exprList )? ) | castExpr )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            else if ( (LA15_0==37) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:145:7: 'new' type '(' ( exprList )? ')'
                    {
                    string_literal59=(Token)match(input,46,FOLLOW_46_in_newExpr1017);  
                    stream_46.add(string_literal59);


                    pushFollow(FOLLOW_type_in_newExpr1019);
                    type60=type();

                    state._fsp--;

                    stream_type.add(type60.getTree());

                    char_literal61=(Token)match(input,37,FOLLOW_37_in_newExpr1021);  
                    stream_37.add(char_literal61);


                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:145:22: ( exprList )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ID||LA14_0==37||LA14_0==46||LA14_0==49) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:145:22: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_newExpr1023);
                            exprList62=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList62.getTree());

                            }
                            break;

                    }


                    char_literal63=(Token)match(input,38,FOLLOW_38_in_newExpr1026);  
                    stream_38.add(char_literal63);


                    // AST REWRITE
                    // elements: exprList, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:8: -> ^( NEW_EXPR type ( exprList )? )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:146:11: ^( NEW_EXPR type ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEW_EXPR, "NEW_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:146:27: ( exprList )?
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:147:7: castExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_castExpr_in_newExpr1052);
                    castExpr64=castExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, castExpr64.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "newExpr"


    public static class castExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "castExpr"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:150:1: castExpr : '(' type ')' expr -> ^( CAST_EXPR type expr ) ;
    public final FJDParser.castExpr_return castExpr() throws RecognitionException {
        FJDParser.castExpr_return retval = new FJDParser.castExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal65=null;
        Token char_literal67=null;
        FJDParser.type_return type66 =null;

        FJDParser.expr_return expr68 =null;


        CommonTree char_literal65_tree=null;
        CommonTree char_literal67_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:151:5: ( '(' type ')' expr -> ^( CAST_EXPR type expr ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:151:7: '(' type ')' expr
            {
            char_literal65=(Token)match(input,37,FOLLOW_37_in_castExpr1069);  
            stream_37.add(char_literal65);


            pushFollow(FOLLOW_type_in_castExpr1071);
            type66=type();

            state._fsp--;

            stream_type.add(type66.getTree());

            char_literal67=(Token)match(input,38,FOLLOW_38_in_castExpr1073);  
            stream_38.add(char_literal67);


            pushFollow(FOLLOW_expr_in_castExpr1075);
            expr68=expr();

            state._fsp--;

            stream_expr.add(expr68.getTree());

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
            // 152:7: -> ^( CAST_EXPR type expr )
            {
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:152:10: ^( CAST_EXPR type expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CAST_EXPR, "CAST_EXPR")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "castExpr"


    public static class fieldAccessOrMethCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldAccessOrMethCall"
    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:155:1: fieldAccessOrMethCall : ( '.' ID -> ^( FIELD_ACCESS_EXPR ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL_EXPR ID ( exprList )? ) );
    public final FJDParser.fieldAccessOrMethCall_return fieldAccessOrMethCall() throws RecognitionException {
        FJDParser.fieldAccessOrMethCall_return retval = new FJDParser.fieldAccessOrMethCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal69=null;
        Token ID70=null;
        Token char_literal71=null;
        Token ID72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        FJDParser.exprList_return exprList74 =null;


        CommonTree char_literal69_tree=null;
        CommonTree ID70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree ID72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal75_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:156:5: ( '.' ID -> ^( FIELD_ACCESS_EXPR ID ) | '.' ID '(' ( exprList )? ')' -> ^( METH_CALL_EXPR ID ( exprList )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==ID) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==37) ) {
                        alt17=2;
                    }
                    else if ( (LA17_2==EOF||(LA17_2 >= 38 && LA17_2 <= 41)) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:156:7: '.' ID
                    {
                    char_literal69=(Token)match(input,40,FOLLOW_40_in_fieldAccessOrMethCall1108);  
                    stream_40.add(char_literal69);


                    ID70=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall1110);  
                    stream_ID.add(ID70);


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
                    // 156:15: -> ^( FIELD_ACCESS_EXPR ID )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:156:18: ^( FIELD_ACCESS_EXPR ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FIELD_ACCESS_EXPR, "FIELD_ACCESS_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:157:7: '.' ID '(' ( exprList )? ')'
                    {
                    char_literal71=(Token)match(input,40,FOLLOW_40_in_fieldAccessOrMethCall1127);  
                    stream_40.add(char_literal71);


                    ID72=(Token)match(input,ID,FOLLOW_ID_in_fieldAccessOrMethCall1129);  
                    stream_ID.add(ID72);


                    char_literal73=(Token)match(input,37,FOLLOW_37_in_fieldAccessOrMethCall1131);  
                    stream_37.add(char_literal73);


                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:157:18: ( exprList )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID||LA16_0==37||LA16_0==46||LA16_0==49) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:157:18: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_fieldAccessOrMethCall1133);
                            exprList74=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList74.getTree());

                            }
                            break;

                    }


                    char_literal75=(Token)match(input,38,FOLLOW_38_in_fieldAccessOrMethCall1136);  
                    stream_38.add(char_literal75);


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
                    // 157:32: -> ^( METH_CALL_EXPR ID ( exprList )? )
                    {
                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:157:35: ^( METH_CALL_EXPR ID ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(METH_CALL_EXPR, "METH_CALL_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:157:55: ( exprList )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldAccessOrMethCall"

    // Delegated rules


 

    public static final BitSet FOLLOW_classDecl_in_program187 = new BitSet(new long[]{0x0002482000200000L});
    public static final BitSet FOLLOW_expr_in_program196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_classDecl236 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_classDecl240 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_classDecl242 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_classDecl246 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_classDecl248 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_fieldDecls_in_classDecl262 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ctorDecl_in_classDecl264 = new BitSet(new long[]{0x0008100000200000L});
    public static final BitSet FOLLOW_methodDecls_in_classDecl266 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_classDecl276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDecl_in_fieldDecls341 = new BitSet(new long[]{0x0000100000200002L});
    public static final BitSet FOLLOW_type_in_fieldDecl374 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_fieldDecl376 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_fieldDecl378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ctorDecl413 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ctorDecl415 = new BitSet(new long[]{0x0000104000200000L});
    public static final BitSet FOLLOW_argList_in_ctorDecl417 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ctorDecl420 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ctorDecl422 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ctorBody_in_ctorDecl424 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ctorDecl426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_argList463 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_argList466 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_arg_in_argList468 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_type_in_arg502 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_arg504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_type559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superStmt_in_ctorBody590 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_fieldInits_in_ctorBody598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_superStmt631 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_superStmt633 = new BitSet(new long[]{0x0000104000200000L});
    public static final BitSet FOLLOW_argList_in_superStmt635 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_superStmt638 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_superStmt640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldInit_in_fieldInits672 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_fieldInit705 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fieldInit707 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_fieldInit711 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_fieldInit713 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_fieldInit717 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_fieldInit719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDecl_in_methodDecls754 = new BitSet(new long[]{0x0000100000200002L});
    public static final BitSet FOLLOW_type_in_methodDecl787 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_methodDecl791 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_methodDecl793 = new BitSet(new long[]{0x0000104000200000L});
    public static final BitSet FOLLOW_argList_in_methodDecl795 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_methodDecl798 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_methodDecl800 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_methBody_in_methodDecl802 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_methodDecl804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_methBody843 = new BitSet(new long[]{0x0002402000200000L});
    public static final BitSet FOLLOW_expr_in_methBody845 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_methBody847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList882 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_exprList885 = new BitSet(new long[]{0x0002402000200000L});
    public static final BitSet FOLLOW_expr_in_exprList887 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_valueExpr_in_expr923 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_thisExpr_in_expr927 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_fieldAccessOrMethCall_in_expr931 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ID_in_valueExpr949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_thisExpr980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_thisExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_newExpr1017 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_type_in_newExpr1019 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_newExpr1021 = new BitSet(new long[]{0x0002406000200000L});
    public static final BitSet FOLLOW_exprList_in_newExpr1023 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_newExpr1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_newExpr1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_castExpr1069 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_type_in_castExpr1071 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_castExpr1073 = new BitSet(new long[]{0x0002402000200000L});
    public static final BitSet FOLLOW_expr_in_castExpr1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_fieldAccessOrMethCall1108 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_fieldAccessOrMethCall1127 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_fieldAccessOrMethCall1129 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_fieldAccessOrMethCall1131 = new BitSet(new long[]{0x0002406000200000L});
    public static final BitSet FOLLOW_exprList_in_fieldAccessOrMethCall1133 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fieldAccessOrMethCall1136 = new BitSet(new long[]{0x0000000000000002L});

}