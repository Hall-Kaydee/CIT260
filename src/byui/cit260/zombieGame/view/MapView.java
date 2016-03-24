/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import java.util.IllegalFormatException;

/**
 *
 * @author Boyd
 */

public class MapView extends View{
    
    
    public MapView() {
        super ( "\n"
                + "\n+---------+---------+---------+---------+---------+---------+---------+"
                + "\n    |     |   TEMPLE SQUARE REFUGEE CAMP    |     |     ZOO     |     |"
                + "\n    |     |---------------------------------|     |-------------|     |"
                + "\n    |  +         +         +         +         +         +         +  |"
                + "\n    |     |-------------|     |-------------|     |-------------|     |"
                + "\n    |     |             | XXX |             |     |             |     |"
                + "\n    |     |             |     |   SHOPPING  |     | CATHEDRAL   |     |"
                + "\n    |  +  |      +      |  +  |     MALL    |  +  |             |  +  |"
                + "\n    |     |  CONVENTION |     |             |     |             |     |"
                + "\n    |     |    CENTER   |     |             |     |             |     |"
                + "\n    |     |             |     |-------------|     |-------------|     |"
                + "\n    |  +  |      +      |  +         +         +         +         +  |"
                + "\n    |     |             |     |-------------|     |-------------|     |"
                + "\n    | XXX |             |     |             |     |             |     |"
                + "\n    |     |             |     |    HOTEL    |     |  APARTMENT  |     |"
                + "\n    |  +  |      +      |  +  |             |  +  |    BLDG     |  +  |"
                + "\n    |     |             |     |             |     |             |     |"
                + "\n    |     |             |     |             |     |             |     |"
                + "\n    |     |-------------| XXX |-------------|     |-------------| XXX |"
                + "\n    |  +         +         +         +         +         +         +  |"
                + "\n    |     |-------------|                         |-------------|     |"
                + "\n    |     |             |                         |             |     |"
                + "\n    |     |     BUS     |          PARK           |    CITY     |     |"
                + "\n    |  +  |   STATION   |  +         +         +  |    HALL     |  +  |"
                + "\n    |     |             |                         |             |     |"
                + "\n    |     |             |                         |             |     |"
                + "\n    | XXX |-------------|                         |-------------|     |"
                + "\n    |  +         +         +         +         +         +         +  |"
                + "\n    |     |-------------|     |-------------|     |-------------|     |"
                + "\n    |     |      |      |     |             |     |             |     |"
                + "\n    |     |      |      |     |   GROCERY   |     |   POLICE    |     |"
                + "\n    |  +  |------|------|  +  |    STORE    |  +  |   STATION   |  +  |"
                + "\n    |     |      |      |     |             |     |             |     |"
                + "\n    |     |      |      |     |             |     |             | XXX |"
                + "\n    |     |-------------|     |-------------|     |-------------|     |"
                + "\n    |  +         +         +         +         +         +         +  |"
                + "\n    |     |-------------|     |-------------|     |-------------|     |"
                + "\n    |     |             |     |             |     |             |     |"
                + "\n    |     |   SPORTING  |     |             |     | CONVENIENCE |     |"
                + "\n    |  +  |    GOODS    |  +  |   HOSPITAL  |  +  |    STORE    |  +  |"
                + "\n    |     |    STORE    |     |             |     |             |     |"
                + "\n    |     |             |     |             |     |             |     |"
                + "\n    |     |-------------|     |-------------|     |-------------|     |"
                + "\n    |  +         +         +         +         +         +         +  |"
                + "\n    |     |-------------|     |-------------|     |-------------|     |"
                + "\n    |     |             |     |             |     |      |      |     |"
                + "\n    |     |    FIRE     |     |             |     |      |      |     |"
                + "\n    |  +  |  STATION    |  +  |    SCHOOL   |  +  |------|------|  +  |"
                + "\n    |     |             |     |             |     |      |      |     |"
                + "\n    |     |             |     |             |     |      |      |     |"
                + "\n|---|     |-------------|     |-------------|     |-------------|     |"
                + "\n+    START       +         +         +         +         +         +  |"
                + "\n|---------------------------------------------------------------------|"
                +"\n "
                + "\nPress Q to Quit:"
                    );
                }
    private boolean promptMessage;

    





    @Override
    public boolean doAction(String choice)throws IllegalFormatException {
    
        // this is the help menu do action function
        try {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "Q"://what is the goal?
                System.out.println("\nReturning to the Game Menu");
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
