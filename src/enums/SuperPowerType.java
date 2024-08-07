package enums;

public enum SuperPowerType {
	TELEKINESIS(35),
    ENERGY_BLAST(45),
    FIREBALL(20);

    private final int attackValue;

    SuperPowerType(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
    
	@Override
	public String toString() {
		switch(this) {
		case TELEKINESIS:
			return "Telekinesis (+35 to your attack)";
		case ENERGY_BLAST:
			return "Energy blast (+45 to your attack)";
		case FIREBALL:
			return "FireBall (+20 to your attack)";
		default:
			return "Unknown Superpower";
		}
	}
    
}
