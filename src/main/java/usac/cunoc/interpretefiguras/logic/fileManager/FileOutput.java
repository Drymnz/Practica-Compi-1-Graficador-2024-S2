/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.fileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author drymnz
 */
public class FileOutput implements Runnable {

    private FileOutputStream salida;
    private File archivoHilo;
    private String contenidoHilo;

    public boolean aguardarTexto(File archivo, String contenido) {
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytes = contenido.getBytes();
            salida.write(bytes);
            salida.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void run() {
        aguardarTexto(archivoHilo, contenidoHilo);
    }

    public void setArchivoHilo(File archivoHilo) {
        this.archivoHilo = archivoHilo;
    }

    public void setContenidoHilo(String contenidoHilo) {
        this.contenidoHilo = contenidoHilo;
    }

}