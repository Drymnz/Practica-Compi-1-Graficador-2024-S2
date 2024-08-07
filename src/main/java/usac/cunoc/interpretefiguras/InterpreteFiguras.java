/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package usac.cunoc.interpretefiguras;

import javax.swing.text.View;
import usac.cunoc.interpretefiguras.view.ViewsMenu;

/**
 *
 * @author drymnz
 */
public class InterpreteFiguras {

    public static final int HIGH = 1280;
    public static final int WIDTH = 720;

    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewsMenu views = new ViewsMenu();
                views.setVisible(true);
                views.setLocationRelativeTo(null);
            }
        });
    }
}
