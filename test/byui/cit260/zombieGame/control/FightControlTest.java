/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.exceptions.FightControlException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tyler
 */
public class FightControlTest {
    
    public FightControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calcEnemyHealth method, of class FightControl.
     */
    @Test
    public void testCalcEnemyHealth() {
        System.out.println("calcEnemyHealth Test #1");
        double charDamage = 30.0;
        double enemyHealth = 3.0;
        int numberOfEnemies = 3;
        FightControl instance = new FightControl();
        double expResult = -7.0;
        double result = instance.calcEnemyHealth(charDamage, enemyHealth, numberOfEnemies);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        System.out.println("calcEnemyHealth Test #2");
        charDamage = 15.0;
        enemyHealth = 4.0;
        numberOfEnemies = 5;

        expResult = 1.0;
        result = instance.calcEnemyHealth(charDamage, enemyHealth, numberOfEnemies);
        assertEquals(expResult, result, 0.0);        
        
        System.out.println("calcEnemyHealth Test #3");
        charDamage = 3.0;
        enemyHealth = -1.0;
        numberOfEnemies = 2;

        expResult = -1;
        result = instance.calcEnemyHealth(charDamage, enemyHealth, numberOfEnemies);
        assertEquals(expResult, result, 0.0);


        System.out.println("calcEnemyHealth Test #4");
        charDamage = 5.0;
        enemyHealth = 4.0;
        numberOfEnemies = -1;

        expResult = -1;
        result = instance.calcEnemyHealth(charDamage, enemyHealth, numberOfEnemies);
        assertEquals(expResult, result, 0.0); 


        System.out.println("calcEnemyHealth Test #5");
        charDamage = -4.0;
        enemyHealth = 0.0;
        numberOfEnemies = 6;

        expResult = -1;
        result = instance.calcEnemyHealth(charDamage, enemyHealth, numberOfEnemies);
        assertEquals(expResult, result, 0.0);


        System.out.println("calcEnemyHealth Test #6");
        charDamage = 99.0;
        enemyHealth = 99.0;
        numberOfEnemies = 99;

        expResult = 98.0;
        result = instance.calcEnemyHealth(charDamage, enemyHealth, numberOfEnemies);
        assertEquals(expResult, result, 0.0); 


        System.out.println("calcEnemyHealth Test #7");
        charDamage = 1.0;
        enemyHealth = 1.0;
        numberOfEnemies = 1;

        expResult = 0.0;
        result = instance.calcEnemyHealth(charDamage, enemyHealth, numberOfEnemies);
        assertEquals(expResult, result, 0.0); 
        
        
    }

    /**
     * Test of calcCharacterHealth method, of class FightControl.
     */
    @Test
    public void testCalcCharacterHealth() throws FightControlException {
        System.out.println("calcCharacterHealth Test #1");
        double enemyDamage = 10.0;
        double numberOfEnemies = 3.0;
        double characterHealth = 80.0;
        int charHitPoints = 5;
        FightControl instance = new FightControl();
        double expResult = 74.0;
        double result = instance.calcCharacterHealth(enemyDamage, numberOfEnemies, characterHealth, charHitPoints);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        System.out.println("calcCharacterHealth Test #2");
        enemyDamage = 8.0;
        numberOfEnemies = 5.0;
        characterHealth = 55.0;
        charHitPoints = 8;

        expResult = 51.4;
        result = instance.calcCharacterHealth(enemyDamage, numberOfEnemies, characterHealth, charHitPoints);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcCharacterHealth Test #3");
        enemyDamage = -1.0;
        numberOfEnemies = 2.0;
        characterHealth = -11.0;
        charHitPoints = 0;

        expResult = -1;
        result = instance.calcCharacterHealth(enemyDamage, numberOfEnemies, characterHealth, charHitPoints);
        assertEquals(expResult, result, 0.0);

        System.out.println("calcCharacterHealth Test #4");
        enemyDamage = 8.0;
        numberOfEnemies = -1.0;
        characterHealth = 6.0;
        charHitPoints = 9;

        expResult = -1;
        result = instance.calcCharacterHealth(enemyDamage, numberOfEnemies, characterHealth, charHitPoints);
        assertEquals(expResult, result, 0.0);
        

        System.out.println("calcCharacterHealth Test #5");
        enemyDamage = 2.0;
        numberOfEnemies = 6.0;
        characterHealth = -4.0;
        charHitPoints = -5;

        expResult = -1;
        result = instance.calcCharacterHealth(enemyDamage, numberOfEnemies, characterHealth, charHitPoints);
        assertEquals(expResult, result, 0.0);

        System.out.println("calcCharacterHealth Test #6");
        enemyDamage = 99.0;
        numberOfEnemies = 99.0;
        characterHealth = 100.0;
        charHitPoints = 10;

        expResult = 11.0;
        result = instance.calcCharacterHealth(enemyDamage, numberOfEnemies, characterHealth, charHitPoints);
        assertEquals(expResult, result, 0.0);
        

        System.out.println("calcCharacterHealth Test #7");
        enemyDamage = 10.0;
        numberOfEnemies = 1.0;
        characterHealth = 1.0;
        charHitPoints = 10;

        expResult = -8.9;
        result = instance.calcCharacterHealth(enemyDamage, numberOfEnemies, characterHealth, charHitPoints);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
}
