package src;

import enums.ArmorType;
import enums.WeaponType;

public class Human extends SharedActions {
	
    private ArmorType armorType = ArmorType.LIGHT; // Basis-Rüstung
    private WeaponType weaponType = WeaponType.SWORD; // Basis-Waffe
    
	//constructor
	public Human(String name) {
		super(name);
		this.attack += weaponType.getWeaponType();
		this.health+=armorType.getArmorValue();
//		System.out.println("Human" + this.id + " was created! The name is: " + this.getName());
	}
	
	//getters and setters for armor/weapon
	public ArmorType getArmorType() {
	       return this.armorType;
	  }

	public void setArmorType(ArmorType armorType) {
	       this.armorType = armorType;
	       this.resetHealth();
	       this.health+=this.armorType.getArmorValue();
	   }

	public WeaponType getWeaponType() {
	       return this.weaponType;
	   }

	public void setWeaponType(WeaponType weaponType) {
	        this.weaponType = weaponType;
	        this.resetAttack();
	        this.attack += this.weaponType.getWeaponType();
	    }

	

	}

	
	

