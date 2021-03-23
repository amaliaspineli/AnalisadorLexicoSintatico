package analisador;

import java.util.Formatter;

public class Token {
    public enum T {
    	FinalLinha         	    { public String toString() { return "FinalLinha"; } },
    	AbParentese     		{ public String toString() { return "AbParentese"; } },
    	Fchparentese          	{ public String toString() { return "Fchparentese"; } },
    	AbColchete              { public String toString() { return "AbColchete"; } },
    	FchColchete             { public String toString() { return "FchColchete"; } },
    	AbChave           		{ public String toString() { return "AbChave"; } },
    	FchChave            	{ public String toString() { return "FchChave"; } },
    	se        				{ public String toString() { return "se"; } },
    	senao        			{ public String toString() { return "senao"; } },
    	enquanto              	{ public String toString() { return "enquanto"; } },
    	para              		{ public String toString() { return "para"; } },
    	caso             		{ public String toString() { return "caso"; } },
    	escreva             	{ public String toString() { return "escreva"; } },
    	leia             		{ public String toString() { return "leia"; } },
    	retorna             	{ public String toString() { return "retorna"; } },
    	atribuicao    			{ public String toString() { return "atribuicao"; } },
    	comentario          	{ public String toString() { return "comentario"; } },
    	Variavel      			{ public String toString() { return "Variavel"; } },
    	OpRelacional           	{ public String toString() { return "OpRelacional"; } },
    	OpMatematica          	{ public String toString() { return "OpMatematica"; } },
    	num          			{ public String toString() { return "num"; } },
    	tipo            		{ public String toString() { return "tipo"; } },
    	bool            		{ public String toString() { return "bool"; } },
        texto          			{ public String toString() { return "texto"; } },
        virgula           		{ public String toString() { return "virgula"; } },
        break1            		{ public String toString() { return "break1"; } },
        switch1            		{ public String toString() { return "switch1"; } },
        caractere            	{ public String toString() { return "caractere"; } },
        DoisPontos            	{ public String toString() { return "DoisPontos"; } },
        e            			{ public String toString() { return "e"; } },
        erro            		{ public String toString() { return "erro"; } },
        ou            			{ public String toString() { return "ou"; } }
    }

    
    public T type;
    public Object val;
    public int lin;
    public int col;
    
    public Token(T type, int lin, int col){
        this.type = type;
        this.lin = lin;
        this.col = col;                
    }
    
    public Token(T type, Object val, int lin, int col){
        this.type = type;
        this.val = val;
        this.lin = lin;
        this.col = col;                
    }
    
    @Override
    public String toString(){
        Formatter out = new Formatter();
        out.format("(%d, %d) %s", lin, col, type);
        if(val != null){
            out.format(" [%s]", val);
        }
        return out.toString();
    }
}