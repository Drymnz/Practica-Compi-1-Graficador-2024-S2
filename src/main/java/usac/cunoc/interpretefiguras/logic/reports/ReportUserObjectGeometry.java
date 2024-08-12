package usac.cunoc.interpretefiguras.logic.reports;

import usac.cunoc.interpretefiguras.logic.animition.ListAnimation;
import usac.cunoc.interpretefiguras.logic.geometry.ListColor;
import usac.cunoc.interpretefiguras.logic.geometry.ListObjectGeometric;

public class ReportUserObjectGeometry {

    private int circleCount, lineCount, polygonCount, rectangleCount, squareCount;
    private int blueCount, redCount, yellowCount, greenCount, blackCount, cyanCount, fuchsiaCount, lavenderCount,
            maroonCount;
    private int lineCountAnimation, curveCount;
    private ListColor typeColor;
    private ListAnimation typeAnimation;

    public ReportUserObjectGeometry() {
    }

    public void incrementAnimationCounter(ListAnimation type) {
        this.typeAnimation = type;
        switch (type) {
            case CURVE:
                this.curveCount++;
                break;
            case LINE:
                this.lineCountAnimation++;
                break;
            default:
                break;
        }
    }
    
    public int countAnimation(ListAnimation type) {
        switch (type) {
            case CURVE:
                return this.curveCount++;
            case LINE:
                return this.lineCountAnimation++;
            default:
                return 0;
        }
    }

    public void incrementColorCounter(ListColor type) {
        this.typeColor = type;
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

    public int countColor(ListColor type) {
        this.typeColor = type;
        switch (type) {
            case BLUE:
                return this.blueCount;
            case RED:
                return this.redCount;
            case YELLOW:
                return this.yellowCount;
            case GREEN:
                return this.greenCount;
            case BLACK:
                return this.blackCount;
            case CYAN:
                return this.cyanCount;
            case FUCHSIA:
                return this.fuchsiaCount;
            case LAVENDER:
                return this.lavenderCount;
            case MAROON:
                return this.maroonCount;
            default:
                return 0;
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

    public int countUserObject(ListObjectGeometric type) {
        switch (type) {
            case CIRCLE:
                return this.circleCount;
            case LINE:
                return this.lineCount;
            case POLYGON:
                return this.polygonCount;
            case RECTANGLE:
                return this.rectangleCount;
            case SQUARE:
                return this.squareCount;
            default:
                return 0;

        }
    }

    public ListColor getTypeColor() {
        return typeColor;
    }

    public int getCircleCount() {
        return circleCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getPolygonCount() {
        return polygonCount;
    }

    public int getRectangleCount() {
        return rectangleCount;
    }

    public int getSquareCount() {
        return squareCount;
    }

    public int getBlueCount() {
        return blueCount;
    }

    public int getRedCount() {
        return redCount;
    }

    public int getYellowCount() {
        return yellowCount;
    }

    public int getGreenCount() {
        return greenCount;
    }

    public int getBlackCount() {
        return blackCount;
    }

    public int getCyanCount() {
        return cyanCount;
    }

    public int getFuchsiaCount() {
        return fuchsiaCount;
    }

    public int getLavenderCount() {
        return lavenderCount;
    }

    public int getMaroonCount() {
        return maroonCount;
    }

    public int getLineCountAnimation() {
        return lineCountAnimation;
    }

    public int getCurveCount() {
        return curveCount;
    }

    public ListAnimation getTypeAnimation() {
        return typeAnimation;
    }

}
