/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.geometry;

/**
 *
 * @author drymnz
 */
public class SquareGeometric extends BasicGeometricObject{
    private double square;

    public SquareGeometric(double posx, double poxy, String id, ListColor color, double square) {
        super(posx, poxy, id, color);
        this.square = square;
    }

    public double getSquare() {
        return square;
    }
    
}
