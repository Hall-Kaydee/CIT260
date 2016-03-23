/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.MoveControl;
import byui.cit260.zombieGame.exceptions.FightControlException;
import byui.cit260.zombieGame.exceptions.MoveControlException;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Map;



/**
 *
 * @author Boyd
 */
public class MoveView extends View{


    
    
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
    public boolean doAction(String choice) {
    
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
             
 
              try{
                
             int  resultR[] = moveControl.movePlayerRight(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   System.out.println(me.getMessage());
                  }
              
//                System.out.println("\nPlayer location is " + resultR[0] + "," + resultR[1]);
                this.console.println("\nYou have moved to the right");
                

                int xCoordR = xCoordinate.getXCoordinate();
                int yCoordR = yCoordinate.getYCoordinate();

                String playerLocationR = playerMapLocation.buildMap(xCoordR, yCoordR);
                this.console.println("\nPlayer location is " + playerLocationR);

                try {
                    fightView.getFightResult();
                    }
                catch
                        
                  (FightControlException me){
                   System.out.println(me.getMessage());
                  }                        
                        
                break;
            
            case "L"://Left

              try{
                
             int  resultL[] = moveControl.movePlayerLeft(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   System.out.println(me.getMessage());
                  }
                
                
        
                //int resultL[] = moveControl.movePlayerLeft(xCoord, yCoord);
                
                //System.out.println("\nPlayer location is " + resultL[0] + "," + resultL[1]);
                this.console.println("\nYou have moved to the left");
                
                int xCoordL = xCoordinate.getXCoordinate();
                int yCoordL = yCoordinate.getYCoordinate();

                String playerLocationL = playerMapLocation.buildMap(xCoordL, yCoordL);
                this.console.println("\nPlayer location is " + playerLocationL);


                try {
                    fightView.getFightResult();
                    }
                catch
                        
                  (FightControlException me){
                   System.out.println(me.getMessage());
                  }                        
                        
                break;
               
            case "F"://Forward

               try{
                
             int  resultF[] = moveControl.movePlayerForward(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   System.out.println(me.getMessage());
                  }               
                
                
                
                //int resultF[] = moveControl.movePlayerForward(xCoord, yCoord);
                
                //System.out.println("\nPlayer location is " + resultF[0] + "," + resultF[1]);
                this.console.println("\nYou have moved forward");

                int xCoordF = xCoordinate.getXCoordinate();
                int yCoordF = yCoordinate.getYCoordinate();


                String playerLocationF = playerMapLocation.buildMap(xCoordF, yCoordF);
                this.console.println("\nPlayer location is " + playerLocationF);
 

                try {
                    fightView.getFightResult();
                    }
                catch
                        
                  (FightControlException me){
                   System.out.println(me.getMessage());
                  }                        
                        
                break;
                
            case "B"://Back

              try{
                
             int  resultB[] = moveControl.movePlayerBack(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   System.out.println(me.getMessage());
                  }                
                
                
                //int resultB[] = moveControl.movePlayerBack(xCoord, yCoord);
                
                //System.out.println("\nPlayer location is " + resultB[0] + "," + resultB[1]);
                this.console.println("\nYou have moved backward");


                int xCoordB = xCoordinate.getXCoordinate();
                int yCoordB = yCoordinate.getYCoordinate();

                String playerLocationB = playerMapLocation.buildMap(xCoordB, yCoordB);
                this.console.println("\nPlayer location is " + playerLocationB);             
                
                try {
                    fightView.getFightResult();
                    }
                catch
                        
                  (FightControlException me){
                   System.out.println(me.getMessage());
                  }                        
                        
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    

}
