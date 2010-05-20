// $ANTLR 3.2 Sep 23, 2009 14:05:07 D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g 2010-05-20 16:06:41
 package org.fjd; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FJDLexer extends Lexer {
    public static final int CLASS=5;
    public static final int FIELD_ACCESS_EXPR=26;
    public static final int OCTAL_ESC=35;
    public static final int SUPER_STMT=11;
    public static final int CHAR=32;
    public static final int ID=28;
    public static final int EOF=-1;
    public static final int TYPE=16;
    public static final int EXPR_LIST=20;
    public static final int CTOR_BODY=10;
    public static final int EXPR=21;
    public static final int ESC_SEQ=30;
    public static final int METHODS=14;
    public static final int FIELD_INIT=12;
    public static final int ARG=18;
    public static final int CAST_EXPR=25;
    public static final int CTOR=9;
    public static final int ARGS=17;
    public static final int FIELD_INIT_LIST=13;
    public static final int THIS_EXPR=22;
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
    public static final int VALUE_EXPR=23;
    public static final int WS=29;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int NEW_EXPR=24;
    public static final int METH_BODY=19;
    public static final int FIELD=7;
    public static final int PROGRAM=4;
    public static final int METHOD=15;
    public static final int STRING=31;

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

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:157:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:157:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:157:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:160:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:160:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:168:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:168:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:168:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
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
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:168:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:168:24: ~ ( '\\\\' | '\"' )
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
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:171:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:171:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:171:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
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
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:171:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:171:25: ~ ( '\\'' | '\\\\' )
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
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:175:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:175:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:179:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:179:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:180:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:181:9: OCTAL_ESC
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
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:14: ( '0' .. '3' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:25: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:36: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:186:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:187:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:187:14: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:187:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:187:25: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:187:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:188:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:188:14: ( '0' .. '7' )
                    // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:188:15: '0' .. '7'
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
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:193:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:193:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | ID | WS | STRING | CHAR )
        int alt6=18;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:10: T__36
                {
                mT__36(); 

                }
                break;
            case 2 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:16: T__37
                {
                mT__37(); 

                }
                break;
            case 3 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:22: T__38
                {
                mT__38(); 

                }
                break;
            case 4 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:28: T__39
                {
                mT__39(); 

                }
                break;
            case 5 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:34: T__40
                {
                mT__40(); 

                }
                break;
            case 6 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:40: T__41
                {
                mT__41(); 

                }
                break;
            case 7 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:46: T__42
                {
                mT__42(); 

                }
                break;
            case 8 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:52: T__43
                {
                mT__43(); 

                }
                break;
            case 9 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:58: T__44
                {
                mT__44(); 

                }
                break;
            case 10 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:64: T__45
                {
                mT__45(); 

                }
                break;
            case 11 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:70: T__46
                {
                mT__46(); 

                }
                break;
            case 12 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:76: T__47
                {
                mT__47(); 

                }
                break;
            case 13 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:82: T__48
                {
                mT__48(); 

                }
                break;
            case 14 :
                // D:\\projects\\fjd\\src\\main\\java\\org\\fjd\\FJD.g:1:88: T__49
                {
                mT__49(); 

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
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | ID | WS | STRING | CHAR );";
        }
    }
 

}