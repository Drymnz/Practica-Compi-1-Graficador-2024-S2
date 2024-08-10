/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.geometry;

/**
 *
 * @author drymnz
 */
public class RectangleGeometric extends BasicGeometricObject{
    private double high;
    private double width;

    public RectangleGeometric(int posx, int poxy, String id, ListColor color,double high
    , double width) {
        super(posx, poxy, id, color);
        this.high = high;
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public double getWidth() {
        return width;
    }
 
}
