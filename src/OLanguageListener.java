// Generated from C:/Users/dyudi/IdeaProjects/finally/grammar/OLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OLanguageParser}.
 */
public interface OLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#identifierToken}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierToken(OLanguageParser.IdentifierTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#identifierToken}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierToken(OLanguageParser.IdentifierTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#integerClassToken}.
	 * @param ctx the parse tree
	 */
	void enterIntegerClassToken(OLanguageParser.IntegerClassTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#integerClassToken}.
	 * @param ctx the parse tree
	 */
	void exitIntegerClassToken(OLanguageParser.IntegerClassTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#integerToken}.
	 * @param ctx the parse tree
	 */
	void enterIntegerToken(OLanguageParser.IntegerTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#integerToken}.
	 * @param ctx the parse tree
	 */
	void exitIntegerToken(OLanguageParser.IntegerTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#realClassToken}.
	 * @param ctx the parse tree
	 */
	void enterRealClassToken(OLanguageParser.RealClassTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#realClassToken}.
	 * @param ctx the parse tree
	 */
	void exitRealClassToken(OLanguageParser.RealClassTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#realToken}.
	 * @param ctx the parse tree
	 */
	void enterRealToken(OLanguageParser.RealTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#realToken}.
	 * @param ctx the parse tree
	 */
	void exitRealToken(OLanguageParser.RealTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#booleanClassToken}.
	 * @param ctx the parse tree
	 */
	void enterBooleanClassToken(OLanguageParser.BooleanClassTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#booleanClassToken}.
	 * @param ctx the parse tree
	 */
	void exitBooleanClassToken(OLanguageParser.BooleanClassTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(OLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(OLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(OLanguageParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(OLanguageParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(OLanguageParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(OLanguageParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(OLanguageParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(OLanguageParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(OLanguageParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(OLanguageParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(OLanguageParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(OLanguageParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(OLanguageParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(OLanguageParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(OLanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(OLanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(OLanguageParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(OLanguageParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(OLanguageParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(OLanguageParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(OLanguageParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(OLanguageParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(OLanguageParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(OLanguageParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OLanguageParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(OLanguageParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OLanguageParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(OLanguageParser.BooleanLiteralContext ctx);
}