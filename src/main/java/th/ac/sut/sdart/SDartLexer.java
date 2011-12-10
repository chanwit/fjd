// $ANTLR 3.4 C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g 2011-12-11 00:04:47
 package th.ac.sut.sdart; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SDartLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int ARG=4;
    public static final int ARGS=5;
    public static final int ASSIGN_STMT=6;
    public static final int CAST_EXPR=7;
    public static final int CHAR=8;
    public static final int CLASS=9;
    public static final int CTOR=10;
    public static final int CTOR_BODY=11;
    public static final int DYNAMIC=12;
    public static final int ESC_SEQ=13;
    public static final int EXPR=14;
    public static final int EXPR_LIST=15;
    public static final int FIELD=16;
    public static final int FIELDS=17;
    public static final int FIELD_ACCESS_EXPR=18;
    public static final int FIELD_INIT_STMT=19;
    public static final int FIELD_INIT_STMT_LIST=20;
    public static final int FUNCTION=21;
    public static final int FUNC_BODY=22;
    public static final int FUNC_CALL_EXPR=23;
    public static final int GETTER=24;
    public static final int HEX_DIGIT=25;
    public static final int ID=26;
    public static final int MEMBERS=27;
    public static final int METH_CALL_EXPR=28;
    public static final int NEW_EXPR=29;
    public static final int OCTAL_ESC=30;
    public static final int PROGRAM=31;
    public static final int RETURN_STMT=32;
    public static final int SETTER=33;
    public static final int STMT=34;
    public static final int STRING=35;
    public static final int SUPER_CLASS=36;
    public static final int SUPER_STMT=37;
    public static final int THIS_EXPR=38;
    public static final int TYPE=39;
    public static final int UNICODE_ESC=40;
    public static final int VALUE_EXPR=41;
    public static final int WS=42;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SDartLexer() {} 
    public SDartLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SDartLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g"; }

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:4:7: ( '(' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:4:9: '('
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:5:7: ( ')' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:5:9: ')'
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:6:7: ( ',' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:6:9: ','
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:7:7: ( '.' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:7:9: '.'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:8:7: ( ':' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:8:9: ':'
            {
            match(':'); 

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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:9:7: ( ';' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:9:9: ';'
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:10:7: ( '=' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:10:9: '='
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:11:7: ( '=>' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:11:9: '=>'
            {
            match("=>"); 



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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:12:7: ( 'class' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:12:9: 'class'
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:13:7: ( 'extends' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:13:9: 'extends'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:14:7: ( 'get' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:14:9: 'get'
            {
            match("get"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:15:7: ( 'new' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:15:9: 'new'
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:16:7: ( 'return' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:16:9: 'return'
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:17:7: ( 'set' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:17:9: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:18:7: ( 'super' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:18:9: 'super'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:19:7: ( 'this' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:19:9: 'this'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:20:7: ( 'var' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:20:9: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:21:7: ( 'void' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:21:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:22:7: ( '{' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:22:9: '{'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:23:7: ( '}' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:23:9: '}'
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
    // $ANTLR end "T__62"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:215:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:215:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:215:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:
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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:218:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:218:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:226:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:226:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:226:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:226:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:226:24: ~ ( '\\\\' | '\"' )
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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:229:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:229:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:229:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:229:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:229:25: ~ ( '\\'' | '\\\\' )
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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:234:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:
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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:238:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:238:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:239:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:240:9: OCTAL_ESC
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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:245:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:245:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:246:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:247:9: '\\\\' ( '0' .. '7' )
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
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:252:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:252:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | ID | WS | STRING | CHAR )
        int alt6=24;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:10: T__43
                {
                mT__43(); 


                }
                break;
            case 2 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:16: T__44
                {
                mT__44(); 


                }
                break;
            case 3 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:22: T__45
                {
                mT__45(); 


                }
                break;
            case 4 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:28: T__46
                {
                mT__46(); 


                }
                break;
            case 5 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:34: T__47
                {
                mT__47(); 


                }
                break;
            case 6 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:40: T__48
                {
                mT__48(); 


                }
                break;
            case 7 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:46: T__49
                {
                mT__49(); 


                }
                break;
            case 8 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:52: T__50
                {
                mT__50(); 


                }
                break;
            case 9 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:58: T__51
                {
                mT__51(); 


                }
                break;
            case 10 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:64: T__52
                {
                mT__52(); 


                }
                break;
            case 11 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:70: T__53
                {
                mT__53(); 


                }
                break;
            case 12 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:76: T__54
                {
                mT__54(); 


                }
                break;
            case 13 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:82: T__55
                {
                mT__55(); 


                }
                break;
            case 14 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:88: T__56
                {
                mT__56(); 


                }
                break;
            case 15 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:94: T__57
                {
                mT__57(); 


                }
                break;
            case 16 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:100: T__58
                {
                mT__58(); 


                }
                break;
            case 17 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:106: T__59
                {
                mT__59(); 


                }
                break;
            case 18 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:112: T__60
                {
                mT__60(); 


                }
                break;
            case 19 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:118: T__61
                {
                mT__61(); 


                }
                break;
            case 20 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:124: T__62
                {
                mT__62(); 


                }
                break;
            case 21 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:130: ID
                {
                mID(); 


                }
                break;
            case 22 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:133: WS
                {
                mWS(); 


                }
                break;
            case 23 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:136: STRING
                {
                mSTRING(); 


                }
                break;
            case 24 :
                // C:\\projects\\fjd\\src\\main\\java\\th\\ac\\sut\\sdart\\SDart.g:1:143: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\7\uffff\1\27\10\22\10\uffff\14\22\1\56\1\57\1\22\1\61\2\22\1\64"+
        "\3\22\2\uffff\1\22\1\uffff\1\22\1\72\1\uffff\1\73\1\74\2\22\1\77"+
        "\3\uffff\1\22\1\101\1\uffff\1\102\2\uffff";
    static final String DFA6_eofS =
        "\103\uffff";
    static final String DFA6_minS =
        "\1\11\6\uffff\1\76\1\154\1\170\4\145\1\150\1\141\10\uffff\1\141"+
        "\2\164\1\167\2\164\1\160\1\151\1\162\1\151\1\163\1\145\2\60\1\165"+
        "\1\60\1\145\1\163\1\60\1\144\1\163\1\156\2\uffff\1\162\1\uffff\1"+
        "\162\1\60\1\uffff\2\60\1\144\1\156\1\60\3\uffff\1\163\1\60\1\uffff"+
        "\1\60\2\uffff";
    static final String DFA6_maxS =
        "\1\175\6\uffff\1\76\1\154\1\170\3\145\1\165\1\150\1\157\10\uffff"+
        "\1\141\2\164\1\167\2\164\1\160\1\151\1\162\1\151\1\163\1\145\2\172"+
        "\1\165\1\172\1\145\1\163\1\172\1\144\1\163\1\156\2\uffff\1\162\1"+
        "\uffff\1\162\1\172\1\uffff\2\172\1\144\1\156\1\172\3\uffff\1\163"+
        "\1\172\1\uffff\1\172\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\23\1\24\1\25\1\26\1"+
        "\27\1\30\1\10\1\7\26\uffff\1\13\1\14\1\uffff\1\16\2\uffff\1\21\5"+
        "\uffff\1\20\1\22\1\11\2\uffff\1\17\1\uffff\1\15\1\12";
    static final String DFA6_specialS =
        "\103\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\1\uffff\1\24\4\uffff\1\25\1"+
            "\1\1\2\2\uffff\1\3\1\uffff\1\4\13\uffff\1\5\1\6\1\uffff\1\7"+
            "\3\uffff\32\22\4\uffff\1\22\1\uffff\2\22\1\10\1\22\1\11\1\22"+
            "\1\12\6\22\1\13\3\22\1\14\1\15\1\16\1\22\1\17\4\22\1\20\1\uffff"+
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35\17\uffff\1\36",
            "\1\37",
            "\1\40\15\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\60",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\62",
            "\1\63",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\70",
            "",
            "\1\71",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\75",
            "\1\76",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "",
            "\1\100",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
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
            return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | ID | WS | STRING | CHAR );";
        }
    }
 

}