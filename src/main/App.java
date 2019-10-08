package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import javax.swing.JFrame;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parser.UsecaseReaderLexer;
import parser.UsecaseReaderParser;

public class App {

	protected static TestVisitor visitor = new TestVisitor();
	
	public static void main(String[] args) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fileChooser.setSize(500, 300);
		fileChooser.setVisible(true);
	}
	
	public static void parseFromFile(String filePath) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(filePath)));
    	
    	ANTLRInputStream inputStream = new ANTLRInputStream(content);
        UsecaseReaderLexer markupLexer = new UsecaseReaderLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        UsecaseReaderParser markupParser = new UsecaseReaderParser(commonTokenStream);

        ParseTree tree = markupParser.usecaseList();
        
        visitor.visit(tree);
        
        visitor.generate();
        
        System.out.println("done");
		
	}
	
	public static void addUsecase(Map<String, String> data) {
		visitor.addUseCase(data);
		visitor.generate();
	}

}
