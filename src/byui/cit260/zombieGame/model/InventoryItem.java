/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Boyd
 */
public class InventoryItem implements Serializable{
    
    //class instance variables
    private String ItemType;
    private int ItemQuantity;
    private double ItemStrength;
    private int ItemXCoordinate;
    private int ItemYCoordinate;

    public InventoryItem() {
    }
    
    
    

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public int getItemQuantity() {
        return ItemQuantity;
    }

    public void setItemQuantity(int ItemQuantity) {
        this.ItemQuantity = ItemQuantity;
    }

    public double getItemStrength() {
        return ItemStrength;
    }

    public void setItemStrength(double ItemStrength) {
        this.ItemStrength = ItemStrength;
    }

    public int getItemXCoordinate() {
        return ItemXCoordinate;
    }

    public void setItemXCoordinate(int ItemXCoordinate) {
        this.ItemXCoordinate = ItemXCoordinate;
    }

    public int getItemYCoordinate() {
        return ItemYCoordinate;
    }

    public void setItemYCoordinate(int ItemYCoordinate) {
        this.ItemYCoordinate = ItemYCoordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ItemType);
        hash = 37 * hash + this.ItemQuantity;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.ItemStrength) ^ (Double.doubleToLongBits(this.ItemStrength) >>> 32));
        hash = 37 * hash + this.ItemXCoordinate;
        hash = 37 * hash + this.ItemYCoordinate;
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "ItemType=" + ItemType + ", ItemQuantity=" + ItemQuantity + ", ItemStrength=" + ItemStrength + ", ItemXCoordinate=" + ItemXCoordinate + ", ItemYCoordinate=" + ItemYCoordinate + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.ItemQuantity != other.ItemQuantity) {
            return false;
        }
        if (this.ItemXCoordinate != other.ItemXCoordinate) {
            return false;
        }
        if (this.ItemYCoordinate != other.ItemYCoordinate) {
            return false;
        }
        if (!Objects.equals(this.ItemType, other.ItemType)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
