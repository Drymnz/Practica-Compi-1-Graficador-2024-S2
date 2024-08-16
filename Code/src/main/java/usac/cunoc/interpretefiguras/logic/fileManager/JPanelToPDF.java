/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.fileManager;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author drymnz
 */
public class JPanelToPDF implements Runnable {

    // Crear el documento PDF
    private Document document = new Document(PageSize.A4, 50, 50, 50, 50); // Ajustar márgenes
    private JPanel panel;
    private File file;
    private String tilePDF;

    public JPanelToPDF() {

    }

    public JPanelToPDF(JPanel panel, File file, String tilePDF) {
        this.panel = panel;
        this.file = file;
        this.tilePDF = tilePDF;
    }

    public boolean jPanelToPDF(JPanel panel, File file, String tilePDF) {
        try {
            // ... Agregar componentes al panel ...
            PdfWriter.getInstance(document, new FileOutputStream(file.getAbsoluteFile()));
            document.open();
            // Obtener una imagen del JPanel
            BufferedImage image = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = image.createGraphics();
            panel.paint(g2d);
            g2d.dispose();//liberar memoria
            // Agregar la imagen al PDF con un título y ajustar el tamaño
            Image pdfImage = Image.getInstance(image, null);
            pdfImage.scaleToFit(PageSize.A4.getWidth() - 100, PageSize.A4.getHeight() - 100); // Ajustar al tamaño de la página
            pdfImage.setAlignment(Image.ALIGN_CENTER);
            Paragraph title = new Paragraph(tilePDF, FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, Font.BOLD));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(pdfImage);
            // Agregar una tabla de contenido
            document.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JPanelToPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(JPanelToPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JPanelToPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void jPanelToPDF() {
        if (this.jPanelToPDF(this.panel, this.file, this.tilePDF)) {
            System.out.println("lo creo con exito");
        } else {
            System.out.println("no lo pudo crear");
        }
    }

    @Override
    public void run() {
        if (this.panel != null && this.file != null) {
            this.jPanelToPDF();
        }
    }

}
