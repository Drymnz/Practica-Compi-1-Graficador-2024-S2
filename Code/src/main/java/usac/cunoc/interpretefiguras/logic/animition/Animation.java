/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.animition;

import usac.cunoc.interpretefiguras.logic.geometry.BasicGeometricObject;

/**
 *
 * @author drymnz
 */
 public class Animation implements Comparable<Animation>{
    private ListAnimation tipy;
    private int destinationPosX;
    private int destinationPosY;
    private int order;
    private BasicGeometricObject objetToAnimate;

    public Animation(ListAnimation tipy, int destinationPosX, int destinationPosY, int order,BasicGeometricObject objetToAnimate) {
        this.tipy = tipy;
        this.destinationPosX = destinationPosX;
        this.destinationPosY = destinationPosY;
        this.order = order;
        this.objetToAnimate = objetToAnimate;
    }

    public ListAnimation getTipy() {
        return tipy;
    }

    public int getDestinationPosX() {
        return destinationPosX;
    }

    public int getDestinationPosY() {
        return destinationPosY;
    }

    public int getOrder() {
        return order;
    }

    public BasicGeometricObject getObjetToAnimate() {
        return objetToAnimate;
    }

    @Override
    public String toString() {
        return "-tipy:"+tipy.toString()+"-destinationPosX:"+this.destinationPosX+"-destinationPosY:"+destinationPosY+"-order:"+order+"-objetToAnimate:"+objetToAnimate.toString();
    }

    @Override
    public int compareTo(Animation otro) {
          return Integer.compare(this.order, otro.getOrder());
    }
}
