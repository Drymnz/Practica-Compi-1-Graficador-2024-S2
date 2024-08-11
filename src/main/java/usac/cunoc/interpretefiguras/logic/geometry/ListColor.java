/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.geometry;

import java.awt.Color;

/**
 *
 * @author drymnz
 */
public enum ListColor {
    BLUE("azul",Color.BLUE),//1
    RED("rojo",Color.RED),//2
    YELLOW("amarillo",Color.YELLOW),//3
    GREEN("verde",Color.GREEN),//4
    BLACK("negro",Color.BLACK),//1
    CYAN("celeste",Color.cyan),//2
    FUCHSIA("fucsia", new Color (255, 0, 90)),//3
    LAVENDER ("lavanda", new Color (181,126,220)),//4
    MAROON("corinto", new Color (146,0,10))//5
    ;
    
    private String nameColor;
    private Color color;

    private ListColor(String nameColor, Color color) {
        this.nameColor = nameColor;
        this.color = color;
    }
    
    public Color getColor(){return this.color;}
}
