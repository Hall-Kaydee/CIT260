/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import java.util.Scanner;



/**
 *
 * @author Evanator
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View(){
    }
    
    public View(String message) {
        this.displayMessage = message;
}

@Override
public void display() {
                
     boolean done = false;    // set flag to not done.
     
        do{
            //prompt for and get value
           String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the view
            
            done = this.doAction(value);
            }
        while (!done);
    }

@Override
 public String getInput() {
     
            Scanner keyboard = new Scanner(System.in);
            boolean valid = false;   //setflag to invalid valid entered
            String selection = null;
            
       while (!valid) {
                //while a valid name has not been retrieved
                //het value
                System.out.println("\n" + this.displayMessage);
                //get the value entered from keyboard
            selection = keyboard.nextLine();  //get the name from the keyboard             
            selection = selection.trim();     //trim off the excess blanks
                
                // if the name is invalid < one character in length
                
        if (selection.length()< 1)  { //blank value entered
                
                System.out.println("You must enter a value");
                continue;//and repeat again
                
                }
                
                break;
                
                }

                return selection;  //return the value       
        
    }
}