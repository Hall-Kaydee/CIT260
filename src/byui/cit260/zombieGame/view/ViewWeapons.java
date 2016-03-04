/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;
/**
 *
 * @author kaydeehall
 */
public class ViewWeapons extends View{
    public final String WEAPONMENU = "\n"
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+                      Weapon Menu                             +"               
            + "\n+      You collect weapons in different areas of the map       +"
            + "\n+     Here you can Look at what weapons you currently have     +" 
            + "\n+     You can choose which weapon to help you on your journey  +"
            + "\n+   You can also drop these weapons if you are carring to much +"                                        
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+ V - View Your Weapons                                        +"
            + "\n+ U - Use Weapon                                               +"
            + "\n+ D - Drop Weapon                                              +"
            + "\n+ Q - Quit                                                     +"   
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            ;
    private boolean promptMessage;
    
        public ViewWeapons() {
        super();
    }
    

    @Override
    public boolean doAction(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "V"://View weapon items?
                this.viewWeapons();
                break;
            
            case "U"://Use weapon
                this.useWeapon();
                break;
               
            case "D"://Drop weapon
                this.dropWeapon();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;    
        }
        return false;
       
    }     



    private void viewWeapons() {
        System.out.println("\n*** viewWeapons()function called");
    }

    private void useWeapon() {
        System.out.println("\n*** useWeapon()function called");
    }

    private void dropWeapon() {
        //System.out.println("\n*** dropInventoryItem called");
        
 
        System.out.println("\n*** dropWeapon()function called");
      
    }
}
