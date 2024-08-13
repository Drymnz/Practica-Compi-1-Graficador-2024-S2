/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.animition;

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
    private GrapherPanel grapherPanel;

    public AnimateObjectGeometry(GrapherPanel grapherPanel, ArrayList<Animation> listAnimation, JButton jButton) {
        this.listAnimation = listAnimation;
        this.jButton = jButton;
        this.grapherPanel = grapherPanel;
    }

    private void animateObjects() {
        try {
            //ordenar nesesario 
            for (Animation animation : listAnimation) {
                boolean finish = false;
                System.out.println("ENTRE");
                while (!finish) {

                    if (animation.getTipy() == ListAnimation.CURVE) {
                        this.rotation(animation.getObjetToAnimate());
                    }
                    this.translation(animation.getObjetToAnimate(), animation.getDestinationPosX(), animation.getDestinationPosY());
                    finish = this.positionTheSame(animation.getObjetToAnimate(), animation.getDestinationPosX(), animation.getDestinationPosY());
                    Thread.sleep(10);
                    grapherPanel.repaint();
                }
                System.out.println("SALI");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        this.animateObjects();
        this.jButton.setEnabled(true);
    }
}
