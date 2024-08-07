package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //player chooses warrior
        int choice = InputHandler.getValidIntInput(scanner, "Choose your warrior: (1) Human or (2) Alien", 1, 2);
        scanner.nextLine(); // "cleaning up" the scanner

        //player give his warrior a name
        String warriorName = InputHandler.getValidStringInput(scanner, "Enter the name of your warrior:");

        //player gets created
        SharedActions player;
        if (choice == 1) {
            player = new Human(warriorName);
        } else {
            player = new Alien(warriorName);
        }
        
        System.out.println(); //new line for readability

        //overview of the base values of player's warrior
        System.out.println("Your warrior details:");
        System.out.println("Name: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        
        if (player instanceof Human) {
            Human human = (Human) player;
            System.out.println("Armor: " + ((Human)player).getArmorType());
            System.out.println("Attack: " + ((Human)player).getAttack());
            System.out.println("Weapon: " + ((Human)player).getWeaponType().name() + " " + human.getWeaponType());
            UpgradeHandler.handleHumanUpgrade(scanner, (Human) player);
        }if (player instanceof Alien) {
        	System.out.println("Healing: " + (((Alien)player).getHealingType()));
            System.out.println("Attack: " + ((Alien)player).getAttack());
            System.out.println("Superpower: " + (((Alien)player).getSuperPowerType()));
            UpgradeHandler.handleAlienUpgrade(scanner, (Alien) player);
        }
   
        System.out.println();  //new line for readability

        //creating battlefield and moving the player to the battlefield
        Environment environment = new Environment();
        environment.addEntity(player);
        
        //enemy gets created
        SharedActions enemy;
        if (choice == 1) {
            enemy = new Alien("Enemy Alien");
        } else {
            enemy = new Human("Enemy Human");
        }

        //moving enemy to the battlefield
        environment.addEntity(enemy);
        System.out.println("The Battle begins!");
        
        //automated fighting
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            //player attacking enemy
            player.attack(enemy);

            //test whether player defeated enemy
            if (enemy.getHealth() <= 0) {
                System.out.println("\nYou defeated " + enemy.getName() + "!");
                break;
            }
            
            System.out.println();  //new line for readability

            //enemy attacking player
            enemy.attack(player);

            //test whether player was defeated by enemy
            if (player.getHealth() <= 0) {
                System.out.println("\nYou were defeated by " + enemy.getName() + "!");
                break;
            }
        }
        scanner.close();
    }  
}


