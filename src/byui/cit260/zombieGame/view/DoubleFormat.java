/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.exceptions.DoubleFormatException;
import java.util.Scanner;

/**
 *
 * @author Evanator
 */
public class DoubleFormat {
    
    protected String displayMessage;
    
    public Double getDoubleNumber()
                throws DoubleFormatException{
        Double number = null;
        
        while ( number == null) {
            String value = this.getInput();
            //value = value.trim().toUpperCase();
            
            if (value.equals("Q"))
                break;
            
          try{  
            
            number = Double.parseDouble(value);
            
          } catch (Exception e){ 
              
             throw new DoubleFormatException(e.getMessage());

          } 
          finally{System.out.println("sup"); }
        }
      return number;
    }

 
    
    
    
    
    
     public String getInput() {
     
            Scanner keyboard = new Scanner(System.in);
            boolean valid = false;   //setflag to invalid valid entered
            String selection = null;
//     try{       
       while (!valid) {
                //while a valid name has not been retrieved
                //het value
                System.out.println("\n" + this.displayMessage);
                //get the value entered from keyboard
            selection = keyboard.nextLine();  //get the name from the keyboard             
            selection = selection.trim();     //trim off the excess blanks
                
                // if the name is invalid < one character in length
                
        if (selection.length()< 1)  { //blank value entered
                
                System.out.println("You must enter a value");
                continue;//and repeat again
                
                }
                
                break;
                
                }
 //    }
     
 //    catch (Exception e){
         
 //        System.out.println("\nError reading inputs" + e.getMessage());
         
 //    }
       
       

                return selection;  //return the value       
        
    }
    
    
    
    
    
}
