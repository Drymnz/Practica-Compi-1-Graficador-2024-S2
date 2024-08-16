package usac.cunoc.interpretefiguras.logic.reports;

import java.util.Stack;

public class InterpretSyntaticError {
    private Stack stack;// la pila
    private String nameTerminal;// NOMBRE ejemplo "ID"
    private int numberTerminal;// del sym.java
    private String lexema;// lexema que encontro
    private int line;
    private int columna;

    public InterpretSyntaticError(Stack stack, String nameTerminal, int numberTerminal, String lexema, int line,
            int columna) {
        this.stack = stack;
        this.nameTerminal = nameTerminal;
        this.numberTerminal = numberTerminal;
        this.lexema = lexema;
        this.line = line;
        this.columna = columna;
    }

    public String description() {
        //System.out.println("this.stack->" + this.stack);
        //System.err.println("this.stack->" + this.stack.get(this.stack.size() - 1).toString().replace("#", ""));
        //System.out.println("this.nameTerminal->" + this.nameTerminal);
        //System.out.println("this.numberTerminal->" + this.numberTerminal);
        //System.out.println("this.lexema->" + this.lexema);
        //System.out.println("this.line->" + this.line);
        //System.out.println("this.columna->" + this.columna);
        return "Se esperaba un <" + previousToken(this.numberTerminal)+ "> y vino un <"+nombreSYM(this.numberTerminal)+ "> que es \""+this.lexema+"\"";

        // return "Se esperaba un " +
        // previousToken(convertir(this.stack.get(this.stack.size()-1).toString().replace("#",
        // "")));
    }

    private String previousToken(int id) {
        switch (id) {
            case 0:
                return "EOF";
            case 1:
                return "error";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return "NUMERO";
            case 7:
                return "PARENTESIS";
            case 8:
                return "PARENTESIS O NUMERO";
            case 9:
                return "ID";
            case 10:
                return "COLOR";
            case 11:

            case 12:

            case 13:

            case 14:

            case 15:

            case 16:

            case 17:

            case 18:

            case 19:
                return "COMA";
            case 20:

            case 21:

            case 22:

            case 23:

            case 24:
                return "GRAFICA";
            case 25:
            case 26:
                return "PARENTESIS";
            case 27:
                return "OBJETO";
            case 28:
                return "ANIMACION";
            case 29:
                return "PARENTESIS";
            default:
                return "NO EXISTE ESTE TERMINAL";
        }
    }

    private String nombreSYM(int id) {
        switch (id) {
            case 0:
                return "EOF";
            case 1:
                return "error";
            case 2:
                return "SUMAR";
            case 3:
                return "RESTAR";
            case 4:
                return "DIVIDIR";
            case 5:
                return "MULTIPLICAR";
            case 6:
                return "COMA";
            case 7:
                return "ID";
            case 8:
                return "REAL_NUMEBERS";
            case 9:
                return "PARENTESIS_A";
            case 10:
                return "PARENTESIS_C";
            case 11:
                return "BLUE";
            case 12:
                return "RED";
            case 13:
                return "YELLOW";
            case 14:
                return "GREEN";
            case 15:
                return "BLACK";
            case 16:
                return "CYAN";
            case 17:
                return "FUCHSIA";
            case 18:
                return "LAVENDER";
            case 19:
                return "MAROON";
            case 20:
                return "CIRCLE";
            case 21:
                return "LINE";
            case 22:
                return "POLYGON";
            case 23:
                return "RECTANGLE";
            case 24:
                return "SQUARE";
            case 25:
                return "GRAFICAR";
            case 26:
                return "ANIMATION";
            case 27:
                return "PREVIOUS";
            case 28:
                return "OBJECT";
            case 29:
                return "CURVE";
            default:
                return "NO EXISTE ESTE TERMINAL";
        }
    }

    private int convertir(String str) {
        int val = 0;
        try {
            val = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Chaîne invalide");
        }
        return val;
    }
}
