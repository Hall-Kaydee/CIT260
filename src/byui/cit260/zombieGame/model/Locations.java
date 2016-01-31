/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kaydee
 */
public class Locations implements Serializable{
    // class instance variables 
    private String type;
    private double timeOfDay;

    public Locations() {
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
        final Locations other = (Locations) obj;
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
