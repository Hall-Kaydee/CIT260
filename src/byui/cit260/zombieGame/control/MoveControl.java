/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

/**
 *
 * @author Boyd
 */
public class MoveControl {

//    public static int[] movePlayerRight() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

// Function code
    
// move player to the right
    
public int[] movePlayerRight(int xCoord, int yCoord){

    int number1 = xCoord;
    int number2 = yCoord;
    
    if (number1 < 6 ){
    number1 = number1 + 1;// 0 to 13  and 0 to 6
    }
    else {
       System.out.println("\nYou have reached the east border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }

    // number2 = 2;
    return new int[] {number1, number2};
}

public int[] movePlayerLeft(int xCoord, int yCoord){

    int number1 = xCoord;
    int number2 = yCoord;
    
    if (number1 > 0 ){
    number1 = number1 - 1;// 0 to 13  and 0 to 6
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
    }
    else {
       System.out.println("\nYou have reached the southh border of the map.");
       System.out.println("\nYou cannot go any farther that direction");
    }

    // number2 = 2;
    return new int[] {number1, number2};
 }



    
}
