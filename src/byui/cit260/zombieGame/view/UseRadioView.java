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
 * @author Boyd
 */
public class UseRadioView extends View{

    
    public UseRadioView() {
        super("\n"
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+                    Using the Radio                     +"
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nL - Listen                                               +"
                + "\nT - Talk"
                + "\nQ - Quit and return to Equipment Menu                    +"
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
               
        );
      }  
    
    
    
    
    
    
    @Override
    public boolean doAction(String choice) throws IllegalFormatException {
    
    choice = choice.toUpperCase();
    
    MainCharacter radioListenCount = new MainCharacter();

    try{
        
        int listenCount = radioListenCount.getRadioListenCount();           

        UseRadioControl useRadioControl = new UseRadioControl();



        String radioMessage = "";    
     
 
    
        switch (choice){
          
            case "L"://right

            radioMessage = useRadioControl.useRadio(listenCount);
            System.out.println(radioMessage); 

            break;
            
            case "T"://Left

                System.out.println("\nYou cannot send a message with this radio");                

               break;
 
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
   
        }
        
     } catch(IllegalFormatException me) {
         
         System.out.println(me.getMessage());
         
        }
        
        return false;
        
    }
    
}
