/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.fileManager;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author drymnz
 */
public class JPanelToPNG implements Runnable {

    private File archivoHilo;
    private JPanel jPanelHilo;
    private FileOutputStream salida;

    public JPanelToPNG() {
    }

    public JPanelToPNG(File archivoHilo, JPanel jPanelHilo) {
        this.archivoHilo = archivoHilo;
        this.jPanelHilo = jPanelHilo;
    }

    public boolean savePNG(File archivo, JPanel jPanle) {
        // Captura el JPanel como una imagen
        BufferedImage image = new BufferedImage(jPanle.getWidth(), jPanle.getHeight(), BufferedImage.TYPE_INT_ARGB);
        try {
            Graphics2D g2d = image.createGraphics();
            jPanle.paint(g2d);
            g2d.dispose();//liberar memoria
            ImageIO.write(image, "png", archivo);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar la imagen: " + e.getMessage());
            return false;
        }
    }

    @Override
    public void run() {
        if (this.archivoHilo != null && this.jPanelHilo != null) {
            savePNG(this.archivoHilo, this.jPanelHilo);
        }
    }

}
