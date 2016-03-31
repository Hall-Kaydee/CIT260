/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
import java.io.Serializable;
//
/**
 *
 * @author Boyd
 */


public class Zombie implements Serializable{
    
    public int hitDamage;
    public int zombieHealth;
    public String zombieDesc;



    public Zombie() {
    }

 public int[] buildZombies(int num1, int num2){
     

        
        
        Zombie[][] zombieObjects = new Zombie [3][7];
        
        //create a zombie profile for each Scene object and define its variables
        
        
        Zombie zombieStart = new Zombie();
        zombieStart.hitDamage = 5;
        zombieStart.zombieHealth = 6;
  
        zombieObjects [0][0] = zombieStart;


        
        
        Zombie zombieSchool = new Zombie();
        zombieSchool.hitDamage = 5;
        zombieSchool.zombieHealth = 6;
  
        zombieObjects [1][0] = zombieSchool;        


        

        Zombie zombieFireStation = new Zombie();
        zombieFireStation.hitDamage = 5;
        zombieFireStation.zombieHealth = 7;
  
        zombieObjects [2][0] = zombieFireStation; 


        
        
        

        Zombie zombieSportingGoodsStore = new Zombie();
        zombieSportingGoodsStore.hitDamage = 7;
        zombieSportingGoodsStore.zombieHealth = 10;
  
        zombieObjects [0][1] = zombieSportingGoodsStore;



        
        
        
        Zombie zombieHospital = new Zombie();
        zombieHospital.hitDamage = 8;
        zombieHospital.zombieHealth = 12;
  
        zombieObjects [1][1] = zombieHospital;
        

        
        
        
        

        Zombie zombieConvenienceStore = new Zombie();
        zombieConvenienceStore.hitDamage = 8;
        zombieConvenienceStore.zombieHealth = 13;
  
        zombieObjects [2][1] = zombieConvenienceStore;




        

        Zombie zombieLot = new Zombie();
        zombieLot.hitDamage = 7;
        zombieLot.zombieHealth = 13;
  
        zombieObjects [0][2] = zombieLot;


        
        
        
        Zombie zombieGroceryStore = new Zombie();
        zombieGroceryStore.hitDamage = 9;
        zombieGroceryStore.zombieHealth = 14;
  
        zombieObjects [1][2] = zombieGroceryStore;        
        

        
        
        
        
        Zombie zombiePoliceStation = new Zombie();
        zombiePoliceStation.hitDamage = 10;
        zombiePoliceStation.zombieHealth = 15;
  
        zombieObjects [2][2] = zombiePoliceStation;        
        




        
        Zombie zombieBusStation = new Zombie();
        zombieBusStation.hitDamage = 8;
        zombieBusStation.zombieHealth = 16;
  
        zombieObjects [0][3] = zombieBusStation;


        
        

        
        Zombie zombiePark = new Zombie();
        zombiePark.hitDamage = 9;
        zombiePark.zombieHealth = 17;
  
        zombieObjects [1][3] = zombiePark;        
        
        

        
        

        Zombie zombieCityHall = new Zombie();
        zombieCityHall.hitDamage = 8;
        zombieCityHall.zombieHealth = 18;
  
        zombieObjects [2][3] = zombieCityHall; 


        
        
        

        Zombie zombieConCenter1 = new Zombie();
        zombieConCenter1.hitDamage = 4;
        zombieConCenter1.zombieHealth = 15;
  
        zombieObjects [0][4] = zombieConCenter1;


        
        


        Zombie zombieHotel = new Zombie();
        zombieHotel.hitDamage = 5;
        zombieHotel.zombieHealth = 18;
  
        zombieObjects [1][4] = zombieHotel;


        
        

        Zombie zombieAptBldg = new Zombie();
        zombieAptBldg.hitDamage = 7;
        zombieAptBldg.zombieHealth = 15;
  
        zombieObjects [2][4] = zombieAptBldg;


        
        


        Zombie zombieConCenter2 = new Zombie();
        zombieConCenter2.hitDamage = 8;
        zombieConCenter2.zombieHealth = 20;
  
        zombieObjects [0][5] = zombieConCenter2;



        


        Zombie zombieShoppingMall = new Zombie();
        zombieShoppingMall.hitDamage = 7;
        zombieShoppingMall.zombieHealth = 21;
  
        zombieObjects [1][5] = zombieShoppingMall;


        
        

        
        Zombie zombieCathedral = new Zombie();
        zombieCathedral.hitDamage = 8;
        zombieCathedral.zombieHealth = 22;
  
        zombieObjects [2][5] = zombieCathedral;        
        
        

        


        Zombie zombieRefugeeCamp1 = new Zombie();
        zombieRefugeeCamp1.hitDamage = 9;
        zombieRefugeeCamp1.zombieHealth = 20;
  
        zombieObjects [0][6] = zombieRefugeeCamp1;        
        



        
        
        
        Zombie zombieRefugeeCamp2 = new Zombie();
        zombieRefugeeCamp2.hitDamage = 3;
        zombieRefugeeCamp2.zombieHealth = 15;
  
        zombieObjects [1][6] = zombieRefugeeCamp2;          
        

        
        
        
        Zombie zombieZoo = new Zombie();
        zombieZoo.hitDamage = 7;
        zombieZoo.zombieHealth = 25;
  
        zombieObjects [2][6] = zombieZoo;

        return new int[] {zombieObjects[num1][num2].hitDamage,
                          zombieObjects[num1][num2].zombieHealth};                

 }
 
 

