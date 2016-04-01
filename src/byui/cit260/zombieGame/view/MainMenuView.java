/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.GameControl;
import byui.cit260.zombieGame.model.MainCharacter;
import java.util.IllegalFormatException;
import java.util.Scanner;
import zombiegame.ZombieGame;

/**
 *
 * @author Boyd
 */
public class MainMenuView extends View {

    public MainMenuView(){
    super("\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Main Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nN - Start New Game"
            + "\nL - Load Game"
            + "\nH - Help"
            + "\nS - Save Game"
            + "\nD - Test Double Number Exception"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
     );
    
        MainCharacter coordinates = new MainCharacter();
     
        int xCoord = coordinates.getXCoordinate();
        int yCoord = coordinates.getYCoordinate();
        double characterHealth = coordinates.getCharHealth();
        
        
        System.out.println("\nYour health is at level " + Double.toString(characterHealth));
        
        System.out.println("\nThere are " + Integer.toString(ZombieGame.zombieCountArray[xCoord][yCoord]) + " zombies here.");     
    
    }


    public MainMenuView(String message) {
        super (message);
    }


    
    @Override
    public boolean doAction(String value) throws IllegalFormatException {

        
       
        
        
 
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            
            case "N"://create and start a new game
                this.startNewGame();
                break;
            
            case "L"://get and start existing game
               this.loadGame();
               break;
               
            case "H"://get help
                this.displayHelpMenu();
                break;
                
            case "S"://save the current game
                this.saveGame();
                break;
                
            case "D"://save the current game
                this.callDoubleNumber();
                break;

          /*  case "R"://save the current game
                this.callSaveReports();
                break;
           */     
                
                
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
      
            }
 
       

          return false;     
        
    }


    private void startNewGame() {
 
        //create new game 
        GameControl.createNewGame(ZombieGame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
           
    }

    private void loadGame() {

       // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the path and filename for file where the game "
                           + "is to be saved:");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } 

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    
    }

    private void displayHelpMenu() {

       
     HelpMenuView helpMenuView = new HelpMenuView();
 
     
        helpMenuView.displayHelpMenuView();
     
       // System.out.println(helpMenuView);    
  
    
    }

    private void saveGame() {


        // prompt for and get the name of the file to save the game in
        this.console.println("\nEnter the path and filename for file where the game "
                           + "is to be saved:");
        String filePath = this.getInput();     
        
        try {
            // save the game to the speciried file
            GameControl.saveGame(ZombieGame.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } 

    }

    private void callDoubleNumber() {
        
        System.out.println("\n*** callDoubleNumber function called");
        DoubleFormat doubleNumber = new DoubleFormat();
        doubleNumber.getDoubleNumber();
    }




    
}