/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.analyzer;

import java.io.Reader;
import java.io.StringReader;
import usac.cunoc.interpretefiguras.logic.analysis.Lexema;
import usac.cunoc.interpretefiguras.logic.analysis.parser;

/**
 *
 * @author drymnz
 */
public class Analyzer {

    private Lexema lexeman;
    private parser parse;

    public Analyzer(String text) {
        System.out.println(text);
        Reader reader = new StringReader(text);
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
    }

    public void Anilisar() {
        try {
            this.parse.parse();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
