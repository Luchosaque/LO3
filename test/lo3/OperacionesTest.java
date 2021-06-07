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
        
        int a = 1;
        int b = 1;
        Operaciones instance = new Operaciones();
        int expResult = 2;//se espera q el resultado sea 2 pero x error de codigo el resultado es 3
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testSumarParNega() {
        
        int a = -1;
        int b = -1;
        Operaciones instance = new Operaciones();
        int expResult = -2;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testSumarParNegaPosi() {
        
        int a = -3;
        int b =  1;
        Operaciones instance = new Operaciones();
        int expResult = -2;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testSumarImpar() {
        
        int a = 2;
        int b = 1;
        Operaciones instance = new Operaciones();
        int expResult = 4;
//el resultado deberia ser 4, xq al ser impar el resultado (3) se le suma 1 haciendo q el resulado sea 3+1=4, pero x error de codigo el resultado es 3
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testSumarImparNega() {
        
        int a = -2;
        int b = -1;
        Operaciones instance = new Operaciones();
        int expResult = -2;
//el resultado deberia ser -2, xq al ser impar el resultado (-3) se le suma 1 haciendo q el resulado sea -3+1=-2, pero x error de codigo el resultado es -3
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testSumarImparNegaPosi() {
        
        int a = -2;
        int b =  1;
        Operaciones instance = new Operaciones();
        int expResult = 0;
//el resultado deberia ser 0, xq al ser impar el resultado (-1) se le suma 1 haciendo q el resulado sea -1+1=0, pero x error de codigo el resultado es -1
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
