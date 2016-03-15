/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

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
   
public int [] movePlayerRight(int xCoord, int yCoord){

    //int number1 = xCoord;
    //int number2 = yCoord;
    
    if (xCoord >= 0 && xCoord < 2 ){
        xCoord = xCoord + 1;// 0 to 6  and 0 to 2
        xCoordinate.setXCoordinate(xCoord);
        yCoordinate.setYCoordinate(yCoord);
        }
    else {
       System.out.println("\nYou have reached the east border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }
    return new int[] {xCoord, yCoord};
}

public int[] movePlayerLeft(int xCoord, int yCoord){

    //int number1 = xCoord;
    //int number2 = yCoord;
    
    if (xCoord > 0 ){
        xCoord = xCoord - 1;// 0 to 6  and 0 to 2
        xCoordinate.setXCoordinate(xCoord);
    }
    else {
       System.out.println("\nYou have reached the west border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }
   
    // number2 = 2;
    return new int[] {xCoord, yCoord};
}




public int[] movePlayerForward(int xCoord, int yCoord){

    //int number1 = xCoord;
    //int number2 = yCoord;    
    
    if (yCoord < 6 ){
        yCoord = yCoord + 1;// 0 to 6  and 0 to 2
        yCoordinate.setYCoordinate(yCoord);
    }
    else {
       System.out.println("\nYou have reached the north border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }


    
    // number2 = 2;
    return new int[] {xCoord, yCoord};
}

public int[] movePlayerBack(int xCoord, int yCoord){

    //int number1 = xCoord;
    //int number2 = yCoord;    
    
    if (yCoord > 0 ){
        yCoord = yCoord - 1;// 0 to 13  and 0 to 6
        yCoordinate.setYCoordinate(yCoord); 
    
    }
    
    else {
       System.out.println("\nYou have reached the south border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }

   
    // number2 = 2;
    return new int[] {xCoord, yCoord};
 }



    
}
