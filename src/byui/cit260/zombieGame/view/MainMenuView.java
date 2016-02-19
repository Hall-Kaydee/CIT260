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
public class MainMenuView {

    private final String MENU = "\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+| Main Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nG - Start Game"
            + "\nH - Help"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n++++++++++++++++++++++++++++++++++++++"
            ;
    
    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            
            System.out.println(MENU);// display the main menu
            
            String input = this.getInput();// get the user selection
            selection = input.charAt(0);//get first character of string
            
            this.doAction(selection);//do action based on selection
            
          }
        
        while (selection != 'E');//while selection is not exit
        
    }
/* BEGIN
DO
	 	 DISPLAY the Main Menu
	 	 GET the user’s selection
	 	 Perform the action associated with selection
		

WHILE the letter “E” has not been selected
END

*/
    
    
    
    void displayMainMenuView() {

        System.out.println("\n*** display menu function called ***");
    
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
        private String promptMessage = "\nPlease make a selection:";
    
        Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "";
            boolean valid = false;//setflag to invalid valid entered
            while (!valid) {
                //while a valid name has not been retrieved
                
                //prompt for the players name
                
                System.out.println(this.promptMessage);
                
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

    private void doAction(char selection) {

   
        
    
    }
  
    
    
    
    
}
