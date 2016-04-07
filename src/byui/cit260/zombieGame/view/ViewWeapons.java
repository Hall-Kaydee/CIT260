/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.model.MainCharacter;
import java.util.List;
import zombiegame.ZombieGame;

/**
 *
 * @author kaydeehall
 */
public class ViewWeapons extends View{
    
    public ViewWeapons() {
    super( ViewWeapons.makeWeaponsList());
        
  

        
    }       

    
        public ViewWeapons(String message) {
        super (message);
    }

        
        public static String makeWeaponsList(){

            String w; 
            String outputString = "\n";
            for (int i= 0; i < 12; i++) {
            w = ZombieGame.weaponListArray[i];
            if (w != null) {
                outputString = outputString + w.charAt(0) + " - "+ w + "\n";
                }
            }

             outputString =  "\n++++++++++++++++++++++++++++++++++++++++"
                           + "\n++++++       Your Weapons         ++++++"
                           + "\n++++++++++++++++++++++++++++++++++++++++"
                           +  outputString 
                           + "Q - Quit"
                           + "\n++++++++++++++++++++++++++++++++++++++++";
            
            
            return outputString;
        }
            
            
    @Override
    public boolean doAction(String choice){
    
        MainCharacter coordinates = new MainCharacter();
  
       
        choice = choice.toUpperCase(); //convert choice to upper case
        
     
        String selectedString1 = null;
        String weaponName = "";
        boolean found;
        
        switch (choice){
            
            case "F"://View weapon items?

                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    while (found = false){
                    // get the first character from the weapon string

                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "F"){

                        found = true;
                            }
                    }
                }

                if (found = true){
                        weaponName = "FISTS";
                        coordinates.setCharDam(5);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
                
                break;
            
            case "K":

                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "K"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "KNIFE";
                        coordinates.setCharDam(15);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }

                break;
               
            case "M"://Drop weapon

                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "M"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "MACHETE";
                        coordinates.setCharDam(18);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;
                
            case "B"://Drop weapon
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "B"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "BASEBALL BAT";
                        coordinates.setCharDam(19);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;

            case "C"://Drop weapon

                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "C"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "CROSSBOW";
                        coordinates.setCharDam(21);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;


            case "H"://Drop weapon
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "H"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "HANDGUN";
                        coordinates.setCharDam(25);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;                
                
                
            case "D"://View weapon items?
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "D"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "DOUBLE DESERT EAGLES";
                        coordinates.setCharDam(30);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;
            
            case "S"://Use weapon
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "S"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "SEMI-AUTOMATIC SHOTGUN";
                        coordinates.setCharDam(32);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;
               
            case "U"://Drop weapon
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "U"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "UZI MACHINE GUN";
                        coordinates.setCharDam(38);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;

            case "A"://Drop weapon
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "A"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "AK-47";
                        coordinates.setCharDam(42);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;
                
            case "G"://Drop weapon
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "G"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "GRENADE";
                        coordinates.setCharDam(55);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;

            case "R"://Drop weapon
                
                for (int i = 0; i < 12; i++){
                    //get the next weapon string
                    selectedString1 = ZombieGame.weaponListArray[i];
                    // get the first character from the weapon string
                    while (found = false){


                    char selectedChar = selectedString1.charAt(0);

                    if (String.valueOf(selectedChar) == "R"){

                        found = true;
                            }
                        }
                    }

                if (found = true){
                        weaponName = "ROCKET LAUNCHER";
                        coordinates.setCharDam(85);
                        this.console.println("\n" + weaponName + " has been selected. Good luck!");
                    }
                else {
                        this.console.println("\nYou do not have this weapon. Sorry man!");                    

                    }
 
                break;                
                
                
                
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid selection. Try again");
                break;    
        }
        return false;
       
    }     



 /*   private void viewWeapons() {

        this.console.println("\n++++++++++++++++++++++++++++++++++++++++"
                           + "\n++++++       Your Weapons         ++++++"
                           + "\n++++++++++++++++++++++++++++++++++++++++");
        

            int i = 0;
            String outputString = "";
            for (String w : ZombieGame.weaponListArray){
                
            if (w != null) {
                outputString = outputString + "+  " + Integer.toString(i) + ". - "+ w +"\n";

                i++;
                }

        //this.console.println("\n*** viewWeapons()function called");
            }

             this.console.println(outputString);


    }

    private void selectWeapon() {
        this.console.println("\n*** useWeapon()function called");
    }

    private void dropWeapon() {
        //System.out.println("\n*** dropInventoryItem called");
        
 
        this.console.println("\n*** dropWeapon()function called");
      
    }

*/


}
