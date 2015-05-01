package  asu.dans; 

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author Nikhil Aravind
 *
 */
public class Dans {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        DANSGrammarLexer lexer = new DANSGrammarLexer(new ANTLRFileStream(args[0]));
        DANSGrammarParser parser = new DANSGrammarParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        DANSRuntime visitor = new DANSRuntime();
        visitor.visit(tree); 
    }
}
