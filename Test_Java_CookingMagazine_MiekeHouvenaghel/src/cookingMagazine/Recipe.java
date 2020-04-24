package cookingMagazine;

public class Recipe {

	private String nameOfRecipe;
	private AuthorOfRecipe author;
	private IngredientsType ingredients;
	private String instructions;

	public Recipe() {

	}

	public Recipe(String nameOfRecipe, IngredientsType ingredients) {
		this(nameOfRecipe, null, ingredients, null);

	}

	public Recipe(String nameOfRecipe, AuthorOfRecipe author, IngredientsType ingredients, String instructions) {
		this.nameOfRecipe = nameOfRecipe;
		this.author = author;
		this.ingredients = ingredients;
		this.instructions = instructions;
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
			return "Recipe [nameOfRecipe=" + nameOfRecipe + ", authorOfRecipe=" + getFirstName() + "" + getLastName()
					+ ", ingredients=" + ingredients + ", instructions=" + instructions + "]";
		}

	}

	


}