package cookingMagazine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import cookingMagazine.Recipe.AuthorOfRecipe;

public class CookingMagazineApp {

	public static void main(String[] args) {
		/* COMMENTS MSH: Instructions set up as a String, not set up in utility, set up a method called instructions() as well
		 * InterfaceCooking with abstract methods to be completed; Recipe details are not printed off; Sorting method to finalise
		 */
		
		List<IngredientsType> listIngredients = new ArrayList<>();
		IngredientsType ingredients1 = new IngredientsType(Vegetables.CAULIFLOWER, Fruit.GOOSEBERRIES,Dairy.KEFIR);
		IngredientsType ingredients2 = new IngredientsType(null, Fruit.GOOSEBERRIES,Dairy.YOGHURT);
		IngredientsType ingredients3 = new IngredientsType(Vegetables.TOMATO, Fruit.PAPAYA, Dairy.KEFIR);
		
		listIngredients.add(new IngredientsType(null, Fruit.GOOSEBERRIES, null));
		listIngredients.add(ingredients3);
		listIngredients.add(ingredients2);
		listIngredients.add(ingredients1);
		
		List<Recipe> listRecipe = new ArrayList<>();
		Recipe recipe = new Recipe();
		Recipe.AuthorOfRecipe author1 = recipe.new AuthorOfRecipe("Charlie", "Mousseux");
		Recipe.AuthorOfRecipe author2 = recipe.new AuthorOfRecipe("Jackie", "Rousseau");
		Recipe recipe1 = new Recipe("Smooth and fast", author2,ingredients2,"Lookup instructions www.yoghurtwith a twist");
		Recipe recipe2 = new Recipe("Crazy lazy days", author2,ingredients2,"Lookup instructions www.yoghurtwith a twist");
		Recipe recipe3 = new Recipe("kefi paja",author1,ingredients3, "Instructions under www.indianlahti");
		
		listRecipe.add(recipe3);
		listRecipe.add(recipe2);
		listRecipe.add(recipe1);
		listRecipe.stream().sorted();
		
			
		List<CookingMagazine> magazine = new ArrayList<> ();
		CookingMagazine summerMagazine = new CookingMagazine("Look and Cook Summer Edition","Beach Cooking Vibes",LocalDateTime.of(2020, 8, 1, 22, 8),
				"Mazzy your cook of the day",CookingCategory.APERO,CookingStyle.FLEMISH,CookingMethod.COLD,
				recipe3);
		
		CookingMagazine mayMagazine = new CookingMagazine("Look and Cook May Edition", "Fresh Breeze", LocalDateTime.of(2020,5,1,22,9),"James Codson",
				CookingCategory.DESSERT,CookingStyle.FRENCH,CookingMethod.OVEN,recipe3);
				
		magazine.add(summerMagazine);
		magazine.add(mayMagazine);
		magazine.add(new CookingMagazine("Look and Cook Special Edition", "Your soul needs special Foods"));
		magazine.forEach(System.out :: println);
		
		System.out.println("------");
		
		magazine.remove(summerMagazine);
		for(CookingMagazine m: magazine) {
			System.out.println(m);
		}
		
		System.out.println("------");
		
		magazine.add(new CookingMagazine("Look and Cook Edition2", "All good foods"));
		
		System.out.println("------");
			
		//magazine.sort(m1,m2) -> m1.getName().compareTo(m2.getName());
		System.out.println(magazine.toString());
		
		
		CookingMagazineComparator cookingComparator = new CookingMagazineComparator();
		//magazine.sort(CookingCategory.values(), cookingComparator);
		
		
	//	Arrays.sort(magazine,cookingComparator);
	}

}