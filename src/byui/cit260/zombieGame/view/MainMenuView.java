/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.GameControl;
import byui.cit260.zombieGame.model.GameMenuView;
import java.util.Scanner;
import zombiegame.ZombieGame;

/**
 *
 * @author Boyd
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Main Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nN - Start New Game"
            + "\nL - Load Game"
            + "\nH - Help"
            + "\nS - Save Game"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
            ;
    private boolean promptMessage;

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

                boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doAction(menuOption);
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
                
                System.out.println(this.MENU);
                
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
        
        
        
    //    System.out.println("\n*** get main menu option function called");
    //    return "N";
    
    }

    public boolean doAction(String choice) {
    
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "N"://create and start a new game
                this.startNewGame();
                break;
            
            case "L"://get and start existing game
               this.loadGame();
               break;
               
            case "H"://get help
                this.displayHelpMenu();
                break;
                
            case "S"://save the current game
                this.saveGame();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }
    
    
    public boolean doActionHelp(String choice) {
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "G"://what is the goal?
                this.startNewGame();
                break;
            
            case "M"://How to move
               this.loadGame();
               break;
               
            case "I"://how to get items
                this.displayHelpMenu();
                break;
                
            case "C"://combat - how to fight
                this.saveGame();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    
    
    
    
    
    
        
        
    //    System.out.println("\n*** do action function called");
    //    return true;

    private void startNewGame() {
 
        //create new game 
        GameControl.createNewGame(ZombieGame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
        
        
        
    }

    private void loadGame() {

        System.out.println("\n*** loadGame function called");    
    
    }

    private void displayHelpMenu() {

       
        



        //System.out.println("\n*** displayHelpMenu function called");    
  
    
    }

    private void saveGame() {


        System.out.println("\n*** saveGame function called");  

    }


   

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
    
    
}