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
        double quantity = 4.0;
        double gramsPerItem = 250.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 1.0;
        double result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
     {  
        System.out.println("test 2");
        quantity = -5.0;
        gramsPerItem = 300.0;
        
        expResult = -1.0;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
      {
         System.out.println("test 3");
        quantity = 2.0;
        gramsPerItem = 0.0;
        
        expResult = -1.0;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.   
            
      {
            System.out.println("test 4");
        quantity = 50.0;
        gramsPerItem = 1.0;
        
        expResult = 0.05;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail. 
        
      {
        System.out.println("test 5");
        quantity = 0.0;
        gramsPerItem = 5000.0;
        
        expResult = 0.0;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail. 
        {
        System.out.println("test 6");
        quantity = 5.0;
        gramsPerItem = 1700.0;
        
        expResult = 8.5;
        result = instance.calcItemWeight(quantity, gramsPerItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail. 
       }
      }
     }   
    }
   }
  }
   
}
