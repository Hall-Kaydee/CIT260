/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

/**
 *
 * @author Boyd
 */
public class UseEquipmentView extends View{

 
        public UseEquipmentView() {
        super("\n"
                + "\n++++++++++++++++++++++++++++++++++++++"
                + "\n+  Use Equipment                     +"
                + "\n++++++++++++++++++++++++++++++++++++++"
                + "\nM - Medkit"
                + "\nR - Radio"
                + "\nW - Water"
                + "\nE - Energy Bar"
                + "\nQ - Quit"
                + "\n++++++++++++++++++++++++++++++++++++++"
               
        );
      }
    
    
    
    @Override
    public boolean doAction(String choice){
    
        // this is the drop item do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "M"://View inventory items?
                this.useMedkit();
                break;
            
            case "R"://Use inventory item
                this.useRadio();
               break;
               
            case "W"://Drop item
                this.useWater();
                break;

            case "E"://Drop item
                this.useEnergybar();
                break;
                
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }       

    private void useMedkit() {
        this.console.println("\n*** useMedkit() called");
    }

    private void useEnergybar() {
        this.console.println("\n*** useEnergybar() called");
    }

    private void useWater() {
        this.console.println("\n*** useWater() called");
    }

    private void useRadio() {
        //System.out.println("\n*** useRadio function called");
        UseRadioView useRadioMenu = new UseRadioView();
        useRadioMenu.display();
    }    
    
    
}
