// $ANTLR 3.2 Sep 23, 2009 14:05:07 D:\\projects\\fjd\\src\\main\\java\\FJD.g 2010-05-17 10:52:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FJDParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'class'", "'extends'", "'{'", "'}'", "';'", "'('", "')'", "','", "'super'", "'this'", "'.'", "'='", "'return'", "'new'"
    };
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int UNICODE_ESC=10;
    public static final int T__20=20;
    public static final int OCTAL_ESC=11;
    public static final int CHAR=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int ESC_SEQ=6;
    public static final int T__16=16;
    public static final int WS=5;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int STRING=7;

    // delegates
    // delegators


        public FJDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FJDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FJDParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\projects\\fjd\\src\\main\\java\\FJD.g"; }



    // $ANTLR start "program"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:3:1: program : ( classDecl )+ expr ;
    public final void program() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:3:9: ( ( classDecl )+ expr )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:3:11: ( classDecl )+ expr
            {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:3:11: ( classDecl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:3:11: classDecl
            	    {
            	    pushFollow(FOLLOW_classDecl_in_program10);
            	    classDecl();

            	    state._fsp--;


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

            pushFollow(FOLLOW_expr_in_program16);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "classDecl"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:7:1: classDecl : 'class' ID 'extends' ID '{' fieldDecls ctorDecl methodDecls '}' ;
    public final void classDecl() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:8:2: ( 'class' ID 'extends' ID '{' fieldDecls ctorDecl methodDecls '}' )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:8:4: 'class' ID 'extends' ID '{' fieldDecls ctorDecl methodDecls '}'
            {
            match(input,12,FOLLOW_12_in_classDecl27); 
            match(input,ID,FOLLOW_ID_in_classDecl29); 
            match(input,13,FOLLOW_13_in_classDecl31); 
            match(input,ID,FOLLOW_ID_in_classDecl33); 
            match(input,14,FOLLOW_14_in_classDecl35); 
            pushFollow(FOLLOW_fieldDecls_in_classDecl37);
            fieldDecls();

            state._fsp--;

            pushFollow(FOLLOW_ctorDecl_in_classDecl39);
            ctorDecl();

            state._fsp--;

            pushFollow(FOLLOW_methodDecls_in_classDecl41);
            methodDecls();

            state._fsp--;

            match(input,15,FOLLOW_15_in_classDecl43); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classDecl"


    // $ANTLR start "fieldDecls"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:11:1: fieldDecls : ( type ID ';' )* ;
    public final void fieldDecls() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:12:2: ( ( type ID ';' )* )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:12:4: ( type ID ';' )*
            {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:12:4: ( type ID ';' )*
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
            	    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:12:5: type ID ';'
            	    {
            	    pushFollow(FOLLOW_type_in_fieldDecls56);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_fieldDecls58); 
            	    match(input,16,FOLLOW_16_in_fieldDecls60); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fieldDecls"


    // $ANTLR start "ctorDecl"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:15:1: ctorDecl : ID '(' ( argList )? ')' '{' ctorBody '}' ;
    public final void ctorDecl() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:16:2: ( ID '(' ( argList )? ')' '{' ctorBody '}' )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:16:4: ID '(' ( argList )? ')' '{' ctorBody '}'
            {
            match(input,ID,FOLLOW_ID_in_ctorDecl73); 
            match(input,17,FOLLOW_17_in_ctorDecl75); 
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:16:11: ( argList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:16:11: argList
                    {
                    pushFollow(FOLLOW_argList_in_ctorDecl77);
                    argList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ctorDecl80); 
            match(input,14,FOLLOW_14_in_ctorDecl82); 
            pushFollow(FOLLOW_ctorBody_in_ctorDecl84);
            ctorBody();

            state._fsp--;

            match(input,15,FOLLOW_15_in_ctorDecl86); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ctorDecl"


    // $ANTLR start "argList"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:19:1: argList : type ID ( ',' type ID )+ ;
    public final void argList() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:19:9: ( type ID ( ',' type ID )+ )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:19:11: type ID ( ',' type ID )+
            {
            pushFollow(FOLLOW_type_in_argList96);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_argList98); 
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:19:19: ( ',' type ID )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:19:20: ',' type ID
            	    {
            	    match(input,19,FOLLOW_19_in_argList101); 
            	    pushFollow(FOLLOW_type_in_argList103);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_argList105); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "argList"


    // $ANTLR start "type"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:22:1: type : ID ;
    public final void type() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:22:6: ( ID )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:22:8: ID
            {
            match(input,ID,FOLLOW_ID_in_type118); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "ctorBody"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:25:1: ctorBody : superStmt ( fieldInits )? ;
    public final void ctorBody() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:26:2: ( superStmt ( fieldInits )? )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:26:4: superStmt ( fieldInits )?
            {
            pushFollow(FOLLOW_superStmt_in_ctorBody130);
            superStmt();

            state._fsp--;

            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:27:4: ( fieldInits )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:27:4: fieldInits
                    {
                    pushFollow(FOLLOW_fieldInits_in_ctorBody135);
                    fieldInits();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ctorBody"


    // $ANTLR start "superStmt"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:30:1: superStmt : 'super' '(' ( argList )? ')' ';' ;
    public final void superStmt() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:31:2: ( 'super' '(' ( argList )? ')' ';' )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:31:4: 'super' '(' ( argList )? ')' ';'
            {
            match(input,20,FOLLOW_20_in_superStmt148); 
            match(input,17,FOLLOW_17_in_superStmt150); 
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:31:16: ( argList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:31:16: argList
                    {
                    pushFollow(FOLLOW_argList_in_superStmt152);
                    argList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_superStmt155); 
            match(input,16,FOLLOW_16_in_superStmt157); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "superStmt"


    // $ANTLR start "fieldInits"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:34:1: fieldInits : 'this' '.' ID '=' ID ';' ;
    public final void fieldInits() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:35:2: ( 'this' '.' ID '=' ID ';' )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:35:4: 'this' '.' ID '=' ID ';'
            {
            match(input,21,FOLLOW_21_in_fieldInits169); 
            match(input,22,FOLLOW_22_in_fieldInits171); 
            match(input,ID,FOLLOW_ID_in_fieldInits173); 
            match(input,23,FOLLOW_23_in_fieldInits175); 
            match(input,ID,FOLLOW_ID_in_fieldInits177); 
            match(input,16,FOLLOW_16_in_fieldInits179); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fieldInits"


    // $ANTLR start "methodDecls"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:38:1: methodDecls : ( methodDecl )* ;
    public final void methodDecls() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:39:2: ( ( methodDecl )* )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:39:4: ( methodDecl )*
            {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:39:4: ( methodDecl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:39:4: methodDecl
            	    {
            	    pushFollow(FOLLOW_methodDecl_in_methodDecls191);
            	    methodDecl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "methodDecls"


    // $ANTLR start "methodDecl"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:42:1: methodDecl : type ID '(' ( argList )? ')' '{' methBody '}' ;
    public final void methodDecl() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:43:2: ( type ID '(' ( argList )? ')' '{' methBody '}' )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:43:4: type ID '(' ( argList )? ')' '{' methBody '}'
            {
            pushFollow(FOLLOW_type_in_methodDecl204);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_methodDecl206); 
            match(input,17,FOLLOW_17_in_methodDecl208); 
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:43:16: ( argList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:43:16: argList
                    {
                    pushFollow(FOLLOW_argList_in_methodDecl210);
                    argList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_methodDecl213); 
            match(input,14,FOLLOW_14_in_methodDecl215); 
            pushFollow(FOLLOW_methBody_in_methodDecl217);
            methBody();

            state._fsp--;

            match(input,15,FOLLOW_15_in_methodDecl219); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "methodDecl"


    // $ANTLR start "methBody"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:46:1: methBody : 'return' expr ';' ;
    public final void methBody() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:47:2: ( 'return' expr ';' )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:47:4: 'return' expr ';'
            {
            match(input,24,FOLLOW_24_in_methBody232); 
            pushFollow(FOLLOW_expr_in_methBody234);
            expr();

            state._fsp--;

            match(input,16,FOLLOW_16_in_methBody236); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "methBody"


    // $ANTLR start "exprList"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:50:1: exprList : expr ( ',' expr )* ;
    public final void exprList() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:51:3: ( expr ( ',' expr )* )
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:51:5: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_exprList249);
            expr();

            state._fsp--;

            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:51:10: ( ',' expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:51:11: ',' expr
            	    {
            	    match(input,19,FOLLOW_19_in_exprList252); 
            	    pushFollow(FOLLOW_expr_in_exprList254);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprList"


    // $ANTLR start "expr"
    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:54:1: expr : ( ID | 'new' ID '(' ( exprList )? ')' );
    public final void expr() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:55:3: ( ID | 'new' ID '(' ( exprList )? ')' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:55:5: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr269); 

                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:56:5: 'new' ID '(' ( exprList )? ')'
                    {
                    match(input,25,FOLLOW_25_in_expr275); 
                    match(input,ID,FOLLOW_ID_in_expr277); 
                    match(input,17,FOLLOW_17_in_expr279); 
                    // D:\\projects\\fjd\\src\\main\\java\\FJD.g:56:18: ( exprList )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID||LA10_0==25) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\projects\\fjd\\src\\main\\java\\FJD.g:56:18: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_expr281);
                            exprList();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,18,FOLLOW_18_in_expr284); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_classDecl_in_program10 = new BitSet(new long[]{0x0000000002001010L});
    public static final BitSet FOLLOW_expr_in_program16 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_classDecl27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_classDecl29 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_classDecl31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_classDecl33 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_classDecl35 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_fieldDecls_in_classDecl37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ctorDecl_in_classDecl39 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_methodDecls_in_classDecl41 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_classDecl43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fieldDecls56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fieldDecls58 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldDecls60 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_ctorDecl73 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ctorDecl75 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_argList_in_ctorDecl77 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ctorDecl80 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ctorDecl82 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ctorBody_in_ctorDecl84 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ctorDecl86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_argList96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_argList98 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_argList101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_type_in_argList103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_argList105 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_type118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superStmt_in_ctorBody130 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_fieldInits_in_ctorBody135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_superStmt148 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_superStmt150 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_argList_in_superStmt152 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_superStmt155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_superStmt157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_fieldInits169 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_fieldInits171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fieldInits173 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_fieldInits175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fieldInits177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldInits179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDecl_in_methodDecls191 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_type_in_methodDecl204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_methodDecl206 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_methodDecl208 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_argList_in_methodDecl210 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_methodDecl213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_methodDecl215 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_methBody_in_methodDecl217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_methodDecl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_methBody232 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_expr_in_methBody234 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_methBody236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList249 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_exprList252 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_expr_in_exprList254 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_expr269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_expr275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_expr277 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_expr279 = new BitSet(new long[]{0x0000000002040010L});
    public static final BitSet FOLLOW_exprList_in_expr281 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expr284 = new BitSet(new long[]{0x0000000000000002L});

}