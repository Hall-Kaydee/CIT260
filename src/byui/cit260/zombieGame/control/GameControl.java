/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.Enum.SceneType;
import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.InventoryItem;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Player;
import javafx.scene.Scene;
import zombiegame.ZombieGame;

/**
 *
 * @author Evan
 */
public class GameControl {

   public static void createNewGame(Player player){
    
    Game game = new Game(); //create new game
    ZombieGame.setCurrentGame(game); //save in zombie game
    
    game.setPlyer(player); //save player in game
    
    //create the inventory list and save in the game
    InventoryItem[] inventoryList = GameControl.createInventoryList();
    game.setInventory(inventoryList);
    
    Map map = MapControl.createMap(); //create and intalize map
    game.setMap(map); // save map

    //MapControl.moveMainCharacterToStartingLocation(map);
   // System.out.println("called movemainc har");
    }

    

   
    
   public enum Item {
       
     water,
     energybar,
     medkit,
     flashlight,
     radio;
       
   }
   
  
   public static InventoryItem[] createInventoryList() {
       
       InventoryItem[] inventory =
               new InventoryItem[5];
                       
       InventoryItem water = new InventoryItem();
       
        water.setDescription("WATER");
        water.setQuantity(0);
        water.setWeight(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem energyBar = new InventoryItem();
        energyBar.setDescription("ENERGYBAR");
        energyBar.setQuantity(0);
        energyBar.setWeight(0);
        inventory[Item.energybar.ordinal()] = energyBar;
       
        InventoryItem medKit = new InventoryItem();
        medKit.setDescription("MEDKIT");
        medKit.setQuantity(0);
        medKit.setWeight(0);
        inventory[Item.medkit.ordinal()] = medKit;
        
        InventoryItem flashlight = new InventoryItem();
        flashlight.setDescription("FLASHLIGHT");
        flashlight.setQuantity(0);
        flashlight.setWeight(0);
        inventory[Item.flashlight.ordinal()] = flashlight;
        
        InventoryItem radio = new InventoryItem();
        radio.setDescription("RADIO");
        radio.setQuantity(0);
        radio.setWeight(0);
        inventory[Item.radio.ordinal()] = radio;
       
     return inventory;  
   }
   
    
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
