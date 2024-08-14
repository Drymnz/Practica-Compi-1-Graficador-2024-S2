package usac.cunoc.interpretefiguras.logic.reports;

import java.util.Stack;

public class InterpretSyntaticError {
    private Stack stack;// la pila
    private String nameTerminal;// NOMBRE ejemplo "ID"
    private int numberTerminal;//del sym.java
    private String lexema;// lexema que encontro
    private int line;
    private int columna;


    public InterpretSyntaticError(Stack stack, String nameTerminal, int numberTerminal, String lexema, int line,int columna) {
        this.stack = stack;
        this.nameTerminal = nameTerminal;
        this.numberTerminal = numberTerminal;
        this.lexema = lexema;
        this.line = line;
        this.columna = columna;
    }

    public String description(){
        System.out.println("this.stack"+this.stack);
        System.out.println("this.nameTerminal"+this.nameTerminal);
        System.out.println("this.numberTerminal"+this.numberTerminal);
        System.out.println("this.lexema"+this.lexema);
        System.out.println("this.line"+this.line);
        System.out.println("this.columna"+this.columna);
        return "el pepe";
    }

}
