// $ANTLR 3.2 Sep 23, 2009 14:05:07 D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g 2010-05-17 13:53:19
 package org.fjd; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FJDLexer extends Lexer {
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

    public FJDLexer() {;} 
    public FJDLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FJDLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:5:7: ( 'class' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:5:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:6:7: ( 'extends' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:6:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:7:7: ( '{' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:7:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:8:7: ( '}' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:8:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:9:7: ( ';' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:10:7: ( '(' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:11:7: ( ')' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:12:7: ( ',' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:13:7: ( 'super' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:13:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:14:7: ( 'this' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:14:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:15:7: ( '.' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:16:7: ( '=' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:17:7: ( 'return' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:17:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:18:7: ( 'new' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:18:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:69:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:69:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:69:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:72:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:72:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:80:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:83:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:83:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:83:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:83:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:83:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:87:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:87:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:91:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt4=1;
                    }
                    break;
                case 'u':
                    {
                    alt4=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:91:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:92:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:93:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>='0' && LA5_1<='3')) ) {
                    int LA5_2 = input.LA(3);

                    if ( ((LA5_2>='0' && LA5_2<='7')) ) {
                        int LA5_4 = input.LA(4);

                        if ( ((LA5_4>='0' && LA5_4<='7')) ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;}
                    }
                    else {
                        alt5=3;}
                }
                else if ( ((LA5_1>='4' && LA5_1<='7')) ) {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3>='0' && LA5_3<='7')) ) {
                        alt5=2;
                    }
                    else {
                        alt5=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:14: ( '0' .. '3' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:25: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:36: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:98:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:14: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:25: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:99:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:100:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:100:14: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:100:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:105:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:105:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | ID | WS | STRING | CHAR )
        int alt6=18;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:94: ID
                {
                mID(); 

                }
                break;
            case 16 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:97: WS
                {
                mWS(); 

                }
                break;
            case 17 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:100: STRING
                {
                mSTRING(); 

                }
                break;
            case 18 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:107: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\2\17\6\uffff\2\17\2\uffff\2\17\4\uffff\13\17\1\44\3\17"+
        "\1\50\1\17\1\uffff\1\52\1\17\1\54\1\uffff\1\17\1\uffff\1\17\1\uffff"+
        "\1\57\1\60\2\uffff";
    static final String DFA6_eofS =
        "\61\uffff";
    static final String DFA6_minS =
        "\1\11\1\154\1\170\6\uffff\1\165\1\150\2\uffff\2\145\4\uffff\1\141"+
        "\1\164\1\160\1\151\1\164\1\167\1\163\2\145\1\163\1\165\1\60\1\163"+
        "\1\156\1\162\1\60\1\162\1\uffff\1\60\1\144\1\60\1\uffff\1\156\1"+
        "\uffff\1\163\1\uffff\2\60\2\uffff";
    static final String DFA6_maxS =
        "\1\175\1\154\1\170\6\uffff\1\165\1\150\2\uffff\2\145\4\uffff\1"+
        "\141\1\164\1\160\1\151\1\164\1\167\1\163\2\145\1\163\1\165\1\172"+
        "\1\163\1\156\1\162\1\172\1\162\1\uffff\1\172\1\144\1\172\1\uffff"+
        "\1\156\1\uffff\1\163\1\uffff\2\172\2\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\13\1\14\2\uffff\1\17"+
        "\1\20\1\21\1\22\21\uffff\1\16\3\uffff\1\12\1\uffff\1\1\1\uffff\1"+
        "\11\2\uffff\1\15\1\2";
    static final String DFA6_specialS =
        "\61\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\20\2\uffff\1\20\22\uffff\1\20\1\uffff\1\21\4\uffff\1\22"+
            "\1\6\1\7\2\uffff\1\10\1\uffff\1\13\14\uffff\1\5\1\uffff\1\14"+
            "\3\uffff\32\17\4\uffff\1\17\1\uffff\2\17\1\1\1\17\1\2\10\17"+
            "\1\16\3\17\1\15\1\11\1\12\6\17\1\3\1\uffff\1\4",
            "\1\23",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25",
            "\1\26",
            "",
            "",
            "\1\27",
            "\1\30",
            "",
            "",
            "",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\51",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\53",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\55",
            "",
            "\1\56",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | ID | WS | STRING | CHAR );";
        }
    }
 

}