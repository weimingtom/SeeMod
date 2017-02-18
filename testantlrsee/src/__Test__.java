import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class __Test__ {

    public static void main(String args[]) throws Exception {
        SeejLexer lex = new SeejLexer(new ANTLRFileStream("D:\\ugame\\src\\as3\\testantlrsee\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        
        SeejParser g = new SeejParser(tokens);
        try {
            //或者转换为org.antlr.runtime.tree.CommonTree
            Tree t = g.program().tree;
            System.out.println(t.toStringTree());
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
