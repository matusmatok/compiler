import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

//javac -cp .;antlr-4.9.3-complete.jar Main.java
//"C:\Program Files\Java\jdk-14.0.2\bin\java" -cp .;antlr-4.9.3-complete.jar Main

public class Main {

	public static void main(String[] args) throws Exception {

		CharStream in = CharStreams.fromFileName("programA.txt");         
		GrammarLexer lexer = new GrammarLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrammarParser parser = new GrammarParser(tokens);

		ParseTree tree = parser.init();

		TableBuilderVisitor PNTBvisitor = new TableBuilderVisitor();
		PNTBvisitor.visit(tree);
		
		CompileVisitor CVisitor = new CompileVisitor(PNTBvisitor.getRecordTable(), PNTBvisitor.getNamespace());
		CVisitor.visit(tree);
		
		if (CVisitor.getErrors().equals("")){
			System.out.println(PNTBvisitor.getGlobals());
			System.out.println(CVisitor.getCode());
		}
		else{
			System.out.println(CVisitor.getErrors());
		}
	}

}