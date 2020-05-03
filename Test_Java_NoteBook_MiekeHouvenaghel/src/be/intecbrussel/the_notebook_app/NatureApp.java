package be.intecbrussel.the_notebook_app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import be.intecbrussel.the_notebook_animal_entities.Animal;
import be.intecbrussel.the_notebook_animal_entities.Carnivore;
import be.intecbrussel.the_notebook_animal_entities.Herbivore;
import be.intecbrussel.the_notebook_animal_entities.Omnivore;
import be.intecbrussel.the_notebook_plant_entities.Bush;
import be.intecbrussel.the_notebook_plant_entities.Flower;
import be.intecbrussel.the_notebook_plant_entities.LeafType;
import be.intecbrussel.the_notebook_plant_entities.Plant;
import be.intecbrussel.the_notebook_plant_entities.Scent;
import be.intecbrussel.the_notebook_plant_entities.Tree;
import be.intecbrussel.the_notebook_plant_entities.Weed;
import be.intecbrussel.the_notebook_services.ForestNoteBook;

public class NatureApp {
	public static void main(String[] args) {
		ForestNoteBook forestSunnyWalk = new ForestNoteBook();
		List<Plant> plants = new ArrayList<>();
		List<Herbivore> herbivores = new ArrayList<>();
		List<Carnivore> carnivores = new ArrayList<>();				
		List<Omnivore> omnivores = new ArrayList<>();
		List<Animal> animals = new ArrayList<>();
				
		Tree tree1 = new Tree("Canadian Oak", 2.78);
		tree1.setLeafType(LeafType.HEART);
	
		Flower flower1 = new Flower("Whitescented Rose",0.67);
		flower1.setSmell(Scent.ORANGE);
		
		Weed weed1 = new Weed("Weedflowers", 0.25);
		weed1.setArea(8.10);
		
		Bush bushTree = new Bush("BerryFresh", 1.56);
		bushTree.setFruit("black berries");
		bushTree.setLeafType(LeafType.ROUND);

		Flower flower2 = new Flower("Purple lilly", 0.78);
		flower2.setSmell(Scent.SWEET);
					
		Set<Plant> plantDiet = new HashSet<>();
		plantDiet.add(bushTree);
		plantDiet.add(weed1);
			
		Herbivore herbivore1 = new Herbivore("White Rhinoceros");
		herbivore1.setHeight(1.76);
		herbivore1.setLength(2.34);
		herbivore1.setWeight(2_300.08);
		herbivore1.setPlantDiet(plantDiet);
		
		Herbivore herbivore2 = new Herbivore("Female Cow");
		herbivore2.setHeight(1.56);
		herbivore2.setLength(2.45);
		herbivore2.setWeight(720.67);
		herbivore2.setPlantDiet(plantDiet);
	
		Herbivore herbivore3 = new Herbivore("White Horse");
		herbivore3.setHeight(1.8);
		herbivore3.setLength(2.43);
		herbivore3.setWeight(720.67);
		herbivore3.setPlantDiet(plantDiet);
	
		Carnivore carnivore1 = new Carnivore("Fox", 52.08, 0.78, 1.32);
		Carnivore carnivore2 = new Carnivore("Grizzly Bear", 320.56, 2.70, 2.56);
		Carnivore carnivore3 = new Carnivore("Female Tiger", 110.56, 2.56, 2.10);

		carnivore1.setMaxFoodSize(5.0);
		carnivore2.setMaxFoodSize(20.0);
		carnivore3.setMaxFoodSize(25.3);
	
		Omnivore omnivore1 = new Omnivore(" Crazy Monkey", 7.7, 0.56, 1.80);
		Omnivore omnivore2 = new Omnivore(" Cheezy Chicken",2.6,0.78,0.5);
		Omnivore omnivore3 = new Omnivore("Fuzzy Fox", 52.08, 0.78, 1.32);
			
		omnivore1.setPlantDiet(plantDiet);
		omnivore2.setPlantDiet(plantDiet);
		omnivore3.setPlantDiet(plantDiet);
		omnivore1.setMaxFoodSize(8.0);
		omnivore3.setMaxFoodSize(3.0);
		omnivore2.setMaxFoodSize(0.8);
		omnivore1.addPlantToDiet(weed1);
				
		animals.addAll(carnivores);
		animals.addAll(omnivores);
		animals.addAll(herbivores);
				
		System.out.println("ENJOY the VIEW of this MAGNIFICENT BOOK:");
		System.out.println("----------------------------------------");
		
		forestSunnyWalk.setCarnivores(carnivores);
		forestSunnyWalk.setHerbivores(herbivores);
		forestSunnyWalk.setOmnivores(omnivores);
		
		forestSunnyWalk.addPlants(flower1);
		forestSunnyWalk.addPlants(flower2);
		forestSunnyWalk.addPlants(bushTree);
		forestSunnyWalk.addPlants(weed1);
		forestSunnyWalk.addPlants(tree1);
		
		forestSunnyWalk.addAnimals(omnivore3);
		forestSunnyWalk.addAnimals(omnivore2);
		forestSunnyWalk.addAnimals(omnivore1);
		forestSunnyWalk.addAnimals(herbivore1);
		forestSunnyWalk.addAnimals(herbivore2);
		forestSunnyWalk.addAnimals(herbivore3);
		forestSunnyWalk.addAnimals(carnivore1);
		forestSunnyWalk.addAnimals(carnivore2);
		forestSunnyWalk.addAnimals(carnivore3);

		System.out.println("I HAVE SEEN " +forestSunnyWalk.getPlantCount() 
				+ " PLANTS and "+forestSunnyWalk.getAnimalCount() +" EXOTIC AIMALS DURING MY SUNDAY WALK");
							
		System.out.println("The Details of My Forest SunnyWalk Notebook:");
		forestSunnyWalk.printNoteBook();
		
		System.out.println("PRINT THE LISTS of ANIMALS SEPARATELY:");
		
		System.out.println("FIRST, I HAVE SEEN THESE CARNIVORES:");
				
		carnivores.forEach(System.out:: println);
		System.out.println("THEN, ... I HAVE COME ACROSS THESE HERBIVORES:");
		herbivores.forEach(System.out:: println);
		System.out.println("AND LAST BUT NOT THE VERY LEAST,...THESE OMNIVORES:");
		omnivores.forEach(System.out:: println);

		forestSunnyWalk.sortPlantsByName();
		forestSunnyWalk.sortAnimalsByName();

		System.out.println("PRINT OFF the Details of the Notebook AFTER SORTING:");
		forestSunnyWalk.printNoteBook();
	
		forestSunnyWalk.sortAnimalsbyHeight();
		forestSunnyWalk.sortPlantsbyHeight();

		System.out.println("PRINT OFF the Details of the Notebook AFTER SORTING EXTRA:");
		forestSunnyWalk.printNoteBook();
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
