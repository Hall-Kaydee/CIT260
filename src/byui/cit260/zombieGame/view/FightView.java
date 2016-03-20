/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.FightControl;
import byui.cit260.zombieGame.exceptions.DoubleFormatException;
import byui.cit260.zombieGame.exceptions.FightControlException;
import java.util.IllegalFormatException;
import java.util.Scanner;


/**
 *
 * @author Boyd
 */
public class FightView {
    

    
    
    
    public void getFightResult() throws FightControlException {
 
    double charDam = 0;
    double enmHealth = 0;
    int numOfEnemies = 0;
    double enmDamage = 0;
    double chrHealth = 0;
    int chrHitPnts = 0;
        
    Scanner in = new Scanner(System.in);        
        
    try {

       System.out.printf("\nEnter character damage:  ");
       charDam = in.nextDouble();        
    }
    catch                   
            
       (IllegalFormatException me){
        System.out.println(me.getMessage());
        
        }
     
      //  catch (DoubleFormatException nf){
   
      // System.out.println("\nValue must be a double number:  ");   
          
      //  }    
       
    try { 
        
      
       System.out.printf("\nEnter enemy health:  ");
       enmHealth = in.nextDouble(); 
        } 
    catch                   
            
       (IllegalFormatException me){
        System.out.println(me.getMessage());
        
        }  
    
    
    try {   
  
       System.out.printf("\nEnter number of enemies:  ");
       numOfEnemies = in.nextInt(); 
       
        } 
    catch                   
            
       (IllegalFormatException me){
        System.out.println(me.getMessage());
        
        }         
       
       
       FightControl fightControl = new FightControl();
       double enemyHealthResult = fightControl.calcEnemyHealth(charDam, enmHealth, numOfEnemies);
        //return enemyHealthResult;
        
        

        
       System.out.println("\nEnemy health is " + enemyHealthResult);
       

       
    try {   
       
       System.out.printf("\nEnter enemy damage:  ");
       enmDamage = in.nextDouble();

        } 
    
    catch                   
            
       (IllegalFormatException me){
        System.out.println(me.getMessage());
        
        }        
       

       //System.out.printf("\nEnter number of enemies:  "); redundantl
       
       //double numEnemies = in.nextDouble();       
       
    try {

       System.out.printf("\nEnter character health:  ");
       chrHealth = in.nextDouble(); 
    }
    catch                   
            
       (IllegalFormatException me){
        System.out.println(me.getMessage());
        
        } 

    try {
        
    
       System.out.printf("\nEnter character hit points:  ");
       chrHitPnts = in.nextInt();
        }

    catch                   
            
       (IllegalFormatException me){
        System.out.println(me.getMessage());
        
        } 

       
       double charHealthResult = fightControl.calcCharacterHealth(enmDamage, numOfEnemies, chrHealth, chrHitPnts);
       
       System.out.println("\nCharacter health is " + charHealthResult);

       
 
     
    }
    
    
   
    
    

    private void printMessage (){
     
        System.out.println("\nFightView class called");

    }


    
}
