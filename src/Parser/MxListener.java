// Generated from C:/Users/13199/IdeaProjects/Compiler/src/Mx.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#mainFn}.
	 * @param ctx the parse tree
	 */
	void enterMainFn(MxParser.MainFnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#mainFn}.
	 * @param ctx the parse tree
	 */
	void exitMainFn(MxParser.MainFnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(MxParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(MxParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classsuite}.
	 * @param ctx the parse tree
	 */
	void enterClasssuite(MxParser.ClasssuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classsuite}.
	 * @param ctx the parse tree
	 */
	void exitClasssuite(MxParser.ClasssuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link MxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterVarMember(MxParser.VarMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link MxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitVarMember(MxParser.VarMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link MxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterFuncMember(MxParser.FuncMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link MxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitFuncMember(MxParser.FuncMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link MxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(MxParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link MxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(MxParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MxParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MxParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardefStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVardefStatement(MxParser.VardefStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardefStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVardefStatement(MxParser.VardefStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MxParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MxParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MxParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MxParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MxParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MxParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MxParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MxParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MxParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MxParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(MxParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(MxParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#globalVardef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVardef(MxParser.GlobalVardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#globalVardef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVardef(MxParser.GlobalVardefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatString}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(MxParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatString}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(MxParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(MxParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(MxParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRightExpr(MxParser.RightExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRightExpr(MxParser.RightExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(MxParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(MxParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classFuncExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassFuncExpr(MxParser.ClassFuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classFuncExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassFuncExpr(MxParser.ClassFuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(MxParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(MxParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(MxParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(MxParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(MxParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(MxParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MxParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MxParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classMemExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassMemExpr(MxParser.ClassMemExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classMemExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassMemExpr(MxParser.ClassMemExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(MxParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(MxParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExpr(MxParser.PriorityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExpr(MxParser.PriorityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVisitExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayVisitExpr(MxParser.ArrayVisitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVisitExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayVisitExpr(MxParser.ArrayVisitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(MxParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(MxParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLeftExpr(MxParser.LeftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLeftExpr(MxParser.LeftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(MxParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(MxParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MxParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MxParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(MxParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(MxParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterIntCons(MxParser.IntConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitIntCons(MxParser.IntConsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterStrCons(MxParser.StrConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitStrCons(MxParser.StrConsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterArrCons(MxParser.ArrConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitArrCons(MxParser.ArrConsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterBoolCons(MxParser.BoolConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolCons}
	 * labeled alternative in {@link MxParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitBoolCons(MxParser.BoolConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#array_Cons}.
	 * @param ctx the parse tree
	 */
	void enterArray_Cons(MxParser.Array_ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#array_Cons}.
	 * @param ctx the parse tree
	 */
	void exitArray_Cons(MxParser.Array_ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#array_Content}.
	 * @param ctx the parse tree
	 */
	void enterArray_Content(MxParser.Array_ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#array_Content}.
	 * @param ctx the parse tree
	 */
	void exitArray_Content(MxParser.Array_ContentContext ctx);
}