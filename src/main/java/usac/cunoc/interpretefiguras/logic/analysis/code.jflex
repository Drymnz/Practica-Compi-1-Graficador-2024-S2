/*primer seccion: codigo de usuario*/

package usac.cunoc.interpretefiguras.logic.analysis;
import java_cup.runtime.Symbol;

%%
/*segunda seccion: configuracion*/

%public
%class Lexema
%unicode
%line
%column
%cup

%{
    /*CODE*/
        public void print() {
            //System.out.println("\n<" + yytext() + "><Linea\"" + (yyline + 1) + "\">" + "<Columna\"" + yycolumn + "\">");
        }
    /*CODE*/
%}

ENTERO =[0-9]+
DECIMAL = {ENTERO}[.]{ENTERO}
NOMBRE = [a-zA-Z0-9_]+
espacio =[\r|\t|\f|\n|\s| ]+
no_pertenece = ("~"|"`"|"&"|"!"|"@"|"#"|"$"|"%"|"_"|"\\"|"<"|">"|"\?"|"."|"^")+
%%

/*tercer seccion: reglase lexicas*/
/*INGNORAR*/
//Comentarios de linea
[//].*[\n]?         {
                        //System.out.println("Comentarios de linea ->"+this.yytext());
                    }
//Comentarios multilinea / otro comentario multilinea
"/*" ~"*/"          {
                        //System.out.println("Comentarios multilinea / otro comentario multilinea ->"+this.yytext() +" <-- Termino");
                    }
{espacio}           {/*nada*/}
/*SIMBOLOS ARIMETICOS*/
"+"                 {
                   print(); return new Symbol(sym.SUMAR,yyline,yycolumn,yytext());
                    }
"-"                 {
                   print(); return new Symbol(sym.RESTAR,yyline,yycolumn);
                    }
"/"                 {
                   print(); return new Symbol(sym.DIVIDIR,yyline,yycolumn);
                    }
"*"                 {
                   print(); return new Symbol(sym.MULTIPLICAR,yyline,yycolumn);
                    }
"="                 {
                   print(); return new Symbol(sym.IGUAL,yyline,yycolumn);
                    }
/*SIMBOLOS DE AGRUPACION*/
"("                 {
                   print(); return new Symbol(sym.PARENTESIS_A,yyline,yycolumn);
                    }
")"                 {
                   print(); return new Symbol(sym.PARENTESIS_C,yyline,yycolumn);
                    }
/*ERROR LEXICO*/
.                   {
                   print(); System.out.println("¡¡¡¡¡¡NO PERTENECE AL ALFABETO -> ERROR LEXICO!!!!!!!!!"+(yytext()));
                    }