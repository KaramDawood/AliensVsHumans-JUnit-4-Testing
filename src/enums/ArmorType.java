package enums;

public enum ArmorType {
	LIGHT(10),
	MEDIUM(25),
	HEAVY(50);
	
	private final int armorValue;

	private ArmorType(int armorValue) {
		this.armorValue=armorValue;
	}
	
	public int getArmorValue(){
		return this.armorValue;
	}
	
	@Override
	public String toString() {
		switch(this) {
		case LIGHT:
			return "Light Armor (+10 to your health)";
		case MEDIUM:
			return "Medium Armor(+25 to your health)";
		case HEAVY:
			return "Heavy Armor(+50 to your health)";
		default:
			return "Unknown Armor";
		}
	}
}
