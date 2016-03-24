/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.Enum;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Evanator
 */
public enum Actor implements Serializable {
    
    Rick("He is the protaganist"),
    Evan("The lovable rogue"),
    Boyd("He is a mad man"),
    Kaydee("lost civilian");
    
    private final String description;
    private final Point coordinates;
    Actor(String description) {
       
        this.description = description;
        coordinates = new Point (1,1);
    }

    public String getDescription() {
        return description;
    }   
    
}
