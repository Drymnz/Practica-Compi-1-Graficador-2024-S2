/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.animition;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import usac.cunoc.interpretefiguras.logic.geometry.BasicGeometricObject;
import usac.cunoc.interpretefiguras.view.GrapherPanel;
import usac.cunoc.interpretefiguras.view.ViewsMenu;

/**
 *
 * @author drymnz
 */
public class AnimateObjectGeometry extends Thread {

    private ArrayList<Animation> listAnimation;
    private JButton jButton;
    private JButton jButtonOne;
    private GrapherPanel grapherPanel;

    public AnimateObjectGeometry(GrapherPanel grapherPanel, ArrayList<Animation> listAnimation, JButton jButton, JButton jButtonOne) {
        this.listAnimation = listAnimation;
        this.jButton = jButton;
        this.jButtonOne = jButtonOne;
        this.grapherPanel = grapherPanel;
    }

    private void animateObjects() {
        try {
            //ordenar nesesario 
            for (Animation animation : listAnimation) {
                double slope = this.calculateSope(animation.getObjetToAnimate(), animation.getDestinationPosX(), animation.getDestinationPosY());;
                double xStar = animation.getObjetToAnimate().getPosx();
                double yStar = animation.getObjetToAnimate().getPoxy();
                double b = -(slope * xStar) + yStar;
                System.out.println("ENTRE");
                while (animation.getObjetToAnimate().getPosx() != animation.getDestinationPosX()) {
                    if (animation.getTipy() == ListAnimation.CURVE) {
                        this.rotation(animation.getObjetToAnimate());
                    }
                    Thread.sleep(10);
                    animation.getObjetToAnimate().setPosx(this.increaseOrDecreaseBalance(animation.getObjetToAnimate().getPosx(), animation.getDestinationPosX()));
                    animation.getObjetToAnimate().setPoxy(this.incrementFormula(slope, animation.getObjetToAnimate().getPosx(), b));
                    grapherPanel.repaint();
                }
                System.out.println("SALI");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int incrementFormula(double m, int x, double b) {
        double result = m * x + b;
        return (int) Math.round(result);
    }

    private double calculateSope(BasicGeometricObject objet, int dPosX, int dPosY) {
        double posXStart = objet.getPosx();
        double posYStart = objet.getPoxy();
        double dPosXD = dPosX;
        double dPosYD = dPosY;
        return (dPosYD - posYStart) / (dPosXD - posXStart);
    }

    private boolean positionTheSame(BasicGeometricObject objet, int dPosX, int dPosY) {
        return (objet.getPosx() == dPosX) && (objet.getPoxy() == dPosY);
    }

    private void translation(BasicGeometricObject objet, int dPosX, int dPosY) {
        int posXStart = objet.getPosx();
        int posYStart = objet.getPoxy();

        objet.setPosx(increaseOrDecreaseBalance(posXStart, dPosX));
        objet.setPoxy(increaseOrDecreaseBalance(posYStart, dPosY));

    }

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
