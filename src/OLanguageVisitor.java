// Generated from C:/Users/dyudi/IdeaProjects/finally/grammar/OLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#identifierToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierToken(OLanguageParser.IdentifierTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#integerClassToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerClassToken(OLanguageParser.IntegerClassTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#integerToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerToken(OLanguageParser.IntegerTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#realClassToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealClassToken(OLanguageParser.RealClassTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#realToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealToken(OLanguageParser.RealTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#booleanClassToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanClassToken(OLanguageParser.BooleanClassTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(OLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(OLanguageParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(OLanguageParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(OLanguageParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(OLanguageParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(OLanguageParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(OLanguageParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(OLanguageParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(OLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(OLanguageParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(OLanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(OLanguageParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(OLanguageParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(OLanguageParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OLanguageParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(OLanguageParser.BooleanLiteralContext ctx);
}