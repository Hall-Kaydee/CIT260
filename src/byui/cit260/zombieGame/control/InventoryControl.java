/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.exceptions.InventoryException;
import java.util.Scanner;

/**
 *
 * @author Evan
 */
public class InventoryControl {
   
    public void inventorySort( String  x [ ] )
    {
     
            int i, j;
            String temp;

            for ( i = 0;  i < x.length - 1;  i++ )
            {
                for ( j = i + 1;  j < x.length;  j++ )
                {  
                         if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ i ];
                                      x [ i ] = x [ j ];    // swapping
                                      x [ j ] = temp; 
                                      
                           } 
                   } 
             } 
      } 
    
   
    public void calcInventoryItem() {

       Scanner in = new Scanner(System.in); 
       System.out.printf("\nEnter quantity ");
       int quantity = in.nextInt();

       System.out.printf("\nEnter grams Per Item  ");
       int gramsPerItem = in.nextInt();       
    
    }
     
        public double calcItemWeight(double quantity, double gramsPerItem) throws InventoryException {
        
        if (quantity < 0 || quantity > 50) {
            throw new InventoryException ("quantity must be between 0 and 50 Try again");
                
            }
        if (gramsPerItem > 5000 || gramsPerItem < 1) {
            throw new InventoryException ("grams per Item must be between 1 and 5000. Try again");
                
        }
        
double totalKilograms = (quantity * gramsPerItem) / 1000;


  System.out.println("\n that weighs " + totalKilograms + "Kilograms");   
     
    return totalKilograms;
        }
}
        
        
   
    
    
    
    
    

