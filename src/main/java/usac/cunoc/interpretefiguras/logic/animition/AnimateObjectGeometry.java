/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.animition;

import java.util.ArrayList;
import javax.swing.JButton;
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

    public AnimateObjectGeometry(GrapherPanel grapherPanel,ArrayList<Animation> listAnimation, JButton jButton) {
        this.listAnimation = listAnimation;
        this.jButton = jButton;
        this.grapherPanel = grapherPanel;
    }
    
    private void animateObjects(){
        int i = 0;
        do {
            try {
                for (Animation animation : listAnimation) {
                    animation.getObjetToAnimate().setPosx(animation.getObjetToAnimate().getPosx() + 100);
                }
                grapherPanel.repaint();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        } while (i < 100);
    }

    @Override
    public void run() {
        this.jButton.setEnabled(false);
        this.animateObjects();
        this.jButton.setEnabled(true);
    }
}
