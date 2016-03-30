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
        
        
        Zombie zombieFred = new Zombie();
        zombieFred.zombieDesc =
                  "\nHis name is Fred. He likes brains, strolling on the beach... more brains.";
        zombieFred.hitDamage = 5;
        zombieFred.zombieHealth = 6;
  
        zombieObjects [0][0] = zombieFred;     
     
 
        return new int[] {zombieObjects[num1][num2].hitDamage,
                          zombieObjects[num1][num2].zombieHealth};                
          
   //return; 

 }
 
 
 
 
 
   
   
    
    

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }
    
    
    public double getZombieHealth() {
        return zombieHealth;
    }

    public void setZombieHealth(int zombieHealth) {
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
