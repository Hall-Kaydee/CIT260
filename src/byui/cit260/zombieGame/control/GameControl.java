/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.model.Player;

/**
 *
 * @author tyler
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double calcSneak(double numEnemy, double dist){
        
     if (numEnemy < 0 || numEnemy > 10 ) {
        return -1;
    }
     
    if (dist > 1000 || dist < 1 ) {
        return -1;
    }
    
    double preSneakSuccess = (5* numEnemy )+(2*( dist /100));
	double sneakSuccess = (100 - preSneakSuccess);

    return sneakSuccess;
   
        
    }

   
    
    
    
    
}
