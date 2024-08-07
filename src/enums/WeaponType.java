package enums;

public enum WeaponType {
	SWORD(15),
	AXE(20),
	SPEAR(10);
	
	private final int weapondamage;
	
	WeaponType(int damage){
		this.weapondamage = damage;
	}
	
	public int getWeaponType() {
		return weapondamage;
	}
		
	@Override
	public String toString() {
		switch(this) {
		case SWORD:
			return "(+15 to your attack)";
		case AXE:
			return "(+25 to your attack)";
		case SPEAR:
			return "(+50 to your attack)";
		default:
			return "Unknown Weapon";
		}
	}

}
