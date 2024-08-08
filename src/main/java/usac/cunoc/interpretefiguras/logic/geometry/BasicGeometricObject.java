/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.geometry;

import java.awt.Color;

/**
 *
 * @author drymnz
 */
public class BasicGeometricObject  {
    private double posx;
    private double poxy;
    private String id;
    private ListColor color;

    public BasicGeometricObject(double posx, double poxy, String id, ListColor color) {
        this.posx = posx;
        this.poxy = poxy;
        this.id = id;
        this.color = color;
    }

    public double getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public double getPoxy() {
        return poxy;
    }

    public void setPoxy(int poxy) {
        this.poxy = poxy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListColor getColor() {
        return color;
    }

    public void setColor(ListColor color) {
        this.color = color;
    }


}
