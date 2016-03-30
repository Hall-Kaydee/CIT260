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
                
        startScene.zombieCount = 0;
        startScene.medKitCount = 6;
        startScene.waterCount = 3;
        startScene.energyBarCount = 2;  
        sceneObjects [0][0] = startScene;
        
        
        Scene schoolScene = new Scene();
        schoolScene.description =
                  "\nYou enter the school yard and survey the area. You see some people huddled over a body near the tire swing "
                + "\nYou can’t really tell what they are doing. You shout to them and they turn to you. They are covered in "
                + "\nwhat looks like blood. They start to approach you making groaning and moaning noises. You think one of  "
                + "\nthem grunts the word “…Brains?...”. You nervously back away and draw your weapon. ";
        
        schoolScene.zombieCount = 2;
        schoolScene.medKitCount = 2;
        schoolScene.waterCount = 1;
        schoolScene.energyBarCount = 0;
        
        sceneObjects [1][0] = schoolScene; 
        
        
        Scene fireStationScene = new Scene();
        fireStationScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        fireStationScene.zombieCount = 5;
        fireStationScene.medKitCount = 5;
        fireStationScene.waterCount = 6;
        fireStationScene.energyBarCount = 2;
        
        sceneObjects [2][0] = fireStationScene; 
        
        
        Scene sportingGoodsStoreScene = new Scene();
        sportingGoodsStoreScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        sportingGoodsStoreScene.zombieCount = 5;
        sportingGoodsStoreScene.medKitCount = 5;
        sportingGoodsStoreScene.waterCount = 6;
        sportingGoodsStoreScene.energyBarCount = 2;
        
        sceneObjects [0][1] = sportingGoodsStoreScene; 
        
        
        
        Scene hospitalScene = new Scene();
        hospitalScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        hospitalScene.zombieCount = 5;
        hospitalScene.medKitCount = 5;
        hospitalScene.waterCount = 6;
        hospitalScene.energyBarCount = 2;
        
        sceneObjects [1][1] = hospitalScene; 
        
        
        
        Scene convenienceStoreScene = new Scene();
        convenienceStoreScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        convenienceStoreScene.zombieCount = 5;
        convenienceStoreScene.medKitCount = 5;
        convenienceStoreScene.waterCount = 6;
        convenienceStoreScene.energyBarCount = 2;
        
        sceneObjects [2][1] = convenienceStoreScene; 
        
        
        Scene residentialLotScene = new Scene();
        residentialLotScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        residentialLotScene.zombieCount = 5;
        residentialLotScene.medKitCount = 5;
        residentialLotScene.waterCount = 6;
        residentialLotScene.energyBarCount = 2;
        
        sceneObjects [0][2] = residentialLotScene; 
        
        
        Scene groceryStoreScene = new Scene();
        groceryStoreScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        groceryStoreScene.zombieCount = 5;
        groceryStoreScene.medKitCount = 5;
        groceryStoreScene.waterCount = 6;
        groceryStoreScene.energyBarCount = 2;
        
        sceneObjects [1][2] = groceryStoreScene; 
        
        
        
        Scene policeStationScene = new Scene();
        policeStationScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        policeStationScene.zombieCount = 5;
        policeStationScene.medKitCount = 5;
        policeStationScene.waterCount = 6;
        policeStationScene.energyBarCount = 2;
        
        sceneObjects [2][2] = policeStationScene; 
        
        
        
        Scene busStationScene = new Scene();
        busStationScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        busStationScene.zombieCount = 5;
        busStationScene.medKitCount = 5;
        busStationScene.waterCount = 6;
        busStationScene.energyBarCount = 2;
        
        sceneObjects [0][3] = busStationScene; 
        
        
        
        Scene parkScene = new Scene();
        parkScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        parkScene.zombieCount = 5;
        parkScene.medKitCount = 5;
        parkScene.waterCount = 6;
        parkScene.energyBarCount = 2;
        
        sceneObjects [1][3] = parkScene; 
        
        
        
        Scene cityHallScene = new Scene();
        cityHallScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        cityHallScene.zombieCount = 5;
        cityHallScene.medKitCount = 5;
        cityHallScene.waterCount = 6;
        cityHallScene.energyBarCount = 2;
        
        sceneObjects [2][3] = cityHallScene; 
        
        
        Scene conventionCenter1Scene = new Scene();
        conventionCenter1Scene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        conventionCenter1Scene.zombieCount = 5;
        conventionCenter1Scene.medKitCount = 5;
        conventionCenter1Scene.waterCount = 6;
        conventionCenter1Scene.energyBarCount = 2;
        
        sceneObjects [0][4] = conventionCenter1Scene; 
        
        
        
        Scene hotelScene = new Scene();
        hotelScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        hotelScene.zombieCount = 5;
        hotelScene.medKitCount = 5;
        hotelScene.waterCount = 6;
        hotelScene.energyBarCount = 2;
        
        sceneObjects [1][4] = hotelScene; 
        
        
        
        Scene apartmentBuildingScene = new Scene();
        apartmentBuildingScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        apartmentBuildingScene.zombieCount = 5;
        apartmentBuildingScene.medKitCount = 5;
        apartmentBuildingScene.waterCount = 6;
        apartmentBuildingScene.energyBarCount = 2;
        
        sceneObjects [2][4] = apartmentBuildingScene; 
        
        
        
        Scene conventionCenter2Scene = new Scene();
        conventionCenter2Scene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        conventionCenter2Scene.zombieCount = 5;
        conventionCenter2Scene.medKitCount = 5;
        conventionCenter2Scene.waterCount = 6;
        conventionCenter2Scene.energyBarCount = 2;
        
        sceneObjects [1][5] = conventionCenter2Scene; 
        
        
        
        
        Scene shoppingMallScene = new Scene();
        shoppingMallScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        shoppingMallScene.zombieCount = 5;
        shoppingMallScene.medKitCount = 5;
        shoppingMallScene.waterCount = 6;
        shoppingMallScene.energyBarCount = 2;
        
        sceneObjects [1][5] = shoppingMallScene; 
        
        
        
        
        Scene cathedralScene = new Scene();
        cathedralScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        cathedralScene.zombieCount = 5;
        cathedralScene.medKitCount = 5;
        cathedralScene.waterCount = 6;
        cathedralScene.energyBarCount = 2;
        
        sceneObjects [2][5] = cathedralScene; 
        
        
        
        
        Scene refugeeCamp1Scene = new Scene();
        refugeeCamp1Scene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        refugeeCamp1Scene.zombieCount = 5;
        refugeeCamp1Scene.medKitCount = 5;
       refugeeCamp1Scene.waterCount = 6;
        refugeeCamp1Scene.energyBarCount = 2;
        
        sceneObjects [0][6] = refugeeCamp1Scene; 
        
        
        
           Scene refugeeCamp2Scene = new Scene();
        refugeeCamp2Scene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        refugeeCamp2Scene.zombieCount = 5;
        refugeeCamp2Scene.medKitCount = 5;
       refugeeCamp2Scene.waterCount = 6;
        refugeeCamp2Scene.energyBarCount = 2;
        
        sceneObjects [1][6] = refugeeCamp2Scene; 
        
        
        
        Scene zooScene = new Scene();
        zooScene.description =
                  "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        zooScene.zombieCount = 5;
        zooScene.medKitCount = 5;
        zooScene.waterCount = 6;
        zooScene.energyBarCount = 2;
        
        sceneObjects [2][6] = zooScene; 
        
        
        
        
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
