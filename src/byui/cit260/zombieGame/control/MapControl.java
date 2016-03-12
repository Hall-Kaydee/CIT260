/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.Enum.SceneType;
import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Scene;
import zombiegame.ZombieGame;

/**
 *
 * @author tyler
 */
public class MapControl {
    
   public static Map createMap() {
        // create map
     Map map = new Map(2, 6);
     
     //create a list of scenes in game
     Scene[] scenes = createScenes();
     
     //assign the differen scenes to locations in tha map
     GameControl.assignScenesToLocations(map, scenes);
     
     return map;
           
    }
    
    private static Scene[] createScenes() {
     
        Game game = ZombieGame.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
    
    
    Scene fireStationScene = new Scene();
        fireStationScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.fireStation.ordinal()] = fireStationScene;
        

Scene schoolScene = new Scene();
        schoolScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.school.ordinal()] = schoolScene;
        

Scene lots1Scene = new Scene();
        lots1Scene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.lot.ordinal()] = lots1Scene;
        

Scene sportingGoodsStoreScene = new Scene();
        sportingGoodsStoreScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.sportingGoodsStore.ordinal()] = sportingGoodsStoreScene;
        

Scene hospitalScene = new Scene();
        hospitalScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.hospital.ordinal()] = hospitalScene;
        

Scene convienceStoreScene = new Scene();
        convienceStoreScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.convienceStore.ordinal()] = convienceStoreScene;
        

Scene lots2Scene = new Scene();
        lots2Scene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.lot.ordinal()] = lots2Scene;
        

Scene  groceryStoreScene = new Scene();
        groceryStoreScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.groceryStore.ordinal()] = groceryStoreScene;
        

Scene policeStationScene = new Scene();
        policeStationScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.policeStation.ordinal()] = policeStationScene;
        

Scene busStationScene = new Scene();
        busStationScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.busStation.ordinal()] = busStationScene;
        

Scene parkScene = new Scene();
        parkScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.park.ordinal()] = parkScene;
        

Scene cityHallScene = new Scene();
        cityHallScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.cityHall.ordinal()] = cityHallScene;
        

Scene conventionCenter1Scene = new Scene();
        conventionCenter1Scene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.conventionCenter1.ordinal()] = conventionCenter1Scene;
        

Scene hotelScene = new Scene();
        hotelScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.hotel.ordinal()] = hotelScene;
    
    
    Scene apartmentBuildingScene = new Scene();
        apartmentBuildingScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.apartmentBuilding.ordinal()] = apartmentBuildingScene;
        
Scene conventionCenter2Scene = new Scene();
        conventionCenter2Scene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.conventionCenter2.ordinal()] = conventionCenter2Scene;
        

Scene shoppingMallScene = new Scene();
        shoppingMallScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.shoppingMall.ordinal()] = shoppingMallScene;
        

Scene cathedralScene = new Scene();
        cathedralScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.cathedral.ordinal()] = cathedralScene;
        

Scene zooScene = new Scene();
        zooScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.zoo.ordinal()] = zooScene;
    
        
    Scene refugeeCamp1Scene = new Scene();
        refugeeCamp1Scene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.refugeeCamp1.ordinal()] = refugeeCamp1Scene;


Scene refugeeCamp2Scene = new Scene();
        refugeeCamp2Scene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        //startingScene.setMapSymbol(" START ");
        //startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[SceneType.refugeeCamp2.ordinal()] = refugeeCamp2Scene;
        
     return scenes;   
    
    }
    
    
    
    
    
    }