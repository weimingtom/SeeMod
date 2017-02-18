// $ANTLR 3.3 Nov 30, 2010 12:45:30 Seej.g 2011-08-15 20:20:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SeejLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int PROGRAM_ROOT=4;
    public static final int FIELD_DECL=5;
    public static final int ARRAY_TYPE=6;
    public static final int ARRAY_DIMENSIONS=7;
    public static final int VAR_DECL=8;
    public static final int STRUCT=9;
    public static final int FUNC_DECL=10;
    public static final int ARG_DECL=11;
    public static final int BLOCK=12;
    public static final int RETURN=13;
    public static final int IF=14;
    public static final int ELSE=15;
    public static final int WHILE=16;
    public static final int SEMI=17;
    public static final int PRINT=18;
    public static final int LEN=19;
    public static final int EXPR=20;
    public static final int ASSIGN=21;
    public static final int LOGICAL_OR=22;
    public static final int LOGICAL_AND=23;
    public static final int EQ=24;
    public static final int NEQ=25;
    public static final int LT=26;
    public static final int LEQ=27;
    public static final int GT=28;
    public static final int GEQ=29;
    public static final int PLUS=30;
    public static final int MINUS=31;
    public static final int MUL=32;
    public static final int DIV=33;
    public static final int MOD=34;
    public static final int LOGICAL_NOT=35;
    public static final int UNARY_PLUS=36;
    public static final int UNARY_MINUS=37;
    public static final int DOT=38;
    public static final int INDEX=39;
    public static final int CALL=40;
    public static final int NEW_STRUCT=41;
    public static final int NEW_ARRAY=42;
    public static final int NULL_LIT=43;
    public static final int ID=44;
    public static final int INT_LIT=45;
    public static final int DOUBLE_LIT=46;
    public static final int CHAR_LIT=47;
    public static final int BOOLEAN_LIT=48;
    public static final int FILENAME=49;
    public static final int INCLUDE=50;
    public static final int SL_COMMENT=51;
    public static final int ML_COMMENT=52;
    public static final int WS=53;

    // delegates
    // delegators

    public SeejLexer() {;} 
    public SeejLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SeejLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Seej.g"; }

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:3:8: ( 'struct' )
            // Seej.g:3:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:4:7: ( '{' )
            // Seej.g:4:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:5:8: ( 'return' )
            // Seej.g:5:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:6:4: ( 'if' )
            // Seej.g:6:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:7:6: ( 'else' )
            // Seej.g:7:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:8:7: ( 'while' )
            // Seej.g:8:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:9:6: ( ';' )
            // Seej.g:9:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:10:7: ( 'print' )
            // Seej.g:10:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "LEN"
    public final void mLEN() throws RecognitionException {
        try {
            int _type = LEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:11:5: ( 'len' )
            // Seej.g:11:7: 'len'
            {
            match("len"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEN"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:12:8: ( '=' )
            // Seej.g:12:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "LOGICAL_OR"
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:13:12: ( '||' )
            // Seej.g:13:14: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL_OR"

    // $ANTLR start "LOGICAL_AND"
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:14:13: ( '&&' )
            // Seej.g:14:15: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL_AND"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:15:4: ( '==' )
            // Seej.g:15:6: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:16:5: ( '!=' )
            // Seej.g:16:7: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:17:4: ( '<' )
            // Seej.g:17:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:18:5: ( '<=' )
            // Seej.g:18:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:19:4: ( '>' )
            // Seej.g:19:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:20:5: ( '>=' )
            // Seej.g:20:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:21:6: ( '+' )
            // Seej.g:21:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:22:7: ( '-' )
            // Seej.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:23:5: ( '*' )
            // Seej.g:23:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:24:5: ( '/' )
            // Seej.g:24:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:25:5: ( '%' )
            // Seej.g:25:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "LOGICAL_NOT"
    public final void mLOGICAL_NOT() throws RecognitionException {
        try {
            int _type = LOGICAL_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:26:13: ( '!' )
            // Seej.g:26:15: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL_NOT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:27:5: ( '.' )
            // Seej.g:27:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "NULL_LIT"
    public final void mNULL_LIT() throws RecognitionException {
        try {
            int _type = NULL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:28:10: ( 'null' )
            // Seej.g:28:12: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL_LIT"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:29:7: ( '}' )
            // Seej.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:30:7: ( ',' )
            // Seej.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:31:7: ( '[' )
            // Seej.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:32:7: ( ']' )
            // Seej.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:33:7: ( 'int' )
            // Seej.g:33:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:34:7: ( 'double' )
            // Seej.g:34:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:35:7: ( 'void' )
            // Seej.g:35:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:36:7: ( 'char' )
            // Seej.g:36:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:37:7: ( 'boolean' )
            // Seej.g:37:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:38:7: ( '(' )
            // Seej.g:38:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:39:7: ( ')' )
            // Seej.g:39:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:40:7: ( 'new' )
            // Seej.g:40:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "FILENAME"
    public final void mFILENAME() throws RecognitionException {
        try {
            // Seej.g:245:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '-' | ' ' | '/' | ':' | '\\\\' )+ )
            // Seej.g:245:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '-' | ' ' | '/' | ':' | '\\\\' )+
            {
            // Seej.g:245:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '-' | ' ' | '/' | ':' | '\\\\' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' '||(LA1_0>='-' && LA1_0<=':')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='\\'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Seej.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1)>='-' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

        }
        finally {
        }
    }
    // $ANTLR end "FILENAME"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken f=null;

            // Seej.g:246:9: ( '#' ( ' ' | '\\t' )* 'include' ( ' ' | '\\t' )* '<' f= FILENAME '>' )
            // Seej.g:246:11: '#' ( ' ' | '\\t' )* 'include' ( ' ' | '\\t' )* '<' f= FILENAME '>'
            {
            match('#'); 
            // Seej.g:246:15: ( ' ' | '\\t' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Seej.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

            match("include"); 

            // Seej.g:246:37: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Seej.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('<'); 
            int fStart396 = getCharIndex();
            int fStartLine396 = getLine();
            int fStartCharPos396 = getCharPositionInLine();
            mFILENAME(); 
            f = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fStart396, getCharIndex()-1);
            f.setLine(fStartLine396);
            f.setCharPositionInLine(fStartCharPos396);
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "INT_LIT"
    public final void mINT_LIT() throws RecognitionException {
        try {
            int _type = INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:249:9: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Seej.g:249:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // Seej.g:249:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // Seej.g:249:26: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Seej.g:249:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_LIT"

    // $ANTLR start "DOUBLE_LIT"
    public final void mDOUBLE_LIT() throws RecognitionException {
        try {
            int _type = DOUBLE_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:251:12: ( INT_LIT '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='.') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Seej.g:251:14: INT_LIT '.' ( '0' .. '9' )*
                    {
                    mINT_LIT(); 
                    match('.'); 
                    // Seej.g:251:26: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Seej.g:251:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Seej.g:251:40: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // Seej.g:251:44: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Seej.g:251:45: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_LIT"

    // $ANTLR start "CHAR_LIT"
    public final void mCHAR_LIT() throws RecognitionException {
        try {
            int _type = CHAR_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:253:9: ( '\\'' (~ ( '\\\\' | '\\r' | '\\n' ) | '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' ) ) '\\'' )
            // Seej.g:253:11: '\\'' (~ ( '\\\\' | '\\r' | '\\n' ) | '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' ) ) '\\''
            {
            match('\''); 
            // Seej.g:253:16: (~ ( '\\\\' | '\\r' | '\\n' ) | '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='\\') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Seej.g:253:18: ~ ( '\\\\' | '\\r' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // Seej.g:253:38: '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
    // $ANTLR end "CHAR_LIT"

    // $ANTLR start "BOOLEAN_LIT"
    public final void mBOOLEAN_LIT() throws RecognitionException {
        try {
            int _type = BOOLEAN_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:255:13: ( 'true' | 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='t') ) {
                alt10=1;
            }
            else if ( (LA10_0=='f') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Seej.g:255:15: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // Seej.g:255:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN_LIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:257:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Seej.g:257:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Seej.g:257:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Seej.g:
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
            	    break loop11;
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

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:259:12: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
            // Seej.g:259:14: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // Seej.g:259:19: (~ ( '\\r' | '\\n' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Seej.g:259:20: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // Seej.g:259:37: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Seej.g:259:37: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:261:12: ( '/*' ( . )* '*/' )
            // Seej.g:261:14: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Seej.g:261:19: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Seej.g:261:19: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Seej.g:263:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Seej.g:263:5: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Seej.g:1:8: ( STRUCT | BLOCK | RETURN | IF | ELSE | WHILE | SEMI | PRINT | LEN | ASSIGN | LOGICAL_OR | LOGICAL_AND | EQ | NEQ | LT | LEQ | GT | GEQ | PLUS | MINUS | MUL | DIV | MOD | LOGICAL_NOT | DOT | NULL_LIT | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | INCLUDE | INT_LIT | DOUBLE_LIT | CHAR_LIT | BOOLEAN_LIT | ID | SL_COMMENT | ML_COMMENT | WS )
        int alt15=47;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // Seej.g:1:10: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 2 :
                // Seej.g:1:17: BLOCK
                {
                mBLOCK(); 

                }
                break;
            case 3 :
                // Seej.g:1:23: RETURN
                {
                mRETURN(); 

                }
                break;
            case 4 :
                // Seej.g:1:30: IF
                {
                mIF(); 

                }
                break;
            case 5 :
                // Seej.g:1:33: ELSE
                {
                mELSE(); 

                }
                break;
            case 6 :
                // Seej.g:1:38: WHILE
                {
                mWHILE(); 

                }
                break;
            case 7 :
                // Seej.g:1:44: SEMI
                {
                mSEMI(); 

                }
                break;
            case 8 :
                // Seej.g:1:49: PRINT
                {
                mPRINT(); 

                }
                break;
            case 9 :
                // Seej.g:1:55: LEN
                {
                mLEN(); 

                }
                break;
            case 10 :
                // Seej.g:1:59: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 11 :
                // Seej.g:1:66: LOGICAL_OR
                {
                mLOGICAL_OR(); 

                }
                break;
            case 12 :
                // Seej.g:1:77: LOGICAL_AND
                {
                mLOGICAL_AND(); 

                }
                break;
            case 13 :
                // Seej.g:1:89: EQ
                {
                mEQ(); 

                }
                break;
            case 14 :
                // Seej.g:1:92: NEQ
                {
                mNEQ(); 

                }
                break;
            case 15 :
                // Seej.g:1:96: LT
                {
                mLT(); 

                }
                break;
            case 16 :
                // Seej.g:1:99: LEQ
                {
                mLEQ(); 

                }
                break;
            case 17 :
                // Seej.g:1:103: GT
                {
                mGT(); 

                }
                break;
            case 18 :
                // Seej.g:1:106: GEQ
                {
                mGEQ(); 

                }
                break;
            case 19 :
                // Seej.g:1:110: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // Seej.g:1:115: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // Seej.g:1:121: MUL
                {
                mMUL(); 

                }
                break;
            case 22 :
                // Seej.g:1:125: DIV
                {
                mDIV(); 

                }
                break;
            case 23 :
                // Seej.g:1:129: MOD
                {
                mMOD(); 

                }
                break;
            case 24 :
                // Seej.g:1:133: LOGICAL_NOT
                {
                mLOGICAL_NOT(); 

                }
                break;
            case 25 :
                // Seej.g:1:145: DOT
                {
                mDOT(); 

                }
                break;
            case 26 :
                // Seej.g:1:149: NULL_LIT
                {
                mNULL_LIT(); 

                }
                break;
            case 27 :
                // Seej.g:1:158: T__54
                {
                mT__54(); 

                }
                break;
            case 28 :
                // Seej.g:1:164: T__55
                {
                mT__55(); 

                }
                break;
            case 29 :
                // Seej.g:1:170: T__56
                {
                mT__56(); 

                }
                break;
            case 30 :
                // Seej.g:1:176: T__57
                {
                mT__57(); 

                }
                break;
            case 31 :
                // Seej.g:1:182: T__58
                {
                mT__58(); 

                }
                break;
            case 32 :
                // Seej.g:1:188: T__59
                {
                mT__59(); 

                }
                break;
            case 33 :
                // Seej.g:1:194: T__60
                {
                mT__60(); 

                }
                break;
            case 34 :
                // Seej.g:1:200: T__61
                {
                mT__61(); 

                }
                break;
            case 35 :
                // Seej.g:1:206: T__62
                {
                mT__62(); 

                }
                break;
            case 36 :
                // Seej.g:1:212: T__63
                {
                mT__63(); 

                }
                break;
            case 37 :
                // Seej.g:1:218: T__64
                {
                mT__64(); 

                }
                break;
            case 38 :
                // Seej.g:1:224: T__65
                {
                mT__65(); 

                }
                break;
            case 39 :
                // Seej.g:1:230: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 40 :
                // Seej.g:1:238: INT_LIT
                {
                mINT_LIT(); 

                }
                break;
            case 41 :
                // Seej.g:1:246: DOUBLE_LIT
                {
                mDOUBLE_LIT(); 

                }
                break;
            case 42 :
                // Seej.g:1:257: CHAR_LIT
                {
                mCHAR_LIT(); 

                }
                break;
            case 43 :
                // Seej.g:1:266: BOOLEAN_LIT
                {
                mBOOLEAN_LIT(); 

                }
                break;
            case 44 :
                // Seej.g:1:278: ID
                {
                mID(); 

                }
                break;
            case 45 :
                // Seej.g:1:281: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 46 :
                // Seej.g:1:292: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 47 :
                // Seej.g:1:303: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\47\1\uffff\4\47\1\uffff\2\47\1\62\2\uffff\1\64\1\66"+
        "\1\70\3\uffff\1\73\1\uffff\1\74\1\47\4\uffff\4\47\3\uffff\2\104"+
        "\1\uffff\2\47\2\uffff\2\47\1\112\5\47\15\uffff\6\47\1\uffff\1\104"+
        "\4\47\1\uffff\1\132\3\47\1\136\1\47\1\140\10\47\1\uffff\1\151\2"+
        "\47\1\uffff\1\154\1\uffff\1\47\1\156\1\157\1\47\1\161\3\47\1\uffff"+
        "\1\165\1\166\1\uffff\1\47\2\uffff\1\47\1\uffff\1\161\1\171\1\172"+
        "\2\uffff\1\173\1\47\3\uffff\1\175\1\uffff";
    static final String DFA15_eofS =
        "\176\uffff";
    static final String DFA15_minS =
        "\1\11\1\164\1\uffff\1\145\1\146\1\154\1\150\1\uffff\1\162\1\145"+
        "\1\75\2\uffff\3\75\3\uffff\1\52\1\uffff\1\60\1\145\4\uffff\2\157"+
        "\1\150\1\157\3\uffff\2\56\1\uffff\1\162\1\141\2\uffff\1\162\1\164"+
        "\1\60\1\164\1\163\2\151\1\156\15\uffff\1\154\1\167\1\165\1\151\1"+
        "\141\1\157\1\uffff\1\56\1\165\1\154\2\165\1\uffff\1\60\1\145\1\154"+
        "\1\156\1\60\1\154\1\60\1\142\1\144\1\162\1\154\1\145\1\163\1\143"+
        "\1\162\1\uffff\1\60\1\145\1\164\1\uffff\1\60\1\uffff\1\154\2\60"+
        "\1\145\1\60\1\145\1\164\1\156\1\uffff\2\60\1\uffff\1\145\2\uffff"+
        "\1\141\1\uffff\3\60\2\uffff\1\60\1\156\3\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\175\1\164\1\uffff\1\145\1\156\1\154\1\150\1\uffff\1\162\1\145"+
        "\1\75\2\uffff\3\75\3\uffff\1\57\1\uffff\1\71\1\165\4\uffff\2\157"+
        "\1\150\1\157\3\uffff\1\56\1\71\1\uffff\1\162\1\141\2\uffff\1\162"+
        "\1\164\1\172\1\164\1\163\2\151\1\156\15\uffff\1\154\1\167\1\165"+
        "\1\151\1\141\1\157\1\uffff\1\71\1\165\1\154\2\165\1\uffff\1\172"+
        "\1\145\1\154\1\156\1\172\1\154\1\172\1\142\1\144\1\162\1\154\1\145"+
        "\1\163\1\143\1\162\1\uffff\1\172\1\145\1\164\1\uffff\1\172\1\uffff"+
        "\1\154\2\172\1\145\1\172\1\145\1\164\1\156\1\uffff\2\172\1\uffff"+
        "\1\145\2\uffff\1\141\1\uffff\3\172\2\uffff\1\172\1\156\3\uffff\1"+
        "\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\4\uffff\1\7\3\uffff\1\13\1\14\3\uffff\1\23\1\24\1"+
        "\25\1\uffff\1\27\2\uffff\1\33\1\34\1\35\1\36\4\uffff\1\44\1\45\1"+
        "\47\2\uffff\1\52\2\uffff\1\54\1\57\10\uffff\1\15\1\12\1\16\1\30"+
        "\1\20\1\17\1\22\1\21\1\55\1\56\1\26\1\31\1\51\6\uffff\1\50\5\uffff"+
        "\1\4\17\uffff\1\37\3\uffff\1\11\1\uffff\1\46\10\uffff\1\5\2\uffff"+
        "\1\32\1\uffff\1\41\1\42\1\uffff\1\53\3\uffff\1\6\1\10\2\uffff\1"+
        "\1\1\3\1\40\1\uffff\1\43";
    static final String DFA15_specialS =
        "\176\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\15\1\uffff\1\41\1\uffff"+
            "\1\24\1\14\1\44\1\37\1\40\1\22\1\20\1\30\1\21\1\25\1\23\1\42"+
            "\11\43\1\uffff\1\7\1\16\1\12\1\17\2\uffff\32\47\1\31\1\uffff"+
            "\1\32\1\uffff\1\47\1\uffff\1\47\1\36\1\35\1\33\1\5\1\46\2\47"+
            "\1\4\2\47\1\11\1\47\1\26\1\47\1\10\1\47\1\3\1\1\1\45\1\47\1"+
            "\34\1\6\3\47\1\2\1\13\1\27",
            "\1\51",
            "",
            "\1\52",
            "\1\53\7\uffff\1\54",
            "\1\55",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\63",
            "\1\65",
            "\1\67",
            "",
            "",
            "",
            "\1\72\4\uffff\1\71",
            "",
            "\12\75",
            "\1\77\17\uffff\1\76",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "\1\75",
            "\1\75\1\uffff\12\105",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\110",
            "\1\111",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\75\1\uffff\12\105",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\137",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\152",
            "\1\153",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\155",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\160",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\167",
            "",
            "",
            "\1\170",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\174",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STRUCT | BLOCK | RETURN | IF | ELSE | WHILE | SEMI | PRINT | LEN | ASSIGN | LOGICAL_OR | LOGICAL_AND | EQ | NEQ | LT | LEQ | GT | GEQ | PLUS | MINUS | MUL | DIV | MOD | LOGICAL_NOT | DOT | NULL_LIT | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | INCLUDE | INT_LIT | DOUBLE_LIT | CHAR_LIT | BOOLEAN_LIT | ID | SL_COMMENT | ML_COMMENT | WS );";
        }
    }
 

}