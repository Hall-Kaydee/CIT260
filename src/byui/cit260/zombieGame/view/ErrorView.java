/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import java.io.PrintWriter;
import zombiegame.ZombieGame;

/**
 *
 * @author Boyd
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = ZombieGame.getOutFile();
    private static final PrintWriter logFile = ZombieGame.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println("\n---------------------------"
                        + "\n--    Error" + errorMessage
                        + "\n---------------------------"
                            );

        logFile.println(className + " - " + errorMessage);

        
            }
    
    
}
