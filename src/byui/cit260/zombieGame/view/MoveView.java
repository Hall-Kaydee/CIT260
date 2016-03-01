/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.MoveControl;
import byui.cit260.zombieGame.model.MainCharacter;
import java.util.Scanner;



/**
 *
 * @author Boyd
 */
public class MoveView {

int result[];
    

//        int xCoord = 0;
//        int yCoord = 0;
    
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
        
          MainCharacter xCoordinate = new MainCharacter();
          MainCharacter yCoordinate = new MainCharacter();

          int xCoord = xCoordinate.getXCoordinate();
          int yCoord = yCoordinate.getYCoordinate();        

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

                //xCoordinate.setXCoordinate(resultL[0]);
                //yCoordinate.setYCoordinate(resultL[1]);                
                
                fightView.getFightResult();
               break;
               
            case "F"://Forward

                int resultF[] = moveControl.movePlayerForward(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultF[0] + "," + resultF[1]);
                System.out.println("\nYou have moved forward");

                //xCoordinate.setXCoordinate(resultF[0]);
                //yCoordinate.setYCoordinate(resultF[1]); 

                fightView.getFightResult();
                break;
                
            case "B"://Back

                int resultB[] = moveControl.movePlayerBack(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultB[0] + "," + resultB[1]);
                System.out.println("\nYou have moved backward");

                //xCoordinate.setXCoordinate(resultB[0]);
                //yCoordinate.setYCoordinate(resultB[1]);                 
                
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
