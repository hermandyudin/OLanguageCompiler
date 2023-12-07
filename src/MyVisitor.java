
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.*;

public class MyVisitor extends OLanguageBaseVisitor<Void> {
    private boolean insideMethod = false;
    private Stack<ArrayList<Pair>> stackOfMethods = new Stack<>();
    private Stack<VariableTable> globalVariableScopes = new Stack<>();
    private HashMap<Integer, ArrayList<String>> unusedVariables = new HashMap<>();
    private HashMap<String, String> inheritance = new HashMap<>();
    String neededReturnType = null;
    private Integer scopeNumber = 0;

    private HashMap<String, VariableTable> classesAndItsVariablesAndMethods = new HashMap<>();
    public HashMap<Integer, ArrayList<String>> getUnusedVariables() {
        return this.unusedVariables;
    }

    private static class Pair {
        private Integer numberOfParams;
        private ArrayList<String> typesOfParams;
        public Pair(Integer numberOfParams, ArrayList<String> typesOfParams) {
            this.numberOfParams = numberOfParams;
            this.typesOfParams = typesOfParams;
        }

        public Integer getNumberOfParams() {
            return this.numberOfParams;
        }

        public ArrayList<String> getTypesOfParams() {
            return this.typesOfParams;
        }
    }

    private static class VariableTable {
        private Map<String, String> variablesAndTypes = new HashMap<>();
        private Map<String, Boolean> variablesDeclared = new HashMap<>();
        private Map<String, ArrayList<Pair>> methodsAndTypesOfParameters = new HashMap<>();
        private Map<String, String> methodAndItsReturn = new HashMap<>();
        private Integer numberScope;

        public VariableTable() {

        }
        public VariableTable(Integer numberScope) {
            this.numberScope = numberScope;
        }
        public void addVariable(String varName, String varType) {
            variablesAndTypes.put(varName, varType);
            variablesDeclared.put(varName, false);
        }
        public void addMethod(String varName, String varType, Pair pair, String returnType) {
            variablesAndTypes.put(varName, varType);
            variablesDeclared.put(varName, false);
            if (methodsAndTypesOfParameters.get(varName) != null) {
                methodsAndTypesOfParameters.get(varName).add(pair);
            }
            else {
                ArrayList<Pair> newArray = new ArrayList<>();
                newArray.add(pair);
                methodsAndTypesOfParameters.put(varName, newArray);
                }
            methodAndItsReturn.put(varName, returnType);
        }

        public Integer getNumber() {
            return this.numberScope;
        }


        public VariableTable getCopy(){
            VariableTable t = new VariableTable();
            for(String k : variablesAndTypes.keySet()){
                t.addVariable(k, variablesAndTypes.get(k));
                if (variablesDeclared.get(k)) {
                    t.useVariable(k);
                }
                if (variablesAndTypes.get(k).equals("method")) {
                    String returnT = methodAndItsReturn.get(k) == null? "null" : methodAndItsReturn.get(k);
                    if (methodsAndTypesOfParameters.get(k) != null) {
                        for (Pair pair : methodsAndTypesOfParameters.get(k)) {
                            t.addMethod(k, "method", pair, returnT);
                        }
                    }
                }
            }
            return t;
        }

        public boolean containsVariable(String varName) {
            return variablesAndTypes.containsKey(varName);
        }

        public void useVariable(String varName) {
            variablesDeclared.put(varName, true);
        }

    }

