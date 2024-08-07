/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.objectAnalysis;

/**
 *
 * @author drymnz
 */
public class Token {
    private int line;
    private int columna;
    private String lexe;

    public Token(int line, int columna, String lexe) {
        this.line = line;
        this.columna = columna;
        this.lexe = lexe;
    }

    public int getLine() {
        return line;
    }

    public int getColumna() {
        return columna;
    }

    public String getLexe() {
        return lexe;
    }
    
}
