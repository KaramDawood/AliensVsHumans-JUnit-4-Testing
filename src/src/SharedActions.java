package src;

public class SharedActions {
	
	protected String name = "";
	protected int health = 100;
	protected int attack = 10;
	protected int id = 0;
	
		
	public SharedActions(String name) {
		this.name = name;
	}
		    
    //methods for armor/weapon/superpower/healing
	public void resetHealth() {
		this.health = 100;
	}
	
	public void resetAttack() {
		this.attack=10;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public void setAttack(int newAttack) {
		this.attack=newAttack;
	}
     
	//setters & getters
	public String getName() {
		return this.name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
	
	public void setHealth(int newHealth) {
		this.health=newHealth;
	}
	
	//fightning mechanics
	public void attack(SharedActions enemy) {
	        // Schaden berechnen
	        int damageDealt = this.attack;

	        // Schaden am Gegner anrichten
	        enemy.setHealth(enemy.getHealth() - damageDealt);

	        // Ausgabe des Kampfergebnisses
	        System.out.println();
	        System.out.println(this.name + " attacks " + enemy.getName() + " and deals " + damageDealt + " damage.");
	        System.out.println(enemy.getName() + " now has " + enemy.getHealth() + " health remaining.");

	        // Kurze Pause einfügen, um den Kampfverlauf verfolgbar zu machen
	        try {
	            Thread.sleep(500); // Pause von 1 Sekunde
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.out.println("Interrupted while sleeping");
	        }
	    }
	
}

