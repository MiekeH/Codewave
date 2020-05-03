package cookingMagazine;

import java.util.List;

public class Recipe {

	private String nameOfRecipe;
	private AuthorOfRecipe author;
	private List<Object> ingredients;
	private String instructions;

	public Recipe() {

	}

	public Recipe(String nameOfRecipe, List<Object> ingredients) {
		this(nameOfRecipe, null, ingredients, null);

	}

	public Recipe(String nameOfRecipe, AuthorOfRecipe author, List<Object> ingredients, String instructions) {
		this.nameOfRecipe = nameOfRecipe;
		this.author = author;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	public List<Object> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Object> ingredients) {
		this.ingredients=ingredients;
	}

	class AuthorOfRecipe {
		private String firstName;
		private String lastName;

		public AuthorOfRecipe(String firstName, String lastName) {
			this.setFirstName(firstName);
			this.setLastName(lastName);
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "AuthorOfRecipe [firstName=" + firstName + ", lastName=" + lastName + "]";
		}

		
	}

	@Override
	public String toString() {
		return "Recipe [nameOfRecipe=" + nameOfRecipe + ", author=" + author + ", ingredients=" + ingredients
				+ ", instructions=" + instructions + "]";
	}
		


//
//    @Override
//    public String toString() {
//
//        return String.format("%n%s%n%s%nrecipe by%s%nList of ingredients%n%n%s%n%nInstructions%n%s%n",
//               "-".repeat(30),name,  author,printMap(), instructions);
//    }

	




}