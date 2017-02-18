package see;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeParser;

import see.interp.Interpreter;
import see.symbol.SymbolTable;

public class Main {

	/** An adaptor which builds SeeAST nodes */
	public static TreeAdaptor seeAdaptor = new CommonTreeAdaptor() {
		public Object create(Token token) {
			return new SeeAST(token);
		}

		public Object dupNode(Object t) {
			if (t == null) {
				return null;
			}
			return create(((SeeAST) t).token);
		}

		public Object errorNode(TokenStream input, Token start, Token stop,
				RecognitionException e) {
			return new ErrorNode(input, start, stop, e);
		}
	};

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java -jar see.jar file.see");
			return;
		}

		try {
			SeeLexer lexer = new SeeLexer(new ANTLRFileStream(args[0], "UTF-8"));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SymbolTable.makeSingleton(tokens);
			SeeParser parser = new SeeParser(tokens);
			parser.setTreeAdaptor(seeAdaptor);
			CommonTree t = parser.program().tree;

			if (parser.getNumberOfSyntaxErrors() != 0) {
				System.out.println("Aborted due to syntax errors.");
				return;
			}

			System.out.println(t.toStringTree());

			// Create Tree Node Stream for Tree Parsers
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
			nodes.setTokenStream(tokens);
			nodes.setTreeAdaptor(seeAdaptor);

			// Define symbols
			Def def = new Def(nodes);
			//def.downup(t);
			visit(t, def);
			
			// Resolve references (make them point at Symbol in SymbolTable).
			// We can't compute the type of forward references in this pass.
			// Compute the type of references and expressions in the next pass.
			/*
			nodes.reset();
			Ref ref = new Ref(nodes);
			ref.downup(t);
			
			if (SymbolTable.getInstance().listener.getErrors() > 0)
				return;

			// Compute expression Types
			nodes.reset();
			Types types = new Types(nodes);
			types.downup(t);

			if (SymbolTable.getInstance().listener.getErrors() > 0)
				return;

			// Run interpreter
			new Interpreter((SeeAST) t).run();
			*/
		} catch (IOException e) {
			System.err.println(e);
		} catch (RecognitionException e) {
			System.err.println(e);
		}
	}
	
	public static Object visit(Object t, Def def) throws RecognitionException {
	    CommonTreeAdaptor adaptor = new CommonTreeAdaptor();
	    boolean isNil = adaptor.isNil(t);
	    /*
	    if (!isNil) {
		def.topdown();
	    }
	    */
	    for (int i=0; i<adaptor.getChildCount(t); i++) {
	        Object child = adaptor.getChild(t, i);
	        System.out.println(child);
	        Object visitResult = visit(child, def);
	        Object childAfterVisit = adaptor.getChild(t, i);
	        if ( visitResult !=  childAfterVisit ) {
	            adaptor.setChild(t, i, visitResult);
	        }
	    }
	    /*
	    if (!isNil) {
		def.bottomup();
	    }
	    */
	    return t;
	}
	
	public static Tree visit(Tree t, Def def) throws RecognitionException {
	    CommonTreeAdaptor adaptor = new CommonTreeAdaptor();
	    boolean isNil = adaptor.isNil(t);
	    //topdown();
	    for (int i = 0; i < adaptor.getChildCount(t); i++) {
			Tree child = t.getChild(i);
			if (t.getText().equals("VAR_DECL")) {
			    System.out.println(((SeeAST)child).getText());
			} else {
			    //System.out.println(((SeeAST)child).getText());
			}
	        Tree visitResult = visit(child, def);
	        Tree childAfterVisit = t.getChild(i);
	        if (visitResult != childAfterVisit) {
	            t.setChild(i, visitResult);
	        }
	    }
	    //bottomup();
	    return t;
	}
}
