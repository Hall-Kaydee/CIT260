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
public enum Actor implements Serializable{
    Rick("He's the boss..the insane leader."), 
    Carl("The whiney son of Rick"), 
    Glen("The token asian"),
    Maggie("The farmer's daughter and girlfriend of Glen");
    
    
    //Class vars
    private final String description;
    private final Point coordinates;
//    public int xCoordinate = 6;
//    public int yCoordinate = 12;
    private double hitPoints;
    private double xCoordinate;
    
    public Actor(string description) {
        this.description = description;
        coordinates = new Point (1,1);
    }
    

   

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
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    

    @Override
    public String toString() {
        return "MainCharacter{" + "name=" + name + ", description=" + description + ", coordinates=" + getXCoordinate() + "," + getYCoordinate() + " hitPoints=" + hitPoints + '}';
    }

    
    
}
