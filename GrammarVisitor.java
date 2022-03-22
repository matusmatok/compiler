// Generated from Grammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(GrammarParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(GrammarParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#procDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDef(GrammarParser.ProcDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(GrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GrammarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDef}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDef(GrammarParser.ArrayDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDef}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(GrammarParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign(GrammarParser.ArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAssign}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(GrammarParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directExpr}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectExpr(GrammarParser.DirectExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#internalbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalbody(GrammarParser.InternalbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elsebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsebody(GrammarParser.ElsebodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(GrammarParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(GrammarParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOp}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(GrammarParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(GrammarParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(GrammarParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(GrammarParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprToLogic}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprToLogic(GrammarParser.ExprToLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveOp}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOp(GrammarParser.AdditiveOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetTerm}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetTerm(GrammarParser.GetTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeOp}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOp(GrammarParser.MultiplicativeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetFactor}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFactor(GrammarParser.GetFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getPower}
	 * labeled alternative in {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetPower(GrammarParser.GetPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerOp}
	 * labeled alternative in {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerOp(GrammarParser.PowerOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(GrammarParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(GrammarParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Character}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(GrammarParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GrammarParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#defParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefParams(GrammarParser.DefParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(GrammarParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(GrammarParser.VarTypeContext ctx);
}