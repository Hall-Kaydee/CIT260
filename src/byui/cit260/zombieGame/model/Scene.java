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
public class Scene implements Serializable{
    // class instance variables 
    private String description; 
    private double travelDistance;
    private String map;
    private int zombieCount;
    private int medKitCount;    
    private int energyBarCount;    
    private int waterCount;    

   public Scene() {
    }
    
 //   public Scene(String description) {
        
 //       this.description = description;
        
 //   }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String getMap() {
        return map;
    }    
    
        public void setMap(String map) {
        this.map = map;
    }
    
    

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }
//
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.travelDistance) ^ (Double.doubleToLongBits(this.travelDistance) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "EventScene{" + "description=" + description + ", travelDistance=" + travelDistance + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelDistance) != Double.doubleToLongBits(other.travelDistance)) {
            return false;
        }
        return true;
    }
    
     public void searchArea(){
        
    }
    
    public void leaveArea() {
        
    }
    
    public void attack() {
    
}
    public void sneak() {
        
}
    public void waitScene() {
        
    }
    

    public void setZombieCount(int zombieCount) {
        this.zombieCount = zombieCount;
    }
    
    public int getZombieCount () {
        return zombieCount;
    }

    public void setMedkitCount(int medKitCount) {
        this.medKitCount = medKitCount;
    }

    public int getMedKitCount () {
        return medKitCount;
    }    
   
    public void setEnergyBarCount(int energyBarCount) {
       
        this.energyBarCount = energyBarCount;
    }
    
    public int getEnergyBarCount () {
        return energyBarCount;
    }

    public void setWaterCount(int waterCount) {
        this.waterCount = waterCount;
        
    }
    
    public int getWaterBarCount () {
        return waterCount;
    }


   
    
    
}
