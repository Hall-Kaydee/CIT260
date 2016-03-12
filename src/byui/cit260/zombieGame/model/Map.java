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
 * @author Boyd/Evan
 */


public class Map implements Serializable {
    
    private int distanceToDestination;
    private int distanceTraveled;
    private int playerXCoordinate;
    private int playerYCoordinate;
    private int noOfRows;
    private int noOfColumns;
    private Location[] [] locations;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
       
     if (noOfRows < 1 || noOfColumns < 1){
        System.out.println("The number of rows and coloumns must be greater then zero");
        return;
     }   
        
     this.noOfRows = noOfRows;
     this.noOfColumns = noOfColumns;
     
     //create 2-D array for location objects
     this.locations = new Location[noOfRows][noOfColumns];
     
     for (int row = 0; row < noOfRows; row++) {
         for (int column = 0; column < noOfColumns; column++){
         //create and intialize new location object instance
         Location location = new Location();
         location.setColumn(column);
         location.setRow(row);
         location.setVisited(false);
         
         //assign the locationobject to the current postion in array
         locations [row] [column] = location;
     }
     } 
    }
    
    
public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
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
