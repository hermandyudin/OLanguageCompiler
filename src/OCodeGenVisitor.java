import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class OCodeGenVisitor extends OLanguageBaseVisitor<Void> {

    private boolean insideMethod = false;
    private String currentClass;
    private int currentClassVariablesCount;
    private ArrayList<String> currentClassVariables = new ArrayList<>();
    private int astore;
    private ArrayList<Pair> parametersAndItsTypes = new ArrayList<>();

    public String getCurrentClass() {
        return this.currentClass;
    }
    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }
    private String currentExtengingClass = "java/lang/Object";
    public String getCurrentExtengingClass() {
        return this.currentExtengingClass;
    }
    public void setCurrentExtengingClass(String currentExtengingClass) {
        this.currentExtengingClass = currentExtengingClass;
    }

    private Stack<VariableTable> globalVariableScopes = new Stack<>();
    private HashMap<Integer, ArrayList<String>> unusedVariables = new HashMap<>();
    String neededReturnType = null;
    private Integer scopeNumber = 0;

    private HashMap<String, VariableTable> classesAndItsVariablesAndMethods = new HashMap<>();

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
        integerClass.addMethod("PrintResult", "method", new Pair(1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Plus", "method", new Pair (1, arrayWithOneInteger), "Integer");
        integerClass.addMethod("Minus", "method", new Pair (1, arrayWithOneInteger), "Integer");
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
        setCurrentExtengingClass("java/lang/Object");
        currentClassVariables = new ArrayList<>();
        setCurrentClass(className);
        globalVariableScopes.peek().addVariable(className, "class");
        VariableTable globalScope = new VariableTable(scopeNumber);
        scopeNumber += 1;
        globalVariableScopes.push(globalScope);
        jasminCode.append(".class public ").append(className).append("\n");
        if (ctx.className(1) != null)
            setCurrentExtengingClass(ctx.className(1).getText());
        jasminCode.append(".super "+ getCurrentExtengingClass() + "\n\n");
        Boolean noConstructors = true;
        for (OLanguageParser.MemberDeclarationContext memberDeclarationContext : ctx.memberDeclaration()) {
            if (memberDeclarationContext.constructorDeclaration() != null && memberDeclarationContext.constructorDeclaration().parameters() == null) {
                noConstructors = false;
            }
        }

        for (OLanguageParser.MemberDeclarationContext memberDeclarationContext : ctx.memberDeclaration()) {
            if (memberDeclarationContext.variableDeclaration() != null) {
                visit(memberDeclarationContext.variableDeclaration());
                currentClassVariablesCount += 1;
                currentClassVariables.add(memberDeclarationContext.variableDeclaration().identifierToken().getText());
            }
        }
        if (noConstructors)
        {
            jasminCode.append(".method public <init>(");
            jasminCode.append(")V\n");
            jasminCode.append("aload 0\n");
            jasminCode.append("invokenonvirtual " + getCurrentExtengingClass() + "/<init>()V\n");
            jasminCode.append("return\n");
            jasminCode.append(".end method\n\n");
        }
        for (OLanguageParser.MemberDeclarationContext memberDeclarationContext : ctx.memberDeclaration()) {
            if (memberDeclarationContext.constructorDeclaration() != null) {
                visit(memberDeclarationContext.constructorDeclaration());
            }
        }
        for (OLanguageParser.MemberDeclarationContext memberDeclarationContext : ctx.memberDeclaration()) {
            if (memberDeclarationContext.methodDeclaration() != null) {
                visit(memberDeclarationContext.methodDeclaration());
            }
        }

        VariableTable arrayOfVandM;
        String classNameExtended;
        if (ctx.className(1) != null) {
            classNameExtended = ctx.className(1).getText();
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
        parametersAndItsTypes = new ArrayList<>();
        String methodName = ctx.identifierToken().getText();
        String returnType = "V";
        if (ctx.className() != null)
            returnType = determineType(ctx.className());

        jasminCode.append(".method public ").append(methodName).append("(");

        // Visit parameters
        if (ctx.parameters() != null)
            visit(ctx.parameters());
        jasminCode.append(")").append(returnType).append("\n\n");
        jasminCode.append(".limit locals 30\n");
        jasminCode.append(".limit stack 30\n");
        // Visit method body
        ArrayList<String> typesOfParams = new ArrayList<>();
        VariableTable globalScope = new VariableTable(scopeNumber);
        OLanguageParser.ParametersContext params = ctx.parameters();
        if (params != null) {
            for (OLanguageParser.ParameterDeclarationContext param : params.parameterDeclaration()) {
                String paramName = param.identifierToken().getText();


                globalScope.addVariable(paramName, param.className().getText());
                typesOfParams.add(param.className().getText());
            }
        }
        if (globalVariableScopes.peek().containsVariable(methodName)) {
            VariableTable t = globalVariableScopes.peek().getCopy();
            ArrayList<Pair> listOfPairs = t.methodsAndTypesOfParameters.get(methodName);

        }
        neededReturnType = ctx.className() != null? ctx.className().getText() : null;
        globalVariableScopes.peek().addMethod(methodName, "method", new Pair(typesOfParams.size(), typesOfParams), neededReturnType);

        scopeNumber += 1;
        globalVariableScopes.push(globalScope);
        insideMethod = true;
        visit(ctx.body());

        if (returnType.equals("V"))
            jasminCode.append("return\n");
        else
            jasminCode.append("areturn\n");

        jasminCode.append(".end method\n\n");
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

    private String determineType(RuleNode typeNode) {
        String typeText = typeNode.getText();
        switch (typeText) {
            case "Integer":
                return "LInteger;";
            case "Real":
                return "LReaL;";
            case "Boolean":
                return "LBoolean;";
            default:
                return "L" + typeText;
        }
    }

    @Override
    public Void visitArguments(OLanguageParser.ArgumentsContext ctx) {

        for (OLanguageParser.ExpressionContext expressionContext : ctx.expression()) {
            String type;
            if (expressionContext.primary().integerToken() != null) {
                type = "LInteger;";
            }
            else if (expressionContext.primary().realToken() != null) {
                type = "LReal;";
            }
            else if (expressionContext.primary().booleanLiteral() != null) {
                type = "LBoolean;";
            }
            else if (expressionContext.primary().getText().startsWith("Array[")) {
                type = "LArray;";
            }
            else if (expressionContext.primary().getText().startsWith("List[")) {
                type = "List;";
            }
            else if (expressionContext.getChildCount() == 1) {
                type = "L" + getVariableType(expressionContext.primary().getText()) + ";";
            }
            else if (classesAndItsVariablesAndMethods.get(expressionContext.primary().getText()) != null) {
                type = "L" + expressionContext.primary().getText() + ";";
            }
            else {
                type = "L"+ classesAndItsVariablesAndMethods.get(getVariableType(expressionContext.primary().getText())).methodAndItsReturn.get(expressionContext.identifierToken(1).getText()) + ";";
            }
            jasminCode.append(type);
        }
        return null;
    }

    @Override
    public Void visitBody(OLanguageParser.BodyContext ctx) {
        // Assuming body is a sequence of statements, visit each statement
        astore = 0;
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
        if ((ctx.expression().primary().booleanLiteral()
                != null || ctx.expression().primary().realToken() != null || ctx.expression().primary().integerToken() != null)) {
            String classOrType;
            if (ctx.expression().primary().booleanLiteral() != null)
                classOrType = "Boolean";
            else if (ctx.expression().primary().integerToken() != null)
                classOrType = "Integer";
            else
                classOrType = "Real";
            jasminCode.append("new ").append(classOrType).append("\n").append("dup\n").append("sipush ").append(ctx.expression().primary().getText());
            jasminCode.append("\n").append("invokespecial ").append(classOrType).append("/<init>(");
            jasminCode.append("I");
            jasminCode.append(")V\n");
            ArrayList<String> newArray = new ArrayList<>();
            newArray.add(ctx.expression().primary().getText());
            newArray.add(currentClass);
            jasminCode.append("astore ").append(String.valueOf(parametersAndItsTypes.size() + 1)).append("\n");
            parametersAndItsTypes.add(new Pair(parametersAndItsTypes.size() + 1, newArray));

        }
        // Assuming assignments are of the form 'variable := expression'
        String variable = ctx.identifierToken().getText();// Visit the expression to get its value
        Boolean flag = false;
        for (String var : currentClassVariables) {
            if (variable.equals(var)) {
                jasminCode.append("aload 0\n");
                visit(ctx.expression());
                jasminCode.append("putfield ").append(currentClass).append("/").append(var).append(" L").append(getVariableType(var)).append(";\n");
                flag = true;
                break;
            }
        }
        if (!flag) {
            for (int i = 0; i < parametersAndItsTypes.size(); i++) {
                if (parametersAndItsTypes.get(i).typesOfParams.get(0).equals(ctx.identifierToken().getText())) {
                    visit(ctx.expression());
                    jasminCode.append("astore ").append((parametersAndItsTypes.get(i).numberOfParams)).append("\n");
                    break;
                }
            }
        }



        return null;
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
        return returnType;
    }

    @Override
    public Void visitBooleanClassToken(OLanguageParser.BooleanClassTokenContext ctx) {
        // Assuming boolean class is used, create an instance of the Boolean class
        String booleanClassName = ctx.getText();
        jasminCode.append("new ").append(booleanClassName).append("\n")
                .append("dup\n")
                .append("invokespecial ").append(booleanClassName).append("/<init>()V \n");
        return null;
    }

    @Override
    public Void visitConstructorDeclaration(OLanguageParser.ConstructorDeclarationContext ctx) {

        parametersAndItsTypes = new ArrayList<>();
        jasminCode.append(".method public <init>(");
        if (ctx.parameters() != null)
            visit(ctx.parameters());
        jasminCode.append(")V\n");
        jasminCode.append(".limit locals 30\n");
        jasminCode.append(".limit stack 30\n");
        jasminCode.append("aload 0\n");
        jasminCode.append("invokenonvirtual " + getCurrentExtengingClass() + "/<init>()V\n");
        visit(ctx.body());
        jasminCode.append("return\n");
        jasminCode.append(".end method\n\n");
        return null;
    }

    @Override
    public Void visitBooleanLiteral(OLanguageParser.BooleanLiteralContext ctx) {
        // Assuming boolean literals are used, push their values onto the stack
        String booleanValue = ctx.getText();
        jasminCode.append("ldc ").append(booleanValue).append(" ; Load boolean literal ").append(booleanValue).append("\n");
        return null;
    }
    @Override
    public Void visitClassName(OLanguageParser.ClassNameContext ctx) {
        // Assuming class names are used to instantiate objects, create an instance of the class
        String className = ctx.getText();
        jasminCode.append("new ").append(className).append("\n")
                .append("dup\n")
                .append("invokespecial ").append(className).append("/<init>()V ; Call the default constructor\n");
        return null;
    }

    @Override
    public Void visitIdentifierToken(OLanguageParser.IdentifierTokenContext ctx) {
        // Assuming identifiers are used as variable names, push their values onto the stack
        String identifier = ctx.getText();
        jasminCode.append("aload 0 \n")
                .append("getfield ").append(identifier);
        return null;
    }

    @Override
    public Void visitIfStatement(OLanguageParser.IfStatementContext ctx) {
        String elseLabel = "ElseLabel" + uniqueLabelId();
        String endLabel = "EndLabel" + uniqueLabelId();

        // Visit the condition expression
        visit(ctx.expression());
        jasminCode.append("invokevirtual Boolean/GetValue()I\n");
        // ifeq means "if equal to zero" (i.e., if the condition is false)
        jasminCode.append("ifeq ").append(elseLabel).append("\n");

        // Visit the 'then' block
        visit(ctx.body(0));

        // Unconditional jump to the end of the if statement
        jasminCode.append("goto ").append(endLabel).append("\n");

        // Label for the 'else' block
        jasminCode.append(elseLabel).append(":\n");

        // Visit the 'else' block if it exists
        if (ctx.body().size() > 1) {
            visit(ctx.body(1));
        }

        // Label for the end of the if statement
        jasminCode.append(endLabel).append(":\n");

        return null;
    }

    @Override
    public Void visitIntegerClassToken(OLanguageParser.IntegerClassTokenContext ctx) {
        // Assuming integer class is used, create an instance of the Integer class
        String integerClassName = ctx.getText();
        jasminCode.append("new ").append(integerClassName).append("\n")
                .append("dup\n")
                .append("invokespecial ").append(integerClassName).append("/<init>()V ; Call the default constructor\n");
        return null;
    }

    @Override
    public Void visitIntegerToken(OLanguageParser.IntegerTokenContext ctx) {
        // Assuming integer tokens are used as literals, push their values onto the stack
        String integerValue = ctx.getText();
        jasminCode.append("ldc ").append(integerValue).append(" ; Load integer literal ").append(integerValue).append("\n");
        return null;
    }

    @Override
    public Void visitMemberDeclaration(OLanguageParser.MemberDeclarationContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitParameters(OLanguageParser.ParametersContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitParameterDeclaration(OLanguageParser.ParameterDeclarationContext ctx) {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add(ctx.identifierToken().getText());
        newArray.add(determineType(ctx.className()));
        parametersAndItsTypes.add(new Pair(parametersAndItsTypes.size() + 1, newArray));
        jasminCode.append(determineType(ctx.className()));
        return null;
    }

    @Override
    public Void visitRealClassToken(OLanguageParser.RealClassTokenContext ctx) {
        // Assuming real class is used, create an instance of the Double class
        String realClassName = ctx.getText();
        jasminCode.append("new ").append(realClassName).append("\n")
                .append("dup\n")
                .append("invokespecial ").append(realClassName).append("/<init>()V ; Call the default constructor\n");
        return null;
    }

    @Override
    public Void visitRealToken(OLanguageParser.RealTokenContext ctx) {
        // Assuming real tokens are used as literals, push their values onto the stack
        String realValue = ctx.getText();
        jasminCode.append("ldc ").append(realValue).append(" ; Load real literal ").append(realValue).append("\n");
        return null;
    }

    @Override
    public Void visitReturnStatement(OLanguageParser.ReturnStatementContext ctx) {
        visitChildren(ctx);

        return null;
    }

    public Void visitStatement(OLanguageParser.StatementContext ctx) {
        // Assuming a statement is one of the possible statement types
        if (ctx.assignment() != null) {
            visitAssignment(ctx.assignment());
        } else if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        } else if (ctx.whileLoop() != null) {
            visitWhileLoop(ctx.whileLoop());
        } else if (ctx.ifStatement() != null) {
            visitIfStatement(ctx.ifStatement());
        } else if (ctx.returnStatement() != null) {
            visitReturnStatement(ctx.returnStatement());
        }
        return null;
    }

    private int loopLabelIndex = 0;

    @Override
    public Void visitWhileLoop(OLanguageParser.WhileLoopContext ctx) {
        VariableTable globalScope = new VariableTable(scopeNumber);
        scopeNumber += 1;
        globalVariableScopes.push(globalScope);
        String loopStartLabel = "WhileLoopStart" + loopLabelIndex;
        loopLabelIndex++;

        // Generate a unique label for the end of the loop
        String loopEndLabel = "WhileLoopEnd" + loopLabelIndex;
        loopLabelIndex++;

        jasminCode.append(loopStartLabel).append(":\n");
        // Emit code for the loop condition
        visit(ctx.expression());

        // Jump to the end of the loop if the condition is false
        jasminCode.append("ifeq ").append(loopEndLabel).append("\n");

        // Emit code for the loop body
        visit(ctx.body());

        // Jump back to the start of the loop
        jasminCode.append("goto ").append(loopStartLabel).append("\n");

        // Mark the end of the loop
        jasminCode.append(loopEndLabel).append(":\n");

        globalVariableScopes.pop();
        return null;
    }

    @Override
    public Void visitVariableDeclaration(OLanguageParser.VariableDeclarationContext ctx) {
        if (ctx.getChildCount() == 0)
            return null;
        String varName = ctx.identifierToken().getText();
        String type;
        if (ctx.expression().primary().integerToken() != null) {
            globalVariableScopes.peek().addVariable(varName, "Integer");
            type = "Integer";
        } else if (ctx.expression().primary().realToken() != null) {
            globalVariableScopes.peek().addVariable(varName, "Real");
            type = "Real";
        } else if (ctx.expression().primary().booleanLiteral() != null) {
            globalVariableScopes.peek().addVariable(varName, "Boolean");
            type = "Boolean";
        } else if (ctx.expression().primary().getText().startsWith("Array[")) {
            globalVariableScopes.peek().addVariable(varName, "Array");
            type = "Array";
        } else if (ctx.expression().primary().getText().startsWith("List[")) {
            globalVariableScopes.peek().addVariable(varName, "List");
            type = "List";
        } else if (ctx.expression().getChildCount() == 1) {
            globalVariableScopes.peek().addVariable(varName, getVariableType(ctx.expression().primary().getText()));
            type = getVariableType(ctx.expression().primary().getText());
        } else if (classesAndItsVariablesAndMethods.get(ctx.expression().primary().getText()) != null) {
            type = ctx.expression().primary().getText();
            globalVariableScopes.peek().addVariable(varName, type);
        } else {
            type = classesAndItsVariablesAndMethods.get(getVariableType(ctx.expression().primary().getText())).methodAndItsReturn.get(ctx.expression().identifierToken(1).getText());
            globalVariableScopes.peek().addVariable(varName, type);
        }
        if (ctx.getParent() instanceof OLanguageParser.MemberDeclarationContext) {
            jasminCode.append(".field private ").append(varName).append(" L").append(type).append(";\n");
            visit(ctx.expression());
        }
        else {
            jasminCode.append("new ").append(type).append("\n").append("dup\n");
            for (OLanguageParser.ArgumentsContext argumentsContext : ctx.expression().arguments()) {
                for (OLanguageParser.ExpressionContext expressionContext : argumentsContext.expression()) {
                    String typek;
                    if (expressionContext.primary().integerToken() != null) {
                        typek = "LInteger;";
                    } else if (expressionContext.primary().realToken() != null) {
                        typek = "LReal;";
                    } else if (expressionContext.primary().booleanLiteral() != null) {
                        typek = "LBoolean;";
                    } else if (expressionContext.primary().getText().startsWith("Array[")) {
                        typek = "LArray;";
                    } else if (expressionContext.primary().getText().startsWith("List[")) {
                        typek = "LList;";
                    } else if (expressionContext.getChildCount() == 1) {
                        typek = "L" + getVariableType(expressionContext.primary().getText()) + ";";
                    } else if (classesAndItsVariablesAndMethods.get(expressionContext.primary().getText()) != null) {
                        typek = "L" + expressionContext.primary().getText() + ";";
                    } else {
                        typek = "L" + classesAndItsVariablesAndMethods.get(getVariableType(expressionContext.primary().getText())).methodAndItsReturn.get(expressionContext.identifierToken(1).getText()) + ";";
                    }
                    ArrayList<String> newArray = new ArrayList<>();
                    newArray.add(expressionContext.getText());
                    newArray.add(typek);
                    parametersAndItsTypes.add(new Pair(parametersAndItsTypes.size() + 1, newArray));
                }
            }

            Boolean flag = false;
            for (int i = 0; i < parametersAndItsTypes.size(); i++) {

                if (parametersAndItsTypes.get(i).typesOfParams.get(0).equals(ctx.expression().primary().getText())) {
                    jasminCode.append("aload ").append((parametersAndItsTypes.get(i).numberOfParams)).append("\n");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int i = 0; i < currentClassVariables.size(); i++) {
                    if (currentClassVariables.get(i).equals(ctx.expression().primary().getText())) {
                        jasminCode.append("getfield " + currentClass + "/" + ctx.expression().primary().getText() + " " + getVariableType(ctx.expression().primary().getText()) + "\n");

                    }
                }
            }
            if ((ctx.expression().getChildCount() > 1)) {
                jasminCode.append("invokespecial " + type + "/<init>(");
                for (OLanguageParser.ArgumentsContext argumentsContext : ctx.expression().arguments()) {
                    visitArguments(argumentsContext);
                }
                jasminCode.append(")V\n");
            }
            if (ctx.expression().getChildCount() == 1 && (ctx.expression().primary().integerToken() != null
                    || ctx.expression().primary().realToken() != null ||
                    ctx.expression().primary().booleanLiteral() != null)) {
                jasminCode.append("sipush ").append(ctx.expression().primary().getText());
                jasminCode.append("\ninvokespecial " + type + "/<init>(I");
                jasminCode.append(")V\n");
            }
            jasminCode.append("astore ").append(String.valueOf(parametersAndItsTypes.size() + 1)).append("\n\n");
            ArrayList<String> newArray = new ArrayList<>();
            newArray.add(varName);
            newArray.add(type);
            parametersAndItsTypes.add(new Pair(parametersAndItsTypes.size() + 1, newArray));
        }

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

        for (OLanguageParser.ArgumentsContext argumentsContext : ctx.arguments()) {
            for (OLanguageParser.ExpressionContext expressionContext : argumentsContext.expression()) {
                if (expressionContext.getChildCount() == 1) {
                    Boolean flag = false;
                    for (int i = 0; i < parametersAndItsTypes.size(); i++) {
                        if (parametersAndItsTypes.get(i).typesOfParams.get(0).equals(expressionContext.primary().getText())) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        for (int i = 0; i < currentClassVariables.size(); i++) {
                            if (currentClassVariables.get(i).equals(expressionContext.primary().getText())) {
                                flag = true;
                            }
                        }
                    }


                    if (!flag && (expressionContext.primary().booleanLiteral()
                            != null || expressionContext.primary().realToken() != null || expressionContext.primary().integerToken() != null)) {
                        String classOrType;
                        if (expressionContext.primary().booleanLiteral() != null)
                            classOrType = "Boolean";
                        else if (expressionContext.primary().integerToken() != null)
                            classOrType = "Integer";
                        else
                            classOrType = "Real";
                        jasminCode.append("new ").append(classOrType).append("\n").append("dup\n").append("sipush ").append(expressionContext.primary().getText());
                        jasminCode.append("\n").append("invokespecial ").append(classOrType).append("/<init>(");
                        jasminCode.append("I");
                        jasminCode.append(")V\n");
                        ArrayList<String> newArray = new ArrayList<>();
                        newArray.add(expressionContext.primary().getText());
                        newArray.add(currentClass);
                        jasminCode.append("astore ").append(String.valueOf(parametersAndItsTypes.size() + 1)).append("\n");
                        parametersAndItsTypes.add(new Pair(parametersAndItsTypes.size() + 1, newArray));

                    }
                }
            }
        }

            Boolean flag = false;
            for (int i = 0; i < parametersAndItsTypes.size(); i++) {
                if (parametersAndItsTypes.get(i).typesOfParams.get(0).equals(ctx.primary().getText())) {
                    jasminCode.append("aload ").append((parametersAndItsTypes.get(i).numberOfParams)).append("\n");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int i = 0; i < currentClassVariables.size(); i++) {
                    if (currentClassVariables.get(i).equals(ctx.primary().getText())) {
                        jasminCode.append("getfield " + currentClass + "/" + ctx.primary().getText() + " L" + getVariableType(ctx.primary().getText()) + ";\n");
                        flag = true;
                    }
                }
            }

            // Assuming method calls are handled here, adjust as needed
         if (ctx.identifierToken(0) != null) {

            for (OLanguageParser.ArgumentsContext argumentsContext : ctx.arguments()) {
                for (OLanguageParser.ExpressionContext expressionContext : argumentsContext.expression()) {
                    visitExpression(expressionContext);
                }
            }

            jasminCode.append("invokevirtual ").append(getVariableType(ctx.primary().getText())).append("/").
                        append(ctx.identifierToken(0).getText()).append("(");
            for (OLanguageParser.ArgumentsContext argumentsContext : ctx.arguments()) {
                visitArguments(argumentsContext);
            }
                jasminCode.append(")L");
                jasminCode.append(classesAndItsVariablesAndMethods.get(getVariableType(ctx.primary().getText())).methodAndItsReturn.get(ctx.identifierToken(0).getText()));
                jasminCode.append(";\n");
        }

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
        return null;
    }

    private StringBuilder jasminCode = new StringBuilder();
    public HashMap<Integer, ArrayList<String>> getUnusedVariables() {
        return this.unusedVariables;
    }

    // Implement other visit methods for variable declaration, method declaration, etc.

    private static int labelIdCounter = 0;

    private static String uniqueLabelId() {
        return String.valueOf(labelIdCounter++);
    }

    // Implement similar methods for other constructs
    public Void visitChildren(RuleNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            visit(node.getChild(i));
        }
        return null;
    }

    public String getJasminCode() {
        return jasminCode.toString();
    }
}
