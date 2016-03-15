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
                

                String[][] listArray = null;
                listArray = new String [3][7];
                listArray[0][0] = "START";
                listArray[1][0] = "SCHOOL";
                listArray[2][0] = "FIRE STATION";

                listArray[0][1] = "SPORTING GOODS STORE";
                listArray[1][1] = "HOSPITAL";
                listArray[2][1] = "CONVENIENCE STORE";

                listArray[0][2] = "RESIDENTIAL LOT";
                listArray[1][2] = "GROCERY STORE";
                listArray[2][2] = "POLICE STATION";

                listArray[0][3] = "BUS STATION";
                listArray[1][3] = "PARK";
                listArray[2][3] = "CITY HALL";

                listArray[0][4] = "CONVENTION CENTER 1";
                listArray[1][4] = "HOTEL";
                listArray[2][4] = "APARTMENT BUILDING";

                listArray[0][5] = "CONVENTION CENTER 2";
                listArray[1][5] = "SHOPPING MALL";
                listArray[2][5] = "CATHEDRAL";

                listArray[0][6] = "REFUGEE CAMP 1";
                listArray[1][6] = "REFUGEE CAMP 2";
                listArray[2][6] = "ZOO";


                


                for (String u : listArray){
                    
                   System.out.println("\n" + u);  
                }                
                

                
                
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

                String[][] locationArray = null;
                locationArray = new String [3][7];
                locationArray[0][0] = "START";
                locationArray[1][0] = "SCHOOL";
                locationArray[2][0] = "FIRE STATION";

                locationArray[0][1] = "SPORTING GOODS STORE";
                locationArray[1][1] = "HOSPITAL";
                locationArray[2][1] = "CONVENIENCE STORE";

                locationArray[0][2] = "RESIDENTIAL LOT";
                locationArray[1][2] = "GROCERY STORE";
                locationArray[2][2] = "POLICE STATION";

                locationArray[0][3] = "BUS STATION";
                locationArray[1][3] = "PARK";
                locationArray[2][3] = "CITY HALL";

                locationArray[0][4] = "CONVENTION CENTER 1";
                locationArray[1][4] = "HOTEL";
                locationArray[2][4] = "APARTMENT BUILDING";

                locationArray[0][5] = "CONVENTION CENTER 2";
                locationArray[1][5] = "SHOPPING MALL";
                locationArray[2][5] = "CATHEDRAL";

                locationArray[0][6] = "REFUGEE CAMP 1";
                locationArray[1][6] = "REFUGEE CAMP 2";
                locationArray[2][6] = "ZOO";


                

                
                for (String[] u : locationArray){
                    
                   System.out.println("\n" + u);  
                }
                
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
