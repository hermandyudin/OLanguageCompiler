import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class OLanguageMain {
    public static PrintWriter writer;

//    private static String splitter = "PleaseNotD";
//
//    private static List<String> getParams(String line){
//        line = line.substring(1, line.length() - 1);
//        return Arrays.stream(line.split(",")).toList();
//    }
//
//    private static HashMap<String, List<String>> getGenerics(String inputFile) throws FileNotFoundException {
//        Scanner scan = new Scanner(new File(inputFile));
//        HashMap<String, List<String>> result = new HashMap<>();
//        String prev = "";
//        boolean classOpen = false;
//        PrintWriter writer = null;
//        while(scan.hasNext()){
//            String s = scan.next();
//            if(s.contains("[") && prev.equals("class")){
//                String[] split = s.split("\\[");
//                String className = split[0];
//                List<String> params = getParams("[" + split[1]);
//                writer = new PrintWriter(new File("generics/" + className));
//                result.put(className, params);
//                writer.println("class");
//                writer.println(className);
//                classOpen = true;
//            }
//            else if(s.equals("class")){
//                if(classOpen){
//                    writer.close();
//                }
//                classOpen = false;
//            }
//            else if(classOpen){
//                writer.println(s);
//            }
//            prev = "" + s;
//        }
//        if(classOpen) {
//            writer.close();
//        }
//        return result;
//    }
//
//    private static void preprocessGenerics(String inputFile) throws FileNotFoundException {
//        HashMap<String, List<String>> genMap = getGenerics(inputFile);
//    }

    private static String classDeclaration(String codeLine) {
        String result = "";

        try {
            StringTokenizer st = new StringTokenizer(codeLine);
            if (st.nextToken().equals(".class")) {
                st.nextToken();
                result = st.nextToken();
            }
        } catch (Throwable e) {
        }
        return result;
    }

    private static boolean mainDeclaration(String codeLine) {
        try {
            StringTokenizer st = new StringTokenizer(codeLine);
            if (st.nextToken().equals(".method")) {
                st.nextToken();
                return st.nextToken().startsWith("main(");
            }
        } catch (Throwable e) {
        }
        return false;
    }

    public static void divideIntoClasses(String filename, String folder) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filename));
        PrintWriter writer = null;
        String currentClass = "";
        String classWithMain = "";
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String className = classDeclaration(line);
            if (!className.equals("")) {
                if (writer != null) {
                    writer.close();
                }
                writer = new PrintWriter(new File(folder + "/" + className + ".j"));
                currentClass = className;
                System.out.println("New class defined: " + className);
            }
            if (mainDeclaration(line)) {
                classWithMain = "" +  currentClass;
                writer.println(".method public static main([Ljava/lang/String;)V");
                continue;
            }
            writer.println(line);
        }
        if (writer != null) {
            writer.close();
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Main method defined in: " + classWithMain);
    }

    public static void main(String[] args) throws Exception {
//        preprocessGenerics("input1.txt");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input file name:");
//            String input = scan.next();
            String input = "input3.txt";
//            preprocessGenerics(input);
            System.out.println("Output file name:");
//            String output = scan.next();
            String output = "output3.txt";
            writer = new PrintWriter(new File(output));

            CharStream charStream = CharStreams.fromFileName(input);
            OLanguageLexer lexer = new OLanguageLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OLanguageParser parser = new OLanguageParser(tokens);

            ParseTree tree = parser.program();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            MyListener optimizer = new MyListener(visitor.getUnusedVariables());
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(optimizer, tree);
            printTree(tree, 0);

            writer.close();
            writer = new PrintWriter(new File("myfile.j"));
            OCodeGenVisitor jasmineCode = new OCodeGenVisitor();
            jasmineCode.visit(tree);
            Scanner scan2 = new Scanner(new File("predefined.txt"));
            while (scan2.hasNext()) {
                writer.println(scan2.nextLine());
            }
            writer.println(jasmineCode.getJasminCode());
            writer.close();

            divideIntoClasses("myfile.j", "generated");

        } catch (SemanticErrorException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printTree(ParseTree tree, int indent) {
        for (int i = 0; i < indent - 1; i++) {
            writer.print("| ");
        }
        for (int i = Math.max(indent - 1, 0); i < indent; i++) {
            writer.print("|-");
        }
        writer.print(tree.getClass().getSimpleName());
        if (tree.getChildCount() == 0) {
            writer.println(": " + tree.getText());
        } else {
            writer.println();
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), indent + 1);
        }
    }
}