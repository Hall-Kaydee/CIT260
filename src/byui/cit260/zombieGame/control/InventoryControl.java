/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import java.util.Scanner;

/**
 *
 * @author Evan
 */
public class InventoryControl {
    
    
   
   
    public void calcInventoryItem() {

    /**
     *
     * @return
     */
    
       Scanner in = new Scanner(System.in); 
       System.out.printf("\nEnter quantity ");
       double quantity = in.nextDouble();

       System.out.printf("\nEnter grams Per Item  ");
       double gramsPerItem = in.nextDouble();       
    
    }
     
        public double calcItemWeight(double quantity, double gramsPerItem) {
        
        if (quantity < 0 || quantity > 50) {
            return -1;
            }
        if (gramsPerItem > 5000 || gramsPerItem < 1) {
            return -1;
        }
        
double totalKilograms = (quantity * gramsPerItem) / 1000;


  System.out.println("\n that weighs " + totalKilograms "Kilograms");   
     
    

        
        
   
    
    
    
    
    

