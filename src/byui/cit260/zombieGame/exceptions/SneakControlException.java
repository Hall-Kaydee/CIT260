/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.exceptions;

/**
 *
 * @author Boyd
 */
public class SneakControlException extends Exception{

    public SneakControlException() {
    }

    public SneakControlException(String message) {
        super(message);
    }

    public SneakControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public SneakControlException(Throwable cause) {
        super(cause);
    }

    public SneakControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
