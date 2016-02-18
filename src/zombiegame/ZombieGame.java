/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;
//
import byui.cit260.zombieGame.model.InventoryItem;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Player;
import byui.cit260.zombieGame.model.Thug;
import byui.cit260.zombieGame.model.Weapon;
import byui.cit260.zombieGame.model.Zombie;
import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.NPC;
import byui.cit260.zombieGame.model.ConversationScene;
import byui.cit260.zombieGame.model.EventScene;
import byui.cit260.zombieGame.model.Locations;
import byui.cit260.zombieGame.model.NormalScene;
import byui.cit260.zombieGame.view.StartProgramView;


/**
 *
 * @author Evanator
 */
public class ZombieGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //create startProgramview origin - display start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        
    }
    

    
    
}
