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
                + "\nE - View Equipment"
                + "\nM - Move"
                + "\nT - Talk"
                + "\nU - Use Equipment"
                + "\nW - Select Weapon"  
                + "\nR - Save Reports"
                + "\nQ - Quit"
                + "\n++++++++++++++++++++++++++++++++++++++"
               
        );
        
        
            MainCharacter mainCharacter = new MainCharacter();
 
            double chrHealth = mainCharacter.getCharHealth();
            
            String characterHealth = String.valueOf(chrHealth);        
      
            System.out.println("\n Player Health is " + characterHealth);        
        
        
        
        
        
        
      }
        
    public GameMenuView(String message) {
    super (message);
    }
        
   
    @Override
    public boolean doAction(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "V"://what is the goal?
                this.displayMap();
               break;
            
            case "E"://How to move
                //System.out.println("\nView Equipment");
                InventoryView inventoryMenu = new InventoryView() {
           
        };
                inventoryMenu.display();
               break;
               
            case "M"://how to get items noted out to test inventory menu -Evan

                MoveView moveMenu = new MoveView();
                MainCharacter xCoordinate = new MainCharacter();
                MainCharacter yCoordinate = new MainCharacter();  
                
                int xCoord = xCoordinate.getXCoordinate();
                int yCoord = yCoordinate.getYCoordinate();
                          
                Map playerMapLocation = new Map();
                String playerLocation = playerMapLocation.buildMap(xCoord, yCoord);
                System.out.println("\nPlayer location is " + playerLocation);
                
                moveMenu.display();


                //System.out.println("\nYou have moved");

                break;
                
            case "T":

                TalkToPersonView talkMenu = new TalkToPersonView();
                talkMenu.display();
                
                break;    
                
            case "U"://combat - how to fight
                
                UseEquipmentView useEquipmentMenu = new UseEquipmentView();
                useEquipmentMenu.display();
                
                break;
                
                
            case "W"://combat - how to fight
                System.out.println("\nView and Select Weapons");
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
 
      MapView mapView = new MapView();

      mapView.display();   
    
    
    }
    
    private void callSaveReports() {

 /*       Map maptxt = MapControl.createMap();
        
        String mapReport = maptxt.getMap();

        Scene sceneMapReport = new Scene();
        
        String map = sceneMapReport.getMap();
        int zombieCount = sceneMapReport.getZombieCount();
        int medKitCount = sceneMapReport.getMedKitCount();
        int energyBarCount = sceneMapReport.getEnergyBarCount();
        int waterCount = sceneMapReport.getWaterBarCount();

*/
 
         Scene sceneMapReport = new Scene();
         String map = sceneMapReport.getMap();
        int zombieCount = sceneMapReport.getZombieCount();
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
               
               //i++;
               
               }
           //out.printf("%-71s", playerMapView);
           
            }
        
        catch (Exception e){
            ErrorView.display(this.getClass().getName(),"\nError writing file");
            }
        
        try {
            
           PrintWriter out2 = new PrintWriter(ZombieGame.sceneReportFile);
           
           out2.println("\n------------ Scene Report --------------");
           out2.printf("%n%-20s%10s", "Description", "Quantity" );
           out2.printf("%n%-20s%10s", "-----------", "--------" );
           out2.printf("%n%-20s%10d", "Zombie Count", zombieCount );           
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
          String playerLocation = playerMapLocation.buildMap(xCoord, yCoord);  
            
            
           PrintWriter out2 = new PrintWriter(ZombieGame.statsReportFile);
           
           out2.println("\n------------ Player Sats Report --------------");
           out2.printf("%n%-30s%10s", "Description", "Value" );
           out2.printf("%n%-30s%10s", "-----------", "-----" );
           out2.printf("%n%-30s%10s", "Scene Name", playerLocation );           
           out2.printf("%n%-30s%10d", "X Coordinate", xCoord ); 
           out2.printf("%n%-30s%10d", "Y Coordinate", yCoord );
           
         
            }
        
        catch (Exception e){
            ErrorView.display(this.getClass().getName(),"\nError writing file");
            }        
        
        
        
 
    }    
    
    
    
    
    
}
