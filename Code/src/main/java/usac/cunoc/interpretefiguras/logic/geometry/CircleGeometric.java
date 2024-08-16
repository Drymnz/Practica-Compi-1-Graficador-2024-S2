/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.geometry;

/**
 *
 * @author drymnz
 */
public class CircleGeometric extends BasicGeometricObject{
    
    private int radio; 
    
    public CircleGeometric(int posx, int poxy, String id, ListColor color, int radio) {
        super(posx, poxy, id, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

}
