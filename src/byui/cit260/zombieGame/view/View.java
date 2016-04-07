/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.exceptions.FightControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.IllegalFormatException;
import java.util.Scanner;
import zombiegame.ZombieGame;



/**
 *
 * @author Evanator
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected final BufferedReader keyboard = ZombieGame.getInFile();
    protected final PrintWriter console = ZombieGame.getOutFile();
    
    public View(){
    }
    
    public View(String message)  {
        this.displayMessage = message;
}

@Override
public void display()throws IllegalFormatException {

    try {
    
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
        catch 
           (IllegalFormatException me){
            ErrorView.display(this.getClass().getName(),me.getMessage());
          }    
        
    }

@Override
 public String getInput() throws IllegalFormatException {
     
            boolean valid = false;   //setflag to invalid valid entered
            String selection = null;

     try{
       while (!valid) {
            System.out.println(this.displayMessage);
            selection = keyboard.readLine();  //get the name from the keyboard 
            selection = selection.trim();     //trim off the excess blanks
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
}