/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.FightControl;
import byui.cit260.zombieGame.exceptions.DoubleFormatException;
import byui.cit260.zombieGame.exceptions.FightControlException;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.Scene;
import byui.cit260.zombieGame.model.Zombie;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import zombiegame.ZombieGame;


/**
 *
 * @author Boyd
 */
public class FightView {

protected String displayMessage = "\nSurvival means fighting, but there is a cost. Best of luck, my friend. Press 'C' to Continue:";
protected final BufferedReader keyboard = ZombieGame.getInFile();
protected final PrintWriter console = ZombieGame.getOutFile();
    

    public void getFightResult(int charDam, double chrHealth, double chrHitPnts) throws FightControlException  {
 


                MainCharacter xCoordinate = new MainCharacter();
                MainCharacter yCoordinate = new MainCharacter();

                int xCoord = xCoordinate.getXCoordinate();
                int yCoord = yCoordinate.getYCoordinate(); 

               // Scene sceneData = new Scene ();
                Zombie zombieData = new Zombie ();

               // int[] sceneDataArray = sceneData.buildScenes(xCoord, yCoord);
                int[] zombieDataArray = zombieData.buildZombies(xCoord, yCoord);

                int enmHealth = zombieDataArray[1];//(int)zombieData.getMasterZombieHealth();
                int enmDamage = zombieDataArray[0];
                zombieData.setMasterZombieHealth((double)enmHealth);
                int numOfEnemies = ZombieGame.zombieCountArray[xCoord][yCoord];
                String zombieDescription = zombieData.buildZombieDescriptions(xCoord, yCoord);

                //Scanner in = new Scanner(System.in);        
                while (zombieData.getMasterZombieHealth() > 0){


                    MainCharacter mainCharacter = new MainCharacter();

                    charDam = mainCharacter.getCharDam();        


                    System.out.println("\nLook at the zombies. This one here. " + zombieDescription);                    
                    
                    
                    FightControl fightControl = new FightControl();

                    double enemyHealthResult = fightControl.calcEnemyHealth
                        (charDam, (int)zombieData.getMasterZombieHealth(), numOfEnemies);







                    if ((int)enemyHealthResult > 0){
                        

                        zombieData.setMasterZombieHealth(enemyHealthResult);
                        chrHealth = mainCharacter.getCharHealth();   


                        chrHitPnts = mainCharacter.getHitPoints();        

                        double charHealthResult = fightControl.calcCharacterHealth
                                        (enmDamage, numOfEnemies, chrHealth, chrHitPnts);

                        System.out.println("\nCharacter health is " + charHealthResult + " Zombie health is " + zombieData.getMasterZombieHealth());

                        MainCharacter charHealthWrite = new MainCharacter();

                        charHealthWrite.setCharHealth(charHealthResult);                        
                        
                        this.display();
                        
                    }
                    else {
                        
                        ZombieGame.zombieCountArray[xCoord][yCoord] = 0;
                        zombieData.setMasterZombieHealth(0);
                        chrHealth = mainCharacter.getCharHealth();   


                        chrHitPnts = mainCharacter.getHitPoints();        

                        double charHealthResult = fightControl.calcCharacterHealth
                                        (enmDamage, numOfEnemies, chrHealth, chrHitPnts);

                        System.out.println("\nCharacter health is " + charHealthResult + " Zombie health is " + zombieData.getMasterZombieHealth());

                        MainCharacter charHealthWrite = new MainCharacter();

                        charHealthWrite.setCharHealth(charHealthResult);
                        
                    }

                    

                          
                  


                                
                
                
                }
        
    }
    
    
public void display()throws IllegalFormatException {

    try {
    
     boolean done = false;    // set flag to not done.
     
        do{
            //prompt for and get value
           String value = this.getInput();
            if (value.toUpperCase().equals("C")) // user wants to quit
                return; //exit the view
            
            done = this.doAction(value);
            }
        while (!done);
    
        }
        catch 
           (IllegalFormatException me){
            ErrorView.display(this.getClass().getName(),me.getMessage());
          }    
        
    }


 public String getInput() throws IllegalFormatException {
     
            //Scanner keyboard = new Scanner(System.in);
            boolean valid = false;   //setflag to invalid valid entered
            String selection = null;
     try{
       while (!valid) {
                //while a valid name has not been retrieved
                //het value
                ErrorView.display(this.getClass().getName(),"\n" + this.displayMessage);
                //get the value entered from keyboard
                
            selection = keyboard.readLine();  //get the name from the keyboard 

            
            selection = selection.trim();     //trim off the excess blanks
                
                // if the name is invalid < one character in length
                
        if (selection.length()< 1)  { //blank value entered
                
                ErrorView.display(this.getClass().getName(),"You must enter a value");
                continue;//and repeat again
                
                }
                
                break;
         }

     }
     catch (Exception e){
         
         ErrorView.display(this.getClass().getName(),"\nError reading inputs" + e.getMessage());
         
     }
     
       
        return selection;  //return the value 
        
        
        
    } 
 
 
     public boolean doAction(String value) throws IllegalFormatException {



        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            
            case "C"://create and start a new game
                
                break;
            
                
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
      
            }
 
       

          return false;     
        
    }

 
 
    
    
      
}
    
    
   
