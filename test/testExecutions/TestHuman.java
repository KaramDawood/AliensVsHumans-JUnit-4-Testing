package testExecutions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import enums.ArmorType;
import enums.WeaponType;

public class TestHuman {

    private Human human;

    @Before
    public void setUp() {
        human = new Human("John Doe");
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", human.getName());
    }

    @Test
    public void testSetAndGetWeaponType() {
        human.setWeaponType(WeaponType.AXE);
        assertEquals(WeaponType.AXE, human.getWeaponType());
        assertEquals(30, human.getAttack());
        
        human.setWeaponType(WeaponType.SPEAR);
        assertEquals(WeaponType.SPEAR, human.getWeaponType());
        assertEquals(20, human.getAttack());

        human.setWeaponType(WeaponType.SWORD);
        assertEquals(WeaponType.SWORD, human.getWeaponType());
        assertEquals(25, human.getAttack());

    }

    @Test
    public void testSetAndGetArmorType() {
        human.setArmorType(ArmorType.MEDIUM);
        assertEquals(ArmorType.MEDIUM, human.getArmorType());
        assertEquals(125, human.getHealth());
        
        human.setArmorType(ArmorType.LIGHT);
        assertEquals(ArmorType.LIGHT, human.getArmorType());
        assertEquals(110, human.getHealth());

        human.setArmorType(ArmorType.HEAVY);
        assertEquals(ArmorType.HEAVY, human.getArmorType());
        assertEquals(150, human.getHealth());
    }

    private class Human extends src.Human {
        public Human(String name) {
            super(name);
        }
    }
}
