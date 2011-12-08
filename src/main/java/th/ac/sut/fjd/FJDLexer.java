// $ANTLR 3.4 C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g 2011-12-09 01:16:17
 package th.ac.sut.fjd; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FJDLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FJDLexer() {} 
    public FJDLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FJDLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g"; }

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:4:7: ( '(' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:4:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:5:7: ( ')' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:5:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:6:7: ( ',' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:7:7: ( '.' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:7:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:8:7: ( ';' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:8:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:9:7: ( '=' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:9:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:10:7: ( 'class' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:10:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:11:7: ( 'def' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:11:9: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:12:7: ( 'extends' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:12:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:13:7: ( 'new' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:13:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:14:7: ( 'return' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:14:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:15:7: ( 'super' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:15:9: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:16:7: ( 'this' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:16:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:17:7: ( '{' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:18:7: ( '}' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:158:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:158:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:158:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:161:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:161:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:169:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:169:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:169:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:169:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:169:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:172:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:172:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:172:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:172:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:172:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:177:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:181:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:181:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:182:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:183:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:188:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1 >= '0' && LA5_1 <= '3')) ) {
                    int LA5_2 = input.LA(3);

                    if ( ((LA5_2 >= '0' && LA5_2 <= '7')) ) {
                        int LA5_4 = input.LA(4);

                        if ( ((LA5_4 >= '0' && LA5_4 <= '7')) ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;
                        }
                    }
                    else {
                        alt5=3;
                    }
                }
                else if ( ((LA5_1 >= '4' && LA5_1 <= '7')) ) {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3 >= '0' && LA5_3 <= '7')) ) {
                        alt5=2;
                    }
                    else {
                        alt5=3;
                    }
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:188:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:189:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:190:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:195:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:195:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | ID | WS | STRING | CHAR )
        int alt6=19;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt6=1;
            }
            break;
        case ')':
            {
            alt6=2;
            }
            break;
        case ',':
            {
            alt6=3;
            }
            break;
        case '.':
            {
            alt6=4;
            }
            break;
        case ';':
            {
            alt6=5;
            }
            break;
        case '=':
            {
            alt6=6;
            }
            break;
        case 'c':
            {
            int LA6_7 = input.LA(2);

            if ( (LA6_7=='l') ) {
                int LA6_20 = input.LA(3);

                if ( (LA6_20=='a') ) {
                    int LA6_27 = input.LA(4);

                    if ( (LA6_27=='s') ) {
                        int LA6_34 = input.LA(5);

                        if ( (LA6_34=='s') ) {
                            int LA6_41 = input.LA(6);

                            if ( ((LA6_41 >= '0' && LA6_41 <= '9')||(LA6_41 >= 'A' && LA6_41 <= 'Z')||LA6_41=='_'||(LA6_41 >= 'a' && LA6_41 <= 'z')) ) {
                                alt6=16;
                            }
                            else {
                                alt6=7;
                            }
                        }
                        else {
                            alt6=16;
                        }
                    }
                    else {
                        alt6=16;
                    }
                }
                else {
                    alt6=16;
                }
            }
            else {
                alt6=16;
            }
            }
            break;
        case 'd':
            {
            int LA6_8 = input.LA(2);

            if ( (LA6_8=='e') ) {
                int LA6_21 = input.LA(3);

                if ( (LA6_21=='f') ) {
                    int LA6_28 = input.LA(4);

                    if ( ((LA6_28 >= '0' && LA6_28 <= '9')||(LA6_28 >= 'A' && LA6_28 <= 'Z')||LA6_28=='_'||(LA6_28 >= 'a' && LA6_28 <= 'z')) ) {
                        alt6=16;
                    }
                    else {
                        alt6=8;
                    }
                }
                else {
                    alt6=16;
                }
            }
            else {
                alt6=16;
            }
            }
            break;
        case 'e':
            {
            int LA6_9 = input.LA(2);

            if ( (LA6_9=='x') ) {
                int LA6_22 = input.LA(3);

                if ( (LA6_22=='t') ) {
                    int LA6_29 = input.LA(4);

                    if ( (LA6_29=='e') ) {
                        int LA6_36 = input.LA(5);

                        if ( (LA6_36=='n') ) {
                            int LA6_42 = input.LA(6);

                            if ( (LA6_42=='d') ) {
                                int LA6_47 = input.LA(7);

                                if ( (LA6_47=='s') ) {
                                    int LA6_50 = input.LA(8);

                                    if ( ((LA6_50 >= '0' && LA6_50 <= '9')||(LA6_50 >= 'A' && LA6_50 <= 'Z')||LA6_50=='_'||(LA6_50 >= 'a' && LA6_50 <= 'z')) ) {
                                        alt6=16;
                                    }
                                    else {
                                        alt6=9;
                                    }
                                }
                                else {
                                    alt6=16;
                                }
                            }
                            else {
                                alt6=16;
                            }
                        }
                        else {
                            alt6=16;
                        }
                    }
                    else {
                        alt6=16;
                    }
                }
                else {
                    alt6=16;
                }
            }
            else {
                alt6=16;
            }
            }
            break;
        case 'n':
            {
            int LA6_10 = input.LA(2);

            if ( (LA6_10=='e') ) {
                int LA6_23 = input.LA(3);

                if ( (LA6_23=='w') ) {
                    int LA6_30 = input.LA(4);

                    if ( ((LA6_30 >= '0' && LA6_30 <= '9')||(LA6_30 >= 'A' && LA6_30 <= 'Z')||LA6_30=='_'||(LA6_30 >= 'a' && LA6_30 <= 'z')) ) {
                        alt6=16;
                    }
                    else {
                        alt6=10;
                    }
                }
                else {
                    alt6=16;
                }
            }
            else {
                alt6=16;
            }
            }
            break;
        case 'r':
            {
            int LA6_11 = input.LA(2);

            if ( (LA6_11=='e') ) {
                int LA6_24 = input.LA(3);

                if ( (LA6_24=='t') ) {
                    int LA6_31 = input.LA(4);

                    if ( (LA6_31=='u') ) {
                        int LA6_38 = input.LA(5);

                        if ( (LA6_38=='r') ) {
                            int LA6_43 = input.LA(6);

                            if ( (LA6_43=='n') ) {
                                int LA6_48 = input.LA(7);

                                if ( ((LA6_48 >= '0' && LA6_48 <= '9')||(LA6_48 >= 'A' && LA6_48 <= 'Z')||LA6_48=='_'||(LA6_48 >= 'a' && LA6_48 <= 'z')) ) {
                                    alt6=16;
                                }
                                else {
                                    alt6=11;
                                }
                            }
                            else {
                                alt6=16;
                            }
                        }
                        else {
                            alt6=16;
                        }
                    }
                    else {
                        alt6=16;
                    }
                }
                else {
                    alt6=16;
                }
            }
            else {
                alt6=16;
            }
            }
            break;
        case 's':
            {
            int LA6_12 = input.LA(2);

            if ( (LA6_12=='u') ) {
                int LA6_25 = input.LA(3);

                if ( (LA6_25=='p') ) {
                    int LA6_32 = input.LA(4);

                    if ( (LA6_32=='e') ) {
                        int LA6_39 = input.LA(5);

                        if ( (LA6_39=='r') ) {
                            int LA6_44 = input.LA(6);

                            if ( ((LA6_44 >= '0' && LA6_44 <= '9')||(LA6_44 >= 'A' && LA6_44 <= 'Z')||LA6_44=='_'||(LA6_44 >= 'a' && LA6_44 <= 'z')) ) {
                                alt6=16;
                            }
                            else {
                                alt6=12;
                            }
                        }
                        else {
                            alt6=16;
                        }
                    }
                    else {
                        alt6=16;
                    }
                }
                else {
                    alt6=16;
                }
            }
            else {
                alt6=16;
            }
            }
            break;
        case 't':
            {
            int LA6_13 = input.LA(2);

            if ( (LA6_13=='h') ) {
                int LA6_26 = input.LA(3);

                if ( (LA6_26=='i') ) {
                    int LA6_33 = input.LA(4);

                    if ( (LA6_33=='s') ) {
                        int LA6_40 = input.LA(5);

                        if ( ((LA6_40 >= '0' && LA6_40 <= '9')||(LA6_40 >= 'A' && LA6_40 <= 'Z')||LA6_40=='_'||(LA6_40 >= 'a' && LA6_40 <= 'z')) ) {
                            alt6=16;
                        }
                        else {
                            alt6=13;
                        }
                    }
                    else {
                        alt6=16;
                    }
                }
                else {
                    alt6=16;
                }
            }
            else {
                alt6=16;
            }
            }
            break;
        case '{':
            {
            alt6=14;
            }
            break;
        case '}':
            {
            alt6=15;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'o':
        case 'p':
        case 'q':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=16;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=17;
            }
            break;
        case '\"':
            {
            alt6=18;
            }
            break;
        case '\'':
            {
            alt6=19;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:10: T__37
                {
                mT__37(); 


                }
                break;
            case 2 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:16: T__38
                {
                mT__38(); 


                }
                break;
            case 3 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:22: T__39
                {
                mT__39(); 


                }
                break;
            case 4 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:28: T__40
                {
                mT__40(); 


                }
                break;
            case 5 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:34: T__41
                {
                mT__41(); 


                }
                break;
            case 6 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:40: T__42
                {
                mT__42(); 


                }
                break;
            case 7 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:46: T__43
                {
                mT__43(); 


                }
                break;
            case 8 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:52: T__44
                {
                mT__44(); 


                }
                break;
            case 9 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:58: T__45
                {
                mT__45(); 


                }
                break;
            case 10 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:64: T__46
                {
                mT__46(); 


                }
                break;
            case 11 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:70: T__47
                {
                mT__47(); 


                }
                break;
            case 12 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:76: T__48
                {
                mT__48(); 


                }
                break;
            case 13 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:82: T__49
                {
                mT__49(); 


                }
                break;
            case 14 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:88: T__50
                {
                mT__50(); 


                }
                break;
            case 15 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:94: T__51
                {
                mT__51(); 


                }
                break;
            case 16 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:100: ID
                {
                mID(); 


                }
                break;
            case 17 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:103: WS
                {
                mWS(); 


                }
                break;
            case 18 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:106: STRING
                {
                mSTRING(); 


                }
                break;
            case 19 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\fjd\\FJD.g:1:113: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


 

}