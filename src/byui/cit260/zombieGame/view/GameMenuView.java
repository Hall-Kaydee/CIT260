/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Map;

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
                + "\nQ - Quit"
                + "\n++++++++++++++++++++++++++++++++++++++"
               
        );
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
    
}
