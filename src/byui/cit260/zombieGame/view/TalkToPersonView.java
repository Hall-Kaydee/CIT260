/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.UseRadioControl;
import byui.cit260.zombieGame.model.MainCharacter;

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
                + "\nL - Listen                                               +"
                + "\nT - Talk                                                 +"
                + "\nQ - Quit and return to Menu                              +"
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
               
        );
      }  
    
    
    
    
    
    
    @Override
    public boolean doAction(String choice){
    
    choice = choice.toUpperCase();



    String phrase = "";    
        
        switch (choice){
          
            case "L":

            phrase = "Things I would hear if I were listening...";
            System.out.println(phrase); 

            break;
            
            case "T":

                System.out.println("\nHello, Its me");                

               break;
 
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }
    
}
