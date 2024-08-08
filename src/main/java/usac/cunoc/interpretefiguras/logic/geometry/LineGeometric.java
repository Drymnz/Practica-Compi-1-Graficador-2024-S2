/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.geometry;

/**
 *
 * @author drymnz
 */
public class LineGeometric extends BasicGeometricObject {

    private double posXF;
    private double posYF;

    public LineGeometric(double posx, double poxy, String id, ListColor color, double posXF, double posYF) {
        super(posx, poxy, id, color);
        this.posXF = posXF;
        this.posYF = posYF;
    }

    public double getPosXF() {
        return posXF;
    }


    public double getPosYF() {
        return posYF;
    }


}
