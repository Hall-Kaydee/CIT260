/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.control;

import byui.cit260.zombieGame.model.MainCharacter;

/**
 *
 * @author Boyd
 */
public class UseRadioControl {


// move player to the right
    
        MainCharacter radioListenCount = new MainCharacter();

        int listenCount = radioListenCount.getRadioListenCount();

   
public String useRadio(int listenCount)  {
 
    String radioMessage = "";
    int number1 = listenCount;
    if (number1 >= 3){
        
        radioMessage = "\n The static is gone... the radio is dead. ";
        
    }
    
    else {
        
        
        switch (number1){
            
            case 0://right
                
                radioMessage = this.setMessageOne();
                
                break;
                
            case 1://Left
                
                radioMessage = this.setMessageTwo();
                
                break;
                
            case 2://Forward
                
                radioMessage = this.setMessageThree();
                
                break;
                
                
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
                
        }
        
        number1 = number1 + 1;// 
        radioListenCount.setRadioListenCount(number1);
    }
    return radioMessage;
    
  }


    
    
    
    private String setMessageOne(){
        
     return "\n "
            + "\nYou hear lots of static.....'All units..."
            + "\n....proceed to'....... then lots of muddled garbage "
            + "\n....ugee camp at....mple Square.....beware of strange "
            + "\n....vir......ning all bitten...ersons....extremely violent"
            + "\nAll remai....vivors....to templ...uare......good luck'"
            + "\n";

    }

    private String setMessageTwo(){
        
     return "\n "
            + "\nYou hear more of the static.....'use caution.... all units..."
            + "\n....subjects....ensitive...nd hig..ly ..ttracted to sound. "
            + "\n....void making noise if ...ssible. Use stealth....all times."
            + "\n....must av..d bites from subjects... all costs. Once bitten..."
            + "\n....turns within...inutes.'"
            + "\n";

    }
    
    private String setMessageThree(){
        
     return "\n "
            + "\nmore static.....'subjects do not die...repeat sub...not die..."
            + "\n....unless brain ..estroyed...must shut ..own motor ..unction to"
            + "\n th...brain....... then lots of muddled garbage "
            + "\n....ugee camp at....mple Square.....beware of.....subjects everywhere. "
            + "\n....vir......ning all bitten...ersons....extremely violent"
            + "\n ...area being overrun by zombies.....must...ve...oon....cannot stay."
            + "\nAll remai....vivors....to templ...uare....fore tomorr....we...re"
            + "\nleaving this area... at Noon."
            + "\n";

    }    
    
}




