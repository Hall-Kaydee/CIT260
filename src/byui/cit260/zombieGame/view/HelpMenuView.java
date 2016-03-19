/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import java.util.Scanner;
/**
 *
 * @author Boyd
 */
public class HelpMenuView extends View {

    public HelpMenuView(){
    super("\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Help Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nG - What is the goal?"
            + "\nM - How do you move?"
            + "\nI - How do you view and use items?" // Luanches the inventory view
            + "\nF - How do you fight enemies?"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
    );
    }
    private boolean promptMessage;
    
    public HelpMenuView(String message) {
        super (message);
    }

    

    void displayHelpMenuView() {

                boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doAction(menuOption);
            }
        while (!done);
    
    }

    

    
    @Override
    public boolean doAction(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "G"://what is the goal?
                System.out.println("\nThe Goal is to get safely to the refugee camp");
                break;
            
            case "M"://How to move
                System.out.println("\nTo move... use the arrows and the spacebar bal ha bal");
               break;
               
            case "I"://how to get items noted out to test inventory menu -Evan
               System.out.println("\nYou collect items in different areas of the map."
                                 + "\n Here you can Look at what Items you currently have" 
                                 + "\n You can use these items to help you on your journey"
                               + "\n You can also drop these idems if you are carring to much" 
                                );
                    
                InventoryView inventoryView = new InventoryView();
                  inventoryView.display();
                break;
            
      
                
            case "F"://combat - how to fight
                System.out.println("\nTo engage in combat..KILL EVERYTHING!!!!!.");
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    

  

    
}
