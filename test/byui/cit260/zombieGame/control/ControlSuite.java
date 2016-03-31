/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author tyler
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({byui.cit260.zombieGame.control.InventoryControlTest.class, byui.cit260.zombieGame.control.GameControlTest.class, byui.cit260.zombieGame.control.FightControlTest.class, byui.cit260.zombieGame.control.MapControlTest.class})
public class ControlSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
