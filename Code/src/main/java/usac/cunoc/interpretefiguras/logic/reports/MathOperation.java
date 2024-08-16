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
public class MathOperation {
    private Token token;
    private ListMathOperation type;

    public MathOperation(Token token, ListMathOperation type) {
        this.token = token;
        this.type = type;
    }

    public Token getToken() {
        return token;
    }

    public ListMathOperation getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return this.token.toString() + "-ListMathOperation:" + this.type.toString();
    }
}
