/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.reports;

import usac.cunoc.interpretefiguras.logic.geometry.ListGeometric;
import static usac.cunoc.interpretefiguras.logic.geometry.ListGeometric.POLYGON;

/**
 *
 * @author drymnz
 */
public class ReportUserObject {

    private int circleCounter;
    private int lineCounter;
    private int polygonCounter;
    private int rectangleCounter;
    private int squareCounter;
    
    //CIRCLE,LINE,POLYGON,RECTANGLE,SQUARE;
    public void addCounter(ListGeometric type) {
        switch (type) {
            case CIRCLE:
                this.circleCounter++;
                break;
            case LINE:
                this.lineCounter++;
                break;
            case POLYGON:
                this.polygonCounter++;
                break;
            case RECTANGLE:
                this.rectangleCounter++;
                break;
            case SQUARE:
                this.squareCounter++;
                break;
            default:
                throw new AssertionError();
        }
    }

    public ReportUserObject() {
    }

    public int getCircleCounter() {
        return circleCounter;
    }

    public int getLineCounter() {
        return lineCounter;
    }

    public int getPolygonCounter() {
        return polygonCounter;
    }

    public int getRectangleCounter() {
        return rectangleCounter;
    }

    public int getSquareCounter() {
        return squareCounter;
    }

}
