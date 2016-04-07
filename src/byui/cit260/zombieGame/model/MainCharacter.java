/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
//
import java.io.Serializable;
import java.util.Objects;
import zombiegame.ZombieGame;

/**
 *
 * @author Evanator
 */
public class MainCharacter implements Serializable{


   // public double hitPoints = 0.0;
    //public int charDam = 0;
//    public double charHealth = 0.0; 
    

    public int getXCoordinate() {
       
        return ZombieGame.xCoordinate;
    }

    public int getYCoordinate() {
       
        return ZombieGame.yCoordinate;
    }    
    
    public int getRadioListenCount() {
       
        return ZombieGame.radioListenCount;
    }

    public void setRadioListenCount(int listenCount) {
        ZombieGame.radioListenCount = listenCount;
    }    
    
    
    public void setXCoordinate(int xCoord) {
        ZombieGame.xCoordinate = xCoord;
    }
    
    
    public void setYCoordinate(int yCoord) {
        ZombieGame.yCoordinate = yCoord;
    }    
    
    

    public double getHitPoints() {
        return ZombieGame.hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        ZombieGame.hitPoints = hitPoints;
    }
    
    
    
    public int getCharDam() {
        return ZombieGame.charDam;
    }

    public void setCharDam(int charDam) {
        ZombieGame.charDam = charDam;
       
    }

   public String getCurrentWeapon (int charDam){
       String weapon = "";

       if (charDam == 5){ 
           weapon = "FISTS";}
       if (charDam == 15){ 
           weapon = "KNIFE";}
       if (charDam == 18){ 
           weapon = "MACHETE";}
       if (charDam == 19){ 
           weapon = "BASEBALL BAT";}
       if (charDam == 21){ 
           weapon = "CROSSBOW";}
       if (charDam == 25){ 
           weapon = "HANDGUN";}
       if (charDam == 30){ 
           weapon = "DOUBLE DESERT EAGLES";}
       if (charDam == 32){ 
           weapon = "SEMI-AUTOMATIC SHOTGUN";}
       if (charDam == 38){ 
           weapon = "UZI MACHINE GUN";}
       if (charDam == 42){ 
           weapon = "AK-47";}
       if (charDam == 55){ 
           weapon = "GRENADE";}
       if (charDam == 85){ 
           weapon = "ROCKET LAUNCHER";}

       return weapon;
       
   }    
    
    
    
    public double getCharHealth() {
        return ZombieGame.charHealth;
    }

    public void setCharHealth(double charHealth) {
        ZombieGame.charHealth = charHealth;
    }    
    
    
    
    
    
    
    

    

   // @Override
    //public String toString() {
      //  return "MainCharacter{" + "name=" + name + ", description=" + description + ", coordinates=" + getXCoordinate() + "," + getYCoordinate() + " hitPoints=" + hitPoints + '}';
   // }

    
    
}
