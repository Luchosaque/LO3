/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumarPar method, of class Operaciones.
     */
    @Test
    public void testSumarPar() {
        
        int a = 2;
        int b = 2;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mayor method, of class Operaciones.
     */
    @Test
    public void testMayor() {
        int a = 1;
        int b = 5;
        Operaciones instance = new Operaciones();
        int expResult = 5;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    @Test
    public void testSumarVector() {
        
        int[] numeros = null;//{1,4,8};
        Operaciones instance = new Operaciones();
        int expResult = 0;//13;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
        
    }
    
}
