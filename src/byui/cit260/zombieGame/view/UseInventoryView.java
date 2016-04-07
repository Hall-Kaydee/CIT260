/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.model.MainCharacter;
import java.util.IllegalFormatException;
import zombiegame.ZombieGame;
import static zombiegame.ZombieGame.energyBarCountArray;
import static zombiegame.ZombieGame.medKitCountArray;
import static zombiegame.ZombieGame.playerEnergyBarCount;
import static zombiegame.ZombieGame.playerMedKitCount;
import static zombiegame.ZombieGame.playerWaterCount;
import static zombiegame.ZombieGame.waterCountArray;

/**
 *
 * @author Boyd
 */
public class UseInventoryView extends View{
    
    
    public UseInventoryView(){
    super(
            "\nNumber of Medkits: " + Integer.toString(ZombieGame.playerMedKitCount) 
                          + "   Number of Water Bottles: " + Integer.toString(ZombieGame.playerWaterCount)
                          + "   Number of Energy Bars: " + Integer.toString(ZombieGame.playerEnergyBarCount)  
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nM - Use Medkits"
            + "\nW - Use Water Bottles"
            + "\nE - Use Energy Bars"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
     );
    
    
    
    }    
    
    public UseInventoryView(String message) {
        super (message);
    }    
    
    @Override
    public boolean doAction(String value) throws IllegalFormatException {


        MainCharacter inventory = new MainCharacter();
  
        double newHealth = inventory.getCharHealth();
        double newHitPoints = inventory.getHitPoints();                

        value = value.toUpperCase(); //convert choice to upper case
        
        
          
        
        switch (value){
            
            case "M":// use medkits

                if (newHealth > 0){

                    newHealth = newHealth + (playerMedKitCount * 2);

                    inventory.setCharHealth(newHealth);                

                    playerMedKitCount = 0;
                }
                
                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }

                
                
                break;
            case "W"://View inventory items?

                if (newHealth > 0){
                    
                    newHealth = newHealth + (playerWaterCount * 1.5);

                    inventory.setCharHealth(newHealth);                

                    playerWaterCount = 0; 
                
                }

                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }

                
                break;  

            
            case "E"://View inventory items?

                if (newHitPoints > 0){

                    newHitPoints = newHitPoints + (playerEnergyBarCount * 0.1);

                    inventory.setHitPoints(newHitPoints);                

                    playerEnergyBarCount = 0;
                
                }
                
                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }                
                
                 
                break;               


            default:
                System.out.println("\nInvalid selection. Try again");
                break;
      
            }
 
       

          return false;     
        
    }    
    
    
    
    
}
