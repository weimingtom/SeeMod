// $ANTLR 3.3 Nov 30, 2010 12:45:30 Ref.g 2011-11-28 00:16:03

package see;

import see.symbol.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Ref extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM_ROOT", "FIELD_DECL", "ARRAY_TYPE", "ARRAY_DIMENSIONS", "VAR_DECL", "STRUCT", "FUNC_DECL", "ARG_DECL", "BLOCK", "RETURN", "IF", "ELSE", "WHILE", "SEMI", "PRINT", "LEN", "EXPR", "ASSIGN", "LOGICAL_OR", "LOGICAL_AND", "EQ", "NEQ", "LT", "LEQ", "GT", "GEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "LOGICAL_NOT", "UNARY_PLUS", "UNARY_MINUS", "DOT", "INDEX", "CALL", "NEW_STRUCT", "NEW_ARRAY", "NULL_LIT", "FILENAME", "INCLUDE", "ID", "INT_LIT", "DOUBLE_LIT", "CHAR_LIT", "BOOLEAN_LIT", "SL_COMMENT", "ML_COMMENT", "WS", "'}'", "','", "'['", "']'", "'int'", "'double'", "'void'", "'char'", "'boolean'", "'('", "')'", "'new'"
    };
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

    // delegates
    // delegators


        public Ref(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Ref(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Ref.tokenNames; }
    public String getGrammarFileName() { return "Ref.g"; }


    SymbolTable symtab = SymbolTable.getInstance();



    // $ANTLR start "topdown"
    // Ref.g:19:1: topdown : ( declVarParamField | functionDeclaration | exprRoot );
    public final void topdown() throws RecognitionException {
        try {
            // Ref.g:19:9: ( declVarParamField | functionDeclaration | exprRoot )
            int alt1=3;
            switch ( input.LA(1) ) {
            case FIELD_DECL:
            case VAR_DECL:
            case ARG_DECL:
                {
                alt1=1;
                }
                break;
            case FUNC_DECL:
                {
                alt1=2;
                }
                break;
            case EXPR:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // Ref.g:19:11: declVarParamField
                    {
                    pushFollow(FOLLOW_declVarParamField_in_topdown50);
                    declVarParamField();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ref.g:20:4: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_topdown55);
                    functionDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Ref.g:21:4: exprRoot
                    {
                    pushFollow(FOLLOW_exprRoot_in_topdown60);
                    exprRoot();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "topdown"

    public static class type_return extends TreeRuleReturnScope {
        public Type t;
    };

    // $ANTLR start "type"
    // Ref.g:28:1: type returns [Type t] : (nonArr= nonArrayType[$start.scope] | ^( ARRAY_TYPE nonArr= nonArrayType[$start.scope] ARRAY_DIMENSIONS ) );
    public final Ref.type_return type() throws RecognitionException {
        Ref.type_return retval = new Ref.type_return();
        retval.start = input.LT(1);

        SeeAST ARRAY_DIMENSIONS1=null;
        Type nonArr = null;


        try {
            // Ref.g:30:2: (nonArr= nonArrayType[$start.scope] | ^( ARRAY_TYPE nonArr= nonArrayType[$start.scope] ARRAY_DIMENSIONS ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DOT||LA2_0==ID||(LA2_0>=58 && LA2_0<=62)) ) {
                alt2=1;
            }
            else if ( (LA2_0==ARRAY_TYPE) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Ref.g:30:4: nonArr= nonArrayType[$start.scope]
                    {
                    pushFollow(FOLLOW_nonArrayType_in_type84);
                    nonArr=nonArrayType(((SeeAST)retval.start).scope);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.t = nonArr;
                    }

                    }
                    break;
                case 2 :
                    // Ref.g:32:4: ^( ARRAY_TYPE nonArr= nonArrayType[$start.scope] ARRAY_DIMENSIONS )
                    {
                    match(input,ARRAY_TYPE,FOLLOW_ARRAY_TYPE_in_type95); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_nonArrayType_in_type99);
                    nonArr=nonArrayType(((SeeAST)retval.start).scope);

                    state._fsp--;
                    if (state.failed) return retval;
                    ARRAY_DIMENSIONS1=(SeeAST)match(input,ARRAY_DIMENSIONS,FOLLOW_ARRAY_DIMENSIONS_in_type102); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {

                      		if (nonArr != null)
                      			retval.t = ArrayType.getInstance(nonArr, (ARRAY_DIMENSIONS1!=null?Integer.valueOf(ARRAY_DIMENSIONS1.getText()):0));
                      		else
                      			retval.t = nonArr;
                      		
                    }

                    }
                    break;

            }
            if ( state.backtracking==1 ) {
              ((SeeAST)retval.start).symbol = retval.t;
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"


    // $ANTLR start "nonArrayType"
    // Ref.g:41:1: nonArrayType[Scope scope] returns [Type t] : (pt= primitiveType[$scope] | st= structType[$scope] );
    public final Type nonArrayType(Scope scope) throws RecognitionException {
        Type t = null;

        Ref.primitiveType_return pt = null;

        StructType st = null;


        try {
            // Ref.g:42:2: (pt= primitiveType[$scope] | st= structType[$scope] )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=58 && LA3_0<=62)) ) {
                alt3=1;
            }
            else if ( (LA3_0==DOT||LA3_0==ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Ref.g:42:4: pt= primitiveType[$scope]
                    {
                    pushFollow(FOLLOW_primitiveType_in_nonArrayType126);
                    pt=primitiveType(scope);

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==1 ) {
                      t = (pt!=null?pt.t:null);
                    }

                    }
                    break;
                case 2 :
                    // Ref.g:43:4: st= structType[$scope]
                    {
                    pushFollow(FOLLOW_structType_in_nonArrayType136);
                    st=structType(scope);

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==1 ) {
                      t = st;
                    }

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
        return t;
    }
    // $ANTLR end "nonArrayType"

    public static class primitiveType_return extends TreeRuleReturnScope {
        public Type t;
    };

    // $ANTLR start "primitiveType"
    // Ref.g:46:1: primitiveType[Scope scope] returns [Type t] : ( 'int' | 'double' | 'void' | 'char' | 'boolean' );
    public final Ref.primitiveType_return primitiveType(Scope scope) throws RecognitionException {
        Ref.primitiveType_return retval = new Ref.primitiveType_return();
        retval.start = input.LT(1);

        try {
            // Ref.g:48:2: ( 'int' | 'double' | 'void' | 'char' | 'boolean' )
            // Ref.g:
            {
            if ( (input.LA(1)>=58 && input.LA(1)<=62) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            if ( state.backtracking==1 ) {
              retval.t = symtab.resolveSimpleType(((SeeAST)retval.start), scope);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    // $ANTLR start "structType"
    // Ref.g:58:1: structType[Scope scope] returns [StructType t] : ( ID | ^( '.' st= structType[scope] ID ) );
    public final StructType structType(Scope scope) throws RecognitionException {
        StructType t = null;

        SeeAST ID2=null;
        SeeAST ID3=null;
        StructType st = null;


        try {
            // Ref.g:59:2: ( ID | ^( '.' st= structType[scope] ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==DOT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Ref.g:59:4: ID
                    {
                    ID2=(SeeAST)match(input,ID,FOLLOW_ID_in_structType200); if (state.failed) return t;
                    if ( state.backtracking==1 ) {
                      t = (StructType)symtab.resolveSimpleType(ID2, scope);
                    }

                    }
                    break;
                case 2 :
                    // Ref.g:60:4: ^( '.' st= structType[scope] ID )
                    {
                    match(input,DOT,FOLLOW_DOT_in_structType208); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_structType_in_structType212);
                    st=structType(scope);

                    state._fsp--;
                    if (state.failed) return t;
                    ID3=(SeeAST)match(input,ID,FOLLOW_ID_in_structType215); if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==1 ) {

                      		if (st != null)
                      			t = symtab.resolveMemberType(ID3, st);
                      		else
                      			t = null;
                      		
                    }

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
        return t;
    }
    // $ANTLR end "structType"


    // $ANTLR start "declVarParamField"
    // Ref.g:70:1: declVarParamField : ^( ( VAR_DECL | ARG_DECL | FIELD_DECL ) type ID ( . )? ) ;
    public final void declVarParamField() throws RecognitionException {
        SeeAST ID4=null;
        Ref.type_return type5 = null;


        try {
            // Ref.g:71:2: ( ^( ( VAR_DECL | ARG_DECL | FIELD_DECL ) type ID ( . )? ) )
            // Ref.g:71:4: ^( ( VAR_DECL | ARG_DECL | FIELD_DECL ) type ID ( . )? )
            {
            if ( input.LA(1)==FIELD_DECL||input.LA(1)==VAR_DECL||input.LA(1)==ARG_DECL ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_declVarParamField241);
            type5=type();

            state._fsp--;
            if (state.failed) return ;
            ID4=(SeeAST)match(input,ID,FOLLOW_ID_in_declVarParamField243); if (state.failed) return ;
            // Ref.g:71:45: ( . )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=PROGRAM_ROOT && LA5_0<=65)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Ref.g:71:45: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              ID4.symbol.setType((type5!=null?type5.t:null));
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
    // $ANTLR end "declVarParamField"


    // $ANTLR start "functionDeclaration"
    // Ref.g:75:1: functionDeclaration : ^( FUNC_DECL type ID ( . )+ ) ;
    public final void functionDeclaration() throws RecognitionException {
        SeeAST ID6=null;
        Ref.type_return type7 = null;


        try {
            // Ref.g:76:2: ( ^( FUNC_DECL type ID ( . )+ ) )
            // Ref.g:76:4: ^( FUNC_DECL type ID ( . )+ )
            {
            match(input,FUNC_DECL,FOLLOW_FUNC_DECL_in_functionDeclaration263); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_functionDeclaration265);
            type7=type();

            state._fsp--;
            if (state.failed) return ;
            ID6=(SeeAST)match(input,ID,FOLLOW_ID_in_functionDeclaration267); if (state.failed) return ;
            // Ref.g:76:24: ( . )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=PROGRAM_ROOT && LA6_0<=65)) ) {
                    alt6=1;
                }
                else if ( (LA6_0==UP) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // Ref.g:76:24: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              ((FunctionSymbol)ID6.symbol).setReturnType((type7!=null?type7.t:null));
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
    // $ANTLR end "functionDeclaration"


    // $ANTLR start "exprRoot"
    // Ref.g:82:1: exprRoot : ^( EXPR expr ) ;
    public final void exprRoot() throws RecognitionException {
        SeeAST EXPR8=null;
        Ref.expr_return expr9 = null;


        try {
            // Ref.g:82:9: ( ^( EXPR expr ) )
            // Ref.g:82:11: ^( EXPR expr )
            {
            EXPR8=(SeeAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot288); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exprRoot290);
            expr9=expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              EXPR8.token.setInputStream((expr9!=null?((SeeAST)expr9.start):null).token.getInputStream());
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
    // $ANTLR end "exprRoot"

    public static class expr_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "expr"
    // Ref.g:85:1: expr : ( BOOLEAN_LIT | CHAR_LIT | INT_LIT | DOUBLE_LIT | NULL_LIT | primitiveType[$start.scope] | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_PLUS a= expr ) | ^( LOGICAL_NOT a= expr ) | ^( arithmOp a= expr b= expr ) | ^( '%' a= expr b= expr ) | ^( relOp a= expr b= expr ) | ^( eqOp a= expr b= expr ) | ^( logOp a= expr b= expr ) | ^( DOT a= expr ID ) | ^( INDEX a= expr b= expr ) | ^( CALL ( expr )+ ) | ^( '=' a= expr b= expr ) | ^( NEW_STRUCT expr ) | ^( NEW_ARRAY expr ARRAY_DIMENSIONS ( expr )+ ) | ^( LEN expr ) );
    public final Ref.expr_return expr() throws RecognitionException {
        Ref.expr_return retval = new Ref.expr_return();
        retval.start = input.LT(1);

        SeeAST ID11=null;
        Ref.expr_return a = null;

        Ref.expr_return b = null;

        Ref.primitiveType_return primitiveType10 = null;


        try {
            // Ref.g:85:6: ( BOOLEAN_LIT | CHAR_LIT | INT_LIT | DOUBLE_LIT | NULL_LIT | primitiveType[$start.scope] | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_PLUS a= expr ) | ^( LOGICAL_NOT a= expr ) | ^( arithmOp a= expr b= expr ) | ^( '%' a= expr b= expr ) | ^( relOp a= expr b= expr ) | ^( eqOp a= expr b= expr ) | ^( logOp a= expr b= expr ) | ^( DOT a= expr ID ) | ^( INDEX a= expr b= expr ) | ^( CALL ( expr )+ ) | ^( '=' a= expr b= expr ) | ^( NEW_STRUCT expr ) | ^( NEW_ARRAY expr ARRAY_DIMENSIONS ( expr )+ ) | ^( LEN expr ) )
            int alt9=22;
            switch ( input.LA(1) ) {
            case BOOLEAN_LIT:
                {
                alt9=1;
                }
                break;
            case CHAR_LIT:
                {
                alt9=2;
                }
                break;
            case INT_LIT:
                {
                alt9=3;
                }
                break;
            case DOUBLE_LIT:
                {
                alt9=4;
                }
                break;
            case NULL_LIT:
                {
                alt9=5;
                }
                break;
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt9=6;
                }
                break;
            case ID:
                {
                alt9=7;
                }
                break;
            case UNARY_MINUS:
                {
                alt9=8;
                }
                break;
            case UNARY_PLUS:
                {
                alt9=9;
                }
                break;
            case LOGICAL_NOT:
                {
                alt9=10;
                }
                break;
            case PLUS:
            case MINUS:
            case MUL:
            case DIV:
                {
                alt9=11;
                }
                break;
            case MOD:
                {
                alt9=12;
                }
                break;
            case LT:
            case LEQ:
            case GT:
            case GEQ:
                {
                alt9=13;
                }
                break;
            case EQ:
            case NEQ:
                {
                alt9=14;
                }
                break;
            case LOGICAL_OR:
            case LOGICAL_AND:
                {
                alt9=15;
                }
                break;
            case DOT:
                {
                alt9=16;
                }
                break;
            case INDEX:
                {
                alt9=17;
                }
                break;
            case CALL:
                {
                alt9=18;
                }
                break;
            case ASSIGN:
                {
                alt9=19;
                }
                break;
            case NEW_STRUCT:
                {
                alt9=20;
                }
                break;
            case NEW_ARRAY:
                {
                alt9=21;
                }
                break;
            case LEN:
                {
                alt9=22;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // Ref.g:85:8: BOOLEAN_LIT
                    {
                    match(input,BOOLEAN_LIT,FOLLOW_BOOLEAN_LIT_in_expr303); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Ref.g:86:4: CHAR_LIT
                    {
                    match(input,CHAR_LIT,FOLLOW_CHAR_LIT_in_expr308); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Ref.g:87:4: INT_LIT
                    {
                    match(input,INT_LIT,FOLLOW_INT_LIT_in_expr313); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Ref.g:88:4: DOUBLE_LIT
                    {
                    match(input,DOUBLE_LIT,FOLLOW_DOUBLE_LIT_in_expr318); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Ref.g:89:4: NULL_LIT
                    {
                    match(input,NULL_LIT,FOLLOW_NULL_LIT_in_expr323); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Ref.g:90:4: primitiveType[$start.scope]
                    {
                    pushFollow(FOLLOW_primitiveType_in_expr328);
                    primitiveType10=primitiveType(((SeeAST)retval.start).scope);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      ((SeeAST)retval.start).symbol = (primitiveType10!=null?primitiveType10.t:null);
                    }

                    }
                    break;
                case 7 :
                    // Ref.g:91:4: ID
                    {
                    ID11=(SeeAST)match(input,ID,FOLLOW_ID_in_expr336); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      ID11.symbol = symtab.resolveSymbolRef(ID11);
                    }

                    }
                    break;
                case 8 :
                    // Ref.g:92:4: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr344); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr348);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Ref.g:93:4: ^( UNARY_PLUS a= expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr355); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr359);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Ref.g:94:4: ^( LOGICAL_NOT a= expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr366); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr370);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Ref.g:95:4: ^( arithmOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_arithmOp_in_expr377);
                    arithmOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr381);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr385);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Ref.g:96:4: ^( '%' a= expr b= expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr392); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr396);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr400);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // Ref.g:97:4: ^( relOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_relOp_in_expr407);
                    relOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr411);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr415);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // Ref.g:98:4: ^( eqOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_eqOp_in_expr422);
                    eqOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr426);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr430);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Ref.g:99:4: ^( logOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_logOp_in_expr437);
                    logOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr441);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr445);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // Ref.g:100:4: ^( DOT a= expr ID )
                    {
                    match(input,DOT,FOLLOW_DOT_in_expr452); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr456);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,ID,FOLLOW_ID_in_expr458); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // Ref.g:101:4: ^( INDEX a= expr b= expr )
                    {
                    match(input,INDEX,FOLLOW_INDEX_in_expr465); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr469);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr473);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // Ref.g:102:4: ^( CALL ( expr )+ )
                    {
                    match(input,CALL,FOLLOW_CALL_in_expr480); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // Ref.g:102:11: ( expr )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==LEN||(LA7_0>=ASSIGN && LA7_0<=NULL_LIT)||(LA7_0>=ID && LA7_0<=BOOLEAN_LIT)||(LA7_0>=58 && LA7_0<=62)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Ref.g:102:11: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr482);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // Ref.g:103:4: ^( '=' a= expr b= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr490); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr494);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr498);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // Ref.g:104:4: ^( NEW_STRUCT expr )
                    {
                    match(input,NEW_STRUCT,FOLLOW_NEW_STRUCT_in_expr505); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr507);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // Ref.g:105:4: ^( NEW_ARRAY expr ARRAY_DIMENSIONS ( expr )+ )
                    {
                    match(input,NEW_ARRAY,FOLLOW_NEW_ARRAY_in_expr514); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr516);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,ARRAY_DIMENSIONS,FOLLOW_ARRAY_DIMENSIONS_in_expr518); if (state.failed) return retval;
                    // Ref.g:105:38: ( expr )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==LEN||(LA8_0>=ASSIGN && LA8_0<=NULL_LIT)||(LA8_0>=ID && LA8_0<=BOOLEAN_LIT)||(LA8_0>=58 && LA8_0<=62)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Ref.g:105:38: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr520);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // Ref.g:106:4: ^( LEN expr )
                    {
                    match(input,LEN,FOLLOW_LEN_in_expr528); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr530);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "expr"


    // $ANTLR start "arithmOp"
    // Ref.g:109:1: arithmOp : ( '+' | '-' | '*' | '/' );
    public final void arithmOp() throws RecognitionException {
        try {
            // Ref.g:109:9: ( '+' | '-' | '*' | '/' )
            // Ref.g:
            {
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "arithmOp"


    // $ANTLR start "relOp"
    // Ref.g:112:1: relOp : ( '<' | '<=' | '>' | '>=' );
    public final void relOp() throws RecognitionException {
        try {
            // Ref.g:112:7: ( '<' | '<=' | '>' | '>=' )
            // Ref.g:
            {
            if ( (input.LA(1)>=LT && input.LA(1)<=GEQ) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "relOp"


    // $ANTLR start "eqOp"
    // Ref.g:115:1: eqOp : ( '==' | '!=' );
    public final void eqOp() throws RecognitionException {
        try {
            // Ref.g:115:6: ( '==' | '!=' )
            // Ref.g:
            {
            if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "eqOp"


    // $ANTLR start "logOp"
    // Ref.g:118:1: logOp : ( '&&' | '||' );
    public final void logOp() throws RecognitionException {
        try {
            // Ref.g:118:7: ( '&&' | '||' )
            // Ref.g:
            {
            if ( (input.LA(1)>=LOGICAL_OR && input.LA(1)<=LOGICAL_AND) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "logOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_declVarParamField_in_topdown50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_topdown55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprRoot_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonArrayType_in_type84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_TYPE_in_type95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonArrayType_in_type99 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAY_DIMENSIONS_in_type102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_nonArrayType126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structType_in_nonArrayType136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_structType200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_structType208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structType_in_structType212 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_structType215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_declVarParamField233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_declVarParamField241 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_declVarParamField243 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x0000000000000003L});
    public static final BitSet FOLLOW_FUNC_DECL_in_functionDeclaration263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_functionDeclaration265 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration267 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_EXPR_in_exprRoot288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_exprRoot290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_LIT_in_expr303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LIT_in_expr308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_expr313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_LIT_in_expr318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LIT_in_expr323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_expr328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arithmOp_in_expr377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr381 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr385 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relOp_in_expr407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr411 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eqOp_in_expr422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr426 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logOp_in_expr437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr441 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_expr452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr456 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_expr458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_expr465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr469 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_expr480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr482 = new BitSet(new long[]{0x7C07CFFFFFE80008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr494 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr498 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_STRUCT_in_expr505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_ARRAY_in_expr514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr516 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAY_DIMENSIONS_in_expr518 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr520 = new BitSet(new long[]{0x7C07CFFFFFE80008L});
    public static final BitSet FOLLOW_LEN_in_expr528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arithmOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_logOp0 = new BitSet(new long[]{0x0000000000000002L});

}