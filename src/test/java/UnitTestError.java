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

import static org.junit.jupiter.api.Assertions.*;

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
        Reader reader = new StringReader("graficar circulo (circulo_6, (50 + 25), (150 + 25), (10 + 12), lila) ");
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