 public String buildZombieDescriptions(int num1, int num2){
     
  
        Zombie[][] zombieDescriptions = new Zombie [3][7];
        
        //create a zombie description for each Scene object and define its variables
        
        
        Zombie zombieStart = new Zombie();
        zombieStart.zombieDesc =
                  "\nHis name is Fred. He likes brains, strolling on the beach... more brains.";
  
        zombieDescriptions [0][0] = zombieStart;


        
        
        Zombie zombieSchool = new Zombie();
        zombieSchool.zombieDesc =
                  "\nHis name is Barney. He likes dandelions, early morning walks... and... brains.";
  
        zombieDescriptions [1][0] = zombieSchool;        


        

        Zombie zombieFireStation = new Zombie();
        zombieFireStation.zombieDesc =
                  "\nHer name is Marge. She likes flannel pajamas, sunshine... and... brains.";
  
        zombieDescriptions [2][0] = zombieFireStation; 


        
        
        

        Zombie zombieSportingGoodsStore = new Zombie();
        zombieSportingGoodsStore.zombieDesc =
                  "\nHis name is Bubba. He likes dinosaurs, Facebook... and... brains.";
  
        zombieDescriptions [0][1] = zombieSportingGoodsStore;



        
        
        
        Zombie zombieHospital = new Zombie();
        zombieHospital.zombieDesc =
                  "\nHer name is Penny. She likes her boyfriend, shopping... and... brains.";
  
        zombieDescriptions [1][1] = zombieHospital;
        
     

        Zombie zombieConvenienceStore = new Zombie();
        zombieConvenienceStore.zombieDesc =
                  "\nHis name is Mark. He likes basketball, Air Jordans... and... brains.";
  
        zombieDescriptions [2][1] = zombieConvenienceStore;


       

        Zombie zombieLot = new Zombie();
        zombieLot.zombieDesc =
                  "\nHis name is Gary. He likes cats, Spongebob... and... brains.";
  
        zombieDescriptions [0][2] = zombieLot;


        
        
        
        Zombie zombieGroceryStore = new Zombie();
        zombieGroceryStore.zombieDesc =
                  "\nHer name is Jenna. She likes Ho-Hos, chocolate... and... brains.";
  
        zombieDescriptions [1][2] = zombieGroceryStore;        
        

        
        
        
        
        Zombie zombiePoliceStation = new Zombie();
        zombiePoliceStation.zombieDesc =
                  "\nHis name is Andrew. He likes his choir class, body wash... and... brains.";
  
        zombieDescriptions [2][2] = zombiePoliceStation;        
        




        
        Zombie zombieBusStation = new Zombie();
        zombieBusStation.zombieDesc =
                  "\nHis name is Kurt. He likes...well...Kurt. He can't get enough Kurt... and... brains.";
  
        zombieDescriptions [0][3] = zombieBusStation;


        
        

        
        Zombie zombiePark = new Zombie();
        zombiePark.zombieDesc =
                  "\nHer name is Pat. She likes guys with muscles, shopping at the mall... and... brains.";
  
        zombieDescriptions [1][3] = zombiePark;        
        
        

        
        

        Zombie zombieCityHall = new Zombie();
        zombieCityHall.zombieDesc =
                  "\nHis name is Brad. He likes being the Mayor, The Beatles... and... brains.";
  
        zombieDescriptions [2][3] = zombieCityHall; 


        
        
        

        Zombie zombieConCenter1 = new Zombie();
        zombieConCenter1.zombieDesc =
                  "\nHis name is Marge. She likes flannel pajamas, sunshine... and... brains.";
  
        zombieDescriptions [0][4] = zombieConCenter1;


        
        


        Zombie zombieHotel = new Zombie();
        zombieHotel.zombieDesc =
                  "\nHis name is Elena. She likes to read Harlequin novels, the beach... and... brains.";
  
        zombieDescriptions [1][4] = zombieHotel;


        
        

        Zombie zombieAptBldg = new Zombie();
        zombieAptBldg.zombieDesc =
                  "\nHis name is Trey. He likes eating candy.... lots of it, sitting around... and... brains.";
  
        zombieDescriptions [2][4] = zombieAptBldg;


        
        


        Zombie zombieConCenter2 = new Zombie();
        zombieConCenter2.zombieDesc =
                  "\nHer name is Cassandra. She likes playing board games, her toy dog... and... brains.";
  
        zombieDescriptions [0][5] = zombieConCenter2;



        


        Zombie zombieShoppingMall = new Zombie();
        zombieShoppingMall.zombieDesc =
                  "\nHis name is Doug. He likes hangin with the bros, his diamond grill... and... brains.";
  
        zombieDescriptions [1][5] = zombieShoppingMall;


        
        

        
        Zombie zombieCathedral = new Zombie();
        zombieCathedral.zombieDesc =
                  "\nHis name is Father Roman. He likes preening in the mirror, jogging... and... brains.";
  
        zombieDescriptions [2][5] = zombieCathedral;        
        
        

        


        Zombie zombieRefugeeCamp1 = new Zombie();
        zombieRefugeeCamp1.zombieDesc =
                  "\nHer name is Beth. She likes to cook, look at Pinterest... and... brains.";
  
        zombieDescriptions [0][6] = zombieRefugeeCamp1;        
        



        
        
        
        Zombie zombieRefugeeCamp2 = new Zombie();
        zombieRefugeeCamp2.zombieDesc =
                  "\nHis name is Bart. He likes trading baseball cards, country music... and... brains.";
  
        zombieDescriptions [1][6] = zombieRefugeeCamp2;          
        

        
        
        
        Zombie zombieZoo = new Zombie();
        zombieZoo.zombieDesc =
                  "\nHis name is Bert. He likes hunting, getting more tattoos... and... brains.";
  
        zombieDescriptions [2][6] = zombieZoo;


        
        
        
        return zombieDescriptions[num1][num2].zombieDesc;
                

 }



 
 
 
   
   
    
    

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }
    
    
    public int getZombieHealth() {
        return zombieHealth;
    }

    public void setZombieHealth(int zombieHealth) {
        this.zombieHealth = zombieHealth;
    }
    

    public String getZombieDesc() {
        return zombieDesc;
    }

    public void setZombieDesc(String zombieDesc) {
        this.zombieHealth = zombieHealth;
    }

    
    



    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.hitDamage;
        
        return hash;
    }

    @Override
    public String toString() {
        return "Zombie{" + "hitPoints=" + hitDamage + ", itemDrop="  + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zombie other = (Zombie) obj;
        if (this.hitDamage != other.hitDamage) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
