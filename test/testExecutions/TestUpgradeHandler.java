package testExecutions;


import enums.ArmorType;
import enums.HealingType;
import enums.SuperPowerType;
import enums.WeaponType;
import src.Alien;
import src.Human;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUpgradeHandler {

    private Human human;
    private Alien alien;

    @Before
    public void setUp() {
        human = new Human("Alex");
        alien = new Alien("Hyxion");
        
        human.setAttack(10);
        alien.setAttack(10);
        human.setHealth(100);
        alien.setHealth(100);
    }

    @Test
    public void testWeaponUpgradeForHuman() {
        WeaponType weaponType = WeaponType.SWORD; // Waffe auswählen
        human.setWeaponType(weaponType);
        
        int expectedAttack = 10 + weaponType.getWeaponType();
        assertEquals(expectedAttack, human.getAttack());
    }

    @Test
    public void testArmorUpgradeForHuman() {
        ArmorType armorType = ArmorType.LIGHT;
        human.setArmorType(armorType);
        
        int expectedHealth = 100 + armorType.getArmorValue();
        assertEquals(expectedHealth, human.getHealth());
    }

    @Test
    public void testSuperPowerUpgradeForAlien() {
        SuperPowerType superPowerType = SuperPowerType.TELEKINESIS;
        alien.setSuperPowerType(superPowerType);
        
        int expectedAttack = 10 + superPowerType.getAttackValue();
        assertEquals(expectedAttack, alien.getAttack());
    }

    @Test
    public void testHealingUpgradeForAlien() {
        HealingType healingType = HealingType.SMALL_HEAL;
        alien.setHealingType(healingType);
                
        int expectedHealth = 100 + healingType.getHealValue();
        assertEquals(expectedHealth, alien.getHealth());
    }
}