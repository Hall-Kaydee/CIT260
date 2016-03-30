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
    public int medKitCount;    
    public int energyBarCount;    
    public int waterCount;    

   public Scene() {
    }
    
 //   public Scene(String description) {
        
 //       this.description = description;
        
 //   }
   
 public int[] buildScenes(int num1, int num2){
     
        //create an object reference array to store the object refs
        
        Scene[][] sceneObjects = new Scene [3][7];
        
        //create each Scene object and define its variables
        
        Scene startScene = new Scene();
        startScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        startScene.zombieCount = 5;
        startScene.medKitCount = 5;
        startScene.waterCount = 6;
        startScene.energyBarCount = 2;  
        sceneObjects [0][0] = startScene;
        
        
        Scene schoolScene = new Scene();
        schoolScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        schoolScene.zombieCount = 5;
        schoolScene.medKitCount = 5;
        schoolScene.waterCount = 6;
        schoolScene.energyBarCount = 2;
        
        sceneObjects [1][0] = schoolScene; 
        
        
        
        
        
        
        return new int[] {sceneObjects[num1][num2].medKitCount,
                          sceneObjects[num1][num2].waterCount,
                          sceneObjects[num1][num2].energyBarCount};
     
 } 
 
 





 
   
   

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
