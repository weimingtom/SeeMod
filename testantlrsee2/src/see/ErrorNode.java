package see;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonErrorNode;

/** A node representing erroneous token range in token stream */
public class ErrorNode extends SeeAST {
	org.antlr.runtime.tree.CommonErrorNode delegate;

	public ErrorNode(TokenStream input, Token start, Token stop,
			RecognitionException e) {
		delegate = new CommonErrorNode(input, start, stop, e);
	}

	public boolean isNil() {
		return delegate.isNil();
	}

	public int getType() {
		return delegate.getType();
	}

	public String getText() {
		return delegate.getText();
	}

	public String toString() {
		return delegate.toString();
	}
}