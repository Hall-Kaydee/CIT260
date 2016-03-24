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
public class FightControlException extends Exception{

    public FightControlException() {
    }

    public FightControlException(String message) {
        super(message);
    }

    public FightControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FightControlException(Throwable cause) {
        super(cause);
    }

    public FightControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
    
}
