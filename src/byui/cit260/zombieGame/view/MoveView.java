/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.MoveControl;
import java.util.Scanner;



/**
 *
 * @author Boyd
 */
public class MoveView {
 
        int xCoord = 0;
        int yCoord = 0;
    
    public final String MOVEMENU = "\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Move Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nR - Right"
            + "\nL - Left"
            + "\nF - Forward"
            + "\nB - Back"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
            ;
    private boolean promptMessage;

/*    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            
            System.out.println(MOVEMENU);// display the main menu
            
            String input = this.getInput();// get the user selection
            selection = input.charAt(0);//get first character of string
            
            this.doActionMove(selection);//do action based on selection
            
          }
        
        while (selection != 'Q');//while selection is not Quit
        
    } 
    
    */

    public void displayMoveMenuView() {

                boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doActionMove(menuOption);
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
                
                System.out.println(this.MOVEMENU);
                
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
    public boolean doActionMove(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        FightView fightView = new FightView();        

        //int xCoord = 0;
        //int yCoord = 0;        
        MoveControl moveControl = new MoveControl();
        
        switch (choice){
            

            
            case "R"://right
                

                int result[] = moveControl.movePlayerRight(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + result[0] + "," + result[1]);
                System.out.println("\nYou have moved to the right");

                fightView.getFightResult();
                break;
            
            case "L"://Left


                int resultL[] = moveControl.movePlayerLeft(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultL[0] + "," + resultL[1]);
                System.out.println("\nYou have moved to the left");

                fightView.getFightResult();
               break;
               
            case "F"://Forward

                int resultF[] = moveControl.movePlayerForward(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultF[0] + "," + resultF[1]);
                System.out.println("\nYou have moved forward");

                fightView.getFightResult();
                break;
                
            case "B"://Back

                int resultB[] = moveControl.movePlayerBack(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultB[0] + "," + resultB[1]);
                System.out.println("\nYou have moved backward");

                fightView.getFightResult();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    

    private void doActionHelp(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    
    
    
    
    
}
