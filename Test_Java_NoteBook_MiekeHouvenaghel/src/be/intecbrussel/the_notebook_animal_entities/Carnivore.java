package be.intecbrussel.the_notebook_animal_entities;

public class Carnivore extends Animal {
	private double maxFoodSize; 
		
	public Carnivore(String name) {
		super(name);
	}
	
	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public double getMaxFoodSize() {
		return this.maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	
	@Override
    public String toString() {
        return String.format("Carnivore '%s'%n%s",
        		name, " has a maxFood Size of "+getMaxFoodSize() +", a weight of " +getWeight() +"kg," +" a height of " 
        +getHeight() +"m, and a length of " +getLength() +"m.");
    }
	
	
	
   

	
		
	
}
