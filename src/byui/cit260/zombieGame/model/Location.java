/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
//
import byui.cit260.zombieGame.Enum.Actor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author kaydee/Evan
 */
public class Location implements Serializable{
    // class instance variables 
    private String type;
    private double timeOfDay;
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Actor> actors;

    public Location(int row, int column, Scene scene, ArrayList<Actor> actors) {
        this.row = row;
        this.column = column;
        this.scene = scene;
        this.visited = false;
        this.actors = actors;
    }

    
     public Location() {
        this.actors = new ArrayList<>();
    }

   
    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(double timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.timeOfDay) ^ (Double.doubleToLongBits(this.timeOfDay) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeOfDay) != Double.doubleToLongBits(other.timeOfDay)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Locations{" + "type=" + type + ", timeOfDay=" + timeOfDay + '}';
    }
    
    
    
    
}
