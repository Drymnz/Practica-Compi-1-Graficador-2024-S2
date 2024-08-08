/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.animition;

/**
 *
 * @author drymnz
 */
public class Animation {
    private ListAnimation tipy;
    private double destinationPosX;
    private double destinationPosY;
    private int order;

    public Animation(ListAnimation tipy, double destinationPosX, double destinationPosY, int order) {
        this.tipy = tipy;
        this.destinationPosX = destinationPosX;
        this.destinationPosY = destinationPosY;
        this.order = order;
    }

    public ListAnimation getTipy() {
        return tipy;
    }

    public double getDestinationPosX() {
        return destinationPosX;
    }

    public double getDestinationPosY() {
        return destinationPosY;
    }

    public int getOrder() {
        return order;
    }
    
}
