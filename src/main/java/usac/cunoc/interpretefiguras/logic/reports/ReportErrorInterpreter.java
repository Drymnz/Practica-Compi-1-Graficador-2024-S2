/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.reports;

import usac.cunoc.interpretefiguras.logic.objectAnalysis.Token;

/**
 *
 * @author drymnz
 */
public class ReportErrorInterpreter {
      private TypeIntreprete type;
      private Token toke;
      private String description;

    public ReportErrorInterpreter(TypeIntreprete type, Token toke, String description) {
        this.type = type;
        this.toke = toke;
        this.description = description;
    }

    public TypeIntreprete getType() {
        return type;
    }

    public Token getToke() {
        return toke;
    }

    public String getDescription() {
        return description;
    }
      
      
}
