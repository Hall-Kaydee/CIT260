/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

/**
 *
 * @author Evanator
 */
public class SearchAreaView extends View {
    
    public SearchAreaView() {
        super("\n"
                + "You search the the area for anything helpful"
               );
    }
        
      private boolean promptMessage;

    public SearchAreaView(String message) {
        super (message);
    }  
        
   @Override
    public boolean doAction(String value) {
        {
    }  
     return false;
           
    }  

    void searchArea() {
        this.console.println("this is search area"); //To change body of generated methods, choose Tools | Templates.
    }
    

}
    
    
    
    

