/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;

import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.NPC;
import byui.cit260.zombieGame.model.Player;

/**
 *
 * @author Evanator
 */
public class ZombieGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     //Player test -Evan
      Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
         playerOne.setBestscore(7.00);
     
         String playerInfo = playerOne.toString();
         System.out.println(playerInfo);
     
     //game test -Evan
     Game gameOne = new Game();
     
        gameOne.setTotalScore(9000.00);
        gameOne.setNoPeople(1.0);
     
         String gameInfo = gameOne.toString();
         System.out.println(gameInfo);
        
     
     // mainCharacter test -Evan
        MainCharacter mainCharacterOne = new MainCharacter();
         
        mainCharacterOne.setName(" Evanator ");
        mainCharacterOne.setDescription(" This a man ");
        mainCharacterOne.setCoordinates(4.56);
        mainCharacterOne.setHitPoints(95);
        
        String MainCharacterInfo = mainCharacterOne.toString();
         System.out.println(MainCharacterInfo);
        
        
      // NPC test -Evan   
         NPC NPCOne = new NPC();
         
         NPCOne.setType("Thug");
         NPCOne.setCoordinates(6.99);
         
         String NPCInfo = NPCOne.toString();
            System.out.println(NPCInfo);
        
    }
    
}
