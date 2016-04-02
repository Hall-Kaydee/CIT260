/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.exceptions.FightControlException;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Scene;
import byui.cit260.zombieGame.model.Zombie;
import zombiegame.ZombieGame;

/**
 *
 * @author Boyd
 */
public class ZombieMayhemView extends View{
    
    
    
    public ZombieMayhemView() {
        
    super ("\n"
                + "\n++++++++++++++++++++++++++++++++++++++"
                + "\n+  Fight Zombie Menu                  "
                + "\n++++++++++++++++++++++++++++++++++++++"
                + "\nF - Fight the zombies"
                + "\nS - Stop and take a chance on running"
                + "\nQ - Quit"
                + "\n++++++++++++++++++++++++++++++++++++++"
               
        );
    
  
    
    
    
    }     
    
    public ZombieMayhemView(String message) {
    super (message);
    }    
    
    @Override
    public boolean doAction(String choice){
    
  
        MainCharacter coordinates = new MainCharacter();
     
        int xCoord = coordinates.getXCoordinate();
        int yCoord = coordinates.getYCoordinate();


        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        FightView fightView = new FightView();  
        
        switch (choice){
            
            case "F"://what is the goal?
                
                try {
                    
                    Zombie zombieData = new Zombie ();
                    
                    int[] zombieDataArray = zombieData.buildZombies(xCoord, yCoord);

                    int enmHealth = zombieDataArray[1];
                    
                    zombieData.setMasterZombieHealth((double) enmHealth);

                    MainCharacter charStats = new MainCharacter();
                    fightView.getFightResult(charStats.getCharDam(), charStats.getCharHealth(), charStats.getHitPoints());
                    }
                catch
                        
                  (FightControlException me){
                   ErrorView.display(this.getClass().getName(),me.getMessage());
                  }
                 
               break;
            
               
            case "S"://how to get items noted out to test inventory menu -Evan

                System.out.println("\nSorry. You need to dispatch ALL the zombies or they will keep attacking you.");                
                
               break;  

            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }      
    
}
