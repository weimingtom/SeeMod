// $ANTLR 3.3 Nov 30, 2010 12:45:30 See.g 2011-11-28 00:16:02

package see;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SeeLexer extends Lexer {
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
    public static final int FILENAME=44;
    public static final int INCLUDE=45;
    public static final int ID=46;
    public static final int INT_LIT=47;
    public static final int DOUBLE_LIT=48;
    public static final int CHAR_LIT=49;
    public static final int BOOLEAN_LIT=50;
    public static final int SL_COMMENT=51;
    public static final int ML_COMMENT=52;
    public static final int WS=53;

    /*
     * Code for implementing the #include directive.
     * Taken from http://www.antlr.org/wiki/pages/viewpage.action?pageId=557057
     */
    	class SaveStruct {
    		SaveStruct(CharStream input) {
    			this.input = input;
    			this.marker = input.mark();
    		}
    		public CharStream input;
    		public int marker;
    	}

    	Stack<SaveStruct> includes = new Stack<SaveStruct>();

    	// We should override this method for handling EOF of included file
    	public Token nextToken() {
    		Token token = super.nextToken();

    		if (token.getType() == Token.EOF && !includes.empty()) {
    			// We've got EOF and have non empty stack
    			SaveStruct ss = includes.pop();
    			setCharStream(ss.input);
    			input.rewind(ss.marker);
    			// this should be used instead of super [like below] to handle exits from nested includes
    			// it matters, when the 'include' token is the last in previous stream (using super, lexer 'crashes' returning EOF token)
    			token = this.nextToken();
    		}

    		// Skip first token after switching on another input
    		// You need to use this rather than super as there may be nested include files
    		if (((CommonToken)token).getStartIndex() < 0)
    			token = this.nextToken();

    		return token;
    	}


    // delegates
    // delegators

    public SeeLexer() {;} 
    public SeeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SeeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "See.g"; }

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // See.g:45:8: ( 'struct' )
            // See.g:45:10: 'struct'
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
            // See.g:46:7: ( '{' )
            // See.g:46:9: '{'
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
            // See.g:47:8: ( 'return' )
            // See.g:47:10: 'return'
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
            // See.g:48:4: ( 'if' )
            // See.g:48:6: 'if'
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
            // See.g:49:6: ( 'else' )
            // See.g:49:8: 'else'
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
            // See.g:50:7: ( 'while' )
            // See.g:50:9: 'while'
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
            // See.g:51:6: ( ';' )
            // See.g:51:8: ';'
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
            // See.g:52:7: ( 'print' )
            // See.g:52:9: 'print'
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
            // See.g:53:5: ( 'len' )
            // See.g:53:7: 'len'
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
            // See.g:54:8: ( '=' )
            // See.g:54:10: '='
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
            // See.g:55:12: ( '||' )
            // See.g:55:14: '||'
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
            // See.g:56:13: ( '&&' )
            // See.g:56:15: '&&'
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
            // See.g:57:4: ( '==' )
            // See.g:57:6: '=='
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
            // See.g:58:5: ( '!=' )
            // See.g:58:7: '!='
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
            // See.g:59:4: ( '<' )
            // See.g:59:6: '<'
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
            // See.g:60:5: ( '<=' )
            // See.g:60:7: '<='
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
            // See.g:61:4: ( '>' )
            // See.g:61:6: '>'
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
            // See.g:62:5: ( '>=' )
            // See.g:62:7: '>='
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
            // See.g:63:6: ( '+' )
            // See.g:63:8: '+'
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
            // See.g:64:7: ( '-' )
            // See.g:64:9: '-'
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
            // See.g:65:5: ( '*' )
            // See.g:65:7: '*'
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
            // See.g:66:5: ( '/' )
            // See.g:66:7: '/'
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
            // See.g:67:5: ( '%' )
            // See.g:67:7: '%'
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
            // See.g:68:13: ( '!' )
            // See.g:68:15: '!'
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
            // See.g:69:5: ( '.' )
            // See.g:69:7: '.'
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
            // See.g:70:10: ( 'null' )
            // See.g:70:12: 'null'
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
            // See.g:71:7: ( '}' )
            // See.g:71:9: '}'
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
            // See.g:72:7: ( ',' )
            // See.g:72:9: ','
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
            // See.g:73:7: ( '[' )
            // See.g:73:9: '['
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
            // See.g:74:7: ( ']' )
            // See.g:74:9: ']'
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
            // See.g:75:7: ( 'int' )
            // See.g:75:9: 'int'
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
            // See.g:76:7: ( 'double' )
            // See.g:76:9: 'double'
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
            // See.g:77:7: ( 'void' )
            // See.g:77:9: 'void'
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
            // See.g:78:7: ( 'char' )
            // See.g:78:9: 'char'
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
            // See.g:79:7: ( 'boolean' )
            // See.g:79:9: 'boolean'
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
            // See.g:80:7: ( '(' )
            // See.g:80:9: '('
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
            // See.g:81:7: ( ')' )
            // See.g:81:9: ')'
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
            // See.g:82:7: ( 'new' )
            // See.g:82:9: 'new'
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
            // See.g:86:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '-' | ' ' | '/' | ':' | '\\\\' )+ )
            // See.g:86:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '-' | ' ' | '/' | ':' | '\\\\' )+
            {
            // See.g:86:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '-' | ' ' | '/' | ':' | '\\\\' )+
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
            	    // See.g:
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

            // See.g:88:9: ( '#' ( ' ' | '\\t' )* 'include' ( ' ' | '\\t' )* '<' f= FILENAME '>' )
            // See.g:88:11: '#' ( ' ' | '\\t' )* 'include' ( ' ' | '\\t' )* '<' f= FILENAME '>'
            {
            match('#'); 
            // See.g:88:15: ( ' ' | '\\t' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // See.g:
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

            // See.g:88:37: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // See.g:
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
            int fStart407 = getCharIndex();
            int fStartLine407 = getLine();
            int fStartCharPos407 = getCharPositionInLine();
            mFILENAME(); 
            f = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fStart407, getCharIndex()-1);
            f.setLine(fStartLine407);
            f.setCharPositionInLine(fStartCharPos407);
            match('>'); 

            			String fileName = (f!=null?f.getText():null);
            			try {
            				// save current lexer's state
            				SaveStruct ss = new SaveStruct(input);
            				includes.push(ss);
            				
            				// switch on new input stream
            				setCharStream(new ANTLRFileStream(fileName));
            				reset();
            			} catch (Exception fnf) { throw new Error("Cannot open file " + fileName); }
            		

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
            // See.g:339:9: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // See.g:339:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // See.g:340:4: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // See.g:340:13: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // See.g:340:14: '0' .. '9'
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
            // See.g:344:2: ( INT_LIT '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
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
                    // See.g:344:4: INT_LIT '.' ( '0' .. '9' )*
                    {
                    mINT_LIT(); 
                    match('.'); 
                    // See.g:344:16: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // See.g:344:17: '0' .. '9'
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
                    // See.g:345:4: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // See.g:345:8: ( '0' .. '9' )+
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
                    	    // See.g:345:9: '0' .. '9'
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
            // See.g:348:9: ( '\\'' (~ ( '\\\\' | '\\r' | '\\n' ) | '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' ) ) '\\'' )
            // See.g:348:11: '\\'' (~ ( '\\\\' | '\\r' | '\\n' ) | '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' ) ) '\\''
            {
            match('\''); 
            // See.g:349:3: (~ ( '\\\\' | '\\r' | '\\n' ) | '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' ) )
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
                    // See.g:349:5: ~ ( '\\\\' | '\\r' | '\\n' )
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
                    // See.g:350:5: '\\\\' ( 't' | 'r' | 'n' | '\\\\' | '\\\"' | '\\'' )
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
            // See.g:356:2: ( 'true' | 'false' )
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
                    // See.g:356:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // See.g:356:13: 'false'
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
            // See.g:359:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // See.g:359:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // See.g:359:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // See.g:
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
            // See.g:362:2: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
            // See.g:362:4: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // See.g:362:9: (~ ( '\\r' | '\\n' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // See.g:362:10: ~ ( '\\r' | '\\n' )
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

            // See.g:362:27: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // See.g:362:27: '\\r'
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
            // See.g:366:2: ( '/*' ( . )* '*/' )
            // See.g:366:4: '/*' ( . )* '*/'
            {
            match("/*"); 

            // See.g:366:9: ( . )*
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
            	    // See.g:366:9: .
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
            // See.g:369:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // See.g:369:6: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // See.g:1:8: ( STRUCT | BLOCK | RETURN | IF | ELSE | WHILE | SEMI | PRINT | LEN | ASSIGN | LOGICAL_OR | LOGICAL_AND | EQ | NEQ | LT | LEQ | GT | GEQ | PLUS | MINUS | MUL | DIV | MOD | LOGICAL_NOT | DOT | NULL_LIT | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | INCLUDE | INT_LIT | DOUBLE_LIT | CHAR_LIT | BOOLEAN_LIT | ID | SL_COMMENT | ML_COMMENT | WS )
        int alt15=47;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // See.g:1:10: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 2 :
                // See.g:1:17: BLOCK
                {
                mBLOCK(); 

                }
                break;
            case 3 :
                // See.g:1:23: RETURN
                {
                mRETURN(); 

                }
                break;
            case 4 :
                // See.g:1:30: IF
                {
                mIF(); 

                }
                break;
            case 5 :
                // See.g:1:33: ELSE
                {
                mELSE(); 

                }
                break;
            case 6 :
                // See.g:1:38: WHILE
                {
                mWHILE(); 

                }
                break;
            case 7 :
                // See.g:1:44: SEMI
                {
                mSEMI(); 

                }
                break;
            case 8 :
                // See.g:1:49: PRINT
                {
                mPRINT(); 

                }
                break;
            case 9 :
                // See.g:1:55: LEN
                {
                mLEN(); 

                }
                break;
            case 10 :
                // See.g:1:59: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 11 :
                // See.g:1:66: LOGICAL_OR
                {
                mLOGICAL_OR(); 

                }
                break;
            case 12 :
                // See.g:1:77: LOGICAL_AND
                {
                mLOGICAL_AND(); 

                }
                break;
            case 13 :
                // See.g:1:89: EQ
                {
                mEQ(); 

                }
                break;
            case 14 :
                // See.g:1:92: NEQ
                {
                mNEQ(); 

                }
                break;
            case 15 :
                // See.g:1:96: LT
                {
                mLT(); 

                }
                break;
            case 16 :
                // See.g:1:99: LEQ
                {
                mLEQ(); 

                }
                break;
            case 17 :
                // See.g:1:103: GT
                {
                mGT(); 

                }
                break;
            case 18 :
                // See.g:1:106: GEQ
                {
                mGEQ(); 

                }
                break;
            case 19 :
                // See.g:1:110: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // See.g:1:115: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // See.g:1:121: MUL
                {
                mMUL(); 

                }
                break;
            case 22 :
                // See.g:1:125: DIV
                {
                mDIV(); 

                }
                break;
            case 23 :
                // See.g:1:129: MOD
                {
                mMOD(); 

                }
                break;
            case 24 :
                // See.g:1:133: LOGICAL_NOT
                {
                mLOGICAL_NOT(); 

                }
                break;
            case 25 :
                // See.g:1:145: DOT
                {
                mDOT(); 

                }
                break;
            case 26 :
                // See.g:1:149: NULL_LIT
                {
                mNULL_LIT(); 

                }
                break;
            case 27 :
                // See.g:1:158: T__54
                {
                mT__54(); 

                }
                break;
            case 28 :
                // See.g:1:164: T__55
                {
                mT__55(); 

                }
                break;
            case 29 :
                // See.g:1:170: T__56
                {
                mT__56(); 

                }
                break;
            case 30 :
                // See.g:1:176: T__57
                {
                mT__57(); 

                }
                break;
            case 31 :
                // See.g:1:182: T__58
                {
                mT__58(); 

                }
                break;
            case 32 :
                // See.g:1:188: T__59
                {
                mT__59(); 

                }
                break;
            case 33 :
                // See.g:1:194: T__60
                {
                mT__60(); 

                }
                break;
            case 34 :
                // See.g:1:200: T__61
                {
                mT__61(); 

                }
                break;
            case 35 :
                // See.g:1:206: T__62
                {
                mT__62(); 

                }
                break;
            case 36 :
                // See.g:1:212: T__63
                {
                mT__63(); 

                }
                break;
            case 37 :
                // See.g:1:218: T__64
                {
                mT__64(); 

                }
                break;
            case 38 :
                // See.g:1:224: T__65
                {
                mT__65(); 

                }
                break;
            case 39 :
                // See.g:1:230: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 40 :
                // See.g:1:238: INT_LIT
                {
                mINT_LIT(); 

                }
                break;
            case 41 :
                // See.g:1:246: DOUBLE_LIT
                {
                mDOUBLE_LIT(); 

                }
                break;
            case 42 :
                // See.g:1:257: CHAR_LIT
                {
                mCHAR_LIT(); 

                }
                break;
            case 43 :
                // See.g:1:266: BOOLEAN_LIT
                {
                mBOOLEAN_LIT(); 

                }
                break;
            case 44 :
                // See.g:1:278: ID
                {
                mID(); 

                }
                break;
            case 45 :
                // See.g:1:281: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 46 :
                // See.g:1:292: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 47 :
                // See.g:1:303: WS
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