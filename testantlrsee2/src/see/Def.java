// $ANTLR 3.3 Nov 30, 2010 12:45:30 Def.g 2011-11-28 00:16:03

package see;

import see.symbol.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Def extends TreeParser {
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


        public Def(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Def(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Def.tokenNames; }
    public String getGrammarFileName() { return "Def.g"; }


    SymbolTable symtab = SymbolTable.getInstance();
    Scope crtScope = symtab.globalScope;
    /** Needed for return statements. RETURN.symbol = crtFunction. */
    FunctionSymbol crtFunction;



    // $ANTLR start "topdown"
    // Def.g:22:1: topdown : ( declVarParamField | enterStruct | enterFunc | enterBlock | returnStat | idRef | primitiveRef );
    public final void topdown() throws RecognitionException {
        try {
            // Def.g:22:9: ( declVarParamField | enterStruct | enterFunc | enterBlock | returnStat | idRef | primitiveRef )
            int alt1=7;
            switch ( input.LA(1) ) {
            case FIELD_DECL:
            case VAR_DECL:
            case ARG_DECL:
                {
                alt1=1;
                }
                break;
            case STRUCT:
                {
                alt1=2;
                }
                break;
            case FUNC_DECL:
                {
                alt1=3;
                }
                break;
            case BLOCK:
                {
                alt1=4;
                }
                break;
            case RETURN:
                {
                alt1=5;
                }
                break;
            case ID:
                {
                alt1=6;
                }
                break;
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // Def.g:22:11: declVarParamField
                    {
                    pushFollow(FOLLOW_declVarParamField_in_topdown50);
                    declVarParamField();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Def.g:23:4: enterStruct
                    {
                    pushFollow(FOLLOW_enterStruct_in_topdown55);
                    enterStruct();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Def.g:24:4: enterFunc
                    {
                    pushFollow(FOLLOW_enterFunc_in_topdown60);
                    enterFunc();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Def.g:25:4: enterBlock
                    {
                    pushFollow(FOLLOW_enterBlock_in_topdown65);
                    enterBlock();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // Def.g:26:4: returnStat
                    {
                    pushFollow(FOLLOW_returnStat_in_topdown70);
                    returnStat();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Def.g:27:4: idRef
                    {
                    pushFollow(FOLLOW_idRef_in_topdown75);
                    idRef();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // Def.g:28:4: primitiveRef
                    {
                    pushFollow(FOLLOW_primitiveRef_in_topdown80);
                    primitiveRef();

                    state._fsp--;


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


    // $ANTLR start "bottomup"
    // Def.g:31:1: bottomup : ( exitStruct | exitFunc | exitBlock );
    public final void bottomup() throws RecognitionException {
        try {
            // Def.g:31:9: ( exitStruct | exitFunc | exitBlock )
            int alt2=3;
            switch ( input.LA(1) ) {
            case STRUCT:
                {
                alt2=1;
                }
                break;
            case FUNC_DECL:
                {
                alt2=2;
                }
                break;
            case BLOCK:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // Def.g:31:11: exitStruct
                    {
                    pushFollow(FOLLOW_exitStruct_in_bottomup89);
                    exitStruct();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Def.g:32:4: exitFunc
                    {
                    pushFollow(FOLLOW_exitFunc_in_bottomup94);
                    exitFunc();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Def.g:33:4: exitBlock
                    {
                    pushFollow(FOLLOW_exitBlock_in_bottomup99);
                    exitBlock();

                    state._fsp--;


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


    // $ANTLR start "declVarParamField"
    // Def.g:37:1: declVarParamField : ^( ( VAR_DECL | ARG_DECL | FIELD_DECL ) typeTree= . id= ID ( . )? ) ;
    public final void declVarParamField() throws RecognitionException {
        SeeAST id=null;
        SeeAST typeTree=null;

        try {
            // Def.g:38:2: ( ^( ( VAR_DECL | ARG_DECL | FIELD_DECL ) typeTree= . id= ID ( . )? ) )
            // Def.g:38:4: ^( ( VAR_DECL | ARG_DECL | FIELD_DECL ) typeTree= . id= ID ( . )? )
            {
            if ( input.LA(1)==FIELD_DECL||input.LA(1)==VAR_DECL||input.LA(1)==ARG_DECL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); 
            typeTree=(SeeAST)input.LT(1);
            matchAny(input); 
            id=(SeeAST)match(input,ID,FOLLOW_ID_in_declVarParamField126); 
            // Def.g:38:54: ( . )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=PROGRAM_ROOT && LA3_0<=65)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Def.g:38:54: .
                    {
                    matchAny(input); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            		symtab.defineVariable(id, crtScope);
            		typeTree.scope = crtScope;
            		

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


    // $ANTLR start "enterStruct"
    // Def.g:46:1: enterStruct : ^( 'struct' ID ( . )* ) ;
    public final void enterStruct() throws RecognitionException {
        SeeAST ID1=null;

        try {
            // Def.g:47:2: ( ^( 'struct' ID ( . )* ) )
            // Def.g:47:4: ^( 'struct' ID ( . )* )
            {
            match(input,STRUCT,FOLLOW_STRUCT_in_enterStruct147); 

            match(input, Token.DOWN, null); 
            ID1=(SeeAST)match(input,ID,FOLLOW_ID_in_enterStruct149); 
            // Def.g:47:18: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=PROGRAM_ROOT && LA4_0<=65)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==UP) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // Def.g:47:18: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); 

            		StructType ss = symtab.defineStruct(ID1, crtScope);
            		crtScope = ss;
            		

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
    // $ANTLR end "enterStruct"


    // $ANTLR start "exitStruct"
    // Def.g:53:1: exitStruct : 'struct' ;
    public final void exitStruct() throws RecognitionException {
        try {
            // Def.g:54:2: ( 'struct' )
            // Def.g:54:4: 'struct'
            {
            match(input,STRUCT,FOLLOW_STRUCT_in_exitStruct167); 
            crtScope = crtScope.parent;

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
    // $ANTLR end "exitStruct"


    // $ANTLR start "enterFunc"
    // Def.g:59:1: enterFunc : ^( FUNC_DECL typeTree= . ID ( . )+ ) ;
    public final void enterFunc() throws RecognitionException {
        SeeAST ID2=null;
        SeeAST typeTree=null;

        try {
            // Def.g:60:2: ( ^( FUNC_DECL typeTree= . ID ( . )+ ) )
            // Def.g:60:4: ^( FUNC_DECL typeTree= . ID ( . )+ )
            {
            match(input,FUNC_DECL,FOLLOW_FUNC_DECL_in_enterFunc184); 

            match(input, Token.DOWN, null); 
            typeTree=(SeeAST)input.LT(1);
            matchAny(input); 
            ID2=(SeeAST)match(input,ID,FOLLOW_ID_in_enterFunc190); 
            // Def.g:60:30: ( . )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=PROGRAM_ROOT && LA5_0<=65)) ) {
                    alt5=1;
                }
                else if ( (LA5_0==UP) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // Def.g:60:30: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match(input, Token.UP, null); 

            		FunctionSymbol fs = symtab.defineFunction(ID2, crtScope);
            		crtFunction = fs;
            		typeTree.scope = crtScope;
            		crtScope = fs;
            		

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
    // $ANTLR end "enterFunc"


    // $ANTLR start "exitFunc"
    // Def.g:68:1: exitFunc : FUNC_DECL ;
    public final void exitFunc() throws RecognitionException {
        try {
            // Def.g:68:9: ( FUNC_DECL )
            // Def.g:68:11: FUNC_DECL
            {
            match(input,FUNC_DECL,FOLLOW_FUNC_DECL_in_exitFunc206); 
            crtScope = crtScope.parent;

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
    // $ANTLR end "exitFunc"


    // $ANTLR start "enterBlock"
    // Def.g:73:1: enterBlock : BLOCK ;
    public final void enterBlock() throws RecognitionException {
        try {
            // Def.g:74:2: ( BLOCK )
            // Def.g:74:4: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock222); 
            crtScope = symtab.defineLocalScope(crtScope);

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
    // $ANTLR end "enterBlock"


    // $ANTLR start "exitBlock"
    // Def.g:77:1: exitBlock : BLOCK ;
    public final void exitBlock() throws RecognitionException {
        try {
            // Def.g:78:2: ( BLOCK )
            // Def.g:78:4: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock236); 
            crtScope = crtScope.parent;

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
    // $ANTLR end "exitBlock"


    // $ANTLR start "returnStat"
    // Def.g:83:1: returnStat : RETURN ;
    public final void returnStat() throws RecognitionException {
        SeeAST RETURN3=null;

        try {
            // Def.g:84:2: ( RETURN )
            // Def.g:84:4: RETURN
            {
            RETURN3=(SeeAST)match(input,RETURN,FOLLOW_RETURN_in_returnStat252); 
            RETURN3.symbol = crtFunction;

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

    public static class idRef_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "idRef"
    // Def.g:89:1: idRef : {...}? ID ;
    public final Def.idRef_return idRef() throws RecognitionException {
        Def.idRef_return retval = new Def.idRef_return();
        retval.start = input.LT(1);

        SeeAST ID4=null;

        try {
            // Def.g:89:7: ({...}? ID )
            // Def.g:89:9: {...}? ID
            {
            if ( !((((SeeAST)retval.start).hasAncestor(EXPR))) ) {
                throw new FailedPredicateException(input, "idRef", "$start.hasAncestor(EXPR)");
            }
            ID4=(SeeAST)match(input,ID,FOLLOW_ID_in_idRef269); 
            ID4.scope = crtScope;

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
    // $ANTLR end "idRef"

    public static class primitiveRef_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "primitiveRef"
    // Def.g:97:1: primitiveRef : {...}? ( 'int' | 'double' | 'void' | 'char' | 'boolean' ) ;
    public final Def.primitiveRef_return primitiveRef() throws RecognitionException {
        Def.primitiveRef_return retval = new Def.primitiveRef_return();
        retval.start = input.LT(1);

        try {
            // Def.g:98:2: ({...}? ( 'int' | 'double' | 'void' | 'char' | 'boolean' ) )
            // Def.g:98:4: {...}? ( 'int' | 'double' | 'void' | 'char' | 'boolean' )
            {
            if ( !((((SeeAST)retval.start).hasAncestor(EXPR))) ) {
                throw new FailedPredicateException(input, "primitiveRef", "$start.hasAncestor(EXPR)");
            }
            if ( (input.LA(1)>=58 && input.LA(1)<=62) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            ((SeeAST)retval.start).scope = crtScope;

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
    // $ANTLR end "primitiveRef"

    // Delegated rules


 

    public static final BitSet FOLLOW_declVarParamField_in_topdown50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterStruct_in_topdown55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterFunc_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterBlock_in_topdown65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStat_in_topdown70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idRef_in_topdown75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveRef_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStruct_in_bottomup89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitFunc_in_bottomup94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitBlock_in_bottomup99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declVarParamField112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declVarParamField126 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x0000000000000003L});
    public static final BitSet FOLLOW_STRUCT_in_enterStruct147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterStruct149 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x0000000000000003L});
    public static final BitSet FOLLOW_STRUCT_in_exitStruct167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DECL_in_enterFunc184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterFunc190 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_FUNC_DECL_in_exitFunc206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_enterBlock222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_exitBlock236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStat252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idRef269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveRef289 = new BitSet(new long[]{0x0000000000000002L});

}