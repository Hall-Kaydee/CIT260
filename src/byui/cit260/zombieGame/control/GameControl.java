/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.model.Player;
import zombiegame.ZombieGame;

/**
 *
 * @author tyler
 */
public class GameControl {

    public static Player createPlayer(String name) {
   
        if (name == null){
            
            return null;
            
        }
        
        Player player = new Player();
        player.setName(name);
        ZombieGame.setPlayer(player);//save the player
        
        
        return player;
        
    
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
