package cookingMagazine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CookingMagazineApp {

	public static void main(String[] args) {
		/* COMMENTS MSH: Instructions (procedure) set up as a String
		 * InterfaceCooking with abstract methods to be completed; 
		 */
		
		List<Object> listIngredients = new ArrayList<>();
		Object ingredient1 = Fruit.CHERRY;
		listIngredients.add(ingredient1);
		listIngredients.add(Fruit.CHERRY);
		listIngredients.add(Fruit.PAPAYA);
		listIngredients.add(Vegetables.CAULIFLOWER);
		listIngredients.add(Dairy.MILK);

		List<Recipe> listRecipe = new ArrayList<>();
		Recipe recipe = new Recipe();
		recipe.setIngredients(listIngredients);
		Recipe.AuthorOfRecipe author1 = recipe.new AuthorOfRecipe("Charlie", "Mousseux");
		Recipe.AuthorOfRecipe author2 = recipe.new AuthorOfRecipe("Jackie", "Rousseau");
		Recipe recipe1 = new Recipe("Smooth and fast", author2, listIngredients,
				"Lookup instructions www.yoghurt with a twist");
		Recipe recipe2 = new Recipe("Crazy lazy days", author2, listIngredients,
				"Lookup instructions www.yoghurt with a twist");
		Recipe recipe3 = new Recipe("kefi paja", author1, listIngredients, "Instructions under www.indianlahti");

		listRecipe.add(recipe3);
		listRecipe.add(recipe2);
		listRecipe.add(recipe1);

		System.out.println("------Print List recipe details");
		System.out.println(listRecipe.toString());

		System.out.println("------Print Magazine details");
		
		List<CookingMagazine> magazine = new ArrayList<>();

		CookingMagazine summerMagazine = new CookingMagazine("ZLook and Cook Summer Edition", "Beach Cooking Vibes",
				LocalDateTime.of(2020, 8, 1, 22, 8), "Mazzy your cook of the day", CookingCategory.APERO,
				CookingStyle.FLEMISH, CookingMethod.COLD, recipe2);

		CookingMagazine mayMagazine = new CookingMagazine("ALook and Cook May Edition", "Fresh Breeze",
				LocalDateTime.of(2020, 5, 1, 22, 9), "James Codson", CookingCategory.DESSERT, CookingStyle.FRENCH,
				CookingMethod.OVEN, recipe3);

		magazine.add(summerMagazine);
		magazine.add(mayMagazine);
		magazine.forEach(System.out::println);
		
		System.out.println("------sort op basis van ENUM klasse comparator CookingCategory");
		CookingMagazineComparator cookingComparator = new CookingMagazineComparator();
		magazine.sort(cookingComparator);
		// Collections.sort(magazine,cookingComparator);

		magazine.forEach(System.out::println);
		

		System.out.println("------remove magazine");

		magazine.remove(summerMagazine);

		for (CookingMagazine m : magazine) {
			System.out.println(m);
		}

		
			
		
	
	}

	

}