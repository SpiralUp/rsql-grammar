// Generated from /home/vrba/v/rsql-parser/src/main/antlr/RsqlWhere.g4 by ANTLR 4.8
package rsql.antlr.where;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RsqlWhereParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RsqlWhereVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(RsqlWhereParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionSingle}
	 * labeled alternative in {@link RsqlWhereParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionSingle(RsqlWhereParser.ConditionSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionAnd}
	 * labeled alternative in {@link RsqlWhereParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAnd(RsqlWhereParser.ConditionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionOr}
	 * labeled alternative in {@link RsqlWhereParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOr(RsqlWhereParser.ConditionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionParens}
	 * labeled alternative in {@link RsqlWhereParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionParens(RsqlWhereParser.ConditionParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#inList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(RsqlWhereParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#inListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInListElement(RsqlWhereParser.InListElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionBetween}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionBetween(RsqlWhereParser.SingleConditionBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionIn}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionIn(RsqlWhereParser.SingleConditionInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionString}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionString(RsqlWhereParser.SingleConditionStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionDate}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionDate(RsqlWhereParser.SingleConditionDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionDatetime}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionDatetime(RsqlWhereParser.SingleConditionDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionDecimal}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionDecimal(RsqlWhereParser.SingleConditionDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionReal}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionReal(RsqlWhereParser.SingleConditionRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionOtherField}
	 * labeled alternative in {@link RsqlWhereParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionOtherField(RsqlWhereParser.SingleConditionOtherFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(RsqlWhereParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorEQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorEQ(RsqlWhereParser.OperatorEQContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorNEQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorNEQ(RsqlWhereParser.OperatorNEQContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorGT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorGT(RsqlWhereParser.OperatorGTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorLT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorLT(RsqlWhereParser.OperatorLTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorGE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorGE(RsqlWhereParser.OperatorGEContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorLE(RsqlWhereParser.OperatorLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorLIKE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorLIKE(RsqlWhereParser.OperatorLIKEContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorIN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorIN(RsqlWhereParser.OperatorINContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#operatorBT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorBT(RsqlWhereParser.OperatorBTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RsqlWhereParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(RsqlWhereParser.FieldContext ctx);
}