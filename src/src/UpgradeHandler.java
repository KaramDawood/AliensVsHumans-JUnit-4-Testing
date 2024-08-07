package src;

import java.util.Scanner;

import enums.ArmorType;
import enums.HealingType;
import enums.SuperPowerType;
import enums.WeaponType;

public class UpgradeHandler {
	
	//method to handle the human upgrade
	public static void handleHumanUpgrade(Scanner scanner, Human player) {
		
        System.out.println("\nDo you want to change your weapon/armor, or proceed to the battlefield?");
        System.out.println("(1) Change Weapon");
        System.out.println("(2) Change Armor");
        System.out.println("(3) Proceed to Battlefield");

        int upgradeChoice = InputHandler.getValidIntInput(scanner, "Choose an option:", 1, 3);
        
        if (upgradeChoice == 1) {
            // Waffen-Auswahl zur HUMAN
            WeaponType[] availableWeapons = getAvailableOptions(WeaponType.values(), player.getWeaponType());
            System.out.println("Available Weapons to replace your current weapon with:");
            for (int i = 0; i < availableWeapons.length; i++) {
                WeaponType weapon = availableWeapons[i];
                System.out.println((i + 1) + ". " + weapon.name() + " - Attack: " + weapon.getWeaponType());
            }

            int weaponChoice = InputHandler.getValidIntInput(scanner, "Choose your Weapon:", 1, availableWeapons.length);
            WeaponType selectedWeapon = availableWeapons[weaponChoice - 1];
            player.setWeaponType(selectedWeapon);
            System.out.println("You equipped a " + selectedWeapon.name() + " with " + selectedWeapon.getWeaponType() + " damage for " + player.getName() + "!");
            System.out.println("New Attack Value: " + player.getAttack()); // Neuer Angriffswert anzeigen
            System.out.println("Now on to the battlefield!");
            
        } else if (upgradeChoice == 2) {
            // Rüstungsauswahl zur Verbesserung
            ArmorType[] availableArmors = getAvailableOptions(ArmorType.values(), ((Human) player).getArmorType());
            System.out.println("Available Armors:");
            for (int i = 0; i < availableArmors.length; i++) {
                ArmorType armor = availableArmors[i];
                System.out.println((i + 1) + ". " + armor.name() + " - Value: " + armor.getArmorValue());
            }

            int armorChoice = InputHandler.getValidIntInput(scanner, "Choose your Armor:", 1, availableArmors.length);
            ArmorType selectedArmor = availableArmors[armorChoice - 1];
            ((Human) player).setArmorType(selectedArmor);
            System.out.println("You equipped " + selectedArmor.name() + " armor with " + selectedArmor.getArmorValue() + " value for " + player.getName() + "!");
            System.out.println("New healt: " + player.getHealth());
            System.out.println("Now on to the battlefield!");

        } else {
            System.out.println("Proceeding to battlefield with current equipment.");
        }
		
	}
	
	//method to handle the alien upgrade
	public static void handleAlienUpgrade(Scanner scanner, Alien player)
	{
		
	    System.out.println("\nDo you want to change your healing/superpower, or proceed to the battlefield?");
        System.out.println("(1) Change Healing");
        System.out.println("(2) Change Superpower");
        System.out.println("(3) Proceed to Battlefield");

        int upgradeChoice = InputHandler.getValidIntInput(scanner, "Choose an option:", 1, 3);

          if (upgradeChoice == 1) {
                // Heilungsauswahl zur Verbesserung ALIEN
                HealingType[] availableHealing = getAvailableOptions(HealingType.values(), ((Alien) player).getHealingType());
                System.out.println("Available Healing Types:");
                for (int i = 0; i < availableHealing.length; i++) {
                    HealingType healing = availableHealing[i];
                    System.out.println((i + 1) + ". " + healing.name() + " - Healing Value: " + healing.getHealValue());
                }

                int healingChoice = InputHandler.getValidIntInput(scanner, "Choose your Healing:", 1, availableHealing.length);
                HealingType selectedHealing = availableHealing[healingChoice - 1];
                ((Alien) player).setHealingType(selectedHealing);
                System.out.println("You chose " + selectedHealing.name() + " healing with " + selectedHealing.getHealValue() + " value for " + player.getName() + "!");
                System.out.println("New Health Value: " + player.getHealth());
                System.out.println("Now on to the battlefield!");

            } else if (upgradeChoice == 2) {
                // Superkraft-Auswahl zur Verbesserung
                SuperPowerType[] availableSuperPowers = getAvailableOptions(SuperPowerType.values(), ((Alien) player).getSuperPowerType());
                System.out.println("Available Superpowers:");
                for (int i = 0; i < availableSuperPowers.length; i++) {
                    SuperPowerType superPower = availableSuperPowers[i];
                    System.out.println((i + 1) + ". " + superPower.name() + " - Attack Value: " + superPower.getAttackValue());
                }

                int superPowerChoice = InputHandler.getValidIntInput(scanner, "Choose your Superpower:", 1, availableSuperPowers.length);
                SuperPowerType selectedSuperPower = availableSuperPowers[superPowerChoice - 1];
                ((Alien) player).setSuperPowerType(selectedSuperPower);
                System.out.println("You chose " + selectedSuperPower.name() + " with " + selectedSuperPower.getAttackValue() + " attack value for " + player.getName() + "!");
                System.out.println("New Attack Value: " + player.getAttack());
                System.out.println("Now on to the battlefield!");

            } else {
                System.out.println("Proceeding to battlefield with current abilities.");
            }
        }
	
    //method to evaluate which options the player has to upgrade armor/weapon/superpoer/healing
    @SuppressWarnings("unchecked")
	public static <T> T[] getAvailableOptions(T[] options, T current) {
        return (T[]) java.util.Arrays.stream(options)
                .filter(option -> !option.equals(current))
                .toArray(size -> (T[]) java.lang.reflect.Array.newInstance(options.getClass().getComponentType(), size));
    }
}
