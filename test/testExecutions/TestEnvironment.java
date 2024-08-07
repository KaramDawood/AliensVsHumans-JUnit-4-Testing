package testExecutions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import src.Alien;
import src.Environment;
import src.Human;
import src.SharedActions;

public class TestEnvironment {

    private Environment environment;
    private SharedActions human;
    private SharedActions alien;

    @Before
    public void setUp() {
        environment = new Environment();
        human = new Human("John Doe");
        alien = new Alien("Zorg");
    }

    @Test
    public void testAddEntity() {
        environment.addEntity(human);
        environment.addEntity(alien);
        
        assertTrue(environment.getEntities().contains(human));
        assertTrue(environment.getEntities().contains(alien));
    }

    @Test
    public void testRemoveEntity() {
        environment.addEntity(human);
        environment.addEntity(alien);
        environment.removeEntity(human);
        

        assertFalse(environment.getEntities().contains(human));
        assertTrue(environment.getEntities().contains(alien));
    }

}

