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
    
    //Class vars
    private String name;
    private String description;
//    public int xCoordinate = 6;
//    public int yCoordinate = 12;
    private double hitPoints;
    private double xCoordinate;

    public MainCharacter() {
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getXCoordinate() {
       
        return ZombieGame.xCoordinate;
    }

    public int getYCoordinate() {
       
        return ZombieGame.yCoordinate;
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
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.description);
//        hash = 79 * hash + (int) (Double.doubleToLongBits(this.xCoordinate) ^ (Double.doubleToLongBits(this.xCoordinate) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "MainCharacter{" + "name=" + name + ", description=" + description + ", coordinates=" + getXCoordinate() + "," + getYCoordinate() + " hitPoints=" + hitPoints + '}';
    }

    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MainCharacter other = (MainCharacter) obj;
        int xCoordinate = ZombieGame.xCoordinate;
        if (Double.doubleToLongBits(this.xCoordinate) != Double.doubleToLongBits(other.xCoordinate)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitPoints) != Double.doubleToLongBits(other.hitPoints)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
