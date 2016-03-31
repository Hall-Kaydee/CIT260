/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.exceptions.FightControlException;

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
                + "\nW - Select another weapon"
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
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        FightView fightView = new FightView();  
        
        switch (choice){
            
            case "F"://what is the goal?
                
                try {
                    fightView.getFightResult();
                    }
                catch
                        
                  (FightControlException me){
                   ErrorView.display(this.getClass().getName(),me.getMessage());
                  }
                 
               break;
            
            case "W"://How to move
                //System.out.println("\nView Equipment");
 
               break;
               
            case "S"://how to get items noted out to test inventory menu -Evan

  

            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }      
    
}
