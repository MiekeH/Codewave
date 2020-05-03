package be.intecbrussel.the_notebook_animal_entities;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import be.intecbrussel.the_notebook_plant_entities.Plant;

public class Herbivore extends Animal {
	private Set<Plant> plantDiet;
	
	public Herbivore(String name) {
		super(name);
	}
	
	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}
	
	public Set<Plant> getPlantDiet () {
		return this.plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		if (plantDiet != null) {
		this.plantDiet = plantDiet;
		}
	}
	
	public void addPlantToDiet (Plant plant) {
		Set<Plant> plantDiets = new HashSet<>();
		plantDiets.add(plant);
	}
	
	public void printDiet() {
		Stream.of(this.plantDiet).forEach(System.out::println);
	}

	
	@Override
    public String toString() {
        return String.format("Herbivore '%s'%n%s",
        		name, " has a weight of " +getWeight() +"kg," +" height of " 
        		        +getHeight() +"m and a length of " +getLength() +"m."
        				+" This herbivore lives on a Diet of the following plants " +plantDiet +".");
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Herbivore other = (Herbivore) obj;
		if (plantDiet == null) {
			if (other.plantDiet != null)
				return false;
		} else if (!plantDiet.equals(other.plantDiet))
			return false;
		return true;
	}


	
	
	
	
}
