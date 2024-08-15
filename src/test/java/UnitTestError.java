/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import usac.cunoc.interpretefiguras.logic.analysis.Lexema;
import usac.cunoc.interpretefiguras.logic.analysis.parser;
import usac.cunoc.interpretefiguras.logic.geometry.BasicGeometricObject;
import usac.cunoc.interpretefiguras.logic.reports.ReportErrorInterpreter;

import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author drymnz
 */
public class UnitTestError {
        
    private parser parse;
    private Lexema lexeman;

    public UnitTestError() {
    }


    @Test
    public void TestErrorUno() {
        Reader reader = new StringReader("graficar circulo  circulo_6, (50 + 5), (150 + 25),15 , lila) \n"
        +"graficar circulo (circulo_7, (50 + 25), (150 + 25), (10 + 12), lila)");
        this.lexeman = new Lexema(reader);
        this.parse = new parser(this.lexeman);
        try {
            this.parse.parse();
            for (ReportErrorInterpreter iterable_element : this.lexeman.getListError()) {
                System.out.println("lexeman-ERROR");
                System.out.println(iterable_element.toString());
            }
            for (ReportErrorInterpreter iterable_element : this.parse.getListError()) {
                System.out.println("parse-ERROR");
                System.out.println(iterable_element.toString());
            }
            for (BasicGeometricObject iterable_element : this.parse.getLisGeometricObject()) {
                System.out.println("recoleccion");
                System.out.println(iterable_element.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
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
