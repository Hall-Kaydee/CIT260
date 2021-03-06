/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kaydee
 */
public class Scene implements Serializable{
    // class instance variables 
    public String description; 
    private double travelDistance;
    private String map;
    public int zombieCount;
    public int medKitCount;    
    public int energyBarCount;    
    public int waterCount;    

   public Scene() {
    }
    
 //   public Scene(String description) {
        
 //       this.description = description;
        
 //   }
   
 public int[] buildScenes(int num1, int num2){
     
        //create an object reference array to store the object refs
      
        Scene[][] sceneObjects = new Scene [3][7];
        
        //create each Scene object and define its variables
        
        Scene startScene = new Scene();

        startScene.medKitCount = 6;
        startScene.waterCount = 3;
        startScene.energyBarCount = 2;  
        sceneObjects [0][0] = startScene;
        
        
        Scene schoolScene = new Scene();

        schoolScene.medKitCount = 2;
        schoolScene.waterCount = 1;
        schoolScene.energyBarCount = 0;
        
        sceneObjects [1][0] = schoolScene; 
        
        
        Scene fireStationScene = new Scene();

        fireStationScene.medKitCount = 2;
        fireStationScene.waterCount = 1;
        fireStationScene.energyBarCount = 0;
        
        sceneObjects [2][0] = fireStationScene; 
        
        
        Scene sportingGoodsStoreScene = new Scene();

        sportingGoodsStoreScene.medKitCount = 2;
        sportingGoodsStoreScene.waterCount = 2;
        sportingGoodsStoreScene.energyBarCount = 1;
        
        sceneObjects [0][1] = sportingGoodsStoreScene; 
        
        
        
        Scene hospitalScene = new Scene();

        hospitalScene.medKitCount = 5;
        hospitalScene.waterCount = 3;
        hospitalScene.energyBarCount = 2;
        
        sceneObjects [1][1] = hospitalScene; 
        
        
        
        Scene convenienceStoreScene = new Scene();

        convenienceStoreScene.medKitCount = 5;
        convenienceStoreScene.waterCount = 6;
        convenienceStoreScene.energyBarCount = 2;
        
        sceneObjects [2][1] = convenienceStoreScene; 
        
        
        Scene residentialLotScene = new Scene();

        residentialLotScene.medKitCount = 5;
        residentialLotScene.waterCount = 6;
        residentialLotScene.energyBarCount = 2;
        
        sceneObjects [0][2] = residentialLotScene; 
        
        
        Scene groceryStoreScene = new Scene();

        groceryStoreScene.medKitCount = 5;
        groceryStoreScene.waterCount = 6;
        groceryStoreScene.energyBarCount = 2;
        
        sceneObjects [1][2] = groceryStoreScene; 
        
        
        
        Scene policeStationScene = new Scene();

        policeStationScene.medKitCount = 5;
        policeStationScene.waterCount = 6;
        policeStationScene.energyBarCount = 2;
        
        sceneObjects [2][2] = policeStationScene; 
        
        
        
        Scene busStationScene = new Scene();
;
        busStationScene.zombieCount = 5;
        busStationScene.medKitCount = 5;
        busStationScene.waterCount = 6;
        busStationScene.energyBarCount = 2;
        
        sceneObjects [0][3] = busStationScene; 
        
        
        
        Scene parkScene = new Scene();

        parkScene.medKitCount = 5;
        parkScene.waterCount = 6;
        parkScene.energyBarCount = 2;
        
        sceneObjects [1][3] = parkScene; 
        
        
        
        Scene cityHallScene = new Scene();

        cityHallScene.medKitCount = 5;
        cityHallScene.waterCount = 6;
        cityHallScene.energyBarCount = 2;
        
        sceneObjects [2][3] = cityHallScene; 
        
        
        Scene conventionCenter1Scene = new Scene();

        conventionCenter1Scene.medKitCount = 5;
        conventionCenter1Scene.waterCount = 6;
        conventionCenter1Scene.energyBarCount = 2;
        
        sceneObjects [0][4] = conventionCenter1Scene; 
        
        
        
        Scene hotelScene = new Scene();

        hotelScene.medKitCount = 5;
        hotelScene.waterCount = 6;
        hotelScene.energyBarCount = 2;
        
        sceneObjects [1][4] = hotelScene; 
        
        
        
        Scene apartmentBuildingScene = new Scene();

        apartmentBuildingScene.medKitCount = 5;
        apartmentBuildingScene.waterCount = 6;
        apartmentBuildingScene.energyBarCount = 2;
        
        sceneObjects [2][4] = apartmentBuildingScene; 
        
        
        
        Scene conventionCenter2Scene = new Scene();

        conventionCenter2Scene.medKitCount = 5;
        conventionCenter2Scene.waterCount = 6;
        conventionCenter2Scene.energyBarCount = 2;
        
        sceneObjects [1][5] = conventionCenter2Scene; 
        
        
        
        
        Scene shoppingMallScene = new Scene();

        shoppingMallScene.medKitCount = 5;
        shoppingMallScene.waterCount = 1;
        shoppingMallScene.energyBarCount = 2;
        
        sceneObjects [1][5] = shoppingMallScene; 
        
        
        
        
        Scene cathedralScene = new Scene();

        cathedralScene.medKitCount = 5;
        cathedralScene.waterCount = 2;
        cathedralScene.energyBarCount = 1;
        
        sceneObjects [2][5] = cathedralScene; 
        
        
        
        
        Scene refugeeCamp1Scene = new Scene();

        refugeeCamp1Scene.medKitCount = 0;
        refugeeCamp1Scene.waterCount = 0;
        refugeeCamp1Scene.energyBarCount = 0;
        
        sceneObjects [0][6] = refugeeCamp1Scene; 
        
        
        
           Scene refugeeCamp2Scene = new Scene();

        refugeeCamp2Scene.medKitCount = 4;
        refugeeCamp2Scene.waterCount = 1;
        refugeeCamp2Scene.energyBarCount = 2;
        
        sceneObjects [1][6] = refugeeCamp2Scene; 
        
        
        
        Scene zooScene = new Scene();

        zooScene.medKitCount = 3;
        zooScene.waterCount = 2;
        zooScene.energyBarCount = 0;
        
        sceneObjects [2][6] = zooScene; 
        
        
       
        
        return new int[] {sceneObjects[num1][num2].medKitCount,
                          sceneObjects[num1][num2].waterCount,
                          sceneObjects[num1][num2].energyBarCount};
    

        
 } 
 
 
 
 
 
 
 
 
 
