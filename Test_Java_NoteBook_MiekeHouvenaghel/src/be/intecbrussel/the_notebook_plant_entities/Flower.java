package be.intecbrussel.the_notebook_plant_entities;


public class Flower extends Plant {
	private Scent smell;
		
	public Flower(String name) {
		super(name);
	}
	
	public Flower(String name, double height) {
		super(name,height);
	}

	public Scent getSmell() {
		return this.smell;
	}

	public void setSmell(Scent smell) {
		this.smell = smell;
	}
	
	@Override
	public String toString() {
		return String.format("Flower '%s'%n%s",
        		name, " with a " +smell + " smell and height of " +height + " m.");
	}
	
	
}
