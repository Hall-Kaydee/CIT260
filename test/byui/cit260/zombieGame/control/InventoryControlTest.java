/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tyler
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcItemWeight method, of class InventoryControl.
     * Test 1
     */
    @Test
    public void testCalcItemWeight() 
    {
        System.out.println("calcItemWeight");
        double quantity = 4;
        double gramsPerItem = 250;
        InventoryControl instance = new InventoryControl();
        double expResult = 1;
        double result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
    /**test 2**/ 
  
        System.out.println("\tTest Case #2");
        quantity = -3;
        gramsPerItem = 300;
        expResult = 1;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    
    /**test 3**/
    
        System.out.println("\tTest Case #3");
        quantity = 4;
        gramsPerItem = 900;
        expResult = 1;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    
    /**test 4**/
        
        System.out.println("\tTest Case #4");
        quantity = 2;
        gramsPerItem = 0;
        expResult = 1;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail
    
    /**test 5**/
        
        System.out.println("\tTest Case #5");
       quantity = 50;
        gramsPerItem = 1;
        expResult = 1;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    /**test 6**/
        
        System.out.println("\tTest Case #6");
        quantity = 0;
        gramsPerItem = 50000;
        expResult = 1;
         result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    /**test 7**/
        
        System.out.println("\tTest Case #7");
        quantity = 5;
        gramsPerItem = 1700;
        expResult = 1;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype."); 
    
    }
