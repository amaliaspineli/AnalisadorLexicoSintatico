package analisador;
import static analisador.Token.*;
import java_cup.runtime.Symbol;

%%
//%class Yylex
%cup
%public
%line
%column
%class Lexer
%type Token

WHITE = [ |\t|\n|\r|\s |\f]

%{   
    private Symbol Symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol Symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    @Override
    public String toString(){
        return "(" + yyline + ", " + yycolumn + ")";
    }
%}

D = [0-9]
L = [a-zA-Z_]

%{
public String lexeme;
%}

%%

{WHITE} {/*Ignore*/}
("//".*) {return new Symbol (Sym.comentario, yychar, yyline, yytext());}

("e") {return new Symbol (Sym.e, yychar, yyline, yytext());}
("ou") {return new Symbol (Sym.ou, yychar, yyline, yytext());}

(",") {return new Symbol (Sym.virgula, yychar, yyline, yytext());}
("(") {return new Symbol (Sym.AbParentese, yychar, yyline, yytext());}
(")") {return new Symbol (Sym.Fchparentese, yychar, yyline, yytext());}
("{") {return new Symbol (Sym.AbChave, yychar, yyline, yytext());}
("}") {return new Symbol (Sym.FchChave, yychar, yyline, yytext());}
(";") {return new Symbol (Sym.FinalLinha, yychar, yyline, yytext());}
("[") {return new Symbol (Sym.AbColchete, yychar, yyline, yytext());}
("]") {return new Symbol (Sym.FchColchete, yychar, yyline, yytext());}
(":") {return new Symbol (Sym.DoisPontos, yychar, yyline, yytext());}

("=") {return new Symbol (Sym.atribuicao, yychar, yyline, yytext());}
("==") {return new Symbol (Sym.OpRelacional, yychar, yyline, yytext());}
("<") {return new Symbol (Sym.OpRelacional, yychar, yyline, yytext());}
("<=") {return new Symbol (Sym.OpRelacional, yychar, yyline, yytext());}
(">") {return new Symbol (Sym.OpRelacional, yychar, yyline, yytext());}
(">=") {return new Symbol (Sym.OpRelacional, yychar, yyline, yytext());}
("!=") {return new Symbol (Sym.OpRelacional, yychar, yyline, yytext());}

("subtracao") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("divisao") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("multiplicacao") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("soma") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("raizquadrada") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("potencia") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("porcentagem") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("fatorial") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("logaritmo") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("cosseno") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("seno") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}
("tangente") {return new Symbol (Sym.OpMatematica, yychar, yyline, yytext());}

("int") {return new Symbol (Sym.tipo, yychar, yyline, yytext());}
("double") {return new Symbol (Sym.tipo, yychar, yyline, yytext());}
("string") {return new Symbol (Sym.tipo, yychar, yyline, yytext());}
("float") {return new Symbol (Sym.tipo, yychar, yyline, yytext());}
("bool") {return new Symbol (Sym.tipo, yychar, yyline, yytext());}

se {return new Symbol (Sym.se, yychar, yyline, yytext());}
senao {return new Symbol (Sym.senao, yychar, yyline, yytext());}
enquanto {return new Symbol (Sym.enquanto, yychar, yyline, yytext());}
para {return new Symbol (Sym.para, yychar, yyline, yytext());}
caso {return new Symbol (Sym.caso, yychar, yyline, yytext());}
escreva {return new Symbol (Sym.escreva, yychar, yyline, yytext());}
leia {return new Symbol (Sym.leia, yychar, yyline, yytext());}
retorna {return new Symbol (Sym.retorna, yychar, yyline, yytext());}
break {return new Symbol (Sym.break1, yychar, yyline, yytext());}
switch {return new Symbol (Sym.switch1, yychar, yyline, yytext());}

[-+]?{D}*[.]{D}+ {return new Symbol (Sym.num, yychar, yyline, yytext());}
[-+]?{D}+ {return new Symbol (Sym.num, yychar, yyline, yytext());}

//[a-zA-Z]\.[\w*] {return new Symbol (Sym.Variavel, yychar, yyline, yytext());}

verdadeiro  {return new Symbol(Sym.bool, yychar, yyline, yytext());}
falso {return new Symbol(Sym.bool, yychar, yyline, yytext());}

\'[a-zA-Z0-9]\' {return new Symbol(Sym.caractere, yychar, yyline, yytext());}
[a-zA-Z_][a-zA-Z0-9_]* {return new Symbol (Sym.Variavel, yychar, yyline, yytext());}
\"[^\"]*\"    {return new Symbol(Sym.texto, yychar, yyline, yytext());}

. {return new Symbol (Sym.erro, yychar, yyline, yytext());}