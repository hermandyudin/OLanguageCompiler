import org.antlr.v4.runtime.tree.RuleNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MyVisitor extends OLanguageBaseVisitor<Void> {
    private boolean insideMethod = false;
    private Stack<VariableTable> globalVariableScopes = new Stack<>();
    private Stack<VariableTable> localVariableScopes = new Stack<>();
    private String currentClassName = null;
    String neededReturnType = null;


    private static class VariableTable {
        private Map<String, String> variables = new HashMap<>();

        public void addVariable(String varName, String varType) {
            variables.put(varName, varType);
        }

        public VariableTable getCopy(){
            VariableTable t = new VariableTable();
            for(String k : variables.keySet()){
                t.addVariable(k, variables.get(k));
            }
            return t;
        }

        public boolean containsVariable(String varName) {
            return variables.containsKey(varName);
        }
    }

    @Override
    public Void visitProgram(OLanguageParser.ProgramContext ctx) {
        VariableTable globalScope = new VariableTable();
        globalVariableScopes.push(globalScope);
        localVariableScopes.push(globalScope);
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitClassDeclaration(OLanguageParser.ClassDeclarationContext ctx) {
        String className = ctx.className(0).getText();
        if (globalVariableScopes.peek().containsVariable(className) || globalVariableScopes.peek().containsVariable(className)) {
            throw new SemanticErrorException("Class with name " + className + " is already declared.");
        }

        localVariableScopes.peek().addVariable(className, "class");
        globalVariableScopes.peek().addVariable(className, "class");
        visitChildren(ctx);

        return null;
    }

    @Override
    public Void visitMethodDeclaration(OLanguageParser.MethodDeclarationContext ctx) {
        String methodName = ctx.identifierToken().getText();

        VariableTable localScope = localVariableScopes.peek();
        VariableTable globalScope = globalVariableScopes.peek();
        // Обработайте параметры метода
        OLanguageParser.ParametersContext params = ctx.parameters();
        if (params != null) {
            for (OLanguageParser.ParameterDeclarationContext param : params.parameterDeclaration()) {
                String paramName = param.identifierToken().getText();

                // Проверьте, была ли переменная уже объявлена в текущей области видимости
                if (globalScope.containsVariable(paramName)) {
                    throw new SemanticErrorException("Parameter with name " + paramName + " is already declared.");
                }


                // Добавьте параметр в таблицу символов текущей области видимости
                localScope.addVariable(paramName, param.className().getText());
            }
        }

        if (globalVariableScopes.peek().containsVariable(methodName) || globalVariableScopes.peek().containsVariable(methodName)) {
            throw new SemanticErrorException("Method with name " + methodName + " is already declared.");
        }

        localVariableScopes.peek().addVariable(methodName, "method");
        globalVariableScopes.peek().addVariable(methodName, "method");

        neededReturnType = ctx.className() != null? ctx.className().getText() : null;

        insideMethod = true;
        visitChildren(ctx);
        insideMethod = false;
        neededReturnType = null;


        return null;
    }
    @Override
    public Void visitArguments(OLanguageParser.ArgumentsContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitBody(OLanguageParser.BodyContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitAssignment(OLanguageParser.AssignmentContext ctx) {
        String ident = ctx.identifierToken().getText();
        if (!globalVariableScopes.peek().containsVariable(ident) && !localVariableScopes.peek().containsVariable(ident))
            throw new SemanticErrorException("Variable " + ident + " is not declared yet");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitBooleanClassToken(OLanguageParser.BooleanClassTokenContext ctx) {
         visitChildren(ctx);
         return null;
    }

    @Override
    public Void visitConstructorDeclaration(OLanguageParser.ConstructorDeclarationContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitBooleanLiteral(OLanguageParser.BooleanLiteralContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitClassName(OLanguageParser.ClassNameContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitIdentifierToken(OLanguageParser.IdentifierTokenContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitIfStatement(OLanguageParser.IfStatementContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitIntegerClassToken(OLanguageParser.IntegerClassTokenContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitIntegerToken(OLanguageParser.IntegerTokenContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitMemberDeclaration(OLanguageParser.MemberDeclarationContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitParameterDeclaration(OLanguageParser.ParameterDeclarationContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitParameters(OLanguageParser.ParametersContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitRealClassToken(OLanguageParser.RealClassTokenContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitRealToken(OLanguageParser.RealTokenContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitReturnStatement(OLanguageParser.ReturnStatementContext ctx) {
        if (!insideMethod) {
            throw new SemanticErrorException("Return is not inside the method");
        }
        if (ctx.expression().primary() != null) {
            if (ctx.expression().primary().booleanLiteral() != null) {
                if (!neededReturnType.equals("Boolean")) {
                    throw new SemanticErrorException("Type checking failed, return type doesn't fit to required one");
                }
            }
            else if (ctx.expression().primary().integerToken() != null) {
                    if (!neededReturnType.equals("Integer")) {
                        throw new SemanticErrorException("Type checking failed, return type doesn't fit to required one");
                    }
                }
            else if (ctx.expression().primary().realToken() != null) {
                if (!neededReturnType.equals("Real")) {
                    throw new SemanticErrorException("Type checking failed, return type doesn't fit to required one");
                }
            }
        }
        visitChildren(ctx);

        return null;
    }

    @Override
    public Void visitStatement(OLanguageParser.StatementContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitWhileLoop(OLanguageParser.WhileLoopContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx) {
        String varName = ctx.identifierToken().getText();
        VariableTable globalScope = globalVariableScopes.peek();
        VariableTable localScope = localVariableScopes.peek();

        // Проверьте, была ли переменная уже объявлена в текущей области видимости
        if (globalScope.containsVariable(varName)) {
            throw new SemanticErrorException("Variable with name " + varName + " is already defined.");
        } else {
            // Добавьте переменную в таблицу символов текущей области видимости
            globalVariableScopes.peek().addVariable(varName, ctx.expression().getText());
        }
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitExpression(OLanguageParser.ExpressionContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitPrimary(OLanguageParser.PrimaryContext ctx) {

        String primaryName = ctx.className() == null? ctx.getText() : ctx.className().identifierToken().getText();
        if (ctx.className() != null && !primaryName.startsWith("Array") && !(globalVariableScopes.peek().containsVariable(primaryName))) {
            throw new SemanticErrorException("Reference to undefined class or variable: " + ctx.className().identifierToken().getText());
        }
        return null;
    }

    // Метод для посещения всех детей узла
    public Void visitChildren(RuleNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            VariableTable t = globalVariableScopes.peek().getCopy();
            for(String key : localVariableScopes.peek().variables.keySet()){
                t.addVariable(key, localVariableScopes.peek().variables.get(key));
            }
            globalVariableScopes.push(t);
            localVariableScopes.push(new VariableTable());
            visit(node.getChild(i));
            localVariableScopes.pop();
            t = globalVariableScopes.pop();
            for(String key : t.variables.keySet()){
                if(localVariableScopes.peek().containsVariable(key) || !globalVariableScopes.peek().containsVariable(key)){
                    localVariableScopes.peek().addVariable(key, t.variables.get(key));
                }
                else{
                    globalVariableScopes.peek().addVariable(key, t.variables.get(key));
                }
            }
        }
        return null;
    }
}
