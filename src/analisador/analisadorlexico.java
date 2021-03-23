package analisador;

import java.io.File;
import JFlex.anttask.JFlexTask;

public class analisadorlexico {
	public static void main(String[] args){
		String path = "C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Lexer.flex";
		GerarLexer(path);
	}

	private static void GerarLexer(String path) {
		File file = new File(path);
		JFlex.Main.generate(file);
		
	}

}