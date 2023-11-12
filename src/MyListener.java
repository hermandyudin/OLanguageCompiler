import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Set;

public class MyListener extends OLanguageBaseListener {
    private Set<String> usedVariables = new HashSet<>();

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

//    @Override
//    public void enterVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx) {
//        // Mark the variable as used
//        usedVariables.add(ctx.identifierToken().getText());
//    }
//
//    @Override
//    public void enterAssignment(OLanguageParser.AssignmentContext ctx) {
//        // Mark the variable in assignment as used
//        usedVariables.add(ctx.identifierToken().getText());
//    }
//
//    @Override
//    public void exitProgram(OLanguageParser.ProgramContext ctx) {
//        // Remove unused variables from the AST
//        removeUnusedVariables();
//    }
//
//    private void removeUnusedVariables() {
//        // Remove variable declarations and assignments for unused variables
//        if (node instanceof OLanguageParser.VariableDeclarationContext ||
//                node instanceof OLanguageParser.AssignmentContext) {
//            String variableName = getVariableName(node);
//            if (!usedVariables.contains(variableName)) {
//                // Remove the node (variable declaration or assignment)
//                node.getParent().removeLastChild();
//            }
//        }
//
//        // Recursively remove unused variables in children
//        for (int i = 0; i < node.getChildCount(); i++) {
//            removeUnusedVariables(node.getChild(i));
//        }
//    }


}
