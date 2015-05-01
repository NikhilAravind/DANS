// Generated from DANSGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DANSGrammarParser}.
 */
public interface DANSGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link DANSGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(@NotNull DANSGrammarParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link DANSGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(@NotNull DANSGrammarParser.IdentifierFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(@NotNull DANSGrammarParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(@NotNull DANSGrammarParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusExpression(@NotNull DANSGrammarParser.ModulusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusExpression(@NotNull DANSGrammarParser.ModulusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(@NotNull DANSGrammarParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(@NotNull DANSGrammarParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link DANSGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSizeFunctionCall(@NotNull DANSGrammarParser.SizeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link DANSGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSizeFunctionCall(@NotNull DANSGrammarParser.SizeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull DANSGrammarParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull DANSGrammarParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull DANSGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull DANSGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull DANSGrammarParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull DANSGrammarParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull DANSGrammarParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull DANSGrammarParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull DANSGrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull DANSGrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(@NotNull DANSGrammarParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(@NotNull DANSGrammarParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(@NotNull DANSGrammarParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(@NotNull DANSGrammarParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(@NotNull DANSGrammarParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(@NotNull DANSGrammarParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(@NotNull DANSGrammarParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(@NotNull DANSGrammarParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull DANSGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull DANSGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(@NotNull DANSGrammarParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(@NotNull DANSGrammarParser.InputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtEqExpression(@NotNull DANSGrammarParser.LtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtEqExpression(@NotNull DANSGrammarParser.LtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull DANSGrammarParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull DANSGrammarParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull DANSGrammarParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull DANSGrammarParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link DANSGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnFunctionCall(@NotNull DANSGrammarParser.PrintlnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link DANSGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnFunctionCall(@NotNull DANSGrammarParser.PrintlnFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(@NotNull DANSGrammarParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(@NotNull DANSGrammarParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull DANSGrammarParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull DANSGrammarParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtEqExpression(@NotNull DANSGrammarParser.GtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtEqExpression(@NotNull DANSGrammarParser.GtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull DANSGrammarParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull DANSGrammarParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(@NotNull DANSGrammarParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(@NotNull DANSGrammarParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqExpression(@NotNull DANSGrammarParser.NotEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqExpression(@NotNull DANSGrammarParser.NotEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(@NotNull DANSGrammarParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(@NotNull DANSGrammarParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull DANSGrammarParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull DANSGrammarParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull DANSGrammarParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull DANSGrammarParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtExpression(@NotNull DANSGrammarParser.GtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtExpression(@NotNull DANSGrammarParser.GtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(@NotNull DANSGrammarParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(@NotNull DANSGrammarParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull DANSGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull DANSGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DANSGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DANSGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull DANSGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull DANSGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull DANSGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull DANSGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(@NotNull DANSGrammarParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(@NotNull DANSGrammarParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DANSGrammarParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull DANSGrammarParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DANSGrammarParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull DANSGrammarParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull DANSGrammarParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull DANSGrammarParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(@NotNull DANSGrammarParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DANSGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(@NotNull DANSGrammarParser.NumberExpressionContext ctx);
}