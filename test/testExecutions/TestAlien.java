package testExecutions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import enums.HealingType;
import enums.SuperPowerType;

public class TestAlien {

    private Alien alien;

    @Before
    public void setUp() {
        alien = new Alien("Zorg");
    }

    @Test
    public void testGetName() {
        assertEquals("Zorg", alien.getName());
    }

    @Test
    public void testSetAndGetSuperPowerType() {
        alien.setSuperPowerType(SuperPowerType.ENERGY_BLAST);
        assertEquals(SuperPowerType.ENERGY_BLAST, alien.getSuperPowerType());
        assertEquals(55, alien.getAttack());
        
        alien.setSuperPowerType(SuperPowerType.TELEKINESIS);
        assertEquals(SuperPowerType.TELEKINESIS, alien.getSuperPowerType());
        assertEquals(45, alien.getAttack());

        alien.setSuperPowerType(SuperPowerType.FIREBALL);
        assertEquals(SuperPowerType.FIREBALL, alien.getSuperPowerType());
        assertEquals(30, alien.getAttack());

    }

    @Test
    public void testSetAndGetHealingType() {
        alien.setHealingType(HealingType.MEDIUM_HEAL);
        assertEquals(HealingType.MEDIUM_HEAL, alien.getHealingType());
        assertEquals(145, alien.getHealth());

        alien.setHealingType(HealingType.SMALL_HEAL);
        assertEquals(HealingType.SMALL_HEAL, alien.getHealingType());
        assertEquals(125, alien.getHealth());
        
        alien.setHealingType(HealingType.LARGE_HEAL);
        assertEquals(HealingType.LARGE_HEAL, alien.getHealingType());
        assertEquals(160, alien.getHealth());
        
    }

    private class Alien extends src.Alien {
        public Alien(String name) {
            super(name);
        }
    }
}
