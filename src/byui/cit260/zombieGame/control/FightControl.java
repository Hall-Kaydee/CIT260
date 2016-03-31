/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.exceptions.FightControlException;
import java.util.IllegalFormatException;

/**
 *
 * @author tyler
 */
public class FightControl {
    
    public int calcEnemyHealth(double charDamage, double enemyHealth, int numberOfEnemies)
    
                                throws IllegalFormatException {
 
        /* if (enemyHealth <= 0 || numberOfEnemies <= 0 || charDamage <=0){
            

            throw new FightControlException("\nNumber of enemies cannot be below zero or above 10.");     

            //return -1;
            }
      */
        
        
        double healthPerEnemy = ((enemyHealth * numberOfEnemies) - charDamage) / numberOfEnemies;
        
        
        if (healthPerEnemy <= 0) {

            System.out.println("Enemies are D.E.A.D."); 
            
		return (int) healthPerEnemy;
             }

	else {
            
                return (int) healthPerEnemy;
            
                }
             }
 
    
    
    public int calcCharacterHealth(double enemyDamage, double numberOfEnemies, double characterHealth, double charHitPoints )
    
                            throws FightControlException {
    
        if (numberOfEnemies <= 0 || characterHealth <= 0){
            
            throw new FightControlException("\nNumber of Enemies or or Player Health cannot be zero or below.");  
            }
        if (charHitPoints <= 0 || enemyDamage <= 0){
            
            throw new FightControlException("\nPlayer Hitpoints or Enemy Damage cannot be zero or below."); 
            }       
        
        double charHpFactor;
        double charHealth;
        charHpFactor = characterHealth * charHitPoints / 100;
        charHealth = characterHealth + charHpFactor - enemyDamage;

 
        
        if (charHealth <= 0) {

                System.out.println("Character is D.E.A.D."); 
		return (int) charHealth;
                }

	else {
            
            return (int) charHealth;
            
                }
        }
}
