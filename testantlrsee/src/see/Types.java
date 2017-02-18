// $ANTLR 3.3 Nov 30, 2010 12:45:30 Types.g 2011-07-11 00:27:33

package see;

import see.symbol.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Types extends TreeFilter {
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


        public Types(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Types(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Types.tokenNames; }
    public String getGrammarFileName() { return "Types.g"; }


    SymbolTable symtab = SymbolTable.getInstance();



    // $ANTLR start "bottomup"
    // Types.g:19:1: bottomup : ( exprRoot | varDecl | returnStat | ifStat | whileStat | printStat );
    public final void bottomup() throws RecognitionException {
        try {
            // Types.g:20:2: ( exprRoot | varDecl | returnStat | ifStat | whileStat | printStat )
            int alt1=6;
            switch ( input.LA(1) ) {
            case EXPR:
                {
                alt1=1;
                }
                break;
            case VAR_DECL:
                {
                alt1=2;
                }
                break;
            case RETURN:
                {
                alt1=3;
                }
                break;
            case IF:
                {
                alt1=4;
                }
                break;
            case WHILE:
                {
                alt1=5;
                }
                break;
            case PRINT:
                {
                alt1=6;
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
                    // Types.g:20:4: exprRoot
                    {
                    pushFollow(FOLLOW_exprRoot_in_bottomup51);
                    exprRoot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Types.g:21:4: varDecl
                    {
                    pushFollow(FOLLOW_varDecl_in_bottomup56);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Types.g:22:4: returnStat
                    {
                    pushFollow(FOLLOW_returnStat_in_bottomup61);
                    returnStat();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Types.g:23:4: ifStat
                    {
                    pushFollow(FOLLOW_ifStat_in_bottomup66);
                    ifStat();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Types.g:24:4: whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_bottomup71);
                    whileStat();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Types.g:25:4: printStat
                    {
                    pushFollow(FOLLOW_printStat_in_bottomup76);
                    printStat();

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
    // $ANTLR end "bottomup"


    // $ANTLR start "varDecl"
    // Types.g:32:1: varDecl : ^( VAR_DECL type= . ID (init= . )? ) ;
    public final void varDecl() throws RecognitionException {
        SeeAST ID1=null;
        SeeAST type=null;
        SeeAST init=null;

        try {
            // Types.g:32:9: ( ^( VAR_DECL type= . ID (init= . )? ) )
            // Types.g:32:11: ^( VAR_DECL type= . ID (init= . )? )
            {
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_varDecl89); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            type=(SeeAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            ID1=(SeeAST)match(input,ID,FOLLOW_ID_in_varDecl95); if (state.failed) return ;
            // Types.g:32:36: (init= . )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=PROGRAM_ROOT && LA2_0<=65)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Types.g:32:36: init= .
                    {
                    init=(SeeAST)input.LT(1);
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

              		ID1.evalType = ID1.symbol.getType();
              		if (init != null)
              			symtab.checkVarInit(ID1, init);
              		
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
    // $ANTLR end "varDecl"


    // $ANTLR start "returnStat"
    // Types.g:40:1: returnStat : ^( RETURN (retVal= . )? ) ;
    public final void returnStat() throws RecognitionException {
        SeeAST RETURN2=null;
        SeeAST retVal=null;

        try {
            // Types.g:41:2: ( ^( RETURN (retVal= . )? ) )
            // Types.g:41:4: ^( RETURN (retVal= . )? )
            {
            RETURN2=(SeeAST)match(input,RETURN,FOLLOW_RETURN_in_returnStat117); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // Types.g:41:19: (retVal= . )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=PROGRAM_ROOT && LA3_0<=65)) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // Types.g:41:19: retVal= .
                        {
                        retVal=(SeeAST)input.LT(1);
                        matchAny(input); if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }
            if ( state.backtracking==1 ) {
              symtab.checkReturnStat(RETURN2, retVal);
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
    // $ANTLR end "returnStat"


    // $ANTLR start "ifStat"
    // Types.g:45:1: ifStat : ^( IF bexp= . s1= . (s2= . )? ) ;
    public final void ifStat() throws RecognitionException {
        SeeAST bexp=null;
        SeeAST s1=null;
        SeeAST s2=null;

        try {
            // Types.g:45:8: ( ^( IF bexp= . s1= . (s2= . )? ) )
            // Types.g:45:10: ^( IF bexp= . s1= . (s2= . )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStat138); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            bexp=(SeeAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            s1=(SeeAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            // Types.g:45:29: (s2= . )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=PROGRAM_ROOT && LA4_0<=65)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Types.g:45:29: s2= .
                    {
                    s2=(SeeAST)input.LT(1);
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.checkCondition(bexp);
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
    // $ANTLR end "ifStat"


    // $ANTLR start "whileStat"
    // Types.g:49:1: whileStat : ^( WHILE bexp= . stat= . ) ;
    public final void whileStat() throws RecognitionException {
        SeeAST bexp=null;
        SeeAST stat=null;

        try {
            // Types.g:50:2: ( ^( WHILE bexp= . stat= . ) )
            // Types.g:50:4: ^( WHILE bexp= . stat= . )
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStat168); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            bexp=(SeeAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            stat=(SeeAST)input.LT(1);
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.checkCondition(bexp);
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
    // $ANTLR end "whileStat"


    // $ANTLR start "printStat"
    // Types.g:54:1: printStat : ^( PRINT e= . ) ;
    public final void printStat() throws RecognitionException {
        SeeAST e=null;

        try {
            // Types.g:55:2: ( ^( PRINT e= . ) )
            // Types.g:55:4: ^( PRINT e= . )
            {
            match(input,PRINT,FOLLOW_PRINT_in_printStat193); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            e=(SeeAST)input.LT(1);
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.checkPrintStat(e);
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
    // $ANTLR end "printStat"


    // $ANTLR start "exprRoot"
    // Types.g:59:1: exprRoot : ^( EXPR expr ) ;
    public final void exprRoot() throws RecognitionException {
        SeeAST EXPR3=null;
        Types.expr_return expr4 = null;


        try {
            // Types.g:59:9: ( ^( EXPR expr ) )
            // Types.g:59:11: ^( EXPR expr )
            {
            EXPR3=(SeeAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot212); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exprRoot214);
            expr4=expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

              		EXPR3.evalType = (expr4!=null?expr4.type:null);
              		EXPR3.symbol = (expr4!=null?((SeeAST)expr4.start):null).symbol;
              		
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
        public Type type;
    };

    // $ANTLR start "expr"
    // Types.g:66:1: expr returns [Type type] : ( BOOLEAN_LIT | CHAR_LIT | INT_LIT | DOUBLE_LIT | NULL_LIT | primitiveType | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_PLUS a= expr ) | ^( LOGICAL_NOT a= expr ) | ^( arithmOp a= expr b= expr ) | ^( '%' a= expr b= expr ) | ^( relOp a= expr b= expr ) | ^( eqOp a= expr b= expr ) | ^( logOp a= expr b= expr ) | ^( DOT a= expr ID ) | ^( INDEX a= expr b= expr ) | call | ^( '=' a= expr b= expr ) | ^( NEW_STRUCT a= expr ) | ^( NEW_ARRAY t= expr ARRAY_DIMENSIONS (i= expr )+ ) | ^( LEN a= expr ) );
    public final Types.expr_return expr() throws RecognitionException {
        Types.expr_return retval = new Types.expr_return();
        retval.start = input.LT(1);

        SeeAST ID5=null;
        SeeAST DOT6=null;
        SeeAST ID7=null;
        SeeAST ARRAY_DIMENSIONS9=null;
        Types.expr_return a = null;

        Types.expr_return b = null;

        Types.expr_return t = null;

        Types.expr_return i = null;

        Type call8 = null;


        try {
            // Types.g:68:2: ( BOOLEAN_LIT | CHAR_LIT | INT_LIT | DOUBLE_LIT | NULL_LIT | primitiveType | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_PLUS a= expr ) | ^( LOGICAL_NOT a= expr ) | ^( arithmOp a= expr b= expr ) | ^( '%' a= expr b= expr ) | ^( relOp a= expr b= expr ) | ^( eqOp a= expr b= expr ) | ^( logOp a= expr b= expr ) | ^( DOT a= expr ID ) | ^( INDEX a= expr b= expr ) | call | ^( '=' a= expr b= expr ) | ^( NEW_STRUCT a= expr ) | ^( NEW_ARRAY t= expr ARRAY_DIMENSIONS (i= expr )+ ) | ^( LEN a= expr ) )
            int alt6=22;
            switch ( input.LA(1) ) {
            case BOOLEAN_LIT:
                {
                alt6=1;
                }
                break;
            case CHAR_LIT:
                {
                alt6=2;
                }
                break;
            case INT_LIT:
                {
                alt6=3;
                }
                break;
            case DOUBLE_LIT:
                {
                alt6=4;
                }
                break;
            case NULL_LIT:
                {
                alt6=5;
                }
                break;
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt6=6;
                }
                break;
            case ID:
                {
                alt6=7;
                }
                break;
            case UNARY_MINUS:
                {
                alt6=8;
                }
                break;
            case UNARY_PLUS:
                {
                alt6=9;
                }
                break;
            case LOGICAL_NOT:
                {
                alt6=10;
                }
                break;
            case PLUS:
            case MINUS:
            case MUL:
            case DIV:
                {
                alt6=11;
                }
                break;
            case MOD:
                {
                alt6=12;
                }
                break;
            case LT:
            case LEQ:
            case GT:
            case GEQ:
                {
                alt6=13;
                }
                break;
            case EQ:
            case NEQ:
                {
                alt6=14;
                }
                break;
            case LOGICAL_OR:
            case LOGICAL_AND:
                {
                alt6=15;
                }
                break;
            case DOT:
                {
                alt6=16;
                }
                break;
            case INDEX:
                {
                alt6=17;
                }
                break;
            case CALL:
                {
                alt6=18;
                }
                break;
            case ASSIGN:
                {
                alt6=19;
                }
                break;
            case NEW_STRUCT:
                {
                alt6=20;
                }
                break;
            case NEW_ARRAY:
                {
                alt6=21;
                }
                break;
            case LEN:
                {
                alt6=22;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Types.g:68:4: BOOLEAN_LIT
                    {
                    match(input,BOOLEAN_LIT,FOLLOW_BOOLEAN_LIT_in_expr239); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.tBoolean;
                    }

                    }
                    break;
                case 2 :
                    // Types.g:69:4: CHAR_LIT
                    {
                    match(input,CHAR_LIT,FOLLOW_CHAR_LIT_in_expr246); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.tChar;
                    }

                    }
                    break;
                case 3 :
                    // Types.g:70:4: INT_LIT
                    {
                    match(input,INT_LIT,FOLLOW_INT_LIT_in_expr253); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.tInt;
                    }

                    }
                    break;
                case 4 :
                    // Types.g:71:4: DOUBLE_LIT
                    {
                    match(input,DOUBLE_LIT,FOLLOW_DOUBLE_LIT_in_expr261); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.tDouble;
                    }

                    }
                    break;
                case 5 :
                    // Types.g:72:4: NULL_LIT
                    {
                    match(input,NULL_LIT,FOLLOW_NULL_LIT_in_expr268); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.tNull;
                    }

                    }
                    break;
                case 6 :
                    // Types.g:73:4: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_expr275);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (Type)((SeeAST)retval.start).symbol;
                    }

                    }
                    break;
                case 7 :
                    // Types.g:74:4: ID
                    {
                    ID5=(SeeAST)match(input,ID,FOLLOW_ID_in_expr282); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.IDExprType(ID5);
                    }

                    }
                    break;
                case 8 :
                    // Types.g:75:4: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr291); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr295);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.uPlusMinus((a!=null?((SeeAST)a.start):null));
                    }

                    }
                    break;
                case 9 :
                    // Types.g:76:4: ^( UNARY_PLUS a= expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr304); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr308);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.uPlusMinus((a!=null?((SeeAST)a.start):null));
                    }

                    }
                    break;
                case 10 :
                    // Types.g:77:4: ^( LOGICAL_NOT a= expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr317); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr321);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.not((a!=null?((SeeAST)a.start):null));
                    }

                    }
                    break;
                case 11 :
                    // Types.g:78:4: ^( arithmOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_arithmOp_in_expr330);
                    arithmOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr334);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr338);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.arithm((a!=null?((SeeAST)a.start):null), (b!=null?((SeeAST)b.start):null));
                    }

                    }
                    break;
                case 12 :
                    // Types.g:79:4: ^( '%' a= expr b= expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr347); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr351);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr355);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.mod((a!=null?((SeeAST)a.start):null), (b!=null?((SeeAST)b.start):null));
                    }

                    }
                    break;
                case 13 :
                    // Types.g:80:4: ^( relOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_relOp_in_expr364);
                    relOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr368);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr372);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.relOp((a!=null?((SeeAST)a.start):null), (b!=null?((SeeAST)b.start):null));
                    }

                    }
                    break;
                case 14 :
                    // Types.g:81:4: ^( eqOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_eqOp_in_expr381);
                    eqOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr385);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr389);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.eqOp((a!=null?((SeeAST)a.start):null), (b!=null?((SeeAST)b.start):null));
                    }

                    }
                    break;
                case 15 :
                    // Types.g:82:4: ^( logOp a= expr b= expr )
                    {
                    pushFollow(FOLLOW_logOp_in_expr398);
                    logOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr402);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr406);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.logOp((a!=null?((SeeAST)a.start):null), (b!=null?((SeeAST)b.start):null));
                    }

                    }
                    break;
                case 16 :
                    // Types.g:83:4: ^( DOT a= expr ID )
                    {
                    DOT6=(SeeAST)match(input,DOT,FOLLOW_DOT_in_expr415); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr419);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    ID7=(SeeAST)match(input,ID,FOLLOW_ID_in_expr421); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {

                      		DOT6.symbol = symtab.field((a!=null?((SeeAST)a.start):null), ID7);

                      		if (DOT6.symbol == null)
                      			retval.type = symtab.tVoid;
                      		else if (DOT6.symbol instanceof Type)
                      			retval.type = (Type)DOT6.symbol;
                      		else
                      			retval.type = DOT6.symbol.getType();
                      		
                    }

                    }
                    break;
                case 17 :
                    // Types.g:96:4: ^( INDEX a= expr b= expr )
                    {
                    match(input,INDEX,FOLLOW_INDEX_in_expr438); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr442);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr446);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.index((a!=null?((SeeAST)a.start):null), (b!=null?((SeeAST)b.start):null));
                    }

                    }
                    break;
                case 18 :
                    // Types.g:97:4: call
                    {
                    pushFollow(FOLLOW_call_in_expr454);
                    call8=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = call8;
                    }

                    }
                    break;
                case 19 :
                    // Types.g:98:4: ^( '=' a= expr b= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr464); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr468);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr472);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.assign((a!=null?((SeeAST)a.start):null), (b!=null?((SeeAST)b.start):null));
                    }

                    }
                    break;
                case 20 :
                    // Types.g:99:4: ^( NEW_STRUCT a= expr )
                    {
                    match(input,NEW_STRUCT,FOLLOW_NEW_STRUCT_in_expr481); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr485);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.newOpStruct((a!=null?((SeeAST)a.start):null));
                    }

                    }
                    break;
                case 21 :
                    // Types.g:100:4: ^( NEW_ARRAY t= expr ARRAY_DIMENSIONS (i= expr )+ )
                    {
                    match(input,NEW_ARRAY,FOLLOW_NEW_ARRAY_in_expr494); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr498);
                    t=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    ARRAY_DIMENSIONS9=(SeeAST)match(input,ARRAY_DIMENSIONS,FOLLOW_ARRAY_DIMENSIONS_in_expr500); if (state.failed) return retval;
                    // Types.g:100:40: (i= expr )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==LEN||(LA5_0>=ASSIGN && LA5_0<=NULL_LIT)||(LA5_0>=ID && LA5_0<=BOOLEAN_LIT)||(LA5_0>=58 && LA5_0<=62)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Types.g:100:41: i= expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr505);
                    	    i=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==1 ) {
                    	      symtab.checkArrayIndexExpr((i!=null?((SeeAST)i.start):null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.newOpArray((t!=null?((SeeAST)t.start):null), (ARRAY_DIMENSIONS9!=null?Integer.valueOf(ARRAY_DIMENSIONS9.getText()):0));
                    }

                    }
                    break;
                case 22 :
                    // Types.g:102:4: ^( LEN a= expr )
                    {
                    match(input,LEN,FOLLOW_LEN_in_expr520); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr524);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = symtab.lenOp((a!=null?((SeeAST)a.start):null));
                    }

                    }
                    break;

            }
            if ( state.backtracking==1 ) {
              ((SeeAST)retval.start).evalType = retval.type;
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
    // Types.g:105:1: arithmOp : ( '+' | '-' | '*' | '/' );
    public final void arithmOp() throws RecognitionException {
        try {
            // Types.g:105:9: ( '+' | '-' | '*' | '/' )
            // Types.g:
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
    // Types.g:108:1: relOp : ( '<' | '<=' | '>' | '>=' );
    public final void relOp() throws RecognitionException {
        try {
            // Types.g:108:7: ( '<' | '<=' | '>' | '>=' )
            // Types.g:
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
    // Types.g:111:1: eqOp : ( '==' | '!=' );
    public final void eqOp() throws RecognitionException {
        try {
            // Types.g:111:6: ( '==' | '!=' )
            // Types.g:
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
    // Types.g:114:1: logOp : ( '&&' | '||' );
    public final void logOp() throws RecognitionException {
        try {
            // Types.g:114:7: ( '&&' | '||' )
            // Types.g:
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


    // $ANTLR start "call"
    // Types.g:117:1: call returns [Type type] : ^( CALL f= expr (a= expr )* ) ;
    public final Type call() throws RecognitionException {
        Type type = null;

        Types.expr_return f = null;

        Types.expr_return a = null;


         List<SeeAST> args = new ArrayList<SeeAST>(); 
        try {
            // Types.g:119:2: ( ^( CALL f= expr (a= expr )* ) )
            // Types.g:119:4: ^( CALL f= expr (a= expr )* )
            {
            match(input,CALL,FOLLOW_CALL_in_call620); if (state.failed) return type;

            match(input, Token.DOWN, null); if (state.failed) return type;
            pushFollow(FOLLOW_expr_in_call624);
            f=expr();

            state._fsp--;
            if (state.failed) return type;
            // Types.g:119:18: (a= expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LEN||(LA7_0>=ASSIGN && LA7_0<=NULL_LIT)||(LA7_0>=ID && LA7_0<=BOOLEAN_LIT)||(LA7_0>=58 && LA7_0<=62)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Types.g:119:19: a= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_call629);
            	    a=expr();

            	    state._fsp--;
            	    if (state.failed) return type;
            	    if ( state.backtracking==1 ) {
            	      args.add((a!=null?((SeeAST)a.start):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return type;
            if ( state.backtracking==1 ) {
              type = symtab.call((f!=null?((SeeAST)f.start):null), args);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "call"


    // $ANTLR start "primitiveType"
    // Types.g:123:1: primitiveType : ( 'int' | 'double' | 'void' | 'char' | 'boolean' ) ;
    public final void primitiveType() throws RecognitionException {
        try {
            // Types.g:124:2: ( ( 'int' | 'double' | 'void' | 'char' | 'boolean' ) )
            // Types.g:124:4: ( 'int' | 'double' | 'void' | 'char' | 'boolean' )
            {
            if ( (input.LA(1)>=58 && input.LA(1)<=62) ) {
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
    // $ANTLR end "primitiveType"

    // Delegated rules


 

    public static final BitSet FOLLOW_exprRoot_in_bottomup51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_bottomup56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStat_in_bottomup61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_bottomup66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_bottomup71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStat_in_bottomup76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECL_in_varDecl89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_varDecl95 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x0000000000000003L});
    public static final BitSet FOLLOW_RETURN_in_returnStat117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_in_ifStat138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WHILE_in_whileStat168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRINT_in_printStat193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_exprRoot212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_exprRoot214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_LIT_in_expr239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LIT_in_expr246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_expr253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_LIT_in_expr261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LIT_in_expr268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_expr275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arithmOp_in_expr330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr334 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr351 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relOp_in_expr364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr368 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eqOp_in_expr381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr385 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logOp_in_expr398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr402 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_expr415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr419 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_expr421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_expr438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr442 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_call_in_expr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_expr464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_STRUCT_in_expr481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_ARRAY_in_expr494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr498 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAY_DIMENSIONS_in_expr500 = new BitSet(new long[]{0x7C07CFFFFFE80000L});
    public static final BitSet FOLLOW_expr_in_expr505 = new BitSet(new long[]{0x7C07CFFFFFE80008L});
    public static final BitSet FOLLOW_LEN_in_expr520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arithmOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_logOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_call620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call624 = new BitSet(new long[]{0x7C07CFFFFFE80008L});
    public static final BitSet FOLLOW_expr_in_call629 = new BitSet(new long[]{0x7C07CFFFFFE80008L});
    public static final BitSet FOLLOW_set_in_primitiveType649 = new BitSet(new long[]{0x0000000000000002L});

}