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
        int expResult = 2;
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
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testMayor() {
        System.out.println("mayor");
        int a = 0;
        int b = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testMayorA() {
        System.out.println("mayor");
        int a = 4;
        int b = 3;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testMayorB() {
        System.out.println("mayor");
        int a = 3;
        int b = 4;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testMayorIguales() {
        System.out.println("mayor");
        int a = 4;
        int b = 4;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testSumarVector() {
        System.out.println("sumarVector");
        int[] numeros = {1,2,3,4};
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testSumarVectorNega() {
        System.out.println("sumarVector");
        int[] numeros = {-1,-2,-3,-4};
        Operaciones instance = new Operaciones();
        int expResult = -10;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testSumarVectorNegaPosi() {
        System.out.println("sumarVector");
        int[] numeros = {-1,2,-3,4};
        Operaciones instance = new Operaciones();
        int expResult = 2;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
