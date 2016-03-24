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
public class DoubleFormatException extends Exception{

    public DoubleFormatException() {
    }

    public DoubleFormatException(String message) {
        super(message);
    }

    public DoubleFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoubleFormatException(Throwable cause) {
        super(cause);
    }

    public DoubleFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
