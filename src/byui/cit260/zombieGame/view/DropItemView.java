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
public class DropItemView  {
 
  
    public void displayDropItem(){
       
        char selection = ' ';
        
        do {
            
            System.out.println("Enter an Item to drop");// display the main menu
            
            String input = this.getInput();// get the user selection
            selection = input.charAt(0);//get first character of string
            
            this.doActionDrop(selection);//do action based on selection
            
          }
        
        while (selection != 'E');//while selection is not exit
        
    }    

    void dropInvetoryItem() {

                boolean done = false;// set flag to not done.
        do{
            //prompt for input
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doActionDrop(menuOption);
            }
        while (!done);
    
    }

    private String getInput() {



    return "WHAT_AM_I? See line 95";
    }

    private String getMenuOption() {
     
        
        Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "     ";
            boolean valid = false;//setflag to invalid valid entered
            while (!valid) {
                //while a valid name has not been retrieved
                
              
               
              
                
                value = keyboard.nextLine();//get the name from the keyboard
                
                value = value.trim();//trim off the excess blanks
                
                // if the name is invalid < one character in length
                
                if (value.length() < 1){
                
                System.out.println("invalid value - the value cannot be blank.");
                
                continue;//and repeat again
                
                        }
                
                valid = true;//set flag to end repetition
                
                }

                return value;//return the value       
    
    
    
    
    
    }
    public boolean doActionDrop(String choice){
    
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


    void dropInventoryItem() {
        this.displayDropItem();
    }

    public void doActionDrop(char selection) {
        this.dropInvetoryItem();
    }

    
    
    
    
}