    @Override
    public Void visitProgram(OLanguageParser.ProgramContext ctx) {
        VariableTable globalScope = new VariableTable(scopeNumber);
        globalVariableScopes.push(globalScope);
        scopeNumber += 1;

        VariableTable integerClass = new VariableTable();
        integerClass.addVariable("Min", "Integer");
        integerClass.addVariable("Max", "Integer");
        integerClass.addMethod("toReal", "method", new Pair (0, new ArrayList<>()), "Real");
        integerClass.addMethod("toBoolean", "method", new Pair (0, new ArrayList<>()), "Boolean");
        integerClass.addMethod("UnaryMinus", "method", new Pair (0, new ArrayList<>()), "Integer");
        ArrayList<String> arrayWithOneInteger = new ArrayList<>();
        ArrayList<String> arrayWithOneReal = new ArrayList<>();
        ArrayList<String> arrayWithOneBoolean = new ArrayList<>();
        ArrayList<String> arrayWithOneArray = new ArrayList<>();
        ArrayList<String> arrayWithOneList = new ArrayList<>();
        arrayWithOneInteger.add("Integer");
        arrayWithOneReal.add("Real");
        arrayWithOneArray.add("Array");
        arrayWithOneBoolean.add("Boolean");
        arrayWithOneList.add("List");
        integerClass.addMethod("PrintResult", "method", new Pair (1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Plus", "method", new Pair (1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Plus", "method", new Pair (1, arrayWithOneReal), "Real");
        integerClass.addMethod("Minus", "method", new Pair (1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Minus", "method", new Pair (1, arrayWithOneReal), "Real");
        integerClass.addMethod("Mult", "method", new Pair (1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Mult", "method", new Pair (1, arrayWithOneReal), "Real");
        integerClass.addMethod("Div", "method", new Pair (1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Div", "method", new Pair (1, arrayWithOneReal), "Real");
        integerClass.addMethod("Rem", "method", new Pair (1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Less", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        integerClass.addMethod("Less", "method", new Pair (1, arrayWithOneReal), "Boolean");
        integerClass.addMethod("LessEqual", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        integerClass.addMethod("LessEqual", "method", new Pair (1, arrayWithOneReal), "Boolean");
        integerClass.addMethod("Greater", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        integerClass.addMethod("Greater", "method", new Pair (1, arrayWithOneReal), "Boolean");
        integerClass.addMethod("GreaterEqual", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        integerClass.addMethod("GreaterEqual", "method", new Pair (1, arrayWithOneReal), "Boolean");
        integerClass.addMethod("Equal", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        integerClass.addMethod("Equal", "method", new Pair (1, arrayWithOneReal), "Boolean");
        integerClass.addMethod("this", "method", new Pair (1, arrayWithOneInteger), "null");
        integerClass.addMethod("this", "method", new Pair (1, arrayWithOneReal), "null");

        classesAndItsVariablesAndMethods.put("Integer", integerClass);
        VariableTable realClass = new VariableTable();
        realClass.addVariable("Min", "Real");
        realClass.addVariable("Max", "Real");
        realClass.addVariable("Epsilon", "Real");
        realClass.addMethod("toInteger", "method", new Pair(0, new ArrayList<>()), "Integer");
        realClass.addMethod("UnaryMinus", "method", new Pair(0, new ArrayList<>()), "Real");
        realClass.addMethod("Plus", "method", new Pair (1, arrayWithOneInteger), "Real");
        realClass.addMethod("Plus", "method", new Pair (1, arrayWithOneReal), "Real");
        realClass.addMethod("Minus", "method", new Pair (1, arrayWithOneInteger), "Real");
        realClass.addMethod("Minus", "method", new Pair (1, arrayWithOneReal), "Real");
        realClass.addMethod("Mult", "method", new Pair (1, arrayWithOneInteger), "Real");
        realClass.addMethod("Mult", "method", new Pair (1, arrayWithOneReal), "Real");
        realClass.addMethod("Div", "method", new Pair (1, arrayWithOneInteger), "Real");
        realClass.addMethod("Div", "method", new Pair (1, arrayWithOneReal), "Real");
        realClass.addMethod("Rem", "method", new Pair (1, arrayWithOneInteger), "Real");
        realClass.addMethod("Less", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        realClass.addMethod("Less", "method", new Pair (1, arrayWithOneReal), "Boolean");
        realClass.addMethod("LessEqual", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        realClass.addMethod("LessEqual", "method", new Pair (1, arrayWithOneReal), "Boolean");
        realClass.addMethod("Greater", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        realClass.addMethod("Greater", "method", new Pair (1, arrayWithOneReal), "Boolean");
        realClass.addMethod("GreaterEqual", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        realClass.addMethod("GreaterEqual", "method", new Pair (1, arrayWithOneReal), "Boolean");
        realClass.addMethod("Equal", "method", new Pair (1, arrayWithOneInteger), "Boolean");
        realClass.addMethod("Equal", "method", new Pair (1, arrayWithOneReal), "Boolean");
        realClass.addMethod("this", "method", new Pair (1, arrayWithOneInteger), "null");
        realClass.addMethod("this", "method", new Pair (1, arrayWithOneReal), "null");

        classesAndItsVariablesAndMethods.put("Real", realClass);
        VariableTable booleanClass = new VariableTable();
        booleanClass.addMethod("toInteger", "method", new Pair(0, new ArrayList<>()), "Integer");
        booleanClass.addMethod("Or", "method", new Pair(1, arrayWithOneBoolean), "Boolean");
        booleanClass.addMethod("And", "method", new Pair(1, arrayWithOneBoolean), "Boolean");
        booleanClass.addMethod("Xor", "method", new Pair(1, arrayWithOneBoolean), "Boolean");
        booleanClass.addMethod("Not", "method", new Pair(0, new ArrayList<>()), "Boolean");
        booleanClass.addMethod("this", "method", new Pair(1, arrayWithOneBoolean), "null");
        classesAndItsVariablesAndMethods.put("Boolean", booleanClass);
        VariableTable arrayClass = new VariableTable();
        ArrayList<String> arrayListNew = new ArrayList<>();
        arrayListNew.add("Integer");
        arrayListNew.add("Generic");
        arrayClass.addMethod("toList", "method", new Pair(0, new ArrayList<>()), "List");
        arrayClass.addMethod("Length", "method", new Pair(0, new ArrayList<>()), "Integer");
        arrayClass.addMethod("get", "method", new Pair(1, arrayWithOneInteger), "Boolean");
        arrayClass.addMethod("set", "method", new Pair(2, arrayListNew), "null");
        arrayClass.addMethod("this", "method", new Pair(1, arrayWithOneInteger), "null");
        classesAndItsVariablesAndMethods.put("Array", arrayClass);
        VariableTable listClass = new VariableTable();
        listClass.addMethod("this", "method", new Pair(0, new ArrayList<>()), "null");
        listClass.addMethod("head", "method", new Pair(0, new ArrayList<>()), "null");
        listClass.addMethod("tail", "method", new Pair(0, new ArrayList<>()), "null");
        arrayListNew.remove("Integer");
        listClass.addMethod("this", "method", new Pair(1, arrayListNew), "null");
        listClass.addMethod("append", "method", new Pair(1, arrayListNew), "null");
        arrayListNew.add("Integer");
        listClass.addMethod("this", "method", new Pair(2, arrayListNew), "null");
        classesAndItsVariablesAndMethods.put("List", listClass);
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitClassDeclaration(OLanguageParser.ClassDeclarationContext ctx) {
        String className = ctx.className(0).getText();
        if (globalVariableScopes.peek().containsVariable(className) ) {
            throw new SemanticErrorException("Class with name " + className + " is already declared.");
        }
        globalVariableScopes.peek().addVariable(className, "class");
        VariableTable globalScope = new VariableTable(scopeNumber);
        scopeNumber += 1;
        globalVariableScopes.push(globalScope);
        visitChildren(ctx);
        VariableTable arrayOfVandM;
        String classNameExtended;
        if (ctx.className(1) != null) {
            classNameExtended = ctx.className(1).getText();
            inheritance.put(className, classNameExtended);
            arrayOfVandM = classesAndItsVariablesAndMethods.get(classNameExtended).getCopy();
            VariableTable t = globalVariableScopes.peek();
            for (String key : t.variablesAndTypes.keySet()) {
                if (t.variablesAndTypes.get(key).equals("method")) {
                    if (t.methodsAndTypesOfParameters.get(key) != null) {
                        for (Pair pair : t.methodsAndTypesOfParameters.get(key)) {
                            arrayOfVandM.addMethod(key, "method", pair, t.methodAndItsReturn.get(key));
                        }
                    }
                }
            }

        }
        else
            arrayOfVandM = globalVariableScopes.peek();
        if (arrayOfVandM.methodsAndTypesOfParameters.get("this") == null)
            arrayOfVandM.addMethod("this", "method", new Pair(0, new ArrayList<>()), "null");
        classesAndItsVariablesAndMethods.put(className, arrayOfVandM);
        globalVariableScopes.pop();
        return null;
    }

    @Override
    public Void visitMethodDeclaration(OLanguageParser.MethodDeclarationContext ctx) {
        String methodName = ctx.identifierToken().getText();
        ArrayList<String> typesOfParams = new ArrayList<>();
        VariableTable globalScope = new VariableTable(scopeNumber);
        OLanguageParser.ParametersContext params = ctx.parameters();
        if (params != null) {
            for (OLanguageParser.ParameterDeclarationContext param : params.parameterDeclaration()) {
                String paramName = param.identifierToken().getText();

                if (globalScope.containsVariable(paramName)) {
                    throw new SemanticErrorException("Parameter with name " + paramName + " is already declared.");
                }

                globalScope.addVariable(paramName, param.className().getText());
                typesOfParams.add(param.className().getText());
            }
        }
        if (globalVariableScopes.peek().containsVariable(methodName)) {
            VariableTable t = globalVariableScopes.peek().getCopy();
            ArrayList<Pair> listOfPairs = t.methodsAndTypesOfParameters.get(methodName);
            for (Pair pair : listOfPairs) {
                if (pair.getNumberOfParams() == typesOfParams.size() && pair.getTypesOfParams().equals(typesOfParams))
                    throw new SemanticErrorException("Method " + methodName + " with these parameters is already declared.");
            }
        }
        neededReturnType = ctx.className() != null? ctx.className().getText() : null;
        globalVariableScopes.peek().addMethod(methodName, "method", new Pair(typesOfParams.size(), typesOfParams), neededReturnType);

        scopeNumber += 1;
        globalVariableScopes.push(globalScope);
        insideMethod = true;
        visitChildren(ctx);
        insideMethod = false;
        neededReturnType = null;
        Map<String, Boolean> variablesDeclaredInScope = globalVariableScopes.peek().variablesDeclared;
        Set<String> keys = variablesDeclaredInScope.keySet();
        for (String key : keys) {
                if (!variablesDeclaredInScope.get(key)) {
                    if (unusedVariables.get(globalVariableScopes.peek().getNumber()) == null) {
                        ArrayList<String> newArray = new ArrayList<>();
                        newArray.add(key);
                        unusedVariables.put(globalVariableScopes.peek().getNumber(), newArray);
                    }
                    else {
                        unusedVariables.get(globalVariableScopes.peek().getNumber()).add(key);
                    }

                }
            }

        globalVariableScopes.pop();


        return null;
    }
    @Override
    public Void visitArguments(OLanguageParser.ArgumentsContext ctx) {
        ArrayList<Pair> pairs = stackOfMethods.peek();
        ArrayList<String> types = new ArrayList<>();
        OLanguageParser.ExpressionContext parent = (OLanguageParser.ExpressionContext) ctx.getParent();
        if (parent.identifierToken() != null) {
            if (ctx.getChildCount() == 2) {
                boolean flag = false;
                for (Pair pair : pairs) {
                    if (pair.getNumberOfParams().equals(0)) {
                        if (pair.getTypesOfParams().isEmpty())
                            flag = true;
                    }
                }
//                if (!flag)
//                    throw new SemanticErrorException("Arguments type not related to required ones: " + ctx.getText());

            } else {
                for (int i = 1; i < ctx.getChildCount(); i = i + 2) {

                    if (ctx.getChild(i).getChildCount() != 1) {

                        types.add(returnExpressionType(ctx.expression(i / 2 + 1)));
                    } else {
                        if (ctx.expression(i / 2).primary().integerToken() != null)
                            types.add("Integer");
                        else if ((ctx.expression(i / 2).primary().realToken() != null))
                            types.add("Real");
                        else if ((ctx.expression(i / 2).primary().booleanLiteral() != null))
                            types.add("Boolean");
                        else if (ctx.expression(i / 2).getText().startsWith("Array["))
                            types.add("Array");
                        else if (ctx.expression(i / 2).primary().getText().startsWith("List["))
                            types.add("List");
                        else
                            types.add(getVariableType(ctx.expression(i / 2).primary().getText()));
                    }
                }
                boolean flag = false;
                for (Pair pair : pairs) {
                    if (pair.getNumberOfParams().equals(types.size())) {
                        if (pair.getTypesOfParams().equals(types))
                            flag = true;
                    }
                }

//                if (!flag)
//                    throw new SemanticErrorException("Arguments type not related to required ones: " + ctx.getText());
            }
        }
        visitChildren(ctx);
        stackOfMethods.pop();
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
        Stack<VariableTable> globalVariableScopesCopy = new Stack<>();
        boolean isDefined = false;
        while (!globalVariableScopes.isEmpty()) {
            if (globalVariableScopes.peek().containsVariable(ident)) {
                isDefined = true;
                globalVariableScopes.peek().useVariable(ident);
                break;
            }
            globalVariableScopesCopy.push(globalVariableScopes.peek());
            globalVariableScopes.pop();
        }
        while (!globalVariableScopesCopy.isEmpty()) {
            globalVariableScopes.push(globalVariableScopesCopy.peek());
            globalVariableScopesCopy.pop();
        }
        if (!isDefined)
            throw new SemanticErrorException("Variable " + ident + " is not declared yet");

        String assignLeftType = getVariableType(ident);
        if ((assignLeftType.equals("Integer") || assignLeftType.equals("Real"))
                && ((returnExpressionType(ctx.expression()).equals("Real"))
                 || (returnExpressionType(ctx.expression()).equals("Integer"))))
            visitChildren(ctx);
        else if (assignLeftType.equals(returnExpressionType(ctx.expression()))) {
            visitChildren(ctx);
        }
        else if (!isChild( returnExpressionType(ctx.expression()), assignLeftType))
            throw new SemanticErrorException("Type Checking: Trying to assign " + returnExpressionType(ctx.expression()) + " to variable with type " + assignLeftType);
        else
            visitChildren(ctx);
        return null;
    }
    public boolean isChild(String left, String right) {
        if (inheritance.get(left) == null) {
            return false;
        }
        else if (inheritance.get(left).equals(right)) {
            return true;
        }
        else
            return isChild(inheritance.get(left), right);
    }
    public String returnExpressionType(OLanguageParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            if (ctx.primary().integerToken() != null) {
                return "Integer";
            }
            else if (ctx.primary().realToken() != null) {
                return "Real";
            }
            else if (ctx.primary().booleanLiteral() != null) {
                return "Boolean";
            }
            else if (ctx.primary().getText().startsWith("Array[")) {
                return "Array";
            }
            else if (ctx.primary().getText().startsWith("List[")) {
                return "List";
            }
            else {
                return getVariableType(ctx.primary().getText());
            }
        }
        else if (classesAndItsVariablesAndMethods.get(ctx.primary().getText()) != null) {

            return ctx.primary().getText();
        }
        return getFunctionReturnType(getVariableType(ctx.getChild(0).getText()), ctx.getChild(2).getText());
    }

    public String getFunctionReturnType(String className, String function) {
        String returnType = "unknown";

        if (classesAndItsVariablesAndMethods.get(className) != null) {
            VariableTable t = classesAndItsVariablesAndMethods.get(className);
            if (t.methodAndItsReturn.get(function) != null)
            {
                returnType = t.methodAndItsReturn.get(function);
            }
        }
        if (returnType.equals("unknown")) {
            throw new SemanticErrorException("Object of class " + className + " doesnot have method " + function);
        }
        return returnType;
    }

    @Override
    public Void visitBooleanClassToken(OLanguageParser.BooleanClassTokenContext ctx) {
         visitChildren(ctx);
         return null;
    }

    @Override
    public Void visitConstructorDeclaration(OLanguageParser.ConstructorDeclarationContext ctx) {
        OLanguageParser.ParametersContext params = ctx.parameters();
        if (params != null) {
            for (OLanguageParser.ParameterDeclarationContext param : params.parameterDeclaration()) {
                String paramName = param.identifierToken().getText();

                if (globalVariableScopes.peek().containsVariable(paramName)) {
                    throw new SemanticErrorException("Parameter with name " + paramName + " is already declared.");
                }

                globalVariableScopes.peek().addVariable(paramName, param.className().getText());
            }
            globalVariableScopes.peek().addVariable("this", "method");
        }
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
        VariableTable globalScope = new VariableTable(scopeNumber);
        scopeNumber += 1;
        globalVariableScopes.push(globalScope);
        visitChildren(ctx);
        globalVariableScopes.pop();
        return null;
    }

    @Override
    public Void visitVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx) {
        String varName = ctx.identifierToken().getText();

        if (globalVariableScopes.peek().containsVariable(varName)) {
            throw new SemanticErrorException("Variable with name " + varName + " is already defined in this scope.");
        } else {
            if (ctx.expression().primary().integerToken() != null)
                globalVariableScopes.peek().addVariable(varName, "Integer");
            else if (ctx.expression().primary().realToken() != null)
                globalVariableScopes.peek().addVariable(varName, "Real");
            else if (ctx.expression().primary().booleanLiteral() != null)
                globalVariableScopes.peek().addVariable(varName, "Boolean");
            else if (ctx.expression().primary().getText().startsWith("Array[")) {
                globalVariableScopes.peek().addVariable(varName, "Array");
            }
            else if (ctx.expression().primary().getText().startsWith("List["))
                globalVariableScopes.peek().addVariable(varName, "List");
            else if (ctx.expression().getChildCount() == 1) {
                globalVariableScopes.peek().addVariable(varName, getVariableType(ctx.expression().primary().getText()));
            }
            else if (classesAndItsVariablesAndMethods.get(ctx.expression().primary().getText()) != null) {
                String type = ctx.expression().primary().getText();
                globalVariableScopes.peek().addVariable(varName, type);
            }
            else {
                globalVariableScopes.peek().addVariable(varName, getVariableType(varName));
            }

        }
        visitChildren(ctx);
        return null;
    }

    public String getVariableType(String varName) {
        String varType = "unknown";
        Stack<VariableTable> globalVariableScopesCopy = new Stack<>();
        while (!globalVariableScopes.isEmpty()) {
            if (globalVariableScopes.peek().containsVariable(varName)) {
                varType = globalVariableScopes.peek().variablesAndTypes.get(varName);
                break;
            }
            globalVariableScopesCopy.push(globalVariableScopes.peek());
            globalVariableScopes.pop();
        }
        while (!globalVariableScopesCopy.isEmpty()) {
            globalVariableScopes.push(globalVariableScopesCopy.peek());
            globalVariableScopesCopy.pop();
        }
        return varType;
    }

    @Override
    public Void visitExpression(OLanguageParser.ExpressionContext ctx) {
        String classNameOfPrimary;
        if (ctx.primary().integerToken() != null)
            classNameOfPrimary = "Integer";
        else if (ctx.primary().realToken() != null)
            classNameOfPrimary = "Real";
        else if (ctx.primary().booleanLiteral() != null)
            classNameOfPrimary = "Boolean";
        else if (ctx.primary().getText().startsWith("Array["))
            classNameOfPrimary = "Array";
        else if (ctx.primary().getText().startsWith("List["))
            classNameOfPrimary = "List";
        else if (ctx.getChildCount() == 1)
            classNameOfPrimary = getVariableType(ctx.primary().getText());
        else
            classNameOfPrimary = getVariableType(ctx.primary().getText());
        String identifierName = ctx.getChild(2) == null? null : ctx.getChild(2).getText();
        if (identifierName != null && (classesAndItsVariablesAndMethods.get(classNameOfPrimary) != null) &&
                classesAndItsVariablesAndMethods.get(classNameOfPrimary).variablesAndTypes.get(identifierName) == null) {
            throw new SemanticErrorException("Method " + identifierName + " is not declared for class " + classNameOfPrimary);
        }
        if (ctx.getChildCount() != 1) {
            String className;
            if (ctx.getChild(0).getText().equals("Integer"))
                className = "Integer";
            else if (ctx.getChild(0).getText().equals("Boolean"))
                className = "Boolean";
            else if (ctx.getChild(0).getText().equals("Real"))
                className = "Real";
            else if (ctx.getChild(0).getText().startsWith("Array"))
                className = "Array";
            else if (ctx.getChild(0).getText().startsWith("List"))
                className = "List";
            else if (classesAndItsVariablesAndMethods.get(ctx.getChild(0).getText()) != null)
                className = ctx.getChild(0).getText();
            else
                className = getVariableType(ctx.getChild(0).getText());
            if (classesAndItsVariablesAndMethods.get(className) != null) {
                VariableTable t = classesAndItsVariablesAndMethods.get(className);
                if (t.containsVariable(ctx.getChild(2).getText())) {
                    ArrayList<Pair> listOfTypesOfArgs = t.methodsAndTypesOfParameters.get(ctx.getChild(2).getText());
                    stackOfMethods.push(listOfTypesOfArgs);
                }
            }
        }
        visitChildren(ctx);

        return null;
    }

    @Override
    public Void visitPrimary(OLanguageParser.PrimaryContext ctx) {

        String primaryName = ctx.className() == null? ctx.getText() : ctx.className().getText();
        Stack<VariableTable> globalVariableScopesCopy = new Stack<>();
        boolean isDefined = false;
        while (!globalVariableScopes.isEmpty()) {
            if (globalVariableScopes.peek().containsVariable(primaryName)) {
                isDefined = true;
                globalVariableScopes.peek().useVariable(primaryName);
                break;
            }
            globalVariableScopesCopy.push(globalVariableScopes.peek());
            globalVariableScopes.pop();
        }
        while (!globalVariableScopesCopy.isEmpty()) {
            globalVariableScopes.push(globalVariableScopesCopy.peek());
            globalVariableScopesCopy.pop();
        }
        if (ctx.className() != null && !primaryName.startsWith("Array") && !primaryName.startsWith("List") &&
                !isDefined && !primaryName.equals("Integer") && !primaryName.equals("Real") && !primaryName.equals("Boolean")) {
            throw new SemanticErrorException("Reference to undefined class or variable: " + ctx.className().getText());
        }
        return null;
    }

    // Метод для посещения всех детей узла
    public Void visitChildren(RuleNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            visit(node.getChild(i));
        }
        return null;
    }
}
