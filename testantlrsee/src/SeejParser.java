// $ANTLR 3.3 Nov 30, 2010 12:45:30 Seej.g 2011-08-15 20:20:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SeejParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM_ROOT", "FIELD_DECL", "ARRAY_TYPE", "ARRAY_DIMENSIONS", "VAR_DECL", "STRUCT", "FUNC_DECL", "ARG_DECL", "BLOCK", "RETURN", "IF", "ELSE", "WHILE", "SEMI", "PRINT", "LEN", "EXPR", "ASSIGN", "LOGICAL_OR", "LOGICAL_AND", "EQ", "NEQ", "LT", "LEQ", "GT", "GEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "LOGICAL_NOT", "UNARY_PLUS", "UNARY_MINUS", "DOT", "INDEX", "CALL", "NEW_STRUCT", "NEW_ARRAY", "NULL_LIT", "ID", "INT_LIT", "DOUBLE_LIT", "CHAR_LIT", "BOOLEAN_LIT", "FILENAME", "INCLUDE", "SL_COMMENT", "ML_COMMENT", "WS", "'}'", "','", "'['", "']'", "'int'", "'double'", "'void'", "'char'", "'boolean'", "'('", "')'", "'new'"
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


        public SeejParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SeejParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SeejParser.tokenNames; }
    public String getGrammarFileName() { return "Seej.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Seej.g:51:1: program : ( topLevelElement )* -> ^( PROGRAM_ROOT ( topLevelElement )* ) ;
    public final SeejParser.program_return program() throws RecognitionException {
        SeejParser.program_return retval = new SeejParser.program_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        SeejParser.topLevelElement_return topLevelElement1 = null;


        RewriteRuleSubtreeStream stream_topLevelElement=new RewriteRuleSubtreeStream(adaptor,"rule topLevelElement");
        try {
            // Seej.g:52:1: ( ( topLevelElement )* -> ^( PROGRAM_ROOT ( topLevelElement )* ) )
            // Seej.g:52:3: ( topLevelElement )*
            {
            // Seej.g:52:3: ( topLevelElement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRUCT||LA1_0==ID||(LA1_0>=58 && LA1_0<=62)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Seej.g:52:3: topLevelElement
            	    {
            	    pushFollow(FOLLOW_topLevelElement_in_program230);
            	    topLevelElement1=topLevelElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_topLevelElement.add(topLevelElement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: topLevelElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 52:20: -> ^( PROGRAM_ROOT ( topLevelElement )* )
            {
                // Seej.g:52:23: ^( PROGRAM_ROOT ( topLevelElement )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(PROGRAM_ROOT, "PROGRAM_ROOT"), root_1);

                // Seej.g:52:38: ( topLevelElement )*
                while ( stream_topLevelElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelElement.nextTree());

                }
                stream_topLevelElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class topLevelElement_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelElement"
    // Seej.g:55:1: topLevelElement : ( structDeclaration | globalVarDeclaration | functionDeclaration );
    public final SeejParser.topLevelElement_return topLevelElement() throws RecognitionException {
        SeejParser.topLevelElement_return retval = new SeejParser.topLevelElement_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        SeejParser.structDeclaration_return structDeclaration2 = null;

        SeejParser.globalVarDeclaration_return globalVarDeclaration3 = null;

        SeejParser.functionDeclaration_return functionDeclaration4 = null;



        try {
            // Seej.g:56:1: ( structDeclaration | globalVarDeclaration | functionDeclaration )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // Seej.g:56:3: structDeclaration
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_structDeclaration_in_topLevelElement249);
                    structDeclaration2=structDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration2.getTree());

                    }
                    break;
                case 2 :
                    // Seej.g:57:3: globalVarDeclaration
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_globalVarDeclaration_in_topLevelElement253);
                    globalVarDeclaration3=globalVarDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, globalVarDeclaration3.getTree());

                    }
                    break;
                case 3 :
                    // Seej.g:58:3: functionDeclaration
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_functionDeclaration_in_topLevelElement257);
                    functionDeclaration4=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "topLevelElement"

    public static class structDeclaration_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structDeclaration"
    // Seej.g:61:1: structDeclaration : 'struct' ID '{' ( structMember )+ '}' -> ^( 'struct' ID ( structMember )+ ) ;
    public final SeejParser.structDeclaration_return structDeclaration() throws RecognitionException {
        SeejParser.structDeclaration_return retval = new SeejParser.structDeclaration_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal5=null;
        Token ID6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        SeejParser.structMember_return structMember8 = null;


        Tree string_literal5_tree=null;
        Tree ID6_tree=null;
        Tree char_literal7_tree=null;
        Tree char_literal9_tree=null;
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_BLOCK=new RewriteRuleTokenStream(adaptor,"token BLOCK");
        RewriteRuleSubtreeStream stream_structMember=new RewriteRuleSubtreeStream(adaptor,"rule structMember");
        try {
            // Seej.g:62:1: ( 'struct' ID '{' ( structMember )+ '}' -> ^( 'struct' ID ( structMember )+ ) )
            // Seej.g:62:3: 'struct' ID '{' ( structMember )+ '}'
            {
            string_literal5=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_structDeclaration266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRUCT.add(string_literal5);

            ID6=(Token)match(input,ID,FOLLOW_ID_in_structDeclaration268); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID6);

            char_literal7=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_structDeclaration270); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK.add(char_literal7);

            // Seej.g:62:19: ( structMember )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==STRUCT||LA3_0==ID||(LA3_0>=58 && LA3_0<=62)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Seej.g:62:19: structMember
            	    {
            	    pushFollow(FOLLOW_structMember_in_structDeclaration272);
            	    structMember8=structMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_structMember.add(structMember8.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            char_literal9=(Token)match(input,54,FOLLOW_54_in_structDeclaration275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal9);



            // AST REWRITE
            // elements: structMember, STRUCT, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 62:37: -> ^( 'struct' ID ( structMember )+ )
            {
                // Seej.g:62:40: ^( 'struct' ID ( structMember )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(stream_STRUCT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                if ( !(stream_structMember.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_structMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_structMember.nextTree());

                }
                stream_structMember.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structDeclaration"

    public static class structMember_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structMember"
    // Seej.g:65:1: structMember : ( type ID ( ',' ID )* ';' -> ( ^( FIELD_DECL type ID ) )+ | structDeclaration );
    public final SeejParser.structMember_return structMember() throws RecognitionException {
        SeejParser.structMember_return retval = new SeejParser.structMember_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID11=null;
        Token char_literal12=null;
        Token ID13=null;
        Token char_literal14=null;
        SeejParser.type_return type10 = null;

        SeejParser.structDeclaration_return structDeclaration15 = null;


        Tree ID11_tree=null;
        Tree char_literal12_tree=null;
        Tree ID13_tree=null;
        Tree char_literal14_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Seej.g:66:1: ( type ID ( ',' ID )* ';' -> ( ^( FIELD_DECL type ID ) )+ | structDeclaration )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||(LA5_0>=58 && LA5_0<=62)) ) {
                alt5=1;
            }
            else if ( (LA5_0==STRUCT) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Seej.g:66:3: type ID ( ',' ID )* ';'
                    {
                    pushFollow(FOLLOW_type_in_structMember295);
                    type10=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type10.getTree());
                    ID11=(Token)match(input,ID,FOLLOW_ID_in_structMember297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    // Seej.g:66:11: ( ',' ID )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==55) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Seej.g:66:12: ',' ID
                    	    {
                    	    char_literal12=(Token)match(input,55,FOLLOW_55_in_structMember300); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_55.add(char_literal12);

                    	    ID13=(Token)match(input,ID,FOLLOW_ID_in_structMember302); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID13);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    char_literal14=(Token)match(input,SEMI,FOLLOW_SEMI_in_structMember306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(char_literal14);



                    // AST REWRITE
                    // elements: ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 66:25: -> ( ^( FIELD_DECL type ID ) )+
                    {
                        if ( !(stream_ID.hasNext()||stream_type.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext()||stream_type.hasNext() ) {
                            // Seej.g:66:28: ^( FIELD_DECL type ID )
                            {
                            Tree root_1 = (Tree)adaptor.nil();
                            root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);

                            adaptor.addChild(root_1, stream_type.nextTree());
                            adaptor.addChild(root_1, stream_ID.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_ID.reset();
                        stream_type.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Seej.g:67:3: structDeclaration
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_structDeclaration_in_structMember321);
                    structDeclaration15=structDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structMember"

    public static class type_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Seej.g:70:1: type : ( typeNotArray -> typeNotArray ) ( ( '[' ']' )+ )? ;
    public final SeejParser.type_return type() throws RecognitionException {
        SeejParser.type_return retval = new SeejParser.type_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal17=null;
        Token char_literal18=null;
        SeejParser.typeNotArray_return typeNotArray16 = null;


        Tree char_literal17_tree=null;
        Tree char_literal18_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_typeNotArray=new RewriteRuleSubtreeStream(adaptor,"rule typeNotArray");
        try {
            // Seej.g:72:1: ( ( typeNotArray -> typeNotArray ) ( ( '[' ']' )+ )? )
            // Seej.g:72:3: ( typeNotArray -> typeNotArray ) ( ( '[' ']' )+ )?
            {
            // Seej.g:72:3: ( typeNotArray -> typeNotArray )
            // Seej.g:72:4: typeNotArray
            {
            pushFollow(FOLLOW_typeNotArray_in_type332);
            typeNotArray16=typeNotArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeNotArray.add(typeNotArray16.getTree());


            // AST REWRITE
            // elements: typeNotArray
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 72:17: -> typeNotArray
            {
                adaptor.addChild(root_0, stream_typeNotArray.nextTree());

            }

            retval.tree = root_0;}
            }

            // Seej.g:73:1: ( ( '[' ']' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==56) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Seej.g:73:3: ( '[' ']' )+
                    {
                    // Seej.g:73:3: ( '[' ']' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==56) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Seej.g:73:4: '[' ']'
                    	    {
                    	    char_literal17=(Token)match(input,56,FOLLOW_56_in_type342); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_56.add(char_literal17);

                    	    char_literal18=(Token)match(input,57,FOLLOW_57_in_type344); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_57.add(char_literal18);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeNotArray_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeNotArray"
    // Seej.g:76:1: typeNotArray : ( primitiveType | structType );
    public final SeejParser.typeNotArray_return typeNotArray() throws RecognitionException {
        SeejParser.typeNotArray_return retval = new SeejParser.typeNotArray_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        SeejParser.primitiveType_return primitiveType19 = null;

        SeejParser.structType_return structType20 = null;



        try {
            // Seej.g:77:1: ( primitiveType | structType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=58 && LA8_0<=62)) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Seej.g:77:3: primitiveType
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_typeNotArray358);
                    primitiveType19=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType19.getTree());

                    }
                    break;
                case 2 :
                    // Seej.g:78:3: structType
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_structType_in_typeNotArray362);
                    structType20=structType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, structType20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeNotArray"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // Seej.g:81:1: primitiveType : ( 'int' | 'double' | 'void' | 'char' | 'boolean' );
    public final SeejParser.primitiveType_return primitiveType() throws RecognitionException {
        SeejParser.primitiveType_return retval = new SeejParser.primitiveType_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set21=null;

        Tree set21_tree=null;

        try {
            // Seej.g:82:1: ( 'int' | 'double' | 'void' | 'char' | 'boolean' )
            // Seej.g:
            {
            root_0 = (Tree)adaptor.nil();

            set21=(Token)input.LT(1);
            if ( (input.LA(1)>=58 && input.LA(1)<=62) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Tree)adaptor.create(set21));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class structType_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structType"
    // Seej.g:89:1: structType : ID ( ( '.' ID )=>op= '.' ID )* ;
    public final SeejParser.structType_return structType() throws RecognitionException {
        SeejParser.structType_return retval = new SeejParser.structType_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token op=null;
        Token ID22=null;
        Token ID23=null;

        Tree op_tree=null;
        Tree ID22_tree=null;
        Tree ID23_tree=null;

        try {
            // Seej.g:90:1: ( ID ( ( '.' ID )=>op= '.' ID )* )
            // Seej.g:90:3: ID ( ( '.' ID )=>op= '.' ID )*
            {
            root_0 = (Tree)adaptor.nil();

            ID22=(Token)match(input,ID,FOLLOW_ID_in_structType397); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID22_tree = (Tree)adaptor.create(ID22);
            adaptor.addChild(root_0, ID22_tree);
            }
            // Seej.g:91:1: ( ( '.' ID )=>op= '.' ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DOT) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==ID) ) {
                        int LA9_3 = input.LA(3);

                        if ( (synpred1_Seej()) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // Seej.g:92:1: ( '.' ID )=>op= '.' ID
            	    {
            	    op=(Token)match(input,DOT,FOLLOW_DOT_in_structType412); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Tree)adaptor.create(op);
            	    root_0 = (Tree)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    ID23=(Token)match(input,ID,FOLLOW_ID_in_structType415); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID23_tree = (Tree)adaptor.create(ID23);
            	    adaptor.addChild(root_0, ID23_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structType"

    public static class globalVarDeclaration_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "globalVarDeclaration"
    // Seej.g:96:1: globalVarDeclaration : type ID ( ',' ID )* ';' -> ( ^( VAR_DECL type ID ) )+ ;
    public final SeejParser.globalVarDeclaration_return globalVarDeclaration() throws RecognitionException {
        SeejParser.globalVarDeclaration_return retval = new SeejParser.globalVarDeclaration_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID25=null;
        Token char_literal26=null;
        Token ID27=null;
        Token char_literal28=null;
        SeejParser.type_return type24 = null;


        Tree ID25_tree=null;
        Tree char_literal26_tree=null;
        Tree ID27_tree=null;
        Tree char_literal28_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Seej.g:97:1: ( type ID ( ',' ID )* ';' -> ( ^( VAR_DECL type ID ) )+ )
            // Seej.g:97:3: type ID ( ',' ID )* ';'
            {
            pushFollow(FOLLOW_type_in_globalVarDeclaration428);
            type24=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type24.getTree());
            ID25=(Token)match(input,ID,FOLLOW_ID_in_globalVarDeclaration430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID25);

            // Seej.g:97:11: ( ',' ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==55) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Seej.g:97:12: ',' ID
            	    {
            	    char_literal26=(Token)match(input,55,FOLLOW_55_in_globalVarDeclaration433); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal26);

            	    ID27=(Token)match(input,ID,FOLLOW_ID_in_globalVarDeclaration435); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID27);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            char_literal28=(Token)match(input,SEMI,FOLLOW_SEMI_in_globalVarDeclaration439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal28);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 98:1: -> ( ^( VAR_DECL type ID ) )+
            {
                if ( !(stream_type.hasNext()||stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type.hasNext()||stream_ID.hasNext() ) {
                    // Seej.g:98:4: ^( VAR_DECL type ID )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_ID.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_ID.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "globalVarDeclaration"

    public static class localVarDeclaration_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVarDeclaration"
    // Seej.g:101:1: localVarDeclaration : type localVarDeclarator ( ',' localVarDeclarator )* ';' -> ( ^( VAR_DECL type localVarDeclarator ) )+ ;
    public final SeejParser.localVarDeclaration_return localVarDeclaration() throws RecognitionException {
        SeejParser.localVarDeclaration_return retval = new SeejParser.localVarDeclaration_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal31=null;
        Token char_literal33=null;
        SeejParser.type_return type29 = null;

        SeejParser.localVarDeclarator_return localVarDeclarator30 = null;

        SeejParser.localVarDeclarator_return localVarDeclarator32 = null;


        Tree char_literal31_tree=null;
        Tree char_literal33_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_localVarDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule localVarDeclarator");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Seej.g:102:1: ( type localVarDeclarator ( ',' localVarDeclarator )* ';' -> ( ^( VAR_DECL type localVarDeclarator ) )+ )
            // Seej.g:102:3: type localVarDeclarator ( ',' localVarDeclarator )* ';'
            {
            pushFollow(FOLLOW_type_in_localVarDeclaration460);
            type29=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type29.getTree());
            pushFollow(FOLLOW_localVarDeclarator_in_localVarDeclaration462);
            localVarDeclarator30=localVarDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_localVarDeclarator.add(localVarDeclarator30.getTree());
            // Seej.g:102:27: ( ',' localVarDeclarator )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==55) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Seej.g:102:28: ',' localVarDeclarator
            	    {
            	    char_literal31=(Token)match(input,55,FOLLOW_55_in_localVarDeclaration465); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal31);

            	    pushFollow(FOLLOW_localVarDeclarator_in_localVarDeclaration467);
            	    localVarDeclarator32=localVarDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_localVarDeclarator.add(localVarDeclarator32.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal33=(Token)match(input,SEMI,FOLLOW_SEMI_in_localVarDeclaration471); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal33);



            // AST REWRITE
            // elements: localVarDeclarator, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 103:1: -> ( ^( VAR_DECL type localVarDeclarator ) )+
            {
                if ( !(stream_localVarDeclarator.hasNext()||stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_localVarDeclarator.hasNext()||stream_type.hasNext() ) {
                    // Seej.g:103:4: ^( VAR_DECL type localVarDeclarator )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_localVarDeclarator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_localVarDeclarator.reset();
                stream_type.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "localVarDeclaration"

    public static class localVarDeclarator_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVarDeclarator"
    // Seej.g:106:1: localVarDeclarator : ID ( '=' expression )? -> ID ( expression )? ;
    public final SeejParser.localVarDeclarator_return localVarDeclarator() throws RecognitionException {
        SeejParser.localVarDeclarator_return retval = new SeejParser.localVarDeclarator_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID34=null;
        Token char_literal35=null;
        SeejParser.expression_return expression36 = null;


        Tree ID34_tree=null;
        Tree char_literal35_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Seej.g:107:1: ( ID ( '=' expression )? -> ID ( expression )? )
            // Seej.g:107:3: ID ( '=' expression )?
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_localVarDeclarator491); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID34);

            // Seej.g:107:6: ( '=' expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ASSIGN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Seej.g:107:7: '=' expression
                    {
                    char_literal35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_localVarDeclarator494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal35);

                    pushFollow(FOLLOW_expression_in_localVarDeclarator496);
                    expression36=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression36.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 108:1: -> ID ( expression )?
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                // Seej.g:108:7: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "localVarDeclarator"

    public static class formalArgList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalArgList"
    // Seej.g:111:1: formalArgList : type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ ;
    public final SeejParser.formalArgList_return formalArgList() throws RecognitionException {
        SeejParser.formalArgList_return retval = new SeejParser.formalArgList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID38=null;
        Token char_literal39=null;
        Token ID41=null;
        SeejParser.type_return type37 = null;

        SeejParser.type_return type40 = null;


        Tree ID38_tree=null;
        Tree char_literal39_tree=null;
        Tree ID41_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Seej.g:112:1: ( type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ )
            // Seej.g:112:3: type ID ( ',' type ID )*
            {
            pushFollow(FOLLOW_type_in_formalArgList515);
            type37=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type37.getTree());
            ID38=(Token)match(input,ID,FOLLOW_ID_in_formalArgList517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID38);

            // Seej.g:112:11: ( ',' type ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==55) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Seej.g:112:12: ',' type ID
            	    {
            	    char_literal39=(Token)match(input,55,FOLLOW_55_in_formalArgList520); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal39);

            	    pushFollow(FOLLOW_type_in_formalArgList522);
            	    type40=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type40.getTree());
            	    ID41=(Token)match(input,ID,FOLLOW_ID_in_formalArgList524); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID41);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 113:1: -> ( ^( ARG_DECL type ID ) )+
            {
                if ( !(stream_ID.hasNext()||stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_type.hasNext() ) {
                    // Seej.g:113:4: ^( ARG_DECL type ID )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_ID.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ID.reset();
                stream_type.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalArgList"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // Seej.g:116:1: functionDeclaration : type ID '(' ( formalArgList )? ')' block -> ^( FUNC_DECL type ID ( formalArgList )? block ) ;
    public final SeejParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        SeejParser.functionDeclaration_return retval = new SeejParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        SeejParser.type_return type42 = null;

        SeejParser.formalArgList_return formalArgList45 = null;

        SeejParser.block_return block47 = null;


        Tree ID43_tree=null;
        Tree char_literal44_tree=null;
        Tree char_literal46_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_formalArgList=new RewriteRuleSubtreeStream(adaptor,"rule formalArgList");
        try {
            // Seej.g:117:1: ( type ID '(' ( formalArgList )? ')' block -> ^( FUNC_DECL type ID ( formalArgList )? block ) )
            // Seej.g:117:3: type ID '(' ( formalArgList )? ')' block
            {
            pushFollow(FOLLOW_type_in_functionDeclaration547);
            type42=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type42.getTree());
            ID43=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID43);

            char_literal44=(Token)match(input,63,FOLLOW_63_in_functionDeclaration551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(char_literal44);

            // Seej.g:117:15: ( formalArgList )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID||(LA14_0>=58 && LA14_0<=62)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Seej.g:117:15: formalArgList
                    {
                    pushFollow(FOLLOW_formalArgList_in_functionDeclaration553);
                    formalArgList45=formalArgList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalArgList.add(formalArgList45.getTree());

                    }
                    break;

            }

            char_literal46=(Token)match(input,64,FOLLOW_64_in_functionDeclaration556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(char_literal46);

            pushFollow(FOLLOW_block_in_functionDeclaration558);
            block47=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block47.getTree());


            // AST REWRITE
            // elements: type, ID, formalArgList, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 118:1: -> ^( FUNC_DECL type ID ( formalArgList )? block )
            {
                // Seej.g:118:4: ^( FUNC_DECL type ID ( formalArgList )? block )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // Seej.g:118:24: ( formalArgList )?
                if ( stream_formalArgList.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalArgList.nextTree());

                }
                stream_formalArgList.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class block_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // Seej.g:121:1: block : '{' ( statement )* '}' -> ^( '{' ( statement )* ) ;
    public final SeejParser.block_return block() throws RecognitionException {
        SeejParser.block_return retval = new SeejParser.block_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        SeejParser.statement_return statement49 = null;


        Tree char_literal48_tree=null;
        Tree char_literal50_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_BLOCK=new RewriteRuleTokenStream(adaptor,"token BLOCK");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // Seej.g:122:1: ( '{' ( statement )* '}' -> ^( '{' ( statement )* ) )
            // Seej.g:122:3: '{' ( statement )* '}'
            {
            char_literal48=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_block583); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK.add(char_literal48);

            // Seej.g:122:7: ( statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==STRUCT||(LA15_0>=BLOCK && LA15_0<=IF)||(LA15_0>=WHILE && LA15_0<=LEN)||(LA15_0>=PLUS && LA15_0<=MINUS)||LA15_0==LOGICAL_NOT||(LA15_0>=NULL_LIT && LA15_0<=BOOLEAN_LIT)||(LA15_0>=58 && LA15_0<=63)||LA15_0==65) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Seej.g:122:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block585);
            	    statement49=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement49.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            char_literal50=(Token)match(input,54,FOLLOW_54_in_block588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal50);



            // AST REWRITE
            // elements: BLOCK, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 123:1: -> ^( '{' ( statement )* )
            {
                // Seej.g:123:4: ^( '{' ( statement )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(stream_BLOCK.nextNode(), root_1);

                // Seej.g:123:10: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // Seej.g:126:1: statement : ( structDeclaration | localVarDeclaration | expression ';' | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | ifStat | whileStat | printStat | ';' | block );
    public final SeejParser.statement_return statement() throws RecognitionException {
        SeejParser.statement_return retval = new SeejParser.statement_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal54=null;
        Token string_literal55=null;
        Token char_literal57=null;
        Token char_literal61=null;
        SeejParser.structDeclaration_return structDeclaration51 = null;

        SeejParser.localVarDeclaration_return localVarDeclaration52 = null;

        SeejParser.expression_return expression53 = null;

        SeejParser.expression_return expression56 = null;

        SeejParser.ifStat_return ifStat58 = null;

        SeejParser.whileStat_return whileStat59 = null;

        SeejParser.printStat_return printStat60 = null;

        SeejParser.block_return block62 = null;


        Tree char_literal54_tree=null;
        Tree string_literal55_tree=null;
        Tree char_literal57_tree=null;
        Tree char_literal61_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Seej.g:127:1: ( structDeclaration | localVarDeclaration | expression ';' | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | ifStat | whileStat | printStat | ';' | block )
            int alt17=9;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // Seej.g:127:3: structDeclaration
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_structDeclaration_in_statement607);
                    structDeclaration51=structDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration51.getTree());

                    }
                    break;
                case 2 :
                    // Seej.g:128:3: localVarDeclaration
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_localVarDeclaration_in_statement611);
                    localVarDeclaration52=localVarDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVarDeclaration52.getTree());

                    }
                    break;
                case 3 :
                    // Seej.g:129:3: expression ';'
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_statement615);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression53.getTree());
                    char_literal54=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement617); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Seej.g:130:3: 'return' ( expression )? ';'
                    {
                    string_literal55=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(string_literal55);

                    // Seej.g:130:12: ( expression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LEN||(LA16_0>=PLUS && LA16_0<=MINUS)||LA16_0==LOGICAL_NOT||(LA16_0>=NULL_LIT && LA16_0<=BOOLEAN_LIT)||LA16_0==63||LA16_0==65) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Seej.g:130:12: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement624);
                            expression56=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());

                            }
                            break;

                    }

                    char_literal57=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(char_literal57);



                    // AST REWRITE
                    // elements: expression, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 131:1: -> ^( 'return' ( expression )? )
                    {
                        // Seej.g:131:4: ^( 'return' ( expression )? )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // Seej.g:131:15: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Seej.g:132:3: ifStat
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_ifStat_in_statement641);
                    ifStat58=ifStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStat58.getTree());

                    }
                    break;
                case 6 :
                    // Seej.g:133:3: whileStat
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_whileStat_in_statement645);
                    whileStat59=whileStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStat59.getTree());

                    }
                    break;
                case 7 :
                    // Seej.g:134:3: printStat
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_printStat_in_statement649);
                    printStat60=printStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printStat60.getTree());

                    }
                    break;
                case 8 :
                    // Seej.g:135:3: ';'
                    {
                    root_0 = (Tree)adaptor.nil();

                    char_literal61=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal61_tree = (Tree)adaptor.create(char_literal61);
                    adaptor.addChild(root_0, char_literal61_tree);
                    }

                    }
                    break;
                case 9 :
                    // Seej.g:136:3: block
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement657);
                    block62=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block62.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class ifStat_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStat"
    // Seej.g:139:1: ifStat : IF '(' expression ')' s1= statement ( ( ELSE statement )=> ELSE s2= statement | ) -> ^( IF expression $s1 ( $s2)? ) ;
    public final SeejParser.ifStat_return ifStat() throws RecognitionException {
        SeejParser.ifStat_return retval = new SeejParser.ifStat_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token IF63=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token ELSE67=null;
        SeejParser.statement_return s1 = null;

        SeejParser.statement_return s2 = null;

        SeejParser.expression_return expression65 = null;


        Tree IF63_tree=null;
        Tree char_literal64_tree=null;
        Tree char_literal66_tree=null;
        Tree ELSE67_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // Seej.g:140:1: ( IF '(' expression ')' s1= statement ( ( ELSE statement )=> ELSE s2= statement | ) -> ^( IF expression $s1 ( $s2)? ) )
            // Seej.g:140:3: IF '(' expression ')' s1= statement ( ( ELSE statement )=> ELSE s2= statement | )
            {
            IF63=(Token)match(input,IF,FOLLOW_IF_in_ifStat667); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF63);

            char_literal64=(Token)match(input,63,FOLLOW_63_in_ifStat669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(char_literal64);

            pushFollow(FOLLOW_expression_in_ifStat671);
            expression65=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression65.getTree());
            char_literal66=(Token)match(input,64,FOLLOW_64_in_ifStat673); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(char_literal66);

            pushFollow(FOLLOW_statement_in_ifStat677);
            s1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(s1.getTree());
            // Seej.g:141:1: ( ( ELSE statement )=> ELSE s2= statement | )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ELSE) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred2_Seej()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==EOF||LA18_0==STRUCT||(LA18_0>=BLOCK && LA18_0<=IF)||(LA18_0>=WHILE && LA18_0<=LEN)||(LA18_0>=PLUS && LA18_0<=MINUS)||LA18_0==LOGICAL_NOT||(LA18_0>=NULL_LIT && LA18_0<=BOOLEAN_LIT)||LA18_0==54||(LA18_0>=58 && LA18_0<=63)||LA18_0==65) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Seej.g:141:3: ( ELSE statement )=> ELSE s2= statement
                    {
                    ELSE67=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStat689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE67);

                    pushFollow(FOLLOW_statement_in_ifStat693);
                    s2=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                    }
                    break;
                case 2 :
                    // Seej.g:143:1: 
                    {
                    }
                    break;

            }



            // AST REWRITE
            // elements: IF, expression, s2, s1
            // token labels: 
            // rule labels: retval, s2, s1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);
            RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 144:1: -> ^( IF expression $s1 ( $s2)? )
            {
                // Seej.g:144:4: ^( IF expression $s1 ( $s2)? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_s1.nextTree());
                // Seej.g:144:24: ( $s2)?
                if ( stream_s2.hasNext() ) {
                    adaptor.addChild(root_1, stream_s2.nextTree());

                }
                stream_s2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStat"

    public static class whileStat_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStat"
    // Seej.g:147:1: whileStat : WHILE '(' expression ')' statement -> ^( WHILE expression statement ) ;
    public final SeejParser.whileStat_return whileStat() throws RecognitionException {
        SeejParser.whileStat_return retval = new SeejParser.whileStat_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token WHILE68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        SeejParser.expression_return expression70 = null;

        SeejParser.statement_return statement72 = null;


        Tree WHILE68_tree=null;
        Tree char_literal69_tree=null;
        Tree char_literal71_tree=null;
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // Seej.g:148:1: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) )
            // Seej.g:148:3: WHILE '(' expression ')' statement
            {
            WHILE68=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStat722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE68);

            char_literal69=(Token)match(input,63,FOLLOW_63_in_whileStat724); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(char_literal69);

            pushFollow(FOLLOW_expression_in_whileStat726);
            expression70=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression70.getTree());
            char_literal71=(Token)match(input,64,FOLLOW_64_in_whileStat728); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(char_literal71);

            pushFollow(FOLLOW_statement_in_whileStat730);
            statement72=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement72.getTree());


            // AST REWRITE
            // elements: WHILE, statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 149:1: -> ^( WHILE expression statement )
            {
                // Seej.g:149:4: ^( WHILE expression statement )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStat"

    public static class printStat_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printStat"
    // Seej.g:152:1: printStat : 'print' expression ';' -> ^( 'print' expression ) ;
    public final SeejParser.printStat_return printStat() throws RecognitionException {
        SeejParser.printStat_return retval = new SeejParser.printStat_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal73=null;
        Token char_literal75=null;
        SeejParser.expression_return expression74 = null;


        Tree string_literal73_tree=null;
        Tree char_literal75_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Seej.g:153:1: ( 'print' expression ';' -> ^( 'print' expression ) )
            // Seej.g:153:3: 'print' expression ';'
            {
            string_literal73=(Token)match(input,PRINT,FOLLOW_PRINT_in_printStat749); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PRINT.add(string_literal73);

            pushFollow(FOLLOW_expression_in_printStat751);
            expression74=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression74.getTree());
            char_literal75=(Token)match(input,SEMI,FOLLOW_SEMI_in_printStat753); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal75);



            // AST REWRITE
            // elements: PRINT, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 154:1: -> ^( 'print' expression )
            {
                // Seej.g:154:4: ^( 'print' expression )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(stream_PRINT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "printStat"

    public static class expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Seej.g:158:1: expression : expr -> ^( EXPR[$expr.start] expr ) ;
    public final SeejParser.expression_return expression() throws RecognitionException {
        SeejParser.expression_return retval = new SeejParser.expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        SeejParser.expr_return expr76 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Seej.g:159:1: ( expr -> ^( EXPR[$expr.start] expr ) )
            // Seej.g:159:3: expr
            {
            pushFollow(FOLLOW_expr_in_expression773);
            expr76=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr76.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 160:1: -> ^( EXPR[$expr.start] expr )
            {
                // Seej.g:160:4: ^( EXPR[$expr.start] expr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(EXPR, (expr76!=null?((Token)expr76.start):null)), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // Seej.g:163:1: expr : assignExpr ;
    public final SeejParser.expr_return expr() throws RecognitionException {
        SeejParser.expr_return retval = new SeejParser.expr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        SeejParser.assignExpr_return assignExpr77 = null;



        try {
            // Seej.g:164:1: ( assignExpr )
            // Seej.g:164:3: assignExpr
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr793);
            assignExpr77=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr77.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // Seej.g:167:1: assignExpr : orExpr ( '=' assignExpr )? ;
    public final SeejParser.assignExpr_return assignExpr() throws RecognitionException {
        SeejParser.assignExpr_return retval = new SeejParser.assignExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal79=null;
        SeejParser.orExpr_return orExpr78 = null;

        SeejParser.assignExpr_return assignExpr80 = null;


        Tree char_literal79_tree=null;

        try {
            // Seej.g:168:1: ( orExpr ( '=' assignExpr )? )
            // Seej.g:168:3: orExpr ( '=' assignExpr )?
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_orExpr_in_assignExpr802);
            orExpr78=orExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpr78.getTree());
            // Seej.g:168:10: ( '=' assignExpr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASSIGN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Seej.g:168:11: '=' assignExpr
                    {
                    char_literal79=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignExpr805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal79_tree = (Tree)adaptor.create(char_literal79);
                    root_0 = (Tree)adaptor.becomeRoot(char_literal79_tree, root_0);
                    }
                    pushFollow(FOLLOW_assignExpr_in_assignExpr808);
                    assignExpr80=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr80.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class orExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpr"
    // Seej.g:171:1: orExpr : andExpr ( '||' andExpr )* ;
    public final SeejParser.orExpr_return orExpr() throws RecognitionException {
        SeejParser.orExpr_return retval = new SeejParser.orExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal82=null;
        SeejParser.andExpr_return andExpr81 = null;

        SeejParser.andExpr_return andExpr83 = null;


        Tree string_literal82_tree=null;

        try {
            // Seej.g:172:1: ( andExpr ( '||' andExpr )* )
            // Seej.g:172:3: andExpr ( '||' andExpr )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_andExpr_in_orExpr820);
            andExpr81=andExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr81.getTree());
            // Seej.g:172:11: ( '||' andExpr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==LOGICAL_OR) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Seej.g:172:12: '||' andExpr
            	    {
            	    string_literal82=(Token)match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_orExpr823); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal82_tree = (Tree)adaptor.create(string_literal82);
            	    root_0 = (Tree)adaptor.becomeRoot(string_literal82_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpr_in_orExpr826);
            	    andExpr83=andExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr83.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpr"

    public static class andExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpr"
    // Seej.g:175:1: andExpr : equalityExpr ( '&&' equalityExpr )* ;
    public final SeejParser.andExpr_return andExpr() throws RecognitionException {
        SeejParser.andExpr_return retval = new SeejParser.andExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal85=null;
        SeejParser.equalityExpr_return equalityExpr84 = null;

        SeejParser.equalityExpr_return equalityExpr86 = null;


        Tree string_literal85_tree=null;

        try {
            // Seej.g:176:1: ( equalityExpr ( '&&' equalityExpr )* )
            // Seej.g:176:3: equalityExpr ( '&&' equalityExpr )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_andExpr838);
            equalityExpr84=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr84.getTree());
            // Seej.g:176:16: ( '&&' equalityExpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==LOGICAL_AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Seej.g:176:17: '&&' equalityExpr
            	    {
            	    string_literal85=(Token)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_andExpr841); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal85_tree = (Tree)adaptor.create(string_literal85);
            	    root_0 = (Tree)adaptor.becomeRoot(string_literal85_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_andExpr844);
            	    equalityExpr86=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr86.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpr"

    public static class equalityExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpr"
    // Seej.g:179:1: equalityExpr : relationalExpr ( ( '==' | '!=' ) relationalExpr )* ;
    public final SeejParser.equalityExpr_return equalityExpr() throws RecognitionException {
        SeejParser.equalityExpr_return retval = new SeejParser.equalityExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal88=null;
        Token string_literal89=null;
        SeejParser.relationalExpr_return relationalExpr87 = null;

        SeejParser.relationalExpr_return relationalExpr90 = null;


        Tree string_literal88_tree=null;
        Tree string_literal89_tree=null;

        try {
            // Seej.g:180:1: ( relationalExpr ( ( '==' | '!=' ) relationalExpr )* )
            // Seej.g:180:3: relationalExpr ( ( '==' | '!=' ) relationalExpr )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr855);
            relationalExpr87=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr87.getTree());
            // Seej.g:180:18: ( ( '==' | '!=' ) relationalExpr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=EQ && LA23_0<=NEQ)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Seej.g:180:19: ( '==' | '!=' ) relationalExpr
            	    {
            	    // Seej.g:180:19: ( '==' | '!=' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==EQ) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==NEQ) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // Seej.g:180:20: '=='
            	            {
            	            string_literal88=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr859); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal88_tree = (Tree)adaptor.create(string_literal88);
            	            root_0 = (Tree)adaptor.becomeRoot(string_literal88_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Seej.g:180:28: '!='
            	            {
            	            string_literal89=(Token)match(input,NEQ,FOLLOW_NEQ_in_equalityExpr864); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal89_tree = (Tree)adaptor.create(string_literal89);
            	            root_0 = (Tree)adaptor.becomeRoot(string_literal89_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr868);
            	    relationalExpr90=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr90.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // Seej.g:183:1: relationalExpr : additiveExpr ( ( '<' | '<=' | '>' | '>=' ) additiveExpr )* ;
    public final SeejParser.relationalExpr_return relationalExpr() throws RecognitionException {
        SeejParser.relationalExpr_return retval = new SeejParser.relationalExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal92=null;
        Token string_literal93=null;
        Token char_literal94=null;
        Token string_literal95=null;
        SeejParser.additiveExpr_return additiveExpr91 = null;

        SeejParser.additiveExpr_return additiveExpr96 = null;


        Tree char_literal92_tree=null;
        Tree string_literal93_tree=null;
        Tree char_literal94_tree=null;
        Tree string_literal95_tree=null;

        try {
            // Seej.g:184:1: ( additiveExpr ( ( '<' | '<=' | '>' | '>=' ) additiveExpr )* )
            // Seej.g:184:3: additiveExpr ( ( '<' | '<=' | '>' | '>=' ) additiveExpr )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpr_in_relationalExpr879);
            additiveExpr91=additiveExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpr91.getTree());
            // Seej.g:184:16: ( ( '<' | '<=' | '>' | '>=' ) additiveExpr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=LT && LA25_0<=GEQ)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Seej.g:184:17: ( '<' | '<=' | '>' | '>=' ) additiveExpr
            	    {
            	    // Seej.g:184:17: ( '<' | '<=' | '>' | '>=' )
            	    int alt24=4;
            	    switch ( input.LA(1) ) {
            	    case LT:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case LEQ:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case GEQ:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // Seej.g:184:18: '<'
            	            {
            	            char_literal92=(Token)match(input,LT,FOLLOW_LT_in_relationalExpr883); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal92_tree = (Tree)adaptor.create(char_literal92);
            	            root_0 = (Tree)adaptor.becomeRoot(char_literal92_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Seej.g:184:25: '<='
            	            {
            	            string_literal93=(Token)match(input,LEQ,FOLLOW_LEQ_in_relationalExpr888); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal93_tree = (Tree)adaptor.create(string_literal93);
            	            root_0 = (Tree)adaptor.becomeRoot(string_literal93_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Seej.g:184:33: '>'
            	            {
            	            char_literal94=(Token)match(input,GT,FOLLOW_GT_in_relationalExpr893); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal94_tree = (Tree)adaptor.create(char_literal94);
            	            root_0 = (Tree)adaptor.becomeRoot(char_literal94_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Seej.g:184:40: '>='
            	            {
            	            string_literal95=(Token)match(input,GEQ,FOLLOW_GEQ_in_relationalExpr898); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal95_tree = (Tree)adaptor.create(string_literal95);
            	            root_0 = (Tree)adaptor.becomeRoot(string_literal95_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpr_in_relationalExpr902);
            	    additiveExpr96=additiveExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpr96.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class additiveExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpr"
    // Seej.g:187:1: additiveExpr : multiplicativeExpr ( ( '+' | '-' ) multiplicativeExpr )* ;
    public final SeejParser.additiveExpr_return additiveExpr() throws RecognitionException {
        SeejParser.additiveExpr_return retval = new SeejParser.additiveExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal98=null;
        Token char_literal99=null;
        SeejParser.multiplicativeExpr_return multiplicativeExpr97 = null;

        SeejParser.multiplicativeExpr_return multiplicativeExpr100 = null;


        Tree char_literal98_tree=null;
        Tree char_literal99_tree=null;

        try {
            // Seej.g:188:1: ( multiplicativeExpr ( ( '+' | '-' ) multiplicativeExpr )* )
            // Seej.g:188:3: multiplicativeExpr ( ( '+' | '-' ) multiplicativeExpr )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr913);
            multiplicativeExpr97=multiplicativeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr97.getTree());
            // Seej.g:188:22: ( ( '+' | '-' ) multiplicativeExpr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=PLUS && LA27_0<=MINUS)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Seej.g:188:23: ( '+' | '-' ) multiplicativeExpr
            	    {
            	    // Seej.g:188:23: ( '+' | '-' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==PLUS) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==MINUS) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // Seej.g:188:24: '+'
            	            {
            	            char_literal98=(Token)match(input,PLUS,FOLLOW_PLUS_in_additiveExpr917); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal98_tree = (Tree)adaptor.create(char_literal98);
            	            root_0 = (Tree)adaptor.becomeRoot(char_literal98_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Seej.g:188:31: '-'
            	            {
            	            char_literal99=(Token)match(input,MINUS,FOLLOW_MINUS_in_additiveExpr922); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal99_tree = (Tree)adaptor.create(char_literal99);
            	            root_0 = (Tree)adaptor.becomeRoot(char_literal99_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr926);
            	    multiplicativeExpr100=multiplicativeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr100.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpr"

    public static class multiplicativeExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpr"
    // Seej.g:191:1: multiplicativeExpr : unaryExpr ( ( '*' | '/' | '%' ) unaryExpr )* ;
    public final SeejParser.multiplicativeExpr_return multiplicativeExpr() throws RecognitionException {
        SeejParser.multiplicativeExpr_return retval = new SeejParser.multiplicativeExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal102=null;
        Token char_literal103=null;
        Token char_literal104=null;
        SeejParser.unaryExpr_return unaryExpr101 = null;

        SeejParser.unaryExpr_return unaryExpr105 = null;


        Tree char_literal102_tree=null;
        Tree char_literal103_tree=null;
        Tree char_literal104_tree=null;

        try {
            // Seej.g:192:1: ( unaryExpr ( ( '*' | '/' | '%' ) unaryExpr )* )
            // Seej.g:192:3: unaryExpr ( ( '*' | '/' | '%' ) unaryExpr )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpr_in_multiplicativeExpr937);
            unaryExpr101=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr101.getTree());
            // Seej.g:192:13: ( ( '*' | '/' | '%' ) unaryExpr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=MUL && LA29_0<=MOD)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Seej.g:192:14: ( '*' | '/' | '%' ) unaryExpr
            	    {
            	    // Seej.g:192:14: ( '*' | '/' | '%' )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // Seej.g:192:15: '*'
            	            {
            	            char_literal102=(Token)match(input,MUL,FOLLOW_MUL_in_multiplicativeExpr941); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal102_tree = (Tree)adaptor.create(char_literal102);
            	            root_0 = (Tree)adaptor.becomeRoot(char_literal102_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Seej.g:192:22: '/'
            	            {
            	            char_literal103=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicativeExpr946); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal103_tree = (Tree)adaptor.create(char_literal103);
            	            root_0 = (Tree)adaptor.becomeRoot(char_literal103_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Seej.g:192:29: '%'
            	            {
            	            char_literal104=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicativeExpr951); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal104_tree = (Tree)adaptor.create(char_literal104);
            	            root_0 = (Tree)adaptor.becomeRoot(char_literal104_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpr_in_multiplicativeExpr955);
            	    unaryExpr105=unaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr105.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // Seej.g:195:1: unaryExpr : ( '!' unaryExpr | op= '+' unaryExpr | op= '-' unaryExpr | lenExpr );
    public final SeejParser.unaryExpr_return unaryExpr() throws RecognitionException {
        SeejParser.unaryExpr_return retval = new SeejParser.unaryExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token op=null;
        Token char_literal106=null;
        SeejParser.unaryExpr_return unaryExpr107 = null;

        SeejParser.unaryExpr_return unaryExpr108 = null;

        SeejParser.unaryExpr_return unaryExpr109 = null;

        SeejParser.lenExpr_return lenExpr110 = null;


        Tree op_tree=null;
        Tree char_literal106_tree=null;

        try {
            // Seej.g:196:1: ( '!' unaryExpr | op= '+' unaryExpr | op= '-' unaryExpr | lenExpr )
            int alt30=4;
            switch ( input.LA(1) ) {
            case LOGICAL_NOT:
                {
                alt30=1;
                }
                break;
            case PLUS:
                {
                alt30=2;
                }
                break;
            case MINUS:
                {
                alt30=3;
                }
                break;
            case LEN:
            case NULL_LIT:
            case ID:
            case INT_LIT:
            case DOUBLE_LIT:
            case CHAR_LIT:
            case BOOLEAN_LIT:
            case 63:
            case 65:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // Seej.g:196:3: '!' unaryExpr
                    {
                    root_0 = (Tree)adaptor.nil();

                    char_literal106=(Token)match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_unaryExpr966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal106_tree = (Tree)adaptor.create(char_literal106);
                    root_0 = (Tree)adaptor.becomeRoot(char_literal106_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr969);
                    unaryExpr107=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr107.getTree());

                    }
                    break;
                case 2 :
                    // Seej.g:197:3: op= '+' unaryExpr
                    {
                    root_0 = (Tree)adaptor.nil();

                    op=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpr975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    op_tree = (Tree)adaptor.create(op);
                    root_0 = (Tree)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr978);
                    unaryExpr108=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr108.getTree());

                    }
                    break;
                case 3 :
                    // Seej.g:198:3: op= '-' unaryExpr
                    {
                    root_0 = (Tree)adaptor.nil();

                    op=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpr984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    op_tree = (Tree)adaptor.create(op);
                    root_0 = (Tree)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr987);
                    unaryExpr109=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr109.getTree());

                    }
                    break;
                case 4 :
                    // Seej.g:199:3: lenExpr
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_lenExpr_in_unaryExpr991);
                    lenExpr110=lenExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lenExpr110.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class lenExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lenExpr"
    // Seej.g:202:1: lenExpr : ( 'len' postfixExpr | postfixExpr );
    public final SeejParser.lenExpr_return lenExpr() throws RecognitionException {
        SeejParser.lenExpr_return retval = new SeejParser.lenExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal111=null;
        SeejParser.postfixExpr_return postfixExpr112 = null;

        SeejParser.postfixExpr_return postfixExpr113 = null;


        Tree string_literal111_tree=null;

        try {
            // Seej.g:203:1: ( 'len' postfixExpr | postfixExpr )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LEN) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=NULL_LIT && LA31_0<=BOOLEAN_LIT)||LA31_0==63||LA31_0==65) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // Seej.g:203:3: 'len' postfixExpr
                    {
                    root_0 = (Tree)adaptor.nil();

                    string_literal111=(Token)match(input,LEN,FOLLOW_LEN_in_lenExpr1001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal111_tree = (Tree)adaptor.create(string_literal111);
                    root_0 = (Tree)adaptor.becomeRoot(string_literal111_tree, root_0);
                    }
                    pushFollow(FOLLOW_postfixExpr_in_lenExpr1004);
                    postfixExpr112=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr112.getTree());

                    }
                    break;
                case 2 :
                    // Seej.g:204:3: postfixExpr
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_lenExpr1008);
                    postfixExpr113=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr113.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lenExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // Seej.g:207:1: postfixExpr : newExpr (op= '.' ID | op= '[' expr rbr= ']' | op= '(' ( expr ( ',' expr )* )? rpar= ')' )* ;
    public final SeejParser.postfixExpr_return postfixExpr() throws RecognitionException {
        SeejParser.postfixExpr_return retval = new SeejParser.postfixExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token op=null;
        Token rbr=null;
        Token rpar=null;
        Token ID115=null;
        Token char_literal118=null;
        SeejParser.newExpr_return newExpr114 = null;

        SeejParser.expr_return expr116 = null;

        SeejParser.expr_return expr117 = null;

        SeejParser.expr_return expr119 = null;


        Tree op_tree=null;
        Tree rbr_tree=null;
        Tree rpar_tree=null;
        Tree ID115_tree=null;
        Tree char_literal118_tree=null;

        try {
            // Seej.g:208:1: ( newExpr (op= '.' ID | op= '[' expr rbr= ']' | op= '(' ( expr ( ',' expr )* )? rpar= ')' )* )
            // Seej.g:208:3: newExpr (op= '.' ID | op= '[' expr rbr= ']' | op= '(' ( expr ( ',' expr )* )? rpar= ')' )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_newExpr_in_postfixExpr1017);
            newExpr114=newExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr114.getTree());
            // Seej.g:209:1: (op= '.' ID | op= '[' expr rbr= ']' | op= '(' ( expr ( ',' expr )* )? rpar= ')' )*
            loop34:
            do {
                int alt34=4;
                switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt34=1;
                    }
                    break;
                case 56:
                    {
                    alt34=2;
                    }
                    break;
                case 63:
                    {
                    alt34=3;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // Seej.g:209:3: op= '.' ID
            	    {
            	    op=(Token)match(input,DOT,FOLLOW_DOT_in_postfixExpr1023); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Tree)adaptor.create(op);
            	    root_0 = (Tree)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    ID115=(Token)match(input,ID,FOLLOW_ID_in_postfixExpr1026); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID115_tree = (Tree)adaptor.create(ID115);
            	    adaptor.addChild(root_0, ID115_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Seej.g:210:3: op= '[' expr rbr= ']'
            	    {
            	    op=(Token)match(input,56,FOLLOW_56_in_postfixExpr1032); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Tree)adaptor.create(op);
            	    root_0 = (Tree)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_postfixExpr1035);
            	    expr116=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr116.getTree());
            	    rbr=(Token)match(input,57,FOLLOW_57_in_postfixExpr1039); if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // Seej.g:211:3: op= '(' ( expr ( ',' expr )* )? rpar= ')'
            	    {
            	    op=(Token)match(input,63,FOLLOW_63_in_postfixExpr1046); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Tree)adaptor.create(op);
            	    root_0 = (Tree)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    // Seej.g:211:11: ( expr ( ',' expr )* )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==LEN||(LA33_0>=PLUS && LA33_0<=MINUS)||LA33_0==LOGICAL_NOT||(LA33_0>=NULL_LIT && LA33_0<=BOOLEAN_LIT)||LA33_0==63||LA33_0==65) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // Seej.g:211:12: expr ( ',' expr )*
            	            {
            	            pushFollow(FOLLOW_expr_in_postfixExpr1050);
            	            expr117=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr117.getTree());
            	            // Seej.g:211:17: ( ',' expr )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==55) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // Seej.g:211:18: ',' expr
            	            	    {
            	            	    char_literal118=(Token)match(input,55,FOLLOW_55_in_postfixExpr1053); if (state.failed) return retval;
            	            	    pushFollow(FOLLOW_expr_in_postfixExpr1056);
            	            	    expr119=expr();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop32;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    rpar=(Token)match(input,64,FOLLOW_64_in_postfixExpr1064); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class newExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // Seej.g:215:1: newExpr : ( ( arrayCreator )=> arrayCreator | structCreator | primary );
    public final SeejParser.newExpr_return newExpr() throws RecognitionException {
        SeejParser.newExpr_return retval = new SeejParser.newExpr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        SeejParser.arrayCreator_return arrayCreator120 = null;

        SeejParser.structCreator_return structCreator121 = null;

        SeejParser.primary_return primary122 = null;



        try {
            // Seej.g:216:1: ( ( arrayCreator )=> arrayCreator | structCreator | primary )
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // Seej.g:216:3: ( arrayCreator )=> arrayCreator
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_arrayCreator_in_newExpr1084);
                    arrayCreator120=arrayCreator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreator120.getTree());

                    }
                    break;
                case 2 :
                    // Seej.g:217:3: structCreator
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_structCreator_in_newExpr1088);
                    structCreator121=structCreator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, structCreator121.getTree());

                    }
                    break;
                case 3 :
                    // Seej.g:218:3: primary
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_primary_in_newExpr1092);
                    primary122=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary122.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newExpr"

    public static class structCreator_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structCreator"
    // Seej.g:221:1: structCreator : op= 'new' structType ( ( '(' ')' )=> '(' ')' )? -> ^( $op structType ) ;
    public final SeejParser.structCreator_return structCreator() throws RecognitionException {
        SeejParser.structCreator_return retval = new SeejParser.structCreator_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token op=null;
        Token char_literal124=null;
        Token char_literal125=null;
        SeejParser.structType_return structType123 = null;


        Tree op_tree=null;
        Tree char_literal124_tree=null;
        Tree char_literal125_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_structType=new RewriteRuleSubtreeStream(adaptor,"rule structType");
        try {
            // Seej.g:222:1: (op= 'new' structType ( ( '(' ')' )=> '(' ')' )? -> ^( $op structType ) )
            // Seej.g:222:3: op= 'new' structType ( ( '(' ')' )=> '(' ')' )?
            {
            op=(Token)match(input,65,FOLLOW_65_in_structCreator1103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(op);

            pushFollow(FOLLOW_structType_in_structCreator1105);
            structType123=structType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_structType.add(structType123.getTree());
            // Seej.g:223:1: ( ( '(' ')' )=> '(' ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==64) ) {
                    int LA36_3 = input.LA(3);

                    if ( (synpred4_Seej()) ) {
                        alt36=1;
                    }
                }
            }
            switch (alt36) {
                case 1 :
                    // Seej.g:223:3: ( '(' ')' )=> '(' ')'
                    {
                    char_literal124=(Token)match(input,63,FOLLOW_63_in_structCreator1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal124);

                    char_literal125=(Token)match(input,64,FOLLOW_64_in_structCreator1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_64.add(char_literal125);


                    }
                    break;

            }



            // AST REWRITE
            // elements: structType, op
            // token labels: op
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 224:1: -> ^( $op structType )
            {
                // Seej.g:224:4: ^( $op structType )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                adaptor.addChild(root_1, stream_structType.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structCreator"

    public static class arrayCreator_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayCreator"
    // Seej.g:227:1: arrayCreator : op= 'new' baseType= typeNotArray ( ( '[' expr ']' )=> '[' expr ']' )+ ( ( '[' ']' )=> '[' ']' )* ;
    public final SeejParser.arrayCreator_return arrayCreator() throws RecognitionException {
        SeejParser.arrayCreator_return retval = new SeejParser.arrayCreator_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token op=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal130=null;
        SeejParser.typeNotArray_return baseType = null;

        SeejParser.expr_return expr127 = null;


        Tree op_tree=null;
        Tree char_literal126_tree=null;
        Tree char_literal128_tree=null;
        Tree char_literal129_tree=null;
        Tree char_literal130_tree=null;

        try {
            // Seej.g:229:1: (op= 'new' baseType= typeNotArray ( ( '[' expr ']' )=> '[' expr ']' )+ ( ( '[' ']' )=> '[' ']' )* )
            // Seej.g:229:3: op= 'new' baseType= typeNotArray ( ( '[' expr ']' )=> '[' expr ']' )+ ( ( '[' ']' )=> '[' ']' )*
            {
            root_0 = (Tree)adaptor.nil();

            op=(Token)match(input,65,FOLLOW_65_in_arrayCreator1147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            op_tree = (Tree)adaptor.create(op);
            adaptor.addChild(root_0, op_tree);
            }
            pushFollow(FOLLOW_typeNotArray_in_arrayCreator1151);
            baseType=typeNotArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, baseType.getTree());
            // Seej.g:230:1: ( ( '[' expr ']' )=> '[' expr ']' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // Seej.g:230:2: ( '[' expr ']' )=> '[' expr ']'
            	    {
            	    char_literal126=(Token)match(input,56,FOLLOW_56_in_arrayCreator1165); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal126_tree = (Tree)adaptor.create(char_literal126);
            	    adaptor.addChild(root_0, char_literal126_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_arrayCreator1167);
            	    expr127=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());
            	    char_literal128=(Token)match(input,57,FOLLOW_57_in_arrayCreator1169); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal128_tree = (Tree)adaptor.create(char_literal128);
            	    adaptor.addChild(root_0, char_literal128_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // Seej.g:231:1: ( ( '[' ']' )=> '[' ']' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==56) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==57) && (synpred6_Seej())) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // Seej.g:231:2: ( '[' ']' )=> '[' ']'
            	    {
            	    char_literal129=(Token)match(input,56,FOLLOW_56_in_arrayCreator1183); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal129_tree = (Tree)adaptor.create(char_literal129);
            	    adaptor.addChild(root_0, char_literal129_tree);
            	    }
            	    char_literal130=(Token)match(input,57,FOLLOW_57_in_arrayCreator1185); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal130_tree = (Tree)adaptor.create(char_literal130);
            	    adaptor.addChild(root_0, char_literal130_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayCreator"

    public static class primary_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // Seej.g:234:1: primary : ( INT_LIT | DOUBLE_LIT | CHAR_LIT | BOOLEAN_LIT | NULL_LIT | ID | '(' expr ')' );
    public final SeejParser.primary_return primary() throws RecognitionException {
        SeejParser.primary_return retval = new SeejParser.primary_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token INT_LIT131=null;
        Token DOUBLE_LIT132=null;
        Token CHAR_LIT133=null;
        Token BOOLEAN_LIT134=null;
        Token NULL_LIT135=null;
        Token ID136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        SeejParser.expr_return expr138 = null;


        Tree INT_LIT131_tree=null;
        Tree DOUBLE_LIT132_tree=null;
        Tree CHAR_LIT133_tree=null;
        Tree BOOLEAN_LIT134_tree=null;
        Tree NULL_LIT135_tree=null;
        Tree ID136_tree=null;
        Tree char_literal137_tree=null;
        Tree char_literal139_tree=null;

        try {
            // Seej.g:235:1: ( INT_LIT | DOUBLE_LIT | CHAR_LIT | BOOLEAN_LIT | NULL_LIT | ID | '(' expr ')' )
            int alt39=7;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt39=1;
                }
                break;
            case DOUBLE_LIT:
                {
                alt39=2;
                }
                break;
            case CHAR_LIT:
                {
                alt39=3;
                }
                break;
            case BOOLEAN_LIT:
                {
                alt39=4;
                }
                break;
            case NULL_LIT:
                {
                alt39=5;
                }
                break;
            case ID:
                {
                alt39=6;
                }
                break;
            case 63:
                {
                alt39=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // Seej.g:235:3: INT_LIT
                    {
                    root_0 = (Tree)adaptor.nil();

                    INT_LIT131=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_primary1197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_LIT131_tree = (Tree)adaptor.create(INT_LIT131);
                    adaptor.addChild(root_0, INT_LIT131_tree);
                    }

                    }
                    break;
                case 2 :
                    // Seej.g:236:3: DOUBLE_LIT
                    {
                    root_0 = (Tree)adaptor.nil();

                    DOUBLE_LIT132=(Token)match(input,DOUBLE_LIT,FOLLOW_DOUBLE_LIT_in_primary1202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_LIT132_tree = (Tree)adaptor.create(DOUBLE_LIT132);
                    adaptor.addChild(root_0, DOUBLE_LIT132_tree);
                    }

                    }
                    break;
                case 3 :
                    // Seej.g:237:3: CHAR_LIT
                    {
                    root_0 = (Tree)adaptor.nil();

                    CHAR_LIT133=(Token)match(input,CHAR_LIT,FOLLOW_CHAR_LIT_in_primary1206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR_LIT133_tree = (Tree)adaptor.create(CHAR_LIT133);
                    adaptor.addChild(root_0, CHAR_LIT133_tree);
                    }

                    }
                    break;
                case 4 :
                    // Seej.g:238:3: BOOLEAN_LIT
                    {
                    root_0 = (Tree)adaptor.nil();

                    BOOLEAN_LIT134=(Token)match(input,BOOLEAN_LIT,FOLLOW_BOOLEAN_LIT_in_primary1210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN_LIT134_tree = (Tree)adaptor.create(BOOLEAN_LIT134);
                    adaptor.addChild(root_0, BOOLEAN_LIT134_tree);
                    }

                    }
                    break;
                case 5 :
                    // Seej.g:239:3: NULL_LIT
                    {
                    root_0 = (Tree)adaptor.nil();

                    NULL_LIT135=(Token)match(input,NULL_LIT,FOLLOW_NULL_LIT_in_primary1214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL_LIT135_tree = (Tree)adaptor.create(NULL_LIT135);
                    adaptor.addChild(root_0, NULL_LIT135_tree);
                    }

                    }
                    break;
                case 6 :
                    // Seej.g:240:3: ID
                    {
                    root_0 = (Tree)adaptor.nil();

                    ID136=(Token)match(input,ID,FOLLOW_ID_in_primary1218); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID136_tree = (Tree)adaptor.create(ID136);
                    adaptor.addChild(root_0, ID136_tree);
                    }

                    }
                    break;
                case 7 :
                    // Seej.g:241:3: '(' expr ')'
                    {
                    root_0 = (Tree)adaptor.nil();

                    char_literal137=(Token)match(input,63,FOLLOW_63_in_primary1222); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_primary1225);
                    expr138=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr138.getTree());
                    char_literal139=(Token)match(input,64,FOLLOW_64_in_primary1227); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    // $ANTLR start synpred1_Seej
    public final void synpred1_Seej_fragment() throws RecognitionException {   
        // Seej.g:92:1: ( '.' ID )
        // Seej.g:92:2: '.' ID
        {
        match(input,DOT,FOLLOW_DOT_in_synpred1_Seej403); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred1_Seej405); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Seej

    // $ANTLR start synpred2_Seej
    public final void synpred2_Seej_fragment() throws RecognitionException {   
        // Seej.g:141:3: ( ELSE statement )
        // Seej.g:141:4: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Seej682); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred2_Seej684);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Seej

    // $ANTLR start synpred3_Seej
    public final void synpred3_Seej_fragment() throws RecognitionException {   
        // Seej.g:216:3: ( arrayCreator )
        // Seej.g:216:4: arrayCreator
        {
        pushFollow(FOLLOW_arrayCreator_in_synpred3_Seej1079);
        arrayCreator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Seej

    // $ANTLR start synpred4_Seej
    public final void synpred4_Seej_fragment() throws RecognitionException {   
        // Seej.g:223:3: ( '(' ')' )
        // Seej.g:223:4: '(' ')'
        {
        match(input,63,FOLLOW_63_in_synpred4_Seej1110); if (state.failed) return ;
        match(input,64,FOLLOW_64_in_synpred4_Seej1112); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Seej

    // $ANTLR start synpred5_Seej
    public final void synpred5_Seej_fragment() throws RecognitionException {   
        // Seej.g:230:2: ( '[' expr ']' )
        // Seej.g:230:3: '[' expr ']'
        {
        match(input,56,FOLLOW_56_in_synpred5_Seej1156); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred5_Seej1158);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred5_Seej1160); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Seej

    // $ANTLR start synpred6_Seej
    public final void synpred6_Seej_fragment() throws RecognitionException {   
        // Seej.g:231:2: ( '[' ']' )
        // Seej.g:231:3: '[' ']'
        {
        match(input,56,FOLLOW_56_in_synpred6_Seej1176); if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred6_Seej1178); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Seej

    // Delegated rules

    public final boolean synpred4_Seej() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Seej_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Seej() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Seej_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Seej() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Seej_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Seej() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Seej_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Seej() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Seej_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Seej() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Seej_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\13\uffff";
    static final String DFA2_minS =
        "\1\11\1\uffff\1\54\1\46\1\71\1\21\2\54\2\uffff\1\46";
    static final String DFA2_maxS =
        "\1\76\1\uffff\2\70\1\71\1\77\1\54\1\70\2\uffff\1\70";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\2\1\uffff";
    static final String DFA2_specialS =
        "\13\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\42\uffff\1\3\15\uffff\5\2",
            "",
            "\1\5\13\uffff\1\4",
            "\1\6\5\uffff\1\5\13\uffff\1\4",
            "\1\7",
            "\1\11\45\uffff\1\11\7\uffff\1\10",
            "\1\12",
            "\1\5\13\uffff\1\4",
            "",
            "",
            "\1\6\5\uffff\1\5\13\uffff\1\4"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "55:1: topLevelElement : ( structDeclaration | globalVarDeclaration | functionDeclaration );";
        }
    }
    static final String DFA17_eotS =
        "\16\uffff";
    static final String DFA17_eofS =
        "\16\uffff";
    static final String DFA17_minS =
        "\1\11\2\uffff\1\21\7\uffff\1\54\1\23\1\21";
    static final String DFA17_maxS =
        "\1\101\2\uffff\1\77\7\uffff\1\54\1\101\1\77";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff";
    static final String DFA17_specialS =
        "\16\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\2\uffff\1\12\1\5\1\6\1\uffff\1\7\1\11\1\10\1\4\12\uffff"+
            "\2\4\3\uffff\1\4\7\uffff\1\4\1\3\4\4\11\uffff\5\2\1\4\1\uffff"+
            "\1\4",
            "",
            "",
            "\1\4\3\uffff\16\4\3\uffff\1\13\5\uffff\1\2\13\uffff\1\14\6"+
            "\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\4\12\uffff\2\4\3\uffff\1\4\7\uffff\6\4\10\uffff\1\2\5\uffff"+
            "\1\4\1\uffff\1\4",
            "\1\4\3\uffff\16\4\3\uffff\1\13\5\uffff\1\2\13\uffff\1\14\6"+
            "\uffff\1\4"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "126:1: statement : ( structDeclaration | localVarDeclaration | expression ';' | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | ifStat | whileStat | printStat | ';' | block );";
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\13\uffff";
    static final String DFA35_minS =
        "\1\53\1\0\11\uffff";
    static final String DFA35_maxS =
        "\1\101\1\0\11\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\3\6\uffff\1\1\1\2";
    static final String DFA35_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA35_transitionS = {
            "\6\2\16\uffff\1\2\1\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "215:1: newExpr : ( ( arrayCreator )=> arrayCreator | structCreator | primary );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Seej()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\30\uffff";
    static final String DFA37_eofS =
        "\1\2\27\uffff";
    static final String DFA37_minS =
        "\1\21\1\0\26\uffff";
    static final String DFA37_maxS =
        "\1\100\1\0\26\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA37_specialS =
        "\1\uffff\1\0\26\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\3\uffff\16\2\3\uffff\1\2\20\uffff\1\2\1\1\1\2\5\uffff"+
            "\2\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()+ loopback of 230:1: ( ( '[' expr ']' )=> '[' expr ']' )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Seej()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_topLevelElement_in_program230 = new BitSet(new long[]{0x7C00100000000202L});
    public static final BitSet FOLLOW_structDeclaration_in_topLevelElement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVarDeclaration_in_topLevelElement253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_topLevelElement257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_structDeclaration266 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_structDeclaration268 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BLOCK_in_structDeclaration270 = new BitSet(new long[]{0x7C00100000000200L});
    public static final BitSet FOLLOW_structMember_in_structDeclaration272 = new BitSet(new long[]{0x7C40100000000200L});
    public static final BitSet FOLLOW_54_in_structDeclaration275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_structMember295 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_structMember297 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_55_in_structMember300 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_structMember302 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_SEMI_in_structMember306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDeclaration_in_structMember321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNotArray_in_type332 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_type342 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_type344 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_typeNotArray358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structType_in_typeNotArray362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_structType397 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_structType412 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_structType415 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_type_in_globalVarDeclaration428 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_globalVarDeclaration430 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_55_in_globalVarDeclaration433 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_globalVarDeclaration435 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_SEMI_in_globalVarDeclaration439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVarDeclaration460 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_localVarDeclarator_in_localVarDeclaration462 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_55_in_localVarDeclaration465 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_localVarDeclarator_in_localVarDeclaration467 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_SEMI_in_localVarDeclaration471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_localVarDeclarator491 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ASSIGN_in_localVarDeclarator494 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_localVarDeclarator496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalArgList515 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_formalArgList517 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_formalArgList520 = new BitSet(new long[]{0x7C00100000000000L});
    public static final BitSet FOLLOW_type_in_formalArgList522 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_formalArgList524 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_type_in_functionDeclaration547 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration549 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_functionDeclaration551 = new BitSet(new long[]{0x7C00100000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_formalArgList_in_functionDeclaration553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_functionDeclaration556 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_functionDeclaration558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block583 = new BitSet(new long[]{0xFC41F808C00F7200L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block585 = new BitSet(new long[]{0xFC41F808C00F7200L,0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_block588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDeclaration_in_statement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVarDeclaration_in_statement611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement615 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement622 = new BitSet(new long[]{0x8001F808C00A0000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_statement641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_statement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStat_in_statement649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStat667 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ifStat669 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_ifStat671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifStat673 = new BitSet(new long[]{0xFC01F808C00F7200L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_ifStat677 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ELSE_in_ifStat689 = new BitSet(new long[]{0xFC01F808C00F7200L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_ifStat693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStat722 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_whileStat724 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_whileStat726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_whileStat728 = new BitSet(new long[]{0xFC01F808C00F7200L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_whileStat730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printStat749 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_printStat751 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_printStat753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_assignExpr802 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignExpr805 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr820 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_orExpr823 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr826 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr838 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_andExpr841 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr844 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr855 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr859 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEQ_in_equalityExpr864 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr868 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_additiveExpr_in_relationalExpr879 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_LT_in_relationalExpr883 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LEQ_in_relationalExpr888 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalExpr893 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GEQ_in_relationalExpr898 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_relationalExpr902 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr913 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpr917 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpr922 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr926 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multiplicativeExpr937 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_MUL_in_multiplicativeExpr941 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpr946 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpr951 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multiplicativeExpr955 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_unaryExpr966 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpr975 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpr984 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lenExpr_in_unaryExpr991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEN_in_lenExpr1001 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_lenExpr1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_lenExpr1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_postfixExpr1017 = new BitSet(new long[]{0x8100004000000002L});
    public static final BitSet FOLLOW_DOT_in_postfixExpr1023 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_postfixExpr1026 = new BitSet(new long[]{0x8100004000000002L});
    public static final BitSet FOLLOW_56_in_postfixExpr1032 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfixExpr1035 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_postfixExpr1039 = new BitSet(new long[]{0x8100004000000002L});
    public static final BitSet FOLLOW_63_in_postfixExpr1046 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000003L});
    public static final BitSet FOLLOW_expr_in_postfixExpr1050 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_postfixExpr1053 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_postfixExpr1056 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_postfixExpr1064 = new BitSet(new long[]{0x8100004000000002L});
    public static final BitSet FOLLOW_arrayCreator_in_newExpr1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structCreator_in_newExpr1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_newExpr1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_structCreator1103 = new BitSet(new long[]{0x7C00100000000000L});
    public static final BitSet FOLLOW_structType_in_structCreator1105 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_structCreator1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_structCreator1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_arrayCreator1147 = new BitSet(new long[]{0x7C00100000000000L});
    public static final BitSet FOLLOW_typeNotArray_in_arrayCreator1151 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_arrayCreator1165 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arrayCreator1167 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_arrayCreator1169 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_arrayCreator1183 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_arrayCreator1185 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_primary1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_LIT_in_primary1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LIT_in_primary1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LIT_in_primary1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LIT_in_primary1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_primary1222 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primary1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_primary1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred1_Seej403 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_synpred1_Seej405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Seej682 = new BitSet(new long[]{0xFC01F808C00F7200L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred2_Seej684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayCreator_in_synpred3_Seej1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred4_Seej1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_synpred4_Seej1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred5_Seej1156 = new BitSet(new long[]{0x8001F808C0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred5_Seej1158 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred5_Seej1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred6_Seej1176 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred6_Seej1178 = new BitSet(new long[]{0x0000000000000002L});

}