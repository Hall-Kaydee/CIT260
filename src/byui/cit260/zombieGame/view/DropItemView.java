/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import java.util.Scanner;

/**
 *
 * @author Evanator
 */
public class DropItemView extends View {

    public DropItemView() {
    super ("\nEnter an Item to drop");
    }



  
    

    void dropInventoryItem() {

                boolean done = false;// set flag to not done.
        do{
            //prompt for input
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
    
        // this is the drop item do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "WATER"://View inventory items?
                this.dropWaterItem();
                break;
            
            case "ENERGYBAR"://Use inventory item
                this.dropEnergybarItem();
               break;
               
            case "MEDKIT"://Drop item
                this.dropMedkititem();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }       

    private void dropMedkititem() {
        System.out.println("\n*** dropMedkititem() called");
    }

    private void dropEnergybarItem() {
        System.out.println("\n*** dropEnergybarItem() called");
    }

    private void dropWaterItem() {
        System.out.println("\n*** dropWaterItem() called");
    }


/*    void dropInventoryItem() {
        this.displayDropItem();
    }

    public void doActionDrop(char selection) {
        this.dropInventoryItem();
    }
*/
    
    
    
    
}
