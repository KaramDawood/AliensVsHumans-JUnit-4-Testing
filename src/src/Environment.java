package src;

import java.util.ArrayList;
import java.util.List;

public class Environment {
	
	private ArrayList<SharedActions> entities;
	
	public Environment() {
		this.entities=new ArrayList<>();
	}
	
	public void addEntity(SharedActions entity) {
		this.entities.add(entity);
//		System.err.println(entity.getName()+ " was added to the Battlefield.");
	}
	
	public void removeEntity(SharedActions entity) {
		this.entities.remove(entity);
		System.out.println(entity.getName() + " was removed from the Battlefield");
	}
	
	   public List<SharedActions> getEntities() {
	        return new ArrayList<>(entities); 
	    }
	
}
