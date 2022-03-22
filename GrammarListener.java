// Generated from Grammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(GrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(GrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#procDef}.
	 * @param ctx the parse tree
	 */
	void enterProcDef(GrammarParser.ProcDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#procDef}.
	 * @param ctx the parse tree
	 */
	void exitProcDef(GrammarParser.ProcDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterIf(GrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitIf(GrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDef}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterArrayDef(GrammarParser.ArrayDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDef}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitArrayDef(GrammarParser.ArrayDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDef}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(GrammarParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDef}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(GrammarParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(GrammarParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(GrammarParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAssign}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(GrammarParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAssign}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(GrammarParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directExpr}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void enterDirectExpr(GrammarParser.DirectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directExpr}
	 * labeled alternative in {@link GrammarParser#statbody}.
	 * @param ctx the parse tree
	 */
	void exitDirectExpr(GrammarParser.DirectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#internalbody}.
	 * @param ctx the parse tree
	 */
	void enterInternalbody(GrammarParser.InternalbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#internalbody}.
	 * @param ctx the parse tree
	 */
	void exitInternalbody(GrammarParser.InternalbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elsebody}.
	 * @param ctx the parse tree
	 */
	void enterElsebody(GrammarParser.ElsebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elsebody}.
	 * @param ctx the parse tree
	 */
	void exitElsebody(GrammarParser.ElsebodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegation(GrammarParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegation(GrammarParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterParens(GrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitParens(GrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOp}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(GrammarParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOp}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(GrammarParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(GrammarParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(GrammarParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(GrammarParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(GrammarParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(GrammarParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(GrammarParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprToLogic}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprToLogic(GrammarParser.ExprToLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprToLogic}
	 * labeled alternative in {@link GrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprToLogic(GrammarParser.ExprToLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveOp}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(GrammarParser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveOp}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(GrammarParser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetTerm}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGetTerm(GrammarParser.GetTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetTerm}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGetTerm(GrammarParser.GetTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeOp}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(GrammarParser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeOp}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(GrammarParser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetFactor}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterGetFactor(GrammarParser.GetFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetFactor}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitGetFactor(GrammarParser.GetFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getPower}
	 * labeled alternative in {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterGetPower(GrammarParser.GetPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getPower}
	 * labeled alternative in {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitGetPower(GrammarParser.GetPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerOp}
	 * labeled alternative in {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPowerOp(GrammarParser.PowerOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerOp}
	 * labeled alternative in {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPowerOp(GrammarParser.PowerOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterVar(GrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitVar(GrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterArray(GrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(GrammarParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(GrammarParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(GrammarParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(GrammarParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Character}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(GrammarParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Character}
	 * labeled alternative in {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(GrammarParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GrammarParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GrammarParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#defParams}.
	 * @param ctx the parse tree
	 */
	void enterDefParams(GrammarParser.DefParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#defParams}.
	 * @param ctx the parse tree
	 */
	void exitDefParams(GrammarParser.DefParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(GrammarParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(GrammarParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(GrammarParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(GrammarParser.VarTypeContext ctx);
}