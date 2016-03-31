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


    public double hitPoints = 0.0;
    public int charDam = 0;
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
