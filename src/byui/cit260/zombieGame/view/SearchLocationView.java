/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Map;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import zombiegame.ZombieGame;
import static zombiegame.ZombieGame.energyBarCountArray;
import static zombiegame.ZombieGame.medKitCountArray;
import static zombiegame.ZombieGame.playerEnergyBarCount;
import static zombiegame.ZombieGame.playerMedKitCount;
import static zombiegame.ZombieGame.playerWaterCount;
import static zombiegame.ZombieGame.waterCountArray;
import static zombiegame.ZombieGame.weaponArray;

/**
 *
 * @author Boyd
 */
public class SearchLocationView extends View{
    
    
    
    public SearchLocationView(){
    super("\n"

            + "++++++++++++++++++++++++++++++++++++++"
            + "\nP - Pick Up Items"
            + "\nW - Pick Up Weapon"            
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
     );
    
    
    
    }    
    
    public SearchLocationView(String message) {
        super (message);
    }    
    

    @Override
    public boolean doAction(String value) throws IllegalFormatException {


                MainCharacter coordinates = new MainCharacter();
  
                
                int xCoord = coordinates.getXCoordinate();
                int yCoord = coordinates.getYCoordinate();       
        
        
 
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            
            case "W":// Pick up weapon
                
                
                if (ZombieGame.weaponArray[xCoord][yCoord] != null ){

                    String weaponString = ZombieGame.weaponArray[xCoord][yCoord];
                    
                    int i = 0;
                    
                    String readList = ZombieGame.weaponListArray[i];
                    
                    while (readList != null){
   
                        i++;
                        readList = ZombieGame.weaponListArray[i]; 
                       
                        }
                    
                    ZombieGame.weaponListArray[i] = weaponString;
                    
                    System.out.println( "\n" + weaponString + " has been picked up. A " + weaponString + " is not a toy.");                            

                    ZombieGame.weaponArray[xCoord][yCoord] = null;                   
                            
                    }              
                else{
                    
                System.out.println("\nNo weapon here, sorry. Try a karate chop?");                    
                    }

                break;
  
            case "P":// Pick up these items
                
    
                playerMedKitCount = playerMedKitCount + medKitCountArray[xCoord][yCoord];
                playerWaterCount = playerWaterCount + waterCountArray[xCoord][yCoord];
                playerEnergyBarCount = playerEnergyBarCount + energyBarCountArray[xCoord][yCoord];
                
                medKitCountArray[xCoord][yCoord] = 0;                
                waterCountArray[xCoord][yCoord] = 0;
                energyBarCountArray[xCoord][yCoord] = 0;

                break;
                
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
      
            }
 
       

          return false;     
        
    }



    
    
}
