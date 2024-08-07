package testExecutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.InputHandler;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TestInputHandler {

    private InputStream originalSystemIn;

    @Before
    public void setUp() {
        originalSystemIn = System.in;
    }

    @Test
    public void testGetValidIntInput_ValidInput() {
        String simulatedInput = "5\n"; 
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Scanner scanner = new Scanner(System.in);
        int result = InputHandler.getValidIntInput(scanner, "Enter a number between 1 and 10:", 1, 10);

        assertEquals(5, result);
    }

    @Test
    public void testGetValidIntInput_InvalidInput() {
        String simulatedInput = "invalid\n7\n"; 
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Scanner scanner = new Scanner(System.in);
        int result = InputHandler.getValidIntInput(scanner, "Enter a number between 1 and 10:", 1, 10);

        assertEquals(7, result);
    }

    @Test
    public void testGetValidStringInput_ValidInput() {
        String simulatedInput = "ValidName\n"; 
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Scanner scanner = new Scanner(System.in);
        String result = InputHandler.getValidStringInput(scanner, "Enter a valid name:");

        assertEquals("ValidName", result);
    }

    @Test
    public void testGetValidStringInput_InvalidInput() {
        String simulatedInput = "123\nInvalidName\n"; 
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Scanner scanner = new Scanner(System.in);
        String result = InputHandler.getValidStringInput(scanner, "Enter a valid name:");

        assertEquals("InvalidName", result);
    }

    @After
    public void tearDown() {
        System.setIn(originalSystemIn);
    }
}
