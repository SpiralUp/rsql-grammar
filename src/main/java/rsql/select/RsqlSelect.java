package rsql.select;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import rsql.antlr.select.RsqlSelectLexer;
import rsql.antlr.select.RsqlSelectParser;

import java.io.IOException;

public class RsqlSelect {

    private SelectTextVisitor _visitor = null;

    public String parseAsText(String inputFile) throws IOException {
        CharStream inputStream = CharStreams.fromFileName(inputFile);
        RsqlSelectLexer lexer = new RsqlSelectLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RsqlSelectParser parser = new RsqlSelectParser(tokens);
        ParseTree tree = parser.select(); // parse; start at select <label id="code.tour.main.6"/>
        _visitor = new SelectTextVisitor();
        return _visitor.visit(tree);
    }

    public String paths() {
        if (_visitor != null) {
            return _visitor.paths.toString();
        }
        return  "";
    }
}
