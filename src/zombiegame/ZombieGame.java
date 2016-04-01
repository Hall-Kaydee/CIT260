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
    
    MainCharacter xCoordinateTemp = new MainCharacter();
    MainCharacter yCoordinateTemp = new MainCharacter();

    int xCoord = xCoordinateTemp.getXCoordinate();
    int yCoord = yCoordinateTemp.getYCoordinate();

    public static int charDam = 25;
    public static double charHealth = 100;
    public static double hitPoints = 1;
    
    public static int[][] zombieCountArray = null;


    //int[][] zombieCountArray



    
    //Zombie zombieData = new Zombie ();    
    //int[][] zombieDataArray = zombieData.buildZombies(xCoord, yCoord);
    

    
    
    
    
  
    public static void main(String[] args) {
       
    

        
        zombieCountArray = new int [3][7];
    
        zombieCountArray[0][0] = 0;
        zombieCountArray[1][0] = 2;
        zombieCountArray[2][0] = 3;
        
        zombieCountArray[0][1] = 3;
        zombieCountArray[1][1] = 5;
        zombieCountArray[2][1] = 5;
        
        zombieCountArray[0][2] = 5;
        zombieCountArray[1][2] = 5;
        zombieCountArray[2][2] = 5;
        
        zombieCountArray[0][3] = 5;
        zombieCountArray[1][3] = 5;
        zombieCountArray[2][3] = 5;
        
        zombieCountArray[0][4] = 5;
        zombieCountArray[1][4] = 5;
        zombieCountArray[2][4] = 5;
        
        zombieCountArray[0][5] = 5;
        zombieCountArray[1][5] = 5;
        zombieCountArray[2][5] = 11;
        
        zombieCountArray[0][6] = 0;
        zombieCountArray[1][6] = 10;
        zombieCountArray[2][6] = 6; 
        
        
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
                  "\nAs you pass the fire station you notice the garage doors are open and the trucks are gone. The place"
                + "\nlooks deserted, suddenly you hear a shout and a zombie fireman comes sliding down the fireman’s pole. "
                + "\nHe is wielding an axe and accompanied by to feral looking Dalmatians. He signals them to attack and  "
                + "\nthey charge you. You draw your weapon. ";
        fireStationScene.zombieCount = 3;
        fireStationScene.medKitCount = 2;
        fireStationScene.waterCount = 1;
        fireStationScene.energyBarCount = 0;
        
        sceneObjects [2][0] = fireStationScene; 
        
        
        Scene sportingGoodsStoreScene = new Scene();
        sportingGoodsStoreScene.description =
                  "\nYou Enter the Sporting goods store in search of supplies. It already looks like it’s been hit by looters. The  "
                + "\nplace is a mess and there is goods all over the floor. You approach the weapon racks. There looks like  "
                + "\nthere are a few Pink firearms still there. As you go to jump over the counter it collapses. You hear noises  "
                + "\nelsewhere in the store… they are getting louder. They are coming for you. You draw your weapon right  "
                + "\nthey charge you. You draw your weapon. ";
        sportingGoodsStoreScene.zombieCount = 3;
        sportingGoodsStoreScene.medKitCount = 2;
        sportingGoodsStoreScene.waterCount = 2;
        sportingGoodsStoreScene.energyBarCount = 1;
        
        sceneObjects [0][1] = sportingGoodsStoreScene; 
        
        
        
        Scene hospitalScene = new Scene();
        hospitalScene.description =
                  "\nThe entrance of the Hospital is barracked and there is an Ambulance smashed in the wall. You climb on  "
                + "\ntop of the ambulance and use it to enter a second story window. You are now in a dark hallway. You trip  "
                + "\nover something and fall causing a gurney to go zooming down the hallway and causing a huge  "
                + "\ncommotion. The echoes can be heard for seconds after the gurney finally comes to a stop in an open  "
                + "\nelevator. As you pick yourself up you see the thing you tripped over move and start to get up. It is vile   "
                + "\nand dripping in who knows what. The zombie charges you. You flee but zombies are flanking you from  "
                + "\nthe behind. You draw your weapon and prepare to fight. ";
        hospitalScene.zombieCount = 5;
        hospitalScene.medKitCount = 5;
        hospitalScene.waterCount = 3;
        hospitalScene.energyBarCount = 2;
        
        sceneObjects [1][1] = hospitalScene; 
        
        
        
        Scene convenienceStoreScene = new Scene();
        convenienceStoreScene.description =
                  "\nIn the Convenience store you see several dead bodies. No sigh of zombies though. You walk around and  "
                + "\ncheck every aisle and door. Looks to be safe. You can search the area for anything of use. ";
 
        convenienceStoreScene.zombieCount = 5;
        convenienceStoreScene.medKitCount = 5;
        convenienceStoreScene.waterCount = 6;
        convenienceStoreScene.energyBarCount = 2;
        
        sceneObjects [2][1] = convenienceStoreScene; 
        
        
        Scene residentialLotScene = new Scene();
        residentialLotScene.description =
                  "\nYou walk down the alley behind some houses. A cat approaches you and starts to speak to you. It tells "
                + "\nyou of a magical place known as the refugee camp where you would be safe from the zombies. Before "
                + "\nyou can fully process this conversation you are having with this feline you hear and see zombies running  "
                + "\ndown both ends of the ally. The cat bails and leaves you to your fate. You climb atop a dumpster for high "
                + "\nground and draw your weapon.";
        residentialLotScene.zombieCount = 5;
        residentialLotScene.medKitCount = 5;
        residentialLotScene.waterCount = 6;
        residentialLotScene.energyBarCount = 2;
        
        sceneObjects [0][2] = residentialLotScene; 
        
        
        Scene groceryStoreScene = new Scene();
        groceryStoreScene.description =
                  "\n The Grocery store is dark no lights at all. The power must be cut. You carefully traverse the aisles in "
                + "\n search of a bathroom as nature is calling. You reach a women’s bathroom without incident. You enter "
                + "\n and quickly head to a stall to do your business. After a few minutes a zombie had reaches under from "
                + "\n the stall next to you and grunts to ask if you have any toilet paper you can share. You freeze and quickly "
                +"\n pull up your pants. You silence and refusal to share enrages the zombie and it begins to shriek. It tries to "
                +"\n get into your stall, It really needs to wipe. You bash its head with the stall door and break for the exit. "
                +"\n You find you are surrounded by zombies that were waiting their turn to go to the bathroom. The turn "
                + "\n their attention to you and lick their zombie lips or lack thereof. You draw your weapon and prepare to fight ";
        groceryStoreScene.zombieCount = 5;
        groceryStoreScene.medKitCount = 5;
        groceryStoreScene.waterCount = 6;
        groceryStoreScene.energyBarCount = 2;
        
        sceneObjects [1][2] = groceryStoreScene; 
        
        
        
        Scene policeStationScene = new Scene();
        policeStationScene.description =
                  "\nThe police station is on fire when you arrive and there are a few panicked people running from the "
                + "\nflames. They are chased by zombies wielding flame throwers. They are preparing for a BBQ. One of the "
                + "\npolice officers who escaped the flames runs to you and you both take cover behind a squad car. He says  "
                + "\nhe will join you in taking down these guys. You agree. He runs across the street firing his handgun to get  "
                + "\ntheir attention. You draw your weapon.";
        policeStationScene.zombieCount = 5;
        policeStationScene.medKitCount = 5;
        policeStationScene.waterCount = 6;
        policeStationScene.energyBarCount = 2;
        
        sceneObjects [2][2] = policeStationScene; 
        
        
        
        Scene busStationScene = new Scene();
        busStationScene.description =
                  "\nAt the bus stations all you see are rows of empty buses and the belongings of people who were unable"
                + "\nto escape the city. You start to look through some of the suitcases and bags for anything that can help "
                + "\nyou. Suddenly the bus in front of you honks. You look up to see a Zombie Bus driver sneering at you. His "
                + "\nhonking has attracted the entire teamsters union. You are really in trouble this time. You Draw your weapon "
                + "\nWhat will you do now?";
        busStationScene.zombieCount = 5;
        busStationScene.medKitCount = 5;
        busStationScene.waterCount = 6;
        busStationScene.energyBarCount = 2;
        
        sceneObjects [0][3] = busStationScene; 
        
        
        
        Scene parkScene = new Scene();
        parkScene.description =
                  "\nThe Park is probably the most untouched of all the city. You take in the pretty blue sky, green grass, the "
                + "\ntall trees and the napping zombie hobo on the park bench. Wait…. What.. The sleeping zombie Hobo "
                + "\nawakes and asks you if you can spare any brains. You try to apologize saying you left your brains in your "
                + "\nother pants. This out rages the Zombie and he waddles towards you spewing zombie profanity and "
                + "\ngreen liquid from his mouth.  A couple other zombies’ climb out of the bushes and approach you as well. "
                + "You draw your weapon.";
        parkScene.zombieCount = 5;
        parkScene.medKitCount = 5;
        parkScene.waterCount = 6;
        parkScene.energyBarCount = 2;
        
        sceneObjects [1][3] = parkScene; 
        
        
        
        Scene cityHallScene = new Scene();
        cityHallScene.description =
                  "\nYou aren’t really sure what you will find here in City Hall. Maybe anyone from the government will still  "
                + "\nbe here. All you find is lots of boring offices and lots of zombies waiting in line for various legal services. "
                + "\nThey are two brain dead to notice you. You come across a large office and inside is a plump zombie  "
                + "\nwearing a suit, Top hat and monocle. He is out raged by your intrusion and charges you flipping tables "
                + "\nand desks to reach you. You fire a shot and run out the door dropping the Mayor Zombie. The "
                + "\ncommotion has drawn the attention of the zombies waiting in line. You now have a lot of zombies "
                + "\nbetween you and the door. You draw your weapon.";
        cityHallScene.zombieCount = 5;
        cityHallScene.medKitCount = 5;
        cityHallScene.waterCount = 6;
        cityHallScene.energyBarCount = 2;
        
        sceneObjects [2][3] = cityHallScene; 
        
        
        Scene conventionCenter1Scene = new Scene();
        conventionCenter1Scene.description =
                  "\nYou enter the convention center and are immediately find yourself surrounded by hundreds of zombie "
                + "\nnerds and zombie cosplayers. It looks like you stumbled upon ZombieCon. The zombies wander around  "
                + "\ngreeting each other and debating trivial facts about fictional things. One zombie approaches you and  "
                + "\ncomplements you on your excellent human solider Cosplay. You thank him and then proceed to shoot  "
                + "\nhim in the head. The rest of the zombies become outrages and threaten to eat your brains and tell your  "
                + "\nmom on you. You draw your weapon.";
        conventionCenter1Scene.zombieCount = 5;
        conventionCenter1Scene.medKitCount = 5;
        conventionCenter1Scene.waterCount = 6;
        conventionCenter1Scene.energyBarCount = 2;
        
        sceneObjects [0][4] = conventionCenter1Scene; 
        
        
        
        Scene hotelScene = new Scene();
        hotelScene.description =
                  "\nThe Hotel Lobby is quite….too quite… after checking the area you come across a disgruntled Bell boy  "
                + "\nzombie. He starts venting to you about how crappy the job is and that the tips suck. No one will give him  "
                + "\ntheir brains…willingly. He offers to show you to your room in exchange for your brains. You decline and  "
                + "\nhe goes full rage on you two more Zombie Hotel employees back him up. You draw your weapon.";
               
        hotelScene.zombieCount = 5;
        hotelScene.medKitCount = 5;
        hotelScene.waterCount = 6;
        hotelScene.energyBarCount = 2;
        
        sceneObjects [1][4] = hotelScene; 
        
        
        
        Scene apartmentBuildingScene = new Scene();
        apartmentBuildingScene.description =
                  "\nYou search the different apartments of the condo and find very little everyone and everything is gone. "
                + "\nYou notice one room that is barracked and has the words “Stay Out” written on it. You figure, what the "
                + "\nworst that could happen. You move all of the stuff blocking the door. You open the door and are  "
                + "\nshocked by what you see. A rabid zombie ninja. He attacks you with ninja stars striking the door instead "
                + "\nas you duck. Time to go to work. You once again draw your weapon.";
        apartmentBuildingScene.zombieCount = 5;
        apartmentBuildingScene.medKitCount = 5;
        apartmentBuildingScene.waterCount = 6;
        apartmentBuildingScene.energyBarCount = 2;
        
        sceneObjects [2][4] = apartmentBuildingScene; 
        
        
        
        Scene conventionCenter2Scene = new Scene();
        conventionCenter2Scene.description =
                  "\nThe far side of the Convention Center is completely abandoned. Looks like it was a Gun Show. Amazingly  "
                + "\nit looks untouched. There is no signing of any humans or zombies. You help yourself to the weapons and ammo";
        conventionCenter2Scene.zombieCount = 5;
        conventionCenter2Scene.medKitCount = 5;
        conventionCenter2Scene.waterCount = 6;
        conventionCenter2Scene.energyBarCount = 2;
        
        sceneObjects [1][5] = conventionCenter2Scene; 
        
        
        
        
        Scene shoppingMallScene = new Scene();
        shoppingMallScene.description =
                  "\nThe Shopping mall is huge. So many stores, they are all abandoned and wrecked like everything else in  "
                + "\nthis city. As you approach a Hot Topic you become surrounded by a half dozen Hipster Zombies wearing  "
                + "\ndark rimmed glasses and thirst store clothing. They insist you give them your brains since they were  "
                + "\neating brains before it was cool. You shake your head in annoyance and take pleasure in eliminating "
                + "\nthese hipsters. You draw your weapon.";
        shoppingMallScene.zombieCount = 5;
        shoppingMallScene.medKitCount = 5;
        shoppingMallScene.waterCount = 1;
        shoppingMallScene.energyBarCount = 2;
        
        sceneObjects [1][5] = shoppingMallScene; 
        
        
        
        
        Scene cathedralScene = new Scene();
        cathedralScene.description =
                  "\nYou hear the Cathedral bells ringing and decide that you should check and see if there is any one in "
                + "\nthere that needs help. Inside you find a lone man in a hood standing in the middle of a hand drawn  "
                + "\nPentagram. He turns to you and lets out a maniacal laugh and start mumbling strange words suddenly a  "
                + "\ndozen zombies appear conjured from the depths of hell or something. The attack you these ones are  "
                + "\nfaster than others. You take cover and draw your weapon.";
        cathedralScene.zombieCount = 11;
        cathedralScene.medKitCount = 5;
        cathedralScene.waterCount = 2;
        cathedralScene.energyBarCount = 1;
        
        sceneObjects [2][5] = cathedralScene; 
        
        
        
        
        Scene refugeeCamp1Scene = new Scene();
        refugeeCamp1Scene.description =
                  "\nYou have made it to the Camp and locate your friends and family. they are all safe.  "
                + "\nYou did it you made it through the nighmare of this world. "
                + "\nGood Job!";
        refugeeCamp1Scene.zombieCount = 0;
        refugeeCamp1Scene.medKitCount = 0;
       refugeeCamp1Scene.waterCount = 0;
        refugeeCamp1Scene.energyBarCount = 0;
        
        sceneObjects [0][6] = refugeeCamp1Scene; 
        
        
        
           Scene refugeeCamp2Scene = new Scene();
        refugeeCamp2Scene.description =
                  "\nYou reach the east side of the Refugee Camp. And find it is in shambles and there are zombies "
                + "\neverywhere eating people that were not able to escape. You see them amassing to the west. You see "
                + "\nlight and hear gun shots. You must help them. You charge the hoard of undead. This is your time! "
                + "\nYou draw your weapon one last time.";
        refugeeCamp2Scene.zombieCount = 10;
        refugeeCamp2Scene.medKitCount = 4;
       refugeeCamp2Scene.waterCount = 1;
        refugeeCamp2Scene.energyBarCount = 2;
        
        sceneObjects [1][6] = refugeeCamp2Scene; 
        
        
        
        Scene zooScene = new Scene();
        zooScene.description =
                  "\nThe Zoo is mostly blocked off, which is disappointing since you really wanted to see the sloths. You deal  "
                + "\nwith a couple zombie Zoo Keepers and even a zombie monkey. You find nothing else and decide to turn "
                + "\nback. As you read the exit you notice something moving slowly in the shadows. Then you see it a half . "
                + "\ndozen zombie sloths are moving to attack you….very slowly… You frown and tear up a little. You  "
                + "\napologize to the cute little guys and draw your weapon.";
        zooScene.zombieCount = 6;
        zooScene.medKitCount = 3;
        zooScene.waterCount = 2;
        zooScene.energyBarCount = 0;
        
        sceneObjects [2][6] = zooScene; 
        
        
        
        
      
        
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
