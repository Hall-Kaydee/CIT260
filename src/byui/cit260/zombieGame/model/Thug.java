/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
import java.io.Serializable;
//
/**
 *
 * @author Boyd
 */
public class Thug implements Serializable {
    
    private int hitPoints;
    private boolean itemDrop;

    public Thug() {
    }
    
    

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean isItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(boolean itemDrop) {
        this.itemDrop = itemDrop;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.hitPoints;
        hash = 73 * hash + (this.itemDrop ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Thug{" + "hitPoints=" + hitPoints + ", itemDrop=" + itemDrop + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thug other = (Thug) obj;
        if (this.hitPoints != other.hitPoints) {
            return false;
        }
        if (this.itemDrop != other.itemDrop) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
