/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.Reader;
import java.io.StringReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import usac.cunoc.interpretefiguras.logic.analysis.Lexema;
import usac.cunoc.interpretefiguras.logic.analysis.parser;
import usac.cunoc.interpretefiguras.logic.animition.Animation;

/**
 *
 * @author drymnz
 */
public class UnitTestTwo {
    
    private String textosdepureva = ""+ 
"graficar circulo (circulo_1, 25 * 2, 100 / 2, 5 * 4, rojo)\n" +//1
"graficar circulo (circulo_2, 50 + 50, 50 + 50, 3 * 5, azul)\n" +//2
"graficar circulo (circulo_3, (50 + 25), 100 / 4, 20 / 2, verde)\n" +//3
"graficar circulo (circulo_4, (10 * 3) - 5, 80 / 2, 6 * 3, amarillo)\n" +//4
"graficar circulo (circulo_5, (40 + 20) * 2, (50 - 20) + 30, (15 + 10) / 5, negro)\n" +//5
"\n" +//6
"\n" +//7
"graficar cuadrado (cuadrado_1, 100 * 2, 50 * 4, 6 * 5, corinto)\n" +//8
"graficar cuadrado (cuadrado_2, 50 * 3, (100 + 50), 10 * 4, celeste)\n" +//9
"graficar cuadrado (cuadrado_3, (30 * 2) + 40, 25 * 3, (30 - 10), fusia)\n" +//10
"graficar cuadrado (cuadrado_4, (80 + 20) + 25, (100 / 2) - 10, (20 + 15), lila)\n" +//11
"graficar cuadrado (cuadrado_5, 60 * 3, 30 * 3, (100 - 50) / 2, verde)\n" +//12
"\n" +//13
"\n" +//14
"graficar rectangulo (rectangulo_1, 150 * 2, 50 * 2, 10 * 5, 6 * 5, negro)\n" +//15
"graficar rectangulo (rectangulo_2, 125 * 2, 100 * 2, 10 * 4, 5 * 4, azul)\n" +//16
"graficar rectangulo (rectangulo_3, (100 + 50) + 50, (50 + 25) * 2, 20 * 3, 5 * 5, rojo)\n" +//17
"graficar rectangulo (rectangulo_4, (75 + 25) * 2, (200 - 50) / 2, (40 + 15), (20 + 15), celeste)\n" +//18
"graficar rectangulo (rectangulo_5, (200 + 75), (100 + 25), (30 + 15), (10 + 5), verde)\n" +//19
"\n" +//20
"\n" +//21
"graficar linea (linea_1, 0, 0, 20 * 5, 10 * 10, rojo)\n" +//22
"graficar linea (linea_2, 10 * 5, 50 * 3, 100 * 2, 10 * 5, azul)\n" +
"graficar linea (linea_3, (20 * 4) + 25, 25 * 3, 50 * 3, 100 * 2, verde)\n" +
"graficar linea (linea_4, 100 * 3, 0, 0, 100 * 3, amarillo)\n" +
"graficar linea (linea_5, (75 + 25) + 50, (150 + 50) - 25, (200 + 100) / 2, (150 + 50) * 2, fusia)\n" +
"\n" +
"\n" +
"graficar poligono (poligono_1, 200 * 2, 100 * 3, 5, 10 * 5, 10 * 5, corinto)\n" +
"graficar poligono (poligono_2, (300 + 50), (200 + 50), 6, 10 * 4, 20 * 3, celeste)\n" +
"graficar poligono (poligono_3, 100 * 3, 50 * 4, 7, (20 + 10), (30 + 15), fusia)\n" +
"graficar poligono (poligono_4, (200 + 50), (100 + 50), 8, (40 + 15), (40 + 15), lila)\n" +
"graficar poligono (poligono_5, 100 * 2, 50 * 2, 9, (20 + 15), (30 + 20), verde)\n" +
"\n" +
"\n" +
"graficar circulo (circulo_6, (50 + 25), (150 + 25), (10 + 12), lila)\n" +
"graficar circulo (circulo_7, (100 + 25), (200 + 25), (10 + 8), celeste)\n" +
"graficar circulo (circulo_8, (25 * 2) + 10, (30 + 50) * 2, (10 + 5), corinto)\n" +
"\n" +
"\n" +
"graficar cuadrado (cuadrado_6, (200 + 25), (50 + 25), (20 + 5), negro)\n" +
"graficar cuadrado (cuadrado_7, (150 + 25), (100 + 25), (20 + 10), amarillo)\n" +
"graficar cuadrado (cuadrado_8, (40 + 50) * 2, (50 + 10) + 15, (20 + 8), lila)\n" +
"\n" +
"\n" +
"graficar rectangulo (rectangulo_6, (300 + 50), (100 + 50), (50 + 15), (20 + 10), azul)\n" +
"graficar rectangulo (rectangulo_7, (250 + 25), (200 + 25), (40 + 15), (30 + 10), verde)\n" +
"graficar rectangulo (rectangulo_8, (150 + 50) + 25, (75 + 25) - 20, (50 + 20), (25 + 10), rojo)\n" +
"\n" +
"\n" +
"graficar linea (linea_6, 10 * 5, 50 * 5, 50 * 5, 10 * 5, verde)\n" +
"graficar linea (linea_7, 50 * 3, 100 * 3, 100 * 3, 50 * 3, fusia)\n" +
"graficar linea (linea_8, 0, 50 * 3, 100 * 4, 50 * 3, celeste)\n" +
"\n" +
"\n" +
"graficar poligono (poligono_6, (400 + 50), (300 + 50), 10, (50 + 10), (50 + 10), corinto)\n" +
"graficar poligono (poligono_7, 100 * 4, 100 * 3, 12, (30 + 20), (50 + 20), amarillo)\n" +
"graficar poligono (poligono_8, (300 + 50), (200 + 50), 15, (30 + 10), (40 + 15), lila)\n" +
"\n" +
"\n" ;
    
    
    private Lexema lexeman;
    private parser parse;
    
