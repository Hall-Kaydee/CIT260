/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
import java.io.Serializable;
import java.util.Objects;
//
/**
 *
 * @author Boyd
 */
public class Weapon implements Serializable{
    
    private String weaponType;
    private int ammoCount;
    private int noiseLevel;
    private int damagelevel;

    public Weapon() {
    }

    
    
    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public int getDamagelevel() {
        return damagelevel;
    }

    public void setDamagelevel(int damagelevel) {
        this.damagelevel = damagelevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.weaponType);
        hash = 41 * hash + this.ammoCount;
        hash = 41 * hash + this.noiseLevel;
        hash = 41 * hash + this.damagelevel;
        return hash;
    }

    @Override
    public String toString() {
        return "Weapon{" + "weaponType=" + weaponType + ", ammoCount=" + ammoCount + ", noiseLevel=" + noiseLevel + ", damagelevel=" + damagelevel + '}';
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
        final Weapon other = (Weapon) obj;
        if (this.ammoCount != other.ammoCount) {
            return false;
        }
        if (this.noiseLevel != other.noiseLevel) {
            return false;
        }
        if (this.damagelevel != other.damagelevel) {
            return false;
        }
        if (!Objects.equals(this.weaponType, other.weaponType)) {
            return false;
        }
        return true;
    }
    
    
    
}
