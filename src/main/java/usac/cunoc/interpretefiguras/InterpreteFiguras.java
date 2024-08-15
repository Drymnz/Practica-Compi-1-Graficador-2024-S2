/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package usac.cunoc.interpretefiguras;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.text.View;
import usac.cunoc.interpretefiguras.view.ViewsMenu;

/**
 *
 * @author drymnz
 */
public class InterpreteFiguras {

    public static final int HIGH = 1280;
    public static final int WIDTH = 720;
/* 
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewsMenu views = new ViewsMenu();
                views.setVisible(true);
                views.setLocationRelativeTo(null);
            }
        });
    } */
     /* public static void main(String[] args) {
        GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        ViewsMenu frame = new ViewsMenu();
        device.setFullScreenWindow(frame);

        // Agrega tus componentes al JFrame aquí

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } */
    
      public static void main(String[] args) {
        ViewsMenu frame = new ViewsMenu();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width-150, screenSize.height-150);

        // Agrega tus componentes al JFrame aquí

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
