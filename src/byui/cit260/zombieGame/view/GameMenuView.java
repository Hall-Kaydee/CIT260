/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.Enum.SceneType;
import byui.cit260.zombieGame.control.MapControl;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Scene;
import java.io.IOException;
import java.io.PrintWriter;
import static jdk.nashorn.internal.objects.NativeString.length;
import zombiegame.ZombieGame;
import static zombiegame.ZombieGame.energyBarCountArray;
import static zombiegame.ZombieGame.medKitCountArray;
import static zombiegame.ZombieGame.sceneObjects;
import static zombiegame.ZombieGame.waterCountArray;
import static zombiegame.ZombieGame.weaponArray;

/**
 *
 * @author Boyd
 */
public class GameMenuView extends View{

        public GameMenuView() {
        super("\n"
                + "\n++++++++++++++++++++++++++++++++++++++"
                + "\n+  Game Menu                          "
                + "\n++++++++++++++++++++++++++++++++++++++"
                + "\nV - View Map"
                + "\nE - View Inventory"
                + "\nM - Move"
                + "\nS - Search Current Location"                
                + "\nT - Talk"
                + "\nU - Use Inventory"
                + "\nW - View and Select Weapon"  
                + "\nR - Save Reports"
                + "\nQ - Quit"
                + "\n++++++++++++++++++++++++++++++++++++++"
               
        );
        
        MainCharacter coordinates = new MainCharacter();
        Scene sceneDescription = new Scene();
        Map playerMapLocation = new Map();
     
        int xCoord = coordinates.getXCoordinate();
        int yCoord = coordinates.getYCoordinate();
        double characterHealth = coordinates.getCharHealth();
        
        

        String playerLocation = playerMapLocation.buildMap(xCoord, yCoord);
        this.console.println("\nPlayer location is " + playerLocation + " Your health is at level " + Double.toString(characterHealth));        

        
        System.out.println("\nThere are " + Integer.toString(ZombieGame.zombieCountArray[xCoord][yCoord]) + " zombies here.");
        

                
        String currentSceneDesc = sceneDescription.buildSceneDescritpions(xCoord, yCoord);
        this.console.println("\n" + currentSceneDesc);
 
      
      }
        
