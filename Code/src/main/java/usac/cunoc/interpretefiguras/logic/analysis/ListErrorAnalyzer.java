/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.analysis;

/**
 *
 * @author drymnz
 */
public enum ListErrorAnalyzer {
    LEXEMA_ONE("Simbolo no existe en el lenguaje");
    private String description;

    private ListErrorAnalyzer(String description) {
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
}
