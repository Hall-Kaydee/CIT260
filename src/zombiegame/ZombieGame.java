/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;
//
import byui.cit260.zombieGame.model.Player;
import byui.cit260.zombieGame.model.Game;

import byui.cit260.zombieGame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Evanator
 */
public class ZombieGame {
    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    
    
    
    public static int xCoordinate = 0;//initial player X coordinate
    public static int yCoordinate = 0;//initial player Y coordinate
    public static int radioListenCount = 0; 
    
    
    
  
    public static void main(String[] args) {
       
        
      
        
        try{ 
       
        ZombieGame.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        
        ZombieGame.outFile = 
                new PrintWriter(System.out, true);
        

        
         String filePath = "log.txt";
        ZombieGame.logFile = new PrintWriter(filePath);  
        
          //create startProgramview origin - display start program view
        StartProgramView startProgramView = new StartProgramView();    
            
        startProgramView.displayStartProgramView();
        return;
            }
       
        catch (Throwable e){
    
           System.out.println("\nException" + e.toString() +
                                 "\ncause" + e.getCause() + 
                                   "\nmessage" + e.getMessage());
            
            
           e.printStackTrace();;
           
        }  
   
        
        finally {
            
            try {
                
                if (ZombieGame.inFile != null) 
                ZombieGame.inFile.close();
 
                if (ZombieGame.outFile != null) 
                ZombieGame.outFile.close();
                
                if (ZombieGame.logFile != null) 
                ZombieGame.logFile.close();                
                
            } catch (IOException ex) {
                System.out.println("\n***Error closing files***");
                return;
            }

        }
    }

   
     public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieGame.player = player;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ZombieGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ZombieGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ZombieGame.logFile = logFile;
    }
    
}
