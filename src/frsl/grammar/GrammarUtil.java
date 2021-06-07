package frsl.grammar;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import frsl.metamodel.UseCase;
import frsl.metamodel.UseCaseV2;
import frsl.util.IOUtil;

public class GrammarUtil {
	public static UseCaseV2 parseFromFile(String filepath) {
		String data = IOUtil.readFile(filepath);
		return parseFromText(data);
	}

	public static UseCaseV2 parseFromText(String text) {
		try {
			text = text.trim().replaceAll(" +", " ");
			text = text.replaceAll("[\n]+", "\n");
			ANTLRInputStream antlrInputStream = new ANTLRInputStream(text);
			FRSLLexer lexer = new FRSLLexer(antlrInputStream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FRSLParser parser = new FRSLParser(tokens);
			ParseTree tree = parser.metaModel();
			ParseTreeWalker walker = new ParseTreeWalker();
//			FRSLWalker FRSLWalker = new FRSLWalker();
//			walker.walk(FRSLWalker, tree);
			FRSLWalkerV2 FRSLWalker = new FRSLWalkerV2();
			walker.walk(FRSLWalker, tree);
			return FRSLWalker.getMetaModel();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