    public UnitTestTwo() {
    }
    
    @Test
    public void TestEmpty() {
        Assertions.assertTrue(true);
    }
    
    
    @Test
    public void TestComplex() {
        Reader reader = new StringReader(textosdepureva);
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
        try {
            this.parse.parse();
            for (int i = 0; i < this.parse.getLisGeometricObject().size(); i++) {
                System.out.println(this.parse.getLisGeometricObject().get(i).toString());
            }
        } catch (Exception e) {
            System.out.println(e);
            Assertions.assertTrue(false);
        }
        Assertions.assertTrue(true);
    }
    @Test
    public void TestAnimation() {
        Reader reader = new StringReader("graficar poligono ( PoligA, (2.3-2)*12  + 2 -1/12, 15, 6, 50 / 2, 12, amarillo)\n" + //
                        "graficar circulo ( cir_Uno,  15, 6, 5  * 2 -1/12-(1.5*3), azul)\n" + //
                        "animar objeto anterior (curva, 50*3-4, 75+ 15/5, 2-1)\n" + //
                        "\n" + //2 *(100) le falta ->* falta 16 / 4,
                        "graficar rectangulo (RectAngulo_test_1, 12 * 3 + 2 *(100), 2*60.50, 16 / 4, 16 / 4,rojo)\n" + //
                        "animar objeto anterior (linea, 300, 6+ 15/5+112, 2-1/2+1)\n" + //
                        "graficar linea (linea_Amarillo, 1 * 3 + 2, 7.5+7.5, 4 / 4+100, 30/2, amarillo)\n" + //
                        "animar objeto anterior (linea, 120, 15, 3)\n" + //
                        "animar objeto anterior (linea, 150, 200, 0)\n" + //
                        "graficar cuadrado ( figura_cuadrada, 12*3+200, 15+1+300, (15-3) / 4+1.8+0.2, verde)\n" + //
                        "graficar poligono ( PoligB, 100, 400, 9, 25 / 2 + 100.5, 50*2-10, amarillo)\n" + //
                        "\n" + //
                        "");
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
        try {
            this.parse.parse();
        } catch (Exception e) {
            System.out.println("****************************");
            System.out.println(e.getMessage());
            System.out.println("****************************");
            Assertions.assertTrue(false);
        }
        Assertions.assertTrue(true);
    }
    
    @Test
    public void TestAnimationList() {
        Reader reader = new StringReader("graficar poligono ( PoligA, (2.3-2)*12  + 2 -1/12, 15, 6, 50 / 2, 12, amarillo)\n" + //
                        "graficar circulo ( cir_Uno,  15, 6, 5  * 2 -1/12-(1.5*3), azul)\n" + //
                        "animar objeto anterior (curva, 50*3-4, 75+ 15/5, 2-1)\n" + //
                        "\n" + //2 *(100) le falta ->* falta 16 / 4,
                        "graficar rectangulo (RectAngulo_test_1, 12 * 3 + 2 *(100), 2*60.50, 16 / 4, 16 / 4,rojo)\n" + //
                        "animar objeto anterior (linea, 300, 6+ 15/5+112, 2-1/2+1)\n" + //
                        "graficar linea (linea_Amarillo, 1 * 3 + 2, 7.5+7.5, 4 / 4+100, 30/2, amarillo)\n" + //
                        "animar objeto anterior (linea, 120, 15, 3)\n" + //
                        "animar objeto anterior (linea, 150, 200, 0)\n" + //
                        "graficar cuadrado ( figura_cuadrada, 12*3+200, 15+1+300, (15-3) / 4+1.8+0.2, verde)\n" + //
                        "graficar poligono ( PoligB, 100, 400, 9, 25 / 2 + 100.5, 50*2-10, amarillo)\n" + //
                        "\n" + //
                        "");
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
        try {
            this.parse.parse();
            for (Animation elemt :  this.parse.getListAnimation()) {
                System.out.println(elemt.toString());
            }

        } catch (Exception e) {
            System.out.println("****************************");
            System.out.println(e.getMessage());
            System.out.println("****************************");
            Assertions.assertTrue(false);
        }
        Assertions.assertTrue(true);
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
