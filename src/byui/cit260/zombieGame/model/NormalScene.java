/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
//
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author kaydee
 */
public class NormalScene implements Serializable{
    
    //class instance variables
    private String description;
    private double travelDistance;

    public NormalScene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
        
        
    }
    
    
    public void searchArea(){
        
    }
    
    public void leaveArea(){
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.travelDistance) ^ (Double.doubleToLongBits(this.travelDistance) >>> 32));
        return hash;
        
        
    }

    @Override
    public String toString() {
        return "NormalScene{" + "description=" + description + ", travelDistance=" + travelDistance + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NormalScene other = (NormalScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelDistance) != Double.doubleToLongBits(other.travelDistance)) {
            return false;
        }
        return true;
    }
    
    
}
