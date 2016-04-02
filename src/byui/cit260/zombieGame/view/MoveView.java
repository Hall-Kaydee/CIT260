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
import byui.cit260.zombieGame.model.Scene;
import zombiegame.ZombieGame;



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
        
        
        MainCharacter coordinates = new MainCharacter();
     
        int xCoord = coordinates.getXCoordinate();
        int yCoord = coordinates.getYCoordinate();
        double characterHealth = coordinates.getCharHealth();
        Map playerMapLocation = new Map();
        Scene sceneDescription = new Scene();
        
        String playerLocation = playerMapLocation.buildMap(xCoord, yCoord);
        this.console.println("\nPlayer location is " + playerLocation + " Your health is at level " + Double.toString(characterHealth));        

        
        System.out.println("\nThere are " + Integer.toString(ZombieGame.zombieCountArray[xCoord][yCoord]) + " zombies here.");
        

                
        String currentSceneDesc = sceneDescription.buildSceneDescritpions(xCoord, yCoord);
        this.console.println("\n" + currentSceneDesc);
        
        
        
        
            }




    @Override
    public boolean doAction(String choice) {
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        //FightView fightView = new FightView();
        ZombieMayhemView mayhemView = new ZombieMayhemView();         
        

        //int xCoord = 0;
        //int yCoord = 0;        
        MoveControl moveControl = new MoveControl();
        
          MainCharacter xCoordinate = new MainCharacter();
          MainCharacter yCoordinate = new MainCharacter();
          Map playerMapLocation = new Map();
          Scene sceneDescription = new Scene();

          int xCoord = xCoordinate.getXCoordinate();
          int yCoord = yCoordinate.getYCoordinate(); 
          
        /*  String playerLocation = playerMapLocation.buildMap(xCoord, yCoord);
          this.console.println("\nPlayer location is " + playerLocation);
                
          String currentSceneDesc = sceneDescription.buildSceneDescritpions(xCoord, yCoord);
          this.console.println("\n" + currentSceneDesc);
        */  



        switch (choice){

            
            case "R"://right
             
 
              try{
                
             int  resultR[] = moveControl.movePlayerRight(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   ErrorView.display(this.getClass().getName(),me.getMessage());
                  }
              
//                System.out.println("\nPlayer location is " + resultR[0] + "," + resultR[1]);
                this.console.println("\nYou have moved to the right");

                int xCoordR = xCoordinate.getXCoordinate();
                int yCoordR = yCoordinate.getYCoordinate();

                String playerLocationR = playerMapLocation.buildMap(xCoordR, yCoordR);
                this.console.println("\nPlayer location is " + playerLocationR);
                
                String currentSceneDescR = sceneDescription.buildSceneDescritpions(xCoordR, yCoordR);
                this.console.println(currentSceneDescR);                
                
                
                
                mayhemView.display();                 


             
                       
                        
                break;
            
            case "L"://Left

              try{
                
             int  resultL[] = moveControl.movePlayerLeft(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   ErrorView.display(this.getClass().getName(),me.getMessage());
                  }
                
                
        
                //int resultL[] = moveControl.movePlayerLeft(xCoord, yCoord);
                
                //System.out.println("\nPlayer location is " + resultL[0] + "," + resultL[1]);
                this.console.println("\nYou have moved to the left");
                
                int xCoordL = xCoordinate.getXCoordinate();
                int yCoordL = yCoordinate.getYCoordinate();

                String playerLocationL = playerMapLocation.buildMap(xCoordL, yCoordL);
                this.console.println("\nPlayer location is " + playerLocationL);

                String currentSceneDescL = sceneDescription.buildSceneDescritpions(xCoordL, yCoordL);
                this.console.println(currentSceneDescL);
                
                mayhemView.display();                        
                        
                break;
               
            case "F"://Forward

               try{
                
             int  resultF[] = moveControl.movePlayerForward(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   ErrorView.display(this.getClass().getName(),me.getMessage());
                  }               
                
                
                
                //int resultF[] = moveControl.movePlayerForward(xCoord, yCoord);
                
                //System.out.println("\nPlayer location is " + resultF[0] + "," + resultF[1]);
                this.console.println("\nYou have moved forward");

                int xCoordF = xCoordinate.getXCoordinate();
                int yCoordF = yCoordinate.getYCoordinate();


                String playerLocationF = playerMapLocation.buildMap(xCoordF, yCoordF);
                this.console.println("\nPlayer location is " + playerLocationF);

                String currentSceneDescF = sceneDescription.buildSceneDescritpions(xCoordF, yCoordF);
                this.console.println(currentSceneDescF);                
                
                
                
                mayhemView.display();                        
                        
                break;
                
            case "B"://Back

              try{
                
             int  resultB[] = moveControl.movePlayerBack(xCoord, yCoord);
                
                }
              catch                   
                  (MoveControlException me){
                   ErrorView.display(this.getClass().getName(),me.getMessage());
                  }                
                
                
                //int resultB[] = moveControl.movePlayerBack(xCoord, yCoord);
                
                //System.out.println("\nPlayer location is " + resultB[0] + "," + resultB[1]);
                this.console.println("\nYou have moved backward");


                int xCoordB = xCoordinate.getXCoordinate();
                int yCoordB = yCoordinate.getYCoordinate();

                String playerLocationB = playerMapLocation.buildMap(xCoordB, yCoordB);
                this.console.println("\nPlayer location is " + playerLocationB);
                
                String currentSceneDescB = sceneDescription.buildSceneDescritpions(xCoordB, yCoordB);
                this.console.println(currentSceneDescB);                
                
                mayhemView.display();                        
                        
                break;
 
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    

}
