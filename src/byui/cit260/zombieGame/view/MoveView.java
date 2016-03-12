/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.MoveControl;
import byui.cit260.zombieGame.model.MainCharacter;



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


}
