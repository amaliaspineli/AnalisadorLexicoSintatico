package analisador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Lexer_lexico.flex";
        String ruta2 = "C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Lexer.flex";	
        String[] rutaS = {"-parser", "Sintax", "C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Sintax.cup"};
        gerar(ruta1, ruta2, rutaS);
    }
    public static void gerar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Sym.java"), 
                Paths.get("C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Sym.java")
        );
        Path rutaSin = Paths.get("C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Sintax.java"), 
                Paths.get("C:\\Users\\amali\\workspace\\AnalisadorLexicoSintatico\\src\\analisador\\Sintax.java")
        );
    }
}
