/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.GameControl;
import byui.cit260.zombieGame.model.Player;
import java.util.Scanner;

/*
Start Game Story follows:

Launch The Game Program

The end user enters the command to start the program. The computer 
displays a banner screen with the following description of the game: 
....

The player is prompted for and enters their name. The user enters 
their name and the computer displays a personalized welcome message 
and the Main Menu. An error message is displayed if an invalid name 
is entered and the player is prompted to re-enter a valid name or quit.



*/
/* banner message below
+---------+---------+---------+---------+---------+---------+---------+
+   In Salt Lake City in the year 2020, strange things are starting   +
+ to happen. People are getting sick, stores and businesses have      +
+ closed their doors as crime is rising at an alarming rate. Police   +
+ are overwhelmed.                                                    +
+                                                                     +
+   You are a National guardsman whose unit has been activated and    +
+ ordered to report to a Military checkpoint for assignment. While    +
+ traveling to your unit you are in an accident. When you awaken,     +
+ you are in a world of utter bedlam. What has happened? Where is     +
+ your unit? Where is your family? You must get to them and make sure + 
+ they are safe!                                                      +
+---------+---------+---------+---------+---------+---------+---------+

*/



/**
 *
 * @author Boyd
 */
public class StartProgramView extends View {
    
    public String displayMessage;
    
    public StartProgramView(){
        super();         
        this.displayMessage = "\nPlease enter your name:";
        
        //  display banner when view is created
        this.displayBanner();
        
   
    } 

    private void displayBanner() {
     
        this.console.println(
        "\n+---------+---------+---------+---------+---------+---------+---------+" +
        "\n+   In Salt Lake City in the year 2020, strange things are starting   +" +
        "\n+ to happen. People are getting sick, stores and businesses have      +" +
        "\n+ closed their doors as crime is rising at an alarming rate. Police   +" +
        "\n+ are overwhelmed.                                                    +" +
        "\n+                                                                     +" +
        "\n+   You are a National guardsman whose unit has been activated and    +" +
        "\n+ ordered to report to a Military checkpoint for assignment. While    +" +
        "\n+ traveling to your unit you are in an accident. When you awaken,     +" +
        "\n+ you are in a world of utter bedlam. What has happened? Where is     +" +
        "\n+ your unit? Where is your family? You must get to them and make sure +" +
        "\n+ they are safe!                                                      +" +
        "\n+---------+---------+---------+---------+---------+---------+---------+"
     
            );
    
    }

    public void displayStartProgramView() {
       
        // System.out.println("\n*** displayProgramView function called ***");
        
        boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String playersName = this.getInput();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doAction(playersName);
            }
        while (!done);
    
            }
// When deleted just get null
    @Override
    public String getInput() {
    
        //Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "";
            boolean valid = false;//setflag to invalid valid entered

          try{
            while (!valid) {
                //while a valid name has not been retrieved
                
                //prompt for the players name
                
                this.console.println(this.displayMessage);
                
                value = keyboard.readLine();//get the name from the keyboard
                
                value = value.trim();//trim off the excess blanks
                
                // if the name is invalid < one character in length
                
                if (value.length()< 1){
                
                ErrorView.display(this.getClass().getName(),"invalid value - the value cannot be blank.");
                
                continue;//and repeat again
                
                        }
                
                valid = true;//set flag to end repetition
                
                }
            
          }
          
          catch (Exception e){
         
         ErrorView.display(this.getClass().getName(),"\nError reading inputs" + e.getMessage());
         
     }

                return value;//return the value
 
    }
    @Override
    public boolean doAction(String playersName) {
    
    
        if (playersName.length()< 2){
            
           ErrorView.display(this.getClass().getName(),"\nInvalid players name: "
                 
                  + "the name must be greater than one character in length");
            
            return false;
        }
                  
       Player player = GameControl.createPlayer(playersName);
       
       if (player == null){
           
           //if unsuccessful
           
           ErrorView.display(this.getClass().getName(),"\nError creating the player");
           
           return false;
       }
       
       //display next view
       
       this.displayNextView(player);
       return true;//success
       
       
 
    }

    
    
    private void displayNextView(Player player) {
  
       
        
    this.console.println("\n++++++++++++++++++++++++++++++++++++++++++"
                     + "\n+ Welcome to the Game " + player.getName()
                     + "\n+ R.I.P. " + player.getName()
                     + "\n++++++++++++++++++++++++++++++++++++++++++"
                        );
    
                        //create main menu view object
                        MainMenuView mainMenuView = new MainMenuView();
                        // display the main menu view
                        mainMenuView.display();
       
    }
       
 } 
