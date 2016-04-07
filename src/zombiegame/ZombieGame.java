/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;
//
import byui.cit260.zombieGame.model.Player;
import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Scene;
import byui.cit260.zombieGame.model.Zombie;

import byui.cit260.zombieGame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

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
    public static int[][][] sceneObjects;
    //public static Iterable<String> weaponList;
    
    MainCharacter xCoordinateTemp = new MainCharacter();
    MainCharacter yCoordinateTemp = new MainCharacter();

    int xCoord = xCoordinateTemp.getXCoordinate();
    int yCoord = yCoordinateTemp.getYCoordinate();

    public static int charDam = 5;
    public static double charHealth = 100;
    public static double hitPoints = .5;
    
    public static int playerMedKitCount = 0;
    public static int playerWaterCount = 0;
    public static int playerEnergyBarCount = 0;
                
            
    
    public static int[][] zombieCountArray = null;
    public static int[][] medKitCountArray = null;
    public static int[][] waterCountArray = null;
    public static int[][] energyBarCountArray = null;
    public static String[][] weaponArray = null;
    public static String[] weaponListArray = null;
    public List<String> weaponList;
    //int[][] zombieCountArray

    

    
    
    
    
  
    public static void main(String[] args) {
       
    

        
        zombieCountArray = new int [3][7];
    
        zombieCountArray[0][0] = 0;
        zombieCountArray[1][0] = 2;
        zombieCountArray[2][0] = 3;
        
        zombieCountArray[0][1] = 3;
        zombieCountArray[1][1] = 7;
        zombieCountArray[2][1] = 9;
        
        zombieCountArray[0][2] = 10;
        zombieCountArray[1][2] = 11;
        zombieCountArray[2][2] = 10;
        
        zombieCountArray[0][3] = 11;
        zombieCountArray[1][3] = 13;
        zombieCountArray[2][3] = 15;
        
        zombieCountArray[0][4] = 15;
        zombieCountArray[1][4] = 16;
        zombieCountArray[2][4] = 18;
        
        zombieCountArray[0][5] = 17;
        zombieCountArray[1][5] = 15;
        zombieCountArray[2][5] = 11;
        
        zombieCountArray[0][6] = 0;
        zombieCountArray[1][6] = 18;
        zombieCountArray[2][6] = 16; 
        

        medKitCountArray = new int [3][7];
    
        medKitCountArray[0][0] = 0;
        medKitCountArray[1][0] = 4;
        medKitCountArray[2][0] = 5;
        
        medKitCountArray[0][1] = 6;
        medKitCountArray[1][1] = 9;
        medKitCountArray[2][1] = 9;
        
        medKitCountArray[0][2] = 8;
        medKitCountArray[1][2] = 9;
        medKitCountArray[2][2] = 10;
        
        medKitCountArray[0][3] = 11;
        medKitCountArray[1][3] = 13;
        medKitCountArray[2][3] = 15;
        
        medKitCountArray[0][4] = 10;
        medKitCountArray[1][4] = 12;
        medKitCountArray[2][4] = 18;
        
        medKitCountArray[0][5] = 17;
        medKitCountArray[1][5] = 15;
        medKitCountArray[2][5] = 11;
        
        medKitCountArray[0][6] = 8;
        medKitCountArray[1][6] = 18;
        medKitCountArray[2][6] = 16;



        waterCountArray = new int [3][7];
    
        waterCountArray[0][0] = 0;
        waterCountArray[1][0] = 1;
        waterCountArray[2][0] = 2;
        
        waterCountArray[0][1] = 1;
        waterCountArray[1][1] = 2;
        waterCountArray[2][1] = 1;
        
        waterCountArray[0][2] = 2;
        waterCountArray[1][2] = 3;
        waterCountArray[2][2] = 2;
        
        waterCountArray[0][3] = 2;
        waterCountArray[1][3] = 1;
        waterCountArray[2][3] = 0;
        
        waterCountArray[0][4] = 3;
        waterCountArray[1][4] = 2;
        waterCountArray[2][4] = 2;
        
        waterCountArray[0][5] = 1;
        waterCountArray[1][5] = 2;
        waterCountArray[2][5] = 3;
        
        waterCountArray[0][6] = 4;
        waterCountArray[1][6] = 3;
        waterCountArray[2][6] = 2;




        energyBarCountArray = new int [3][7];
    
        energyBarCountArray[0][0] = 0;
        energyBarCountArray[1][0] = 1;
        energyBarCountArray[2][0] = 1;
        
        energyBarCountArray[0][1] = 2;
        energyBarCountArray[1][1] = 2;
        energyBarCountArray[2][1] = 1;
        
        energyBarCountArray[0][2] = 2;
        energyBarCountArray[1][2] = 0;
        energyBarCountArray[2][2] = 1;
        
        energyBarCountArray[0][3] = 2;
        energyBarCountArray[1][3] = 1;
        energyBarCountArray[2][3] = 1;
        
        energyBarCountArray[0][4] = 1;
        energyBarCountArray[1][4] = 2;
        energyBarCountArray[2][4] = 2;
        
        energyBarCountArray[0][5] = 1;
        energyBarCountArray[1][5] = 1;
        energyBarCountArray[2][5] = 2;
        
        energyBarCountArray[0][6] = 1;
        energyBarCountArray[1][6] = 2;
        energyBarCountArray[2][6] = 2;



        weaponArray = new String [3][7];
    
        weaponArray[0][0] = "KNIFE";
        weaponArray[1][0] = null;
        weaponArray[2][0] = "MACHETE";
        
        weaponArray[0][1] = "BASEBALL BAT";
        weaponArray[1][1] = "CROSSBOW";
        weaponArray[2][1] = null;
        
        weaponArray[0][2] = null;
        weaponArray[1][2] = null;
        weaponArray[2][2] = "HANDGUN";
        
        weaponArray[0][3] = "DOUBLE DESERT EAGLES";
        weaponArray[1][3] = null;
        weaponArray[2][3] = null;
        
        weaponArray[0][4] = "SEMI-AUTOMATIC SHOTGUN";
        weaponArray[1][4] = null;
        weaponArray[2][4] = "UZI MACHINE GUN";
        
        weaponArray[0][5] = null;
        weaponArray[1][5] = null;
        weaponArray[2][5] = "AK-47";
        
        weaponArray[0][6] = null;
        weaponArray[1][6] = "GRENADE";
        weaponArray[2][6] = "ROCKET LAUNCHER";


        weaponListArray = new String [12];
        weaponListArray[0] = "FISTS";
    /*    weaponListArray[1] = "";        
        weaponListArray[2] = "";        
        weaponListArray[3] = "";   
        weaponListArray[4] = "";        
        weaponListArray[5] = "";
        weaponListArray[6] = "";        
        weaponListArray[7] = "";        
        weaponListArray[8] = "";        
        weaponListArray[9] = "";        
        weaponListArray[10] = "";
        weaponListArray[11] = "";
        
        */
        
        
        try{ 
       
        ZombieGame.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        
        ZombieGame.outFile = 
                new PrintWriter(System.out, true);
        
        

        
         String filePath = "c:/users/boyd/documents/cit260/game_files/log.txt";
         String mapReportFilePath = "c:/users/boyd/documents/cit260/game_files/mapreport.txt";         
         String sceneReportFilePath = "c:/users/boyd/documents/cit260/game_files/scenereport.txt";         
         String statsReportFilePath = "c:/users/boyd/documents/cit260/game_files/statsreport.txt";         
         
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
  

        ZombieGame list = new ZombieGame();

        list.setWeaponList(list.weaponListMaker());
        
    }
 
    public ArrayList<String> weaponListMaker (){
        



        ArrayList<String> weaponList = new ArrayList<>();
        weaponList.add("FISTS");


        return weaponList;

    }    
    
    
    
    
    
    
    public List<String> getWeaponList (){
        
        return weaponList;
        
    }

    
    public void setWeaponList(List<String> wList) {
        weaponList = wList;
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
