/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author drymnz
 */
public class NewEmptyJUnitTestAnlysis {
    

    @Test
    public void testana(){
        
        try {
            String fileName = "test.txt";
            BufferedReader buffer = new BufferedReader(new FileReader(fileName));
            //Lexema customLexer = new Lexema(buffer);
            /* while (true) {
            CustomYytoken token = customLexer.yylex();
            if (token == null) break;
            System.out.println(token.toString());
            }*/
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Assertions.assertEquals(0, 0);
    }
}
