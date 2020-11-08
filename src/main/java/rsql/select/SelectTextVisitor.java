package rsql.select;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import rsql.antlr.select.RsqlSelectBaseVisitor;
import rsql.antlr.select.RsqlSelectParser;

import java.util.HashSet;
import java.util.Set;

public class SelectTextVisitor extends RsqlSelectBaseVisitor<String> {

    String selectText = "";
    Set<String> paths;

    public SelectTextVisitor(String selectText) {
        this.selectText = selectText;
        this.paths = new HashSet<>();
    }

    public SelectTextVisitor() {
        this.selectText = "";
        this.paths = new HashSet<>();
    }

    @Override
    public String visit(ParseTree tree) {
        this.selectText = super.visit(tree);
        return this.selectText;
    }

    @Override
    public String visitSelect(RsqlSelectParser.SelectContext ctx) {
        return super.visitSelect(ctx);
    }

    @Override
    public String visitSelectElements(RsqlSelectParser.SelectElementsContext ctx) {
        String result = "";
        int numberOfElements = ctx.children.size();
        for (int i = 0; i < numberOfElements; i++) {
            if (ctx.children.get(i) instanceof TerminalNodeImpl && ctx.children.get(i).toString().equals(",")) {
                result += ",";
            } else {
                final ParseTree c = ctx.children.get(i);
                String r = c.accept(this);
                result += r;
            }
        }
        return result;
    }

    @Override
    public String visitSeAll(RsqlSelectParser.SeAllContext ctx) {
        // Select field.*
        if (ctx.children.size()==3) {
            String table = visitField(ctx.field());
            this.paths.add(table);

            return table + ".*";
        } else {
            return "*";
        }

    }

    @Override
    public String visitSeField(RsqlSelectParser.SeFieldContext ctx) {
        // field (':' simpleField)?
        return super.visitSeField(ctx);
    }

    @Override
    public String visitSeFuncCall(RsqlSelectParser.SeFuncCallContext ctx) {
        // functionCall (':' simpleField)?
        return super.visitSeFuncCall(ctx);
    }

    @Override
    public String visitFunctionCall(RsqlSelectParser.FunctionCallContext ctx) {
        // function call
        return super.visitFunctionCall(ctx);
    }

    @Override
    public String visitFuncCall(RsqlSelectParser.FuncCallContext ctx) {
        // AVG, MAX, MIN, SUM, GRP
        // children(0) -> func name
        // children(2) -> arguments
        String funcName = ctx.children.get(0).getText().toUpperCase();
        final String argument = super.visitFunctionArg(ctx.functionArg());
        String result = funcName + "(" + argument+ ")";
        return result;
    }

    @Override
    public String visitCountAll(RsqlSelectParser.CountAllContext ctx) {
        // COUNT(* | ALL? functionArg)
        String result = "";
        if (ctx.functionArg() != null) {
            final String argument = super.visitFunctionArg(ctx.functionArg());
            result = "COUNT(all " + argument + ")";
        } else {
            result = "COUNT(*)";
        }
        return result;
    }

    @Override
    public String visitCountDist(RsqlSelectParser.CountDistContext ctx) {
        // COUNT (DIST functionArgs)

        String arguments = visitFunctionArgs(ctx.functionArgs());
        String result = "COUNT(dist " + arguments + ")";
        return result;
    }

    @Override
    public String visitFunctionArgs(RsqlSelectParser.FunctionArgsContext ctx) {
        // (field | functionCall) (',' (field | functionCall))*
        String result = visitFunctionArg(ctx.functionArg(0));

        for (int i = 1; i < ctx.functionArg().size(); i++) {
            result += "," + visitFunctionArg(ctx.functionArg(i));
        }
        return result;
    }

    @Override
    public String visitFunctionArg(RsqlSelectParser.FunctionArgContext ctx) {
        // (field | functionCall)
        return super.visitFunctionArg(ctx);
    }

    @Override
    public String visitField(RsqlSelectParser.FieldContext ctx) {
        // ID(DOT_ID)*
        StringBuilder field = new StringBuilder(ctx.ID().getText());
        for (int i = 0; i < ctx.DOT_ID().size(); i++) {
            field.append(ctx.DOT_ID(i).getText());
        }
        if (ctx.DOT_ID().size()>0) {
            extractPathFromField(field.toString());
        }
        return field.toString();
    }

    @Override
    public String visitSimpleField(RsqlSelectParser.SimpleFieldContext ctx) {
        // ID
        StringBuilder field = new StringBuilder(ctx.ID().getText());
        return field.toString();
    }

    void extractPathFromField(String field) {
        int lastPos = field.lastIndexOf(".");
        if (lastPos>0) {
            String path = field.substring(0, lastPos);
            this.paths.add(path);
        }
    }
}
