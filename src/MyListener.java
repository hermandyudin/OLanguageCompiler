import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class MyListener extends OLanguageBaseListener {
    public MyListener(HashMap<Integer, ArrayList<String>> unusedVariables) {
        this.unusedVariables = unusedVariables;
    }
    private Integer scopeNumber = 0;
    private HashMap<Integer, ArrayList<String>> unusedVariables;

    @Override
    public void enterIfStatement(OLanguageParser.IfStatementContext ctx) {
        if (ctx.expression().primary().booleanLiteral() != null) {

            String conditionValue = (ctx.expression().primary().getText());
            System.out.println("Optimization: If statement condition is a constant boolean value: " + conditionValue);

            if (conditionValue.equals("true"))
                ctx.getParent().getParent().addChild(ctx.body(0));
            ctx.getParent().removeLastChild();
        }
    }

    @Override
    public void enterBody(OLanguageParser.BodyContext ctx) {
        for (OLanguageParser.VariableDeclarationContext variableDeclarationContext : ctx.variableDeclaration()) {
            if (unusedVariables.get(scopeNumber) != null) {
                if (unusedVariables.get(scopeNumber).contains(variableDeclarationContext.identifierToken().getText())) {
                    System.out.println("Optimization: Unused variable " + variableDeclarationContext.identifierToken().getText() + " in scope " + scopeNumber + " deleted.");
                    ctx.children.remove(ctx.children.indexOf(variableDeclarationContext));
                }
            }
        }
    }

    @Override
    public void enterVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx) {
    }


    @Override
    public void enterAssignment(OLanguageParser.AssignmentContext ctx) {
    }

    @Override
    public void enterClassDeclaration(OLanguageParser.ClassDeclarationContext ctx) {
        scopeNumber += 1;
    }

    public void enterMethodDeclaration(OLanguageParser.MethodDeclarationContext ctx) {
        scopeNumber += 1;
    }

    @Override
    public void enterWhileLoop(OLanguageParser.WhileLoopContext ctx) {
        scopeNumber += 1;
    }

    @Override
    public void exitClassDeclaration(OLanguageParser.ClassDeclarationContext ctx) {

    }
}
