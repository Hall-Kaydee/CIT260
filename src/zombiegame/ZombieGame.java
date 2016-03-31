/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;
//
import byui.cit260.zombieGame.model.Player;
import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.Scene;

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
    
    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;
    public static PrintWriter logFile = null;
    
    public static PrintWriter mapReportFile = null;
    public static PrintWriter sceneReportFile = null;
    public static PrintWriter statsReportFile = null;
    
    
    public static int xCoordinate = 0;//initial player X coordinate
    public static int yCoordinate = 0;//initial player Y coordinate
    public static int radioListenCount = 0; 
    public static double hitPoints = 1;
    public static int charDam = 25;
    public static double charHealth = 100;
    public static int zombieCount = 0;
    

    
    
    
    
  
    public static void main(String[] args) {
       
        
      
        
        try{ 
       
        ZombieGame.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        
        ZombieGame.outFile = 
                new PrintWriter(System.out, true);
        
        

        
         String filePath = "log.txt";
         String mapReportFilePath = "mapreport.txt";         
         String sceneReportFilePath = "scenereport.txt";         
         String statsReportFilePath = "statsreport.txt";         
         
        ZombieGame.logFile = new PrintWriter(filePath);
        
        ZombieGame.mapReportFile = new PrintWriter(mapReportFilePath);

        ZombieGame.sceneReportFile = new PrintWriter(sceneReportFilePath);

        ZombieGame.statsReportFile = new PrintWriter(statsReportFilePath);        
        
        
        
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
                
                if (ZombieGame.mapReportFile != null) 
                ZombieGame.mapReportFile.close();
                
                if (ZombieGame.sceneReportFile != null) 
                ZombieGame.sceneReportFile.close(); 
                
                if (ZombieGame.statsReportFile != null) 
                ZombieGame.statsReportFile.close();             
                
                
            } catch (IOException ex) {
                System.out.println("\n***Error closing files***");
                return;
            }

        }
        
        
        Scene startScene = new Scene();
        startScene.medKitCount = 5;
        startScene.waterCount = 6;
        startScene.energyBarCount = 2;        
        
        
        
        
        
        
        
        
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
    
    public static PrintWriter getMapReportFile() {
        return logFile;
    }

    public static void setMapReportFile(PrintWriter logFile) {
        ZombieGame.logFile = logFile;
    }

    public static PrintWriter getSceneReportFile() {
        return logFile;
    }

    public static void getSceneReportFile(PrintWriter logFile) {
        ZombieGame.logFile = logFile;
    }

    public static PrintWriter getStatsReportFile() {
        return logFile;
    }

    public static void setStatsReportFile(PrintWriter logFile) {
        ZombieGame.logFile = logFile;
    }    
    
    
    
    
    
    
}