 public String buildSceneDescritpions(int num1, int num2){
     
        //create an object reference array to store the object refs
      
        String [][] sceneDescriptionsArray = new String [3][7];
        
        
    
        sceneDescriptionsArray[0][0] = 
                
                 "\nYou wake up in the wrecked APC. You are alone the doors are open "
                + "\nLooks like everyone left in a hurry. Where did they go? what happened? "
                + "\nYou exit the APC and look around. the street is empty and there is no sign of life. "
                + "\nYou hear in the distance the sounds of the occasional gun shot and distant shouts. "
                + "\nWhat will you do now?";
        
        sceneDescriptionsArray[1][0] = 
                
                  "\nYou enter the school yard and survey the area. You see some people huddled over a body near the tire swing "
                + "\nYou can’t really tell what they are doing. You shout to them and they turn to you. They are covered in "
                + "\nwhat looks like blood. They start to approach you making groaning and moaning noises. You think one of  "
                + "\nthem grunts the word “…Brains?...”. You nervously back away and draw your weapon. ";
        
        
        sceneDescriptionsArray[2][0] = 
                
                  "\nAs you pass the fire station you notice the garage doors are open and the trucks are gone. The place"
                + "\nlooks deserted, suddenly you hear a shout and a zombie fireman comes sliding down the fireman’s pole. "
                + "\nHe is wielding an axe and accompanied by to feral looking Dalmatians. He signals them to attack and  "
                + "\nthey charge you. You draw your weapon. ";
        
        sceneDescriptionsArray[0][1] = 
                
                  "\nYou Enter the Sporting goods store in search of supplies. It already looks like it’s been hit by looters. The  "
                + "\nplace is a mess and there is goods all over the floor. You approach the weapon racks. There looks like  "
                + "\nthere are a few Pink firearms still there. As you go to jump over the counter it collapses. You hear noises  "
                + "\nelsewhere in the store… they are getting louder. They are coming for you. You draw your weapon right  "
                + "\nthey charge you. You draw your weapon. ";
        
        
        sceneDescriptionsArray[1][1] = 
                
                  "\nThe entrance of the Hospital is barracked and there is an Ambulance smashed in the wall. You climb on  "
                + "\ntop of the ambulance and use it to enter a second story window. You are now in a dark hallway. You trip  "
                + "\nover something and fall causing a gurney to go zooming down the hallway and causing a huge  "
                + "\ncommotion. The echoes can be heard for seconds after the gurney finally comes to a stop in an open  "
                + "\nelevator. As you pick yourself up you see the thing you tripped over move and start to get up. It is vile   "
                + "\nand dripping in who knows what. The zombie charges you. You flee but zombies are flanking you from  "
                + "\nthe behind. You draw your weapon and prepare to fight. ";
        
        
        sceneDescriptionsArray[2][1] = 
                
                  "\nIn the Convenience store you see several dead bodies. No sigh of zombies though. You walk around and  "
                + "\ncheck every aisle and door. Looks to be safe. You can search the area for anything of use. ";
        
        
        sceneDescriptionsArray[0][2] = 
                
                  "\nYou walk down the alley behind some houses. A cat approaches you and starts to speak to you. It tells "
                + "\nyou of a magical place known as the refugee camp where you would be safe from the zombies. Before "
                + "\nyou can fully process this conversation you are having with this feline you hear and see zombies running  "
                + "\ndown both ends of the ally. The cat bails and leaves you to your fate. You climb atop a dumpster for high "
                + "\nground and draw your weapon.";
        
        
        sceneDescriptionsArray[1][2] = 
                
                
                  "\n The Grocery store is dark no lights at all. The power must be cut. You carefully traverse the aisles in "
                + "\n search of a bathroom as nature is calling. You reach a women’s bathroom without incident. You enter "
                + "\n and quickly head to a stall to do your business. After a few minutes a zombie had reaches under from "
                + "\n the stall next to you and grunts to ask if you have any toilet paper you can share. You freeze and quickly "
                +"\n pull up your pants. You silence and refusal to share enrages the zombie and it begins to shriek. It tries to "
                +"\n get into your stall, It really needs to wipe. You bash its head with the stall door and break for the exit. "
                +"\n You find you are surrounded by zombies that were waiting their turn to go to the bathroom. The turn "
                + "\n their attention to you and lick their zombie lips or lack thereof. You draw your weapon and prepare to fight ";
        
        
        sceneDescriptionsArray[2][2] = 
                
                
                  "\nThe police station is on fire when you arrive and there are a few panicked people running from the "
                + "\nflames. They are chased by zombies wielding flame throwers. They are preparing for a BBQ. One of the "
                + "\npolice officers who escaped the flames runs to you and you both take cover behind a squad car. He says  "
                + "\nhe will join you in taking down these guys. You agree. He runs across the street firing his handgun to get  "
                + "\ntheir attention. You draw your weapon.";
        
        
        sceneDescriptionsArray[0][3] = 
                
                  "\nAt the bus stations all you see are rows of empty buses and the belongings of people who were unable"
                + "\nto escape the city. You start to look through some of the suitcases and bags for anything that can help "
                + "\nyou. Suddenly the bus in front of you honks. You look up to see a Zombie Bus driver sneering at you. His "
                + "\nhonking has attracted the entire teamsters union. You are really in trouble this time. You Draw your weapon "
                + "\nWhat will you do now?";
        
        
        sceneDescriptionsArray[1][3] = 
                
                  "\nThe Park is probably the most untouched of all the city. You take in the pretty blue sky, green grass, the "
                + "\ntall trees and the napping zombie hobo on the park bench. Wait…. What.. The sleeping zombie Hobo "
                + "\nawakes and asks you if you can spare any brains. You try to apologize saying you left your brains in your "
                + "\nother pants. This out rages the Zombie and he waddles towards you spewing zombie profanity and "
                + "\ngreen liquid from his mouth.  A couple other zombies’ climb out of the bushes and approach you as well. "
                + "You draw your weapon.";
        
        
        sceneDescriptionsArray[2][3] = 
                
                
                  "\nYou aren’t really sure what you will find here in City Hall. Maybe anyone from the government will still  "
                + "\nbe here. All you find is lots of boring offices and lots of zombies waiting in line for various legal services. "
                + "\nThey are two brain dead to notice you. You come across a large office and inside is a plump zombie  "
                + "\nwearing a suit, Top hat and monocle. He is out raged by your intrusion and charges you flipping tables "
                + "\nand desks to reach you. You fire a shot and run out the door dropping the Mayor Zombie. The "
                + "\ncommotion has drawn the attention of the zombies waiting in line. You now have a lot of zombies "
                + "\nbetween you and the door. You draw your weapon.";
        
        
        
        sceneDescriptionsArray[0][4] = 
                
                
                  "\nYou enter the convention center and are immediately find yourself surrounded by hundreds of zombie "
                + "\nnerds and zombie cosplayers. It looks like you stumbled upon ZombieCon. The zombies wander around  "
                + "\ngreeting each other and debating trivial facts about fictional things. One zombie approaches you and  "
                + "\ncomplements you on your excellent human solider Cosplay. You thank him and then proceed to shoot  "
                + "\nhim in the head. The rest of the zombies become outrages and threaten to eat your brains and tell your  "
                + "\nmom on you. You draw your weapon.";
        
        
        
        sceneDescriptionsArray[1][4] = 
                
                  "\nThe Hotel Lobby is quite….too quite… after checking the area you come across a disgruntled Bell boy  "
                + "\nzombie. He starts venting to you about how crappy the job is and that the tips suck. No one will give him  "
                + "\ntheir brains…willingly. He offers to show you to your room in exchange for your brains. You decline and  "
                + "\nhe goes full rage on you two more Zombie Hotel employees back him up. You draw your weapon.";
        
        
        sceneDescriptionsArray[2][4] = 
                
                  "\nYou search the different apartments of the condo and find very little everyone and everything is gone. "
                + "\nYou notice one room that is barracked and has the words “Stay Out” written on it. You figure, what the "
                + "\nworst that could happen. You move all of the stuff blocking the door. You open the door and are  "
                + "\nshocked by what you see. A rabid zombie ninja. He attacks you with ninja stars striking the door instead "
                + "\nas you duck. Time to go to work. You once again draw your weapon.";
        
        
        sceneDescriptionsArray[0][5] = 
                
                  "\nThe far side of the Convention Center is completely abandoned. Looks like it was a Gun Show. Amazingly  "
                + "\nit looks untouched. There is no signing of any humans or zombies. You help yourself to the weapons and ammo";
        
        sceneDescriptionsArray[1][5] = 
                
                
                  "\nThe Shopping mall is huge. So many stores, they are all abandoned and wrecked like everything else in  "
                + "\nthis city. As you approach a Hot Topic you become surrounded by a half dozen Hipster Zombies wearing  "
                + "\ndark rimmed glasses and thirst store clothing. They insist you give them your brains since they were  "
                + "\neating brains before it was cool. You shake your head in annoyance and take pleasure in eliminating "
                + "\nthese hipsters. You draw your weapon.";
        
        
        sceneDescriptionsArray[2][5] = 
                
                
                  "\nYou hear the Cathedral bells ringing and decide that you should check and see if there is any one in "
                + "\nthere that needs help. Inside you find a lone man in a hood standing in the middle of a hand drawn  "
                + "\nPentagram. He turns to you and lets out a maniacal laugh and start mumbling strange words suddenly a  "
                + "\ndozen zombies appear conjured from the depths of hell or something. The attack you these ones are  "
                + "\nfaster than others. You take cover and draw your weapon.";
        
        
        sceneDescriptionsArray[0][6] = 
                
                  "\nYou have made it to the Camp and locate your friends and family. they are all safe.  "
                + "\nYou did it you made it through the nighmare of this world. "
                + "\nGood Job!";
        
        sceneDescriptionsArray[1][6] = 
                
                  "\nYou reach the east side of the Refugee Camp. And find it is in shambles and there are zombies "
                + "\neverywhere eating people that were not able to escape. You see them amassing to the west. You see "
                + "\nlight and hear gun shots. You must help them. You charge the hoard of undead. This is your time! "
                + "\nYou draw your weapon one last time.";
        
        
        sceneDescriptionsArray[2][6] = 
                
                  "\nThe Zoo is mostly blocked off, which is disappointing since you really wanted to see the sloths. You deal  "
                + "\nwith a couple zombie Zoo Keepers and even a zombie monkey. You find nothing else and decide to turn "
                + "\nback. As you read the exit you notice something moving slowly in the shadows. Then you see it a half . "
                + "\ndozen zombie sloths are moving to attack you….very slowly… You frown and tear up a little. You  "
                + "\napologize to the cute little guys and draw your weapon.";
        

        return sceneDescriptionsArray[num1][num2];

    

        
 }


   
   

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String getMap() {
        return map;
    }    
    
        public void setMap(String map) {
        this.map = map;
    }
    
    

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }
//
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.travelDistance) ^ (Double.doubleToLongBits(this.travelDistance) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "EventScene{" + "description=" + description + ", travelDistance=" + travelDistance + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelDistance) != Double.doubleToLongBits(other.travelDistance)) {
            return false;
        }
        return true;
    }
    
     public void searchArea(){
        
    }
    
    public void leaveArea() {
        
    }
    
    public void attack() {
    
}
    public void sneak() {
        
}
    public void waitScene() {
        
    }
    

    public void setZombieCount(int zombieCount) {
        this.zombieCount = zombieCount;
    }
    
    public int getZombieCount () {
        return zombieCount;
    }

    public void setMedkitCount(int medKitCount) {
        this.medKitCount = medKitCount;
    }

    public int getMedKitCount () {
        return medKitCount;
    }    
   
    public void setEnergyBarCount(int energyBarCount) {
       
        this.energyBarCount = energyBarCount;
    }
    
    public int getEnergyBarCount () {
        return energyBarCount;
    }

    public void setWaterCount(int waterCount) {
        this.waterCount = waterCount;
        
    }
    
    public int getWaterBarCount () {
        return waterCount;
    }


   
    
    
}
