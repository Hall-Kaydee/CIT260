/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
import java.io.Serializable;
//
/**
 *
 * @author Boyd
 */


public class Map implements Serializable {
    
    private int distanceToDestination;
    private int distanceTraveled;
    private int playerXCoordinate;
    private int playerYCoordinate;

    public Map() {
    }
    
    

    public int getDistanceToDestination() {
        return distanceToDestination;
    }

    public void setDistanceToDestination(int distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getPlayerXCoordinate() {
        return playerXCoordinate;
    }

    public void setPlayerXCoordinate(int playerXCoordinate) {
        this.playerXCoordinate = playerXCoordinate;
    }

    public int getPlayerYCoordinate() {
        return playerYCoordinate;
    }

    public void setPlayerYCoordinate(int playerYCoordinate) {
        this.playerYCoordinate = playerYCoordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.distanceToDestination;
        hash = 71 * hash + this.distanceTraveled;
        hash = 71 * hash + this.playerXCoordinate;
        hash = 71 * hash + this.playerYCoordinate;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "distanceToDestination=" + distanceToDestination + ", distanceTraveled=" + distanceTraveled + ", playerXCoordinate=" + playerXCoordinate + ", playerYCoordinate=" + playerYCoordinate + '}';
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
        final Map other = (Map) obj;
        if (this.distanceToDestination != other.distanceToDestination) {
            return false;
        }
        if (this.distanceTraveled != other.distanceTraveled) {
            return false;
        }
        if (this.playerXCoordinate != other.playerXCoordinate) {
            return false;
        }
        if (this.playerYCoordinate != other.playerYCoordinate) {
            return false;
        }
        return true;
    }
    
    
    
    
}
