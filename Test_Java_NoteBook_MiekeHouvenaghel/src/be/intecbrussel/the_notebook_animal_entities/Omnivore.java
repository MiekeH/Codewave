
package be.intecbrussel.the_notebook_animal_entities;

import java.util.HashSet;
import java.util.Set;
import be.intecbrussel.the_notebook_plant_entities.Plant;

public class Omnivore extends Animal {
	private Set<Plant> plantDiet;
	private double maxFoodSize;
	
	public Omnivore(String name) {
		super(name);
	}
	
	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return this.plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return this.maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	public void addPlantToDiet (Plant plant) {
		Set<Plant> plantDiets = new HashSet<>();
		plantDiets.add(plant);  
	        
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(maxFoodSize);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((plantDiet == null) ? 0 : plantDiet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Omnivore other = (Omnivore) obj;
		if (Double.doubleToLongBits(maxFoodSize) != Double.doubleToLongBits(other.maxFoodSize))
			return false;
		if (plantDiet == null) {
			if (other.plantDiet != null)
				return false;
		} else if (!plantDiet.equals(other.plantDiet))
			return false;
		return true;
	}

	
	@Override
    public String toString() {
        return String.format("Omnivore '%s'%n%s",
        		name, " has a weight of " +getWeight() +"kg," +" height of " 
        		        +getHeight() +"m and a length of " +getLength() +"m."
        				+" This omnivore has a max Food Size of " +getMaxFoodSize() +" and lives on a Diet of the following plants " +plantDiet +".");
    }
	
	
	
}
