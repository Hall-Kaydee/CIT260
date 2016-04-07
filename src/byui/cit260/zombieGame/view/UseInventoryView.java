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
                          
      
              "\n++++++++++++++++++++++++++++++++++++++"
            + "\nM - Use Medkits"
            + "\nW - Use Water Bottles"
            + "\nE - Use Energy Bars"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
     );
    
     System.out.println("\nNumber of Medkits: " + Integer.toString(ZombieGame.playerMedKitCount) 
          + "   Number of Water Bottles: " + Integer.toString(ZombieGame.playerWaterCount)
          + "   Number of Energy Bars: " + Integer.toString(ZombieGame.playerEnergyBarCount)); 
    
    }    
    
    public UseInventoryView(String message) {
        super (message);
    }    
    
    @Override
    public boolean doAction(String value) throws IllegalFormatException {

    System.out.println("\nNumber of Medkits: " + Integer.toString(ZombieGame.playerMedKitCount) 
                          + "   Number of Water Bottles: " + Integer.toString(ZombieGame.playerWaterCount)
                          + "   Number of Energy Bars: " + Integer.toString(ZombieGame.playerEnergyBarCount)
                             );
        

        MainCharacter inventory = new MainCharacter();
  
        double newHealth = inventory.getCharHealth();
        double newHitPoints = inventory.getHitPoints();                

        value = value.toUpperCase(); //convert choice to upper case
        
        
          
        
        switch (value){
            
            case "M":// use medkits

                if (newHealth > 0){

                    newHealth = newHealth + (ZombieGame.playerMedKitCount * 2);

                    inventory.setCharHealth(newHealth);                

                    ZombieGame.playerMedKitCount = 0;
                    

                }
                
                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }

                
                
                break;
            case "W"://View inventory items?

                if (newHealth > 0){
                    
                    newHealth = newHealth + (ZombieGame.playerWaterCount * 1.5);

                    inventory.setCharHealth(newHealth);                

                    ZombieGame.playerWaterCount = 0;
                    
                    System.out.println("\nNumber of Medkits: " + Integer.toString(ZombieGame.playerMedKitCount) 
                          + "   Number of Water Bottles: " + Integer.toString(ZombieGame.playerWaterCount)
                          + "   Number of Energy Bars: " + Integer.toString(ZombieGame.playerEnergyBarCount)
                             );
                
                }

                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }

                
                break;  

            
            case "E"://View inventory items?

                if (newHitPoints > 0){

                    newHitPoints = newHitPoints + (ZombieGame.playerEnergyBarCount * 0.1);

                    inventory.setHitPoints(newHitPoints);                

                    ZombieGame.playerEnergyBarCount = 0;

                    System.out.println("\nNumber of Medkits: " + Integer.toString(ZombieGame.playerMedKitCount) 
                          + "   Number of Water Bottles: " + Integer.toString(ZombieGame.playerWaterCount)
                          + "   Number of Energy Bars: " + Integer.toString(ZombieGame.playerEnergyBarCount)
                             );                    
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
