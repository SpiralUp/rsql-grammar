package rsql.where;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import rsql.antlr.where.RsqlWhereLexer;
import rsql.antlr.where.RsqlWhereParser;

import java.io.IOException;

public class RsqlWhere {

    public String parseAsText(String inputFile) throws IOException {
        CharStream inputStream = CharStreams.fromFileName(inputFile);
        RsqlWhereLexer lexer = new RsqlWhereLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RsqlWhereParser parser = new RsqlWhereParser(tokens);
        ParseTree tree = parser.where(); // parse; start at where
//        System.out.println(tree.toStringTree(parser)); // print tree as text
        WhereTextVisitor visitor = new WhereTextVisitor();
        return visitor.visit(tree);
    }
}
