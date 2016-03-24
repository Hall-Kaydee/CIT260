/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.exceptions.MoveControlException;
import byui.cit260.zombieGame.model.MainCharacter;

/**
 *
 * @author Boyd
 */
public class MoveControl {
   
// move player to the right
    
        MainCharacter xCoordinate = new MainCharacter();
        MainCharacter yCoordinate = new MainCharacter();

        int xCoord = xCoordinate.getXCoordinate();
        int yCoord = yCoordinate.getYCoordinate();  
   
public int [] movePlayerRight(int xCoord, int yCoord) throws MoveControlException {

    //int number1 = xCoord;
    //int number2 = yCoord;
    
    if (xCoord >= 0 && xCoord < 2 ){
        xCoord = xCoord + 1;// 0 to 6  and 0 to 2
        xCoordinate.setXCoordinate(xCoord);
        yCoordinate.setYCoordinate(yCoord);
        }
    else {
        
       throw new MoveControlException("\nYou have reached the EAST border of the map. You cannot go any farther");

        }
    return new int[] {xCoord, yCoord};
}

public int[] movePlayerLeft(int xCoord, int yCoord) throws MoveControlException {

    //int number1 = xCoord;
    //int number2 = yCoord;
    
    if (xCoord > 0 ){
        xCoord = xCoord - 1;// 0 to 6  and 0 to 2
        xCoordinate.setXCoordinate(xCoord);
    }
    else {
        
       throw new MoveControlException("\nYou have reached the WEST border of the map. You cannot go any farther");

        }
   
    // number2 = 2;
    return new int[] {xCoord, yCoord};
}




public int[] movePlayerForward(int xCoord, int yCoord) throws MoveControlException {

    //int number1 = xCoord;
    //int number2 = yCoord;    
    
    if (yCoord < 6 ){
        yCoord = yCoord + 1;// 0 to 6  and 0 to 2
        yCoordinate.setYCoordinate(yCoord);
    }
    else {
        
       throw new MoveControlException("\nYou have reached the NORTH border of the map. You cannot go any farther");

        }
   
    // number2 = 2;
    return new int[] {xCoord, yCoord};
}

public int[] movePlayerBack(int xCoord, int yCoord) throws MoveControlException {

    //int number1 = xCoord;
    //int number2 = yCoord;    
    
    if (yCoord > 0 ){
        yCoord = yCoord - 1;// 0 to 13  and 0 to 6
        yCoordinate.setYCoordinate(yCoord); 
    
    }
    
    else {

        throw new MoveControlException("\nYou have reached the SOUTH border of the map. You cannot go any farther");

        }

    // number2 = 2;
    return new int[] {xCoord, yCoord};
 }

  
}
