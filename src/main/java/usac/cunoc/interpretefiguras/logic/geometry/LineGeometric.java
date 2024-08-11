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

    private int posXF;
    private int posYF;

    public LineGeometric(int posx, int poxy, String id, ListColor color, int posXF, int posYF) {
        super(posx, poxy, id, color);
        this.posXF = posXF;
        this.posYF = posYF;
    }

    public int getPosXF() {
        return posXF;
    }


    public int getPosYF() {
        return posYF;
    }


}
