/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.animition;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import usac.cunoc.interpretefiguras.logic.geometry.BasicGeometricObject;
import usac.cunoc.interpretefiguras.logic.geometry.LineGeometric;
import usac.cunoc.interpretefiguras.logic.geometry.RectangleGeometric;
import usac.cunoc.interpretefiguras.logic.geometry.SquareGeometric;
import usac.cunoc.interpretefiguras.view.GrapherPanel;

/**
 *
 * @author drymnz
 */
public class AnimateObjectGeometry extends Thread {

    private ArrayList<Animation> listAnimation;
    private JButton jButton;
    private JButton jButtonOne;
    private GrapherPanel grapherPanel;
    private double angulo = 0;//para rota

    //calculations for the trajectory to be animated
    private double slope;
    private double xStar;
    private double yStar;
    private double b;

    private final int FPS = 60;
    private final int MS = 1000 / this.FPS;

    public AnimateObjectGeometry(GrapherPanel grapherPanel, ArrayList<Animation> listAnimation, JButton jButton, JButton jButtonOne) {
        this.listAnimation = listAnimation;
        this.jButton = jButton;
        this.jButtonOne = jButtonOne;
        this.grapherPanel = grapherPanel;
    }

    private void animateObjects() {
        //ordenar nesesario 
        for (Animation animation : listAnimation) {
            this.calculaAnimation(animation);
            this.angulo = 0;
            this.grapherPanel.setNameAnimation("");
        }
    }

    // alculos de animacion
    private void calculaAnimation(Animation animation) {
        double b2 = -1;
        int distanci = 0;
        this.calculationsFistPositionLine(animation);
        while (animation.getObjetToAnimate().getPosx() != animation.getDestinationPosX()) {
            this.pause(this.MS);
            //cambiar el punto inicial
            animation.getObjetToAnimate().setPosx(this.increaseOrDecreaseBalance(animation.getObjetToAnimate().getPosx(), animation.getDestinationPosX()));
            animation.getObjetToAnimate().setPoxy(this.incrementFormula(slope, animation.getObjetToAnimate().getPosx(), b));
            // animation if line
            if (animation.getObjetToAnimate() instanceof LineGeometric) {
                LineGeometric lineGeometric = (LineGeometric) animation.getObjetToAnimate();
                if (b2 == -1) {
                    b2 = -(slope * lineGeometric.getPosXF()) + lineGeometric.getPosYF();
                    distanci = (lineGeometric.getPosXF() - lineGeometric.getPosx()) + animation.getDestinationPosX();
                }
                lineGeometric.setPosXF(this.increaseOrDecreaseBalance(lineGeometric.getPosXF(), distanci));
                lineGeometric.setPosYF(this.incrementFormula(slope, lineGeometric.getPosXF(), b2));
            }// termina con los calculos de la nueva posicion
            if (animation.getTipy() == ListAnimation.CURVE) {
                this.rotation(animation.getObjetToAnimate());
            }
            //grafica lo nuevo
            this.grapherPanel.repaint();
        }
    }

    //calcular la primera recta
    private void calculationsFistPositionLine(Animation animation) {
        this.slope = this.calculateSope(animation.getObjetToAnimate(), animation.getDestinationPosX(), animation.getDestinationPosY());;
        this.xStar = animation.getObjetToAnimate().getPosx();
        this.yStar = animation.getObjetToAnimate().getPoxy();
        this.b = -(this.slope * this.xStar) + this.yStar;
    }

    private void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(AnimateObjectGeometry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // usando al ecuacion de una reacta
    private int incrementFormula(double m, int x, double b) {
        double result = m * x + b;
        return (int) Math.round(result);
    }

    //calculando la pendiente 
    private double calculateSope(BasicGeometricObject objet, int dPosX, int dPosY) {
        double posXStart = objet.getPosx();
        double posYStart = objet.getPoxy();
        double dPosXD = dPosX;
        double dPosYD = dPosY;
        return (dPosYD - posYStart) / (dPosXD - posXStart);
    }

    //calculando que los numeros coincida 
    private int increaseOrDecreaseBalance(int intIncreaseOrDecrease, int intTwo) {
        if (!(intIncreaseOrDecrease == intTwo)) {
            if (intIncreaseOrDecrease > intTwo) {
                return intIncreaseOrDecrease - 1;
            } else {
                return intIncreaseOrDecrease + 1;
            }
        } else {
            return intIncreaseOrDecrease;
        }
    }

    private void rotation(BasicGeometricObject objet) {
        this.angulo += 5;
        AffineTransform affineTransform = new AffineTransform();
        //rotacon para los rectangulos
        if (objet instanceof RectangleGeometric) {
            RectangleGeometric squar = (RectangleGeometric) objet;
            double posX = objet.getPosx() + (squar.getWidth()/ 2);
            double posY = objet.getPoxy() + (squar.getHigh()/ 2);
            affineTransform.rotate(Math.toRadians(this.angulo), posX, posY);
        }
        this.grapherPanel.setNameAnimation(objet.getId());
        this.grapherPanel.setAffineTransform(affineTransform);
    }

    @Override
    public void run() {
        this.jButton.setEnabled(false);
        this.jButtonOne.setEnabled(false);
        this.animateObjects();
        this.jButton.setEnabled(true);
        this.jButtonOne.setEnabled(true);
    }
}
