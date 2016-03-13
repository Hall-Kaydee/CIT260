/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.Enum.SceneType;
import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.Location;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Scene;
import zombiegame.ZombieGame;

/**
 *
 * @author Evan
 */
public class MapControl {
    
   public static Map createMap() {
        // create map
     Map map = new Map(7, 14);
     
     //create a list of scenes in game
     Scene[] scenes = createScenes();
     
     //assign the differen scenes to locations in tha map
     MapControl.assignScenesToLocations(map, scenes);
     
     return map;
           
    }
    
    private static Scene[] createScenes() {
     
        Game game = ZombieGame.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "You wake up in the wrecked APC. You are alone the doors are open "
                + "Looks like everyone left in a hurry. Where did they go? what happened? "
                + "You exit the APC and look around. the street is empty and there is no sign of life. "
                + "You hear in the distance the sounds of the ocasional gun shot and distant shouts. "
                + "What will you do now?");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
    
    
    Scene fireStationScene = new Scene();
        fireStationScene.setDescription(
                  "You arrive at the fire station, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.fireStation.ordinal()] = fireStationScene;
        

Scene schoolScene = new Scene();
        schoolScene.setDescription(
                  "You arrive at the School, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.school.ordinal()] = schoolScene;
        

Scene sportingGoodsStoreScene = new Scene();
        sportingGoodsStoreScene.setDescription(
                  "You arrive at the sporting Goods Store, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.sportingGoodsStore.ordinal()] = sportingGoodsStoreScene;
        

Scene hospitalScene = new Scene();
        hospitalScene.setDescription(
                  "You arrive at the Hospital, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.hospital.ordinal()] = hospitalScene;
        

Scene convienceStoreScene = new Scene();
        convienceStoreScene.setDescription(
                  "You arrive at the Convience Store, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.convienceStore.ordinal()] = convienceStoreScene;
        

Scene lotScene = new Scene();
        lotScene.setDescription(
                  "You arrive at an empty lot, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.lot.ordinal()] = lotScene;
        

Scene  groceryStoreScene = new Scene();
        groceryStoreScene.setDescription(
                  "You arrive at the Grocery Store, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.groceryStore.ordinal()] = groceryStoreScene;
        

Scene policeStationScene = new Scene();
        policeStationScene.setDescription(
                  "You arrive at the Police station, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.policeStation.ordinal()] = policeStationScene;
        

Scene busStationScene = new Scene();
        busStationScene.setDescription(
                  "You arrive at the Bus Station, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.busStation.ordinal()] = busStationScene;
        

Scene parkScene = new Scene();
        parkScene.setDescription(
                  "You arrive at the Park, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.park.ordinal()] = parkScene;
        

Scene cityHallScene = new Scene();
        cityHallScene.setDescription(
                  "You arrive at City Hall, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.cityHall.ordinal()] = cityHallScene;
        

Scene conventionCenter1Scene = new Scene();
        conventionCenter1Scene.setDescription(
                  "You arrive at the convention center, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.conventionCenter1.ordinal()] = conventionCenter1Scene;
        

Scene hotelScene = new Scene();
        hotelScene.setDescription(
                 "You arrive at the hotel, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.hotel.ordinal()] = hotelScene;
    
    
    Scene apartmentBuildingScene = new Scene();
        apartmentBuildingScene.setDescription(
                  "You arrive at the appartment building, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.apartmentBuilding.ordinal()] = apartmentBuildingScene;
        
Scene conventionCenter2Scene = new Scene();
        conventionCenter2Scene.setDescription(
                  "You arrive at the Second Convention center, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.conventionCenter2.ordinal()] = conventionCenter2Scene;
        

Scene shoppingMallScene = new Scene();
        shoppingMallScene.setDescription(
                  "You arrive at the Shopping Mall, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.shoppingMall.ordinal()] = shoppingMallScene;
        

Scene cathedralScene = new Scene();
        cathedralScene.setDescription(
                  "You arrive at the Cathedral, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.cathedral.ordinal()] = cathedralScene;
        

Scene zooScene = new Scene();
        zooScene.setDescription(
                  "You arrive at the Zoo, "
                + "no one appears to be here");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.zoo.ordinal()] = zooScene;
    
        
    Scene refugeeCamp1Scene = new Scene();
        refugeeCamp1Scene.setDescription(
                  "You arrive at the Refugee Camp and start lookin g for your family, "
                + "People rush to you begging you for any spare food or drink you have");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.refugeeCamp1.ordinal()] = refugeeCamp1Scene;


Scene refugeeCamp2Scene = new Scene();
        refugeeCamp2Scene.setDescription(
                  "You have navigated the Refugee camp and have located your family. "
                + "Good work! it can only get better from here... Or will it?");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.refugeeCamp2.ordinal()] = refugeeCamp2Scene;
        
     return scenes;   
    
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.school.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.fireStation.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.sportingGoodsStore.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.convienceStore.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.lot.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.groceryStore.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.policeStation.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.busStation.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.park.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.cityHall.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.conventionCenter1.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.hotel.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.apartmentBuilding.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.conventionCenter2.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.shoppingMall.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.cathedral.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.refugeeCamp1.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.refugeeCamp2.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.zoo.ordinal()]);
    }
    
    
    
    }