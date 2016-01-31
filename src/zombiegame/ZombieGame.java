/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;

import byui.cit260.zombieGame.model.InventoryItem;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Player;
import byui.cit260.zombieGame.model.Thug;
import byui.cit260.zombieGame.model.Weapon;
import byui.cit260.zombieGame.model.Zombie;

/**
 *
 * @author Evanator
 */
public class ZombieGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Player playerOne = new Player();
        
     playerOne.setName("Fred Flinstone");
     playerOne.setBestscore(7.00);
     
     String playerInfo = playerOne.toString();
     System.out.println(playerInfo);
     
     InventoryItem itemOne = new InventoryItem ();
     
     itemOne.setItemStrength(20.0);
     itemOne.setItemQuantity(4);
     itemOne.setItemType("Ration");
     itemOne.setItemXCoordinate(3);
     itemOne.setItemYCoordinate(5);
     
     String InventoryItemInfo = itemOne.toString();
     System.out.println(InventoryItemInfo);
     
     
     Weapon weaponOne = new Weapon ();
    
     weaponOne.setWeaponType("Handgun");
     weaponOne.setAmmoCount(21);
     weaponOne.setNoiseLevel(8);
     weaponOne.setDamagelevel(8);
     
     String weaponInfo = weaponOne.toString();
     System.out.println(weaponInfo);
     
     Map mapLocationOne = new Map ();
     
     mapLocationOne.setDistanceToDestination(24);
     mapLocationOne.setDistanceTraveled(1);
     mapLocationOne.setPlayerXCoordinate(3);
     mapLocationOne.setPlayerYCoordinate(15);
     
     String mapLocationInfo = mapLocationOne.toString();
     System.out.println(mapLocationInfo);
     
     
     Zombie zombieOne = new Zombie ();
     
     zombieOne.setHitPoints(20);
     zombieOne.setItemDrop(true);
     
     String zombieInfo = zombieOne.toString();
     System.out.println(zombieInfo);
     
     
     Thug thugOne = new Thug ();
 
     thugOne.setHitPoints(80);
     thugOne.setItemDrop(true);
     
     String thugInfo = thugOne.toString();
     System.out.println(thugInfo);
     
     
     
    }
    

    
    
}
