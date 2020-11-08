package rsql.where;

import org.antlr.v4.runtime.tree.ParseTree;
import rsql.antlr.where.RsqlWhereBaseVisitor;
import rsql.antlr.where.RsqlWhereParser;

public class WhereTextVisitor extends RsqlWhereBaseVisitor<String> {

    String whereText = "";

    public WhereTextVisitor() {
    }

    @Override
    public String visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public String visitWhere(RsqlWhereParser.WhereContext ctx) {
        return super.visitWhere(ctx);
    }

    @Override
    public String visitField(RsqlWhereParser.FieldContext ctx) {

        StringBuilder field = new StringBuilder(ctx.ID().getText());
        for (int i = 0; i < ctx.DOT_ID().size(); i++) {
            field.append(ctx.DOT_ID(i).getText());
        }
        whereText += field + " ";
        return field.toString();
    }

    @Override
    public String visitConditionSingle(RsqlWhereParser.ConditionSingleContext ctx) {
        return super.visitConditionSingle(ctx);
    }

    @Override
    public String visitConditionAnd(RsqlWhereParser.ConditionAndContext ctx) {
        String left = super.visit(ctx.condition(0));
        String right = super.visit(ctx.condition(1));
        return left + " and " + right;
    }

    @Override
    public String visitConditionOr(RsqlWhereParser.ConditionOrContext ctx) {
        String left = super.visit(ctx.condition(0));
        String right = super.visit(ctx.condition(1));
        return left + " or " + right;
    }

    @Override
    public String visitConditionParens(RsqlWhereParser.ConditionParensContext ctx) {
        String condition = super.visit(ctx.condition());

        return "(" + condition + ")";
    }

    @Override
    public String visitSingleConditionBetween(RsqlWhereParser.SingleConditionBetweenContext ctx) {
        String field = visitField(ctx.field());
        String operator = " between ";
        String first = ctx.inListElement(0).getText();
        String second = ctx.inListElement(1).getText();
        return field+operator+first+" and "+second;

    }

    @Override
    public String visitSingleConditionIn(RsqlWhereParser.SingleConditionInContext ctx) {
        String field = visitField(ctx.field());
        String operator = " in ";
        String text = super.visit(ctx.inList());
        return field+operator+"("+text+")";
    }

    @Override
    public String visitSingleConditionString(RsqlWhereParser.SingleConditionStringContext ctx) {
        String field = visitField(ctx.field());
        String operator = visitOperator(ctx.operator());
        String text = ctx.STRING_LITERAL().getText();

        return field+operator+text;
    }

    @Override
    public String visitInList(RsqlWhereParser.InListContext ctx) {
        StringBuilder l = new StringBuilder(ctx.inListElement(0).getText());

        if (ctx.getChildCount()>1) {
            for (int i = 1; i < ctx.inListElement().size(); i++) {
                l.append(',').append(ctx.inListElement(i).getText());
            }
        }
        return l.toString();
    }

    @Override
    public String visitInListElement(RsqlWhereParser.InListElementContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSingleConditionDecimal(RsqlWhereParser.SingleConditionDecimalContext ctx) {
        String field = visitField(ctx.field());
        String operator = visitOperator(ctx.operator());
        String text = ctx.DECIMAL_LITERAL().getText();
        return field+operator+text;
    }

    @Override
    public String visitSingleConditionReal(RsqlWhereParser.SingleConditionRealContext ctx) {
        String field = visitField(ctx.field());
        String operator = visitOperator(ctx.operator());
        String text = ctx.REAL_LITERAL().getText();
        return field+operator+text;

    }

    @Override
    public String visitOperator(RsqlWhereParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }

    @Override
    public String visitOperatorEQ(RsqlWhereParser.OperatorEQContext ctx) {
        return "=";
    }

    @Override
    public String visitOperatorNEQ(RsqlWhereParser.OperatorNEQContext ctx) {
        return "!=";
    }

    @Override
    public String visitOperatorGT(RsqlWhereParser.OperatorGTContext ctx) {
        return ">";
    }

    @Override
    public String visitOperatorLT(RsqlWhereParser.OperatorLTContext ctx) {
        return "<";
    }

    @Override
    public String visitOperatorGE(RsqlWhereParser.OperatorGEContext ctx) {
        return ">=";
    }

    @Override
    public String visitOperatorLE(RsqlWhereParser.OperatorLEContext ctx) {
        return "<=";
    }

    @Override
    public String visitOperatorLIKE(RsqlWhereParser.OperatorLIKEContext ctx) {
        return " like ";
    }

}
