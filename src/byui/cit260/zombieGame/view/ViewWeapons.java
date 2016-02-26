/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import java.util.Scanner;
import byui.cit260.zombieGame.view.HelpMenuView;
/**
 *
 * @author kaydeehall
 */
public class ViewWeapons {
    public final String WEAPONMENU = "\n"
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+                      Weapon Menu                             +"               
            + "\n+      You collect weapons in different areas of the map       +"
            + "\n+     Here you can Look at what weapons you currently have     +" 
            + "\n+     You can choose which weapon to help you on your journey  +"
            + "\n+   You can also drop these weapons if you are carring to much +"                                        
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+ V - View Your Weapons                                        +"
            + "\n+ U - Use Weapon                                               +"
            + "\n+ D - Drop Weapon                                              +"
            + "\n+ Q - Quit                                                     +"   
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            ;
    private boolean promptMessage;

    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            
            System.out.println(WEAPONMENU);// display the main menu
            
            String input = this.getInput();// get the user selection
            selection = input.charAt(0);//get first character of string
            
            this.doActionHelp(selection);//do action based on selection
            
          }
        
        while (selection != 'E');//while selection is not exit
        
    }    

    void displayViewWeapons() {
        
       

                boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
            done = this.doActionWeapon(menuOption);
            }
        while (!done);
    
    }

    private String getInput() {

    /*
        
    getInput(): value
        BEGIN
        WHILE valid value has not been entered
         DISPLAY a message prompting the user to enter a value
         GET the value entered from keyboard
         Trim blanks off front and end of value
         IF invalid value entered THEN
         DISPLAY invalid value message
         CONTINUE
         ENDIF
         BREAK
        ENDWHILE
        RETURN value    
        
     */
 

    return "WHAT_AM_I? See line 95";
    }

    private String getMenuOption() {
     
        
        Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "";
            boolean valid = false;//setflag to invalid valid entered
            while (!valid) {
                //while a valid name has not been retrieved
                
                //prompt for the players name
                
                System.out.println(this.WEAPONMENU);
                
                value = keyboard.nextLine();//get the name from the keyboard
                
                value = value.trim();//trim off the excess blanks
                
                // if the name is invalid < one character in length
                
                if (value.length()< 1){
                
                System.out.println("invalid value - the value cannot be blank.");
                
                continue;//and repeat again
                
                        }
                
                valid = true;//set flag to end repetition
                
                }

                return value;//return the value       
    
    
    
    
    
    }
    public boolean doActionWeapon(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "V"://View weapon items?
                this.viewWeapons();
                break;
            
            case "U"://Use weapon
                this.useWeapon();
                break;
               
            case "D"://Drop weapon
                this.dropWeapon();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;    
        }
        return false;
        
        
        /*if (choice == "V") {
        this.viewWeapons();
        }
        else if (choice == "U") {
        this.useWeapon();
        }
        else if (choice == "D") {
        this.dropWeapon(); 
        }
        else {
        System.out.println("\nInvalid selection. Try again");
        }
        */
        
    }     

    private void doActionHelp(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewWeapons() {
        System.out.println("\n*** viewWeapons()function called");
    }

    private void useWeapon() {
        System.out.println("\n*** useWeapon()function called");
    }

    private void dropWeapon() {
        //System.out.println("\n*** dropInventoryItem called");
        
         DropItem dropItem = new DropItem();
 
     
                    dropItem.dropItemView();
        
        
    }
}
