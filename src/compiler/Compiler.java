package compiler;

public class Compiler {
	
	/*
	 * Write first phases of a compiler
	 * Lexer analyser.
	 * Syntax analyser.
	 * 
	 * The current phases in order are.
	 * Lexical->Syntax -> Semantic->Intermediate Code-> Optimization->Code generation.
	 */
	
	

	public static void main(String[] args) {
		ReaderClass rd = new ReaderClass();
		rd.initInput("resource/Mundo.aaad");
	}

}
