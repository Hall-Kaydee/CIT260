/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.FightControl;
import byui.cit260.zombieGame.exceptions.DoubleFormatException;
import java.util.Scanner;


/**
 *
 * @author Boyd
 */
public class FightView {
    
    
    public void getFightResult() /*throws DoubleFormatException */ {
 
     Scanner in = new Scanner(System.in);        
        
     //try {

       System.out.printf("\nEnter character damage:  ");
       double charDam = in.nextDouble();        


     
      //  catch (DoubleFormatException nf){
   
      // System.out.println("\nValue must be a double number:  ");   
          
      //  }    
       
       
       System.out.printf("\nEnter enemy health:  ");
       double enmHealth = in.nextDouble();       

       System.out.printf("\nEnter number of enemies:  ");
       int numOfEnemies = in.nextInt();   
       
       FightControl fightControl = new FightControl();
       double enemyHealthResult = fightControl.calcEnemyHealth(charDam, enmHealth, numOfEnemies);
        //return enemyHealthResult;
        
       System.out.println("\nEnemy health is " + enemyHealthResult);
       

       System.out.printf("\nEnter enemy damage:  ");
       double enmDamage = in.nextDouble();

       //System.out.printf("\nEnter number of enemies:  "); redundantl
       
       //double numEnemies = in.nextDouble();       
       
       System.out.printf("\nEnter character health:  ");
       double chrHealth = in.nextDouble();       

       System.out.printf("\nEnter character hit points:  ");
       int chrHitPnts = in.nextInt();
       
       double charHealthResult = fightControl.calcCharacterHealth(enmDamage, numOfEnemies, chrHealth, chrHitPnts);
       
       System.out.println("\nCharacter health is " + charHealthResult);

       
 
     
    }
    
    
   
    
    

    private void printMessage (){
     
        System.out.println("\nFightView class called");

    }


    
}
