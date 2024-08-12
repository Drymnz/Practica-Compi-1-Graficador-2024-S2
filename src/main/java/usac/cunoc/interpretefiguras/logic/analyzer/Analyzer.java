/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.analyzer;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import usac.cunoc.interpretefiguras.logic.analysis.Lexema;
import usac.cunoc.interpretefiguras.logic.analysis.parser;
import usac.cunoc.interpretefiguras.logic.reports.ReportErrorInterpreter;

/**
 *
 * @author drymnz
 */
public class Analyzer {

    private Lexema lexeman;
    private parser parse;

    public Analyzer(String text) {
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

    public boolean isErrorsAnalyzing() {
        return this.lexeman.getListError().size() > 0 || this.parse.getListError().size() > 0;
    }

    public ArrayList<ReportErrorInterpreter> getListError() {
        System.out.println(this.lexeman.getListError().size());
        System.out.println(this.parse.getListError().size());
        this.lexeman.getListError().addAll(this.parse.getListError());
        return this.lexeman.getListError();
    }

    public parser getParse() {
        return parse;
    }
    
    
}
