/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.UseRadioControl;
import byui.cit260.zombieGame.model.MainCharacter;
import java.util.IllegalFormatException;

/**
 *
 * @author kaydeehall
 */
public class TalkToPersonView extends View{
    


    
    public TalkToPersonView() {
        super("\n"
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n             Talking to a person                         +"
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nA - Have you been bitten?                                +"
                + "\nB - Do you need food?                                    +"
                + "\nC - Are you injured?                                     +"
                + "\nD - Where are you going?                                 +"
                + "\nE - What is your name?                                   +"
                + "\nQ - Quit and return to Menu                              +"
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
               
        );
      }  
    
    
    
    
    
    
    @Override
    public boolean doAction(String choice)throws IllegalFormatException {
        try {
    
    choice = choice.toUpperCase();



    String phrase = "";    
        
        switch (choice){
          
            case "A":

            phrase = "\nHave you been bitten?";
            System.out.println(phrase); 

            break;
            
            case "B":

                System.out.println("\nDo you need food?");                

               break;
            case "C":

            phrase = "\nAre you injured?";
            System.out.println(phrase); 

            break;
            
            case "D":

                System.out.println("\nWhere are you going?");                

               break;
               
            case "E":

                System.out.println("\nWhat is your name?");                

               break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        
        } catch 
                (IllegalFormatException me){
                System.out.println(me.getMessage());
                }
        
        return false;
        
    }
    
}