    public GameMenuView(String message) {
    super (message);
    }
        
   
    @Override
    public boolean doAction(String choice){
    
        MainCharacter coordinates = new MainCharacter();
  
                
        int xCoord = coordinates.getXCoordinate();
        int yCoord = coordinates.getYCoordinate();

        Map playerMapLocation = new Map();                          
        String playerLocation = playerMapLocation.buildMap(xCoord, yCoord);
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "V"://what is the goal?
                this.displayMap();
               break;
            
            case "E":


                
                
                
                

                System.out.println("\nNumber of Medkits: " + Integer.toString(ZombieGame.playerMedKitCount) 
                                 + "   Number of Water Bottles: " + Integer.toString(ZombieGame.playerWaterCount)
                                 + "   Number of Energy Bars: " + Integer.toString(ZombieGame.playerEnergyBarCount)                
                                    );                





                //System.out.println("\nView Equipment");
                //InventoryView inventoryMenu = new InventoryView() {};
                //inventoryMenu.display();
               break;
               
            case "M"://how to get items noted out to test inventory menu -Evan

                MoveView moveMenu = new MoveView();
                /*
                MainCharacter xCoordinate = new MainCharacter();
                MainCharacter yCoordinate = new MainCharacter();  
                
                int xCoordM = xCoordinate.getXCoordinate();
                int yCoordM = yCoordinate.getYCoordinate();
                          
                Map playerMapLocation = new Map();
                String playerLocation = playerMapLocation.buildMap(xCoordM, yCoordM);
                System.out.println("\nPlayer location is " + playerLocation);
                */
                moveMenu.display();


                //System.out.println("\nYou have moved");

                break;
   
                
            case "S":


                
                
                int medKits = medKitCountArray[xCoord][yCoord];
                int waters = waterCountArray[xCoord][yCoord];
                int energyBars = energyBarCountArray[xCoord][yCoord];
                String weapon = weaponArray[xCoord][yCoord];

                
                System.out.println("\nPlayer location is " + playerLocation);
                System.out.println("Number of Medkits: " + Integer.toString(medKits) 
                                 + "  Number of Water Bottles: " + Integer.toString(waters)
                                 + "  Number of Energy Bars: " + Integer.toString(energyBars)
                                 + "  Weapon found: " + weapon
                                    );                


                SearchLocationView searchMenu = new SearchLocationView();
                searchMenu.display();
                
                break;                 
                
                
            case "T":

                TalkToPersonView talkMenu = new TalkToPersonView();
                talkMenu.display();
                
                break;    
                
            case "U"://combat - how to fight
                
                UseInventoryView useInventoryMenu = new UseInventoryView ();
                useInventoryMenu.display();
                
                break;
                
                
            case "W"://combat - how to fight
                
                ViewWeapons viewWeapons = new ViewWeapons ();
                viewWeapons.display();
                
                
                //System.out.println("\nView and Select Weapons");
                break;
                
            case "R"://save the current game
                this.callSaveReports();
                break;    
                
                
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    

    public void displayMap() {
 
      Map mapView = new Map();
      
      MainCharacter xCoordinate = new MainCharacter();
      MainCharacter yCoordinate = new MainCharacter();

      int xCoord = xCoordinate.getXCoordinate();
      int yCoord = yCoordinate.getYCoordinate();
      
      String playerMapView = mapView.buildMapViews(xCoord, yCoord);

      System.out.println(playerMapView); 
    
    
    }
    
    private void callSaveReports() {

 
         Scene sceneMapReport = new Scene();
         String map = sceneMapReport.getMap();
        //int zombieCount = sceneMapReport.getZombieCount();
        int medKitCount = sceneMapReport.getMedKitCount();
        int energyBarCount = sceneMapReport.getEnergyBarCount();
        int waterCount = sceneMapReport.getWaterBarCount();
 
        
        try {
            
            
          MainCharacter xCoordinate = new MainCharacter();
          MainCharacter yCoordinate = new MainCharacter();
          Map playerMapLocation = new Map();

          int xCoord = xCoordinate.getXCoordinate();
          int yCoord = yCoordinate.getYCoordinate(); 
          String playerMapView = playerMapLocation.buildMapViews(xCoord, yCoord); 
            
           PrintWriter out = new PrintWriter(ZombieGame.mapReportFile);
           
           out.println("\n--------- THIS IS THE MAP YO--------------\n\n");
           out.println("\n\n");
           
           int i = 0;
           int mapStringLength = 0;
           int lineCount = 0;
           String newMapString = "";
           char characterIn;
           char characterOut;
           mapStringLength = playerMapView.length() - 1;
           
           while (i <= mapStringLength){
   
               if (lineCount <= 71) {
                   
                   characterIn = playerMapView.charAt(i);
                   characterOut = characterIn;
                   newMapString = newMapString + Character.toString(characterOut);
                   lineCount++;
                   i++;
                     }
               else {

                   characterIn = playerMapView.charAt(i);
                   characterOut = characterIn;
                   newMapString = newMapString + Character.toString(characterOut);
                   out.printf("%n%-71s", newMapString);
                   newMapString = " ";
                   lineCount = 1;
                   i++;
                    }
               
               
               }

           
            }
        
        catch (Exception e){
            ErrorView.display(this.getClass().getName(),"\nError writing file");
            }
        
        try {
            
           PrintWriter out2 = new PrintWriter(ZombieGame.sceneReportFile);
            medKitCount = ZombieGame.playerMedKitCount;
            waterCount = ZombieGame.playerWaterCount;
            energyBarCount = ZombieGame.playerEnergyBarCount; 
            
            MainCharacter damageVal = new MainCharacter();
            int damageValue = damageVal.getCharDam();
            String currentWeapon = "";
            if (damageValue == 5)  currentWeapon = "FISTS";
            if (damageValue == 15) currentWeapon = "KNIFE";            
            if (damageValue == 18) currentWeapon = "MACHETE";
            if (damageValue == 19) currentWeapon = "BASEBALL BAT";
            if (damageValue == 21) currentWeapon = "CROSSBOW";
            if (damageValue == 25) currentWeapon = "HANDGUN";
            if (damageValue == 30) currentWeapon = "DOUBLE DESERT EAGLES";
            if (damageValue == 32) currentWeapon = "SEMI-AUTOMATIC SHOTGUN";
            if (damageValue == 38) currentWeapon = "UZI MACHINE GUN";
            if (damageValue == 42) currentWeapon = "AK-47";
            if (damageValue == 55) currentWeapon = "GRENADE";
            if (damageValue == 85) currentWeapon = "ROCKET LAUNCHER";

                                    
                                    
                        
            
                                                 
           out2.println("\n------------ Scene Report --------------");
           out2.printf("%n%-20s%10s", "Description", "Quantity" );
           out2.printf("%n%-20s%10s", "-----------", "--------" );
           out2.printf("%n%-20s%10s", "Current Weapon", currentWeapon );           
           out2.printf("%n%-20s%10d", "Medkit Count", medKitCount ); 
           out2.printf("%n%-20s%10d", "Energybar Count", energyBarCount );
           out2.printf("%n%-20s%10d", "Water Count", waterCount );           
         
            }
        
        catch (Exception e){
            ErrorView.display(this.getClass().getName(),"\nError writing file");
            } 
        
        try {
           
          MainCharacter xCoordinate = new MainCharacter();
          MainCharacter yCoordinate = new MainCharacter();
          Map playerMapLocation = new Map();

          int xCoord = xCoordinate.getXCoordinate();
          int yCoord = yCoordinate.getYCoordinate();
          double health = xCoordinate.getCharHealth();
          String playerLocation = playerMapLocation.buildMap(xCoord, yCoord);  
            
            
           PrintWriter out2 = new PrintWriter(ZombieGame.statsReportFile);
           
           out2.println("\n------------ Player Sats Report --------------");
           out2.printf("%n%-30s%10s", "Description", "Value" );
           out2.printf("%n%-30s%10s", "-----------", "-----" );
           out2.printf("%n%-30s%10f", "Player Health", health ); 
           out2.printf("%n%-30s%10s", "Scene Name", playerLocation );           
           out2.printf("%n%-30s%10d", "X Coordinate", xCoord ); 
           out2.printf("%n%-30s%10d", "Y Coordinate", yCoord );
          
         
            }
        
        catch (Exception e){
            ErrorView.display(this.getClass().getName(),"\nError writing file");
            }        
        
        
        
 
    }    
    
    
    
    
    
}
