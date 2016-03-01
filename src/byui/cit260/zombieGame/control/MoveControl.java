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
   
public int[] movePlayerRight(int xCoord, int yCoord){

    int number1 = xCoord;
    int number2 = yCoord;
    
    if (number1 < 6 ){
        number1 = number1 + 1;// 0 to 13  and 0 to 6
        xCoordinate.setXCoordinate(number1);
    }
    else {
       System.out.println("\nYou have reached the east border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }
    return new int[] {number1, number2};
}

public int[] movePlayerLeft(int xCoord, int yCoord){

    int number1 = xCoord;
    int number2 = yCoord;
    
    if (number1 > 0 ){
        number1 = number1 - 1;// 0 to 13  and 0 to 6
        xCoordinate.setXCoordinate(number1);
    }
    else {
       System.out.println("\nYou have reached the west border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }



    
    
    // number2 = 2;
    return new int[] {number1, number2};
}




public int[] movePlayerForward(int xCoord, int yCoord){

    int number1 = xCoord;
    int number2 = yCoord;    
    
    if (number2 < 13 ){
        number2 = number2 + 1;// 0 to 13  and 0 to 6
        yCoordinate.setYCoordinate(number2);
    }
    else {
       System.out.println("\nYou have reached the north border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }


    
    // number2 = 2;
    return new int[] {number1, number2};
}

public int[] movePlayerBack(int xCoord, int yCoord){

    int number1 = xCoord;
    int number2 = yCoord;    
    
    if (number2 > 0 ){
        number2 = number2 - 1;// 0 to 13  and 0 to 6
        yCoordinate.setYCoordinate(number2); 
    
    }
    
    else {
       System.out.println("\nYou have reached the southh border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }

   
    // number2 = 2;
    return new int[] {number1, number2};
 }



    
}
