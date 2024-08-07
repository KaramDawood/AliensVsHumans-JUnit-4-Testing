package src;

import enums.HealingType;
import enums.SuperPowerType;

public class Alien extends SharedActions {
    
    private HealingType healingType;
    private SuperPowerType superPowerType;
    
     
    public Alien(String name) {
    	super(name);
        this.superPowerType = SuperPowerType.FIREBALL;
        this.healingType = HealingType.SMALL_HEAL;
        this.attack += this.superPowerType.getAttackValue();
        this.health += this.healingType.getHealValue();
    }
    
    public void setSuperPowerType(SuperPowerType superPowerType) {
        this.superPowerType = superPowerType;
        this.resetAttack();
        this.attack += superPowerType.getAttackValue(); // base attack + superpower value
    }

    public SuperPowerType getSuperPowerType() {
        return superPowerType;
    }

    public HealingType getHealingType() {
    	return this.healingType;
    }
    
    public void setHealingType(HealingType healingType) {
        this.healingType = healingType;
        this.resetHealth();
        this.health+=healingType.getHealValue();
    }
 
}
