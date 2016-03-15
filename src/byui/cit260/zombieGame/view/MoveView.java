/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.MoveControl;
import byui.cit260.zombieGame.model.Location;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Map;
import java.util.Arrays;



/**
 *
 * @author Boyd
 */
public class MoveView extends View{

int result[];
    
    
        public MoveView() {
        super ("\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Move Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nR - Right"
            + "\nL - Left"
            + "\nF - Forward"
            + "\nB - Back"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
               );
            }




    @Override
    public boolean doAction(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        FightView fightView = new FightView();        

        //int xCoord = 0;
        //int yCoord = 0;        
        MoveControl moveControl = new MoveControl();
        
          MainCharacter xCoordinate = new MainCharacter();
          MainCharacter yCoordinate = new MainCharacter();
          Map playerMapLocation = new Map();

          int xCoord = xCoordinate.getXCoordinate();
          int yCoord = yCoordinate.getYCoordinate();  
          



        switch (choice){

            
            case "R"://right
                int resultR[] = moveControl.movePlayerRight(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultR[0] + "," + resultR[1]);
                System.out.println("\nYou have moved to the right");
                

                int xCoordR = xCoordinate.getXCoordinate();
                int yCoordR = yCoordinate.getYCoordinate();

                String playerLocationR = playerMapLocation.buildMap(xCoordR, yCoordR);
                System.out.println("\nPlayer location is " + playerLocationR);
                
                
                
                fightView.getFightResult();
                break;
            
            case "L"://Left


        
                int resultL[] = moveControl.movePlayerLeft(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultL[0] + "," + resultL[1]);
                System.out.println("\nYou have moved to the left");
                
                int xCoordL = xCoordinate.getXCoordinate();
                int yCoordL = yCoordinate.getYCoordinate();

                String playerLocationL = playerMapLocation.buildMap(xCoordL, yCoordL);
                System.out.println("\nPlayer location is " + playerLocationL);
                
                fightView.getFightResult();
               break;
               
            case "F"://Forward

                int resultF[] = moveControl.movePlayerForward(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultF[0] + "," + resultF[1]);
                System.out.println("\nYou have moved forward");

                int xCoordF = xCoordinate.getXCoordinate();
                int yCoordF = yCoordinate.getYCoordinate();


                String playerLocationF = playerMapLocation.buildMap(xCoordF, yCoordF);
                System.out.println("\nPlayer location is " + playerLocationF);
 

                fightView.getFightResult();
                break;
                
            case "B"://Back

                int resultB[] = moveControl.movePlayerBack(xCoord, yCoord);
                
                System.out.println("\nPlayer location is " + resultB[0] + "," + resultB[1]);
                System.out.println("\nYou have moved backward");


                int xCoordB = xCoordinate.getXCoordinate();
                int yCoordB = yCoordinate.getYCoordinate();

                String playerLocationB = playerMapLocation.buildMap(xCoordB, yCoordB);
                System.out.println("\nPlayer location is " + playerLocationB);             
                
                fightView.getFightResult();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    


}
