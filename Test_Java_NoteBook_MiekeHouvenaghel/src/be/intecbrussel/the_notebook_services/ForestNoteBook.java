package be.intecbrussel.the_notebook_services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import be.intecbrussel.the_notebook_animal_entities.Animal;
import be.intecbrussel.the_notebook_animal_entities.Carnivore;
import be.intecbrussel.the_notebook_animal_entities.Omnivore;
import be.intecbrussel.the_notebook_plant_entities.Plant;
import be.intecbrussel.the_notebook_animal_entities.Herbivore;

public class ForestNoteBook {
	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;
	private List<Herbivore> herbivores;
	private int plantCount;
	private int animalCount;
	private List<Animal> animals;
	private List<Plant> plants;
	
	public ForestNoteBook() {
		this.animals = new ArrayList<> ();
		this.plants = new ArrayList<> ();
		this.carnivores = new ArrayList<> ();
		this.herbivores = new ArrayList<>();
		this.omnivores = new ArrayList<> ();
	}
		
	public List<Carnivore> getCarnivores() {
		return this.carnivores;
	}
	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}
	public List<Omnivore> getOmnivores() {
		return this.omnivores;
	}
	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}
	public List<Herbivore> getHerbivores() {
		return this.herbivores;
	}
	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}
	public int getPlantCount() {
		return (int) plants.stream().count();
	}
	
	public int getAnimalCount() {
		return (int) animals.stream().count();
	}
	
	public List<Animal> getAnimals() {
		return this.animals;
	}
	
	public void addAnimals(Animal animals) {
		animals.hashCode();
		this.animals.add((Animal) animals);
		
		if(animals instanceof Carnivore) {
			this.carnivores.add((Carnivore) animals);
		}
		else {
		if(animals instanceof Herbivore) {
			this.herbivores.add((Herbivore) animals);
			}
			else {
				if (animals instanceof Omnivore) {
					this.omnivores.add((Omnivore) animals);
				}
			}
		}
	}
			
			
	public void addPlants(Plant plant) {
		if (plant != null) {
			if (!plants.contains(plant)) {
			this.plants.add(plant);
			}
		
		else {
		System.out.println("cannot add plants to the list");
		}
		}
	
	}

	public void printNoteBook() {
		System.out.println("AMAZING ANIMALS:");
		animals.forEach(System.out::println);
		System.out.println("PARADISE PLANTS:");
		plants.forEach(System.out::println);
	}
	
	public void sortAnimalsByName() {
		this.animals.sort(Comparator.comparing(s->s.getName()));
	}
	
	public void sortPlantsByName() {
		this.plants.sort(Comparator.comparing(s->s.getName()));
	}
	
	public void sortAnimalsbyHeight() {
		this.animals.sort(Comparator.comparingDouble(s->s.getHeight()));
		}
				
	public void sortPlantsbyHeight() {
		this.plants.sort(Comparator.comparingDouble(s->s.getHeight()));
		}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + animalCount;
		result = prime * result + ((animals == null) ? 0 : animals.hashCode());
		result = prime * result + ((carnivores == null) ? 0 : carnivores.hashCode());
		result = prime * result + ((herbivores == null) ? 0 : herbivores.hashCode());
		result = prime * result + ((omnivores == null) ? 0 : omnivores.hashCode());
		result = prime * result + plantCount;
		result = prime * result + ((plants == null) ? 0 : plants.hashCode());
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
		ForestNoteBook other = (ForestNoteBook) obj;
		if (animalCount != other.animalCount)
			return false;
		if (animals == null) {
			if (other.animals != null)
				return false;
		} else if (!animals.equals(other.animals))
			return false;
		if (carnivores == null) {
			if (other.carnivores != null)
				return false;
		} else if (!carnivores.equals(other.carnivores))
			return false;
		if (herbivores == null) {
			if (other.herbivores != null)
				return false;
		} else if (!herbivores.equals(other.herbivores))
			return false;
		if (omnivores == null) {
			if (other.omnivores != null)
				return false;
		} else if (!omnivores.equals(other.omnivores))
			return false;
		if (plantCount != other.plantCount)
			return false;
		if (plants == null) {
			if (other.plants != null)
				return false;
		} else if (!plants.equals(other.plants))
			return false;
		return true;
	}
	

		
	}


	
	

