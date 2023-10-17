import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class OLanguageMain {
    public static PrintWriter writer;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input file name:");
        String input = scan.next();

        System.out.println("Output file name:");
        String output = scan.next();
        writer = new PrintWriter(new File(output));

        CharStream charStream = CharStreams.fromFileName(input);
        OLanguageLexer lexer = new OLanguageLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OLanguageParser parser = new OLanguageParser(tokens);

        ParseTree tree = parser.program();

        printTree(tree, 0);
        writer.close();
    }

    public static void printTree(ParseTree tree, int indent) {
        for (int i = 0; i < indent - 1; i++) {
            writer.print("| ");
        }
        for (int i = Math.max(indent - 1,0); i < indent; i++) {
            writer.print("|-");
        }
        writer.print(tree.getClass().getSimpleName());
        if(tree.getChildCount() == 0){
            writer.println(": " + tree.getText());
        }
        else{
            writer.println();
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), indent + 1);
        }
    }
}