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
import static org.junit.jupiter.api.Assertions.*;
import usac.cunoc.interpretefiguras.logic.analysis.Lexema;
import usac.cunoc.interpretefiguras.logic.analysis.parser;

/**
 *
 * @author drymnz
 */
public class NewEmptyJUnitTest {

    private String textosdepureva = "graficar circulo (circulo_1, 25 * 2, 100 / 2, 5 * 4, rojo)\n"
            + "graficar circulo (circulo_2, 50 + 50, 50 + 50, 3 * 5, azul)\n"
            + "graficar circulo (circulo_3, (50 + 25), 100 / 4, 20 / 2, verde)\n"
            + "graficar circulo (circulo_4, (10 * 3) - 5, 80 / 2, 6 * 3, amarillo)\n"
            + "graficar circulo (circulo_5, (40 + 20) * 2, (50 - 20) + 30, (15 + 10) / 5, negro)";
    private Lexema lexeman;
    private parser parse;
    
    @Test
    public void TestEmpty() {
        Assertions.assertTrue(true);
    }
    

    @Test
    public void TestOne() {
        System.out.println(textosdepureva);
        Reader reader = new StringReader(textosdepureva);
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
        try {
            this.parse.parse();
        } catch (Exception e) {
            System.out.println(e);
            Assertions.assertTrue(false);
        }
        Assertions.assertTrue(true);
    }
    
    @Test
    public void TestTwo() {
        String pruva = "&";
        Reader reader = new StringReader(pruva);
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
        try {
            this.parse.parse();
        } catch (Exception e) {
            Assertions.assertTrue(this.lexeman.getListError().size() == 0);
        }
        Assertions.assertTrue(this.lexeman.getListError().size() == 1);
    }
    
    @Test
    public void TestTree() {
        Reader reader = new StringReader(this.textosdepureva + "ESTEESELERROR");
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
        try {
            this.parse.parse();
        } catch (Exception e) {
            Assertions.assertTrue(this.parse.getListError().size() == 1);
        }
        Assertions.assertTrue(this.parse.getListError().size() ==1);
    }
    

    public NewEmptyJUnitTest() {

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
