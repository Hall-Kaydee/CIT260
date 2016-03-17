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
public class MoveControlException extends Exception{

    public MoveControlException() {
    }

    public MoveControlException(String message) {
        super(message);
    }

    public MoveControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoveControlException(Throwable cause) {
        super(cause);
    }

    public MoveControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
    
}
