package src;

import java.util.Scanner;

public class InputHandler {
	
	//method to make sure user types in an int value
    public static int getValidIntInput(Scanner scanner, String prompt, int min, int max) {
        int input = 0;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    break; // Gültige Eingabe, Schleife verlassen
                } else {
                    System.out.println("Invalid choice. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Ungültige Eingabe konsumieren
            }
        }
        return input;
    }

    //method to make sure user types in a String value
    public static String getValidStringInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.println(prompt);
            input = scanner.nextLine().trim();
            if (!input.isEmpty() && !input.matches(".*\\d.*")) { // Überprüft, ob der Name leer ist oder Zahlen enthält
                break; // Gültige Eingabe, Schleife verlassen
            } else {
                System.out.println("Invalid input. Please enter a valid name (no numbers).");
            }
        }
        return input;
    }

}
