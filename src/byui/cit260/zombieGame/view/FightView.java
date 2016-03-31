/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.FightControl;
import byui.cit260.zombieGame.exceptions.DoubleFormatException;
import byui.cit260.zombieGame.exceptions.FightControlException;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Scene;
import byui.cit260.zombieGame.model.Zombie;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Boyd
 */
public class FightView {

    

    public void getFightResult() throws FightControlException  {
 
        double charDam = 0.0;
        //int enmHealth;
        //int numOfEnemies;
        //int enmDamage;
        double chrHealth = 0;
        double chrHitPnts = 0;
        
        
        
        

                MainCharacter xCoordinate = new MainCharacter();
                MainCharacter yCoordinate = new MainCharacter();

                int xCoord = xCoordinate.getXCoordinate();
                int yCoord = yCoordinate.getYCoordinate(); 

                Scene sceneData = new Scene ();
                Zombie zombieData = new Zombie ();

                int[] sceneDataArray = sceneData.buildScenes(xCoord, yCoord);
                int[] zombieDataArray = zombieData.buildZombies(xCoord, yCoord);

                int enmHealth = zombieDataArray[1];
                int enmDamage = zombieDataArray[0];
                int numOfEnemies = sceneDataArray[0];
                String zombieDescription = zombieData.buildZombieDescriptions(xCoord, yCoord);

                Scanner in = new Scanner(System.in);        
        


                MainCharacter mainCharacter = new MainCharacter();

                charDam = mainCharacter.getCharDam();        


                FightControl fightControl = new FightControl();

                double enemyHealthResult = fightControl.calcEnemyHealth
                                     (charDam, enmHealth, numOfEnemies);
                 //return enemyHealthResult;


                System.out.println("\n" + zombieDescription);        

                System.out.println("\nZombie health is " + enemyHealthResult);

                Zombie zombieHealthWrite = new Zombie();

                zombieHealthWrite.setZombieHealth((int) enemyHealthResult);

                
                chrHealth = mainCharacter.getCharHealth();   
       
     
 
                chrHitPnts = mainCharacter.getHitPoints();        
   

                double charHealthResult = fightControl.calcCharacterHealth
                                (enmDamage, numOfEnemies, chrHealth, chrHitPnts);
                
                System.out.println("\nCharacter health is " + charHealthResult);
       
                MainCharacter charHealthWrite = new MainCharacter();
       
                charHealthWrite.setCharHealth(charHealthResult);
                

   
        }
        

      
    }
    
    
   
