import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import core.Value;

public class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String line = ">";
		EvalParserTC visitor = new EvalParserTC();
		while (!line.isEmpty()) {
			System.out.print("> ");
			line = in.nextLine();
			CharStream lineStream = CharStreams.fromString(line);
			ParserTCLexer lexer = new ParserTCLexer(lineStream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ParserTCParser parser = new ParserTCParser(tokens);
			ParseTree tree = parser.stmt();
			Value result = visitor.visit(tree);
				
			//System.out.println(tree.toStringTree(parser));
			System.out.println(result.toString());
		}
	}

}
