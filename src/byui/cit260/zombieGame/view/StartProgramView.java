/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.GameControl;
import byui.cit260.zombieGame.model.Player;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
import java.util.Scanner;
import zombiegame.ZombieGame;

/**
 *
 * @author Boyd
 */
public class StartProgramView {

    private final String displayMessage;
    protected final BufferedReader keyboard = ZombieGame.getInFile();
    protected final PrintWriter console = ZombieGame.getOutFile();
    
    //public String displayMessage;
    
    public StartProgramView(){
        super();         
        this.displayMessage = "\nPlease enter your name:";
        
        //  display banner when view is created
        this.displayBanner();
        
   
    } 

    private void displayBanner() {
     
        System.out.println(
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

    public void displayStartProgramView() throws IOException {
       
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

    public String getInput() throws IOException {
    
        //Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "";
            boolean valid = false;//setflag to invalid valid entered

          //try{
            while (!valid) {
                //while a valid name has not been retrieved
                
                //prompt for the players name
                
                System.out.println(this.displayMessage);
                
                value = keyboard.readLine();//get the name from the keyboard
                
                value = value.trim();//trim off the excess blanks
                
                // if the name is invalid < one character in length
                
                if (value.length()< 1){
                
                ErrorView.display(this.getClass().getName(),"invalid value - the value cannot be blank.");
                
                continue;//and repeat again
                
                        }
                
                valid = true;//set flag to end repetition
                
                }
            
         // }
          
        //  catch (Exception e){
         
       //  ErrorView.display(this.getClass().getName(),"\nError reading inputs" + e.getMessage());
         
    // }

                return value;//return the value
 
    }

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
  
       
        
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++"
                     + "\n+ Welcome to the Game " + player.getName()
                     + "\n++++++++++++++++++++++++++++++++++++++++++"
                     + "\n"
                     + "\n        ----------           "
                     + "\n       /          \\         "
                     + "\n      |            |         "
                     + "\n      |   R.I.P.   |         "
                     + "\n      |  " + player.getName()
                     + "\n      |            |         "
                     + "\n      |            |         "
                     + "\n      |            |         "
                     + "\n      |            |         "
                     + "\n      |            |         "     
                     + "\n -----==============------   "
                       );
    
                        //create main menu view object
                        MainMenuView mainMenuView = new MainMenuView();
                        // display the main menu view
                        mainMenuView.display();
       
    }
       
 } 
