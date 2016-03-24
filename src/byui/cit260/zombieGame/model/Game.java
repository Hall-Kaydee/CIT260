/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
//
import java.io.Serializable;

/**
 *
 * @author Evanator
 */
public class Game implements Serializable {
    
    //class var
    private double totalScore;
    private double noPeople;
    private InventoryItem[] Inventory;
    private Map map;

    public Game() {
    }
    
    

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalScore) ^ (Double.doubleToLongBits(this.totalScore) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalScore=" + totalScore + ", noPeople=" + noPeople + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalScore) != Double.doubleToLongBits(other.totalScore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        return true;
    }

    public void setMap(Map map) {
        System.out.println("set map called");
    }

    public void setInventory(InventoryItem[] inventoryList) {
       System.out.println("set Inventory called");
    }

    public void setPlyer(Player player) {
       System.out.println("set player called");
    }
    
    
    
}
