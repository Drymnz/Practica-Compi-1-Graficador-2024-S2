/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package usac.cunoc.interpretefiguras;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;
import usac.cunoc.interpretefiguras.view.modifiedview.ViewMenuOne;

/**
 *
 * @author drymnz
 */
public class InterpreteFiguras {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ViewMenuOne views = new ViewMenuOne();
                //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                //views.setSize(screenSize.width - 150, screenSize.height - 150);
                views.setVisible(true);
                views.setLocationRelativeTo(null);
            }
        });
    }
    /*
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ViewsMenu views = new ViewsMenu();
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                views.setSize(screenSize.width - 150, screenSize.height - 150);
                views.setVisible(true);
                views.setLocationRelativeTo(null);
            }
        });
    }*/
}
