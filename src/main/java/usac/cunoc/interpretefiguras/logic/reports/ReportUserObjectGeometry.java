package usac.cunoc.interpretefiguras.logic.reports;

import usac.cunoc.interpretefiguras.logic.animition.ListAnimation;
import usac.cunoc.interpretefiguras.logic.geometry.ListColor;
import usac.cunoc.interpretefiguras.logic.geometry.ListObjectGeometric;

public class ReportUserObjectGeometry {
    private int circleCount, lineCount, polygonCount, rectangleCount, squareCount;
    private int blueCount, redCount, yellowCount, greenCount, blackCount, cyanCount, fuchsiaCount, lavenderCount,
            maroonCount;
    private int lineCountAnimation, curveCount;

    public ReportUserObjectGeometry() {
    }

    public void incrementAnimationCounter(ListAnimation type) {
        switch (type) {
            case CURVE:
            this.curveCount ++;
                break;
            case LINE:
            this.lineCountAnimation++;
                break;
            default:
                break;
        }
    }

    public void incrementColorCounter(ListColor type) {
        switch (type) {
            case BLUE:
                this.blueCount++;
                break;
            case RED:
                this.redCount++;
                break;
            case YELLOW:
                this.yellowCount++;
                break;
            case GREEN:
                this.greenCount++;
                break;
            case BLACK:
                this.blackCount++;
                break;
            case CYAN:
                this.cyanCount++;
                break;
            case FUCHSIA:
                this.fuchsiaCount++;
                break;
            case LAVENDER:
                this.lavenderCount++;
                break;
            case MAROON:
                this.maroonCount++;
                break;
        }
    }

    public void incrementObjectCounter(ListObjectGeometric type) {
        switch (type) {
            case CIRCLE:
                this.circleCount++;
                break;
            case LINE:
                this.lineCount++;
                break;
            case POLYGON:
                this.polygonCount++;
                break;
            case RECTANGLE:
                this.rectangleCount++;
                break;
            case SQUARE:
                this.squareCount++;
                break;

        }
    }
}
