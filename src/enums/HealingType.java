package enums;

public enum HealingType {
	SMALL_HEAL(25),
	MEDIUM_HEAL(45),
	LARGE_HEAL(60);
	
	private final int healValue;
	
	HealingType(int healValue){
		this.healValue=healValue;
	}
	
	public int getHealValue() {
		return healValue;
	}
	
	@Override
	public String toString() {
		switch(this) {
		case SMALL_HEAL:
			return "Small healing (+25 to your health)";
		case MEDIUM_HEAL:
			return "Medium healing (+45 to your health)";
		case LARGE_HEAL:
			return "Large healing (+60 to your health)";
		default:
			return "Unknown Healing";
		}
	}

}
