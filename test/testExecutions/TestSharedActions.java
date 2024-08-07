package testExecutions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.SharedActions;

public class TestSharedActions {

    private SharedActions action;

    @Before
    public void setUp() {
        action = new SharedActions("Test Warrior");
    }

    @Test
    public void testGetName() {
        assertEquals("Test Warrior", action.getName());
    }

    @Test
    public void testSetName() {
        action.setName("New Name");
        assertEquals("New Name", action.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, action.getHealth());
    }

    @Test
    public void testSetHealth() {
        action.setHealth(150);
        assertEquals( 150, action.getHealth());
    }

    @Test
    public void testGetAttack() {
        assertEquals( 10, action.getAttack());
    }

}
