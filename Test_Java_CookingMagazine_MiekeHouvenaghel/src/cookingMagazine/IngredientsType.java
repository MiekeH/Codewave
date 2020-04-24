 package cookingMagazine;

import java.util.List;

public class IngredientsType {

	private Vegetables vegetables;
	private Fruit fruits;
	private Dairy dairy;
	
	private List<Dairy> listDairy;
	private List<Fruit> listFruits;
	private List<Vegetables> listVegetables;
		
	
	
	public IngredientsType(Vegetables vegetables, Fruit fruits, Dairy dairy) {
		this.vegetables = vegetables;
		this.fruits = fruits;
		this.dairy = dairy;
		
	}
	
	
	public IngredientsType(List <Dairy> listDairy, List<Fruit> listFruits,List<Vegetables> listVegetables) {
		this.listDairy=listDairy;
		this.listFruits=listFruits;
		this.listVegetables=listVegetables;
	}


	@Override
	public String toString() {
		return "IngredientsType [vegetables=" + vegetables + ", fruits=" + fruits + ", dairy=" + dairy + ", listDairy="
				+ listDairy + ", listFruits=" + listFruits + ", listVegetables=" + listVegetables + "]";
	}
	
	
	
}
