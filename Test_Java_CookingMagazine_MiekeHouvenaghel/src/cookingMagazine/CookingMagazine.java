package cookingMagazine;

import java.time.LocalDateTime;

public class CookingMagazine implements Comparable<CookingMagazine>{

	private String name;
	private LocalDateTime monthPublished;
	private String author;
	private String titleOfMagazine;
	
	private CookingCategory category;
	private CookingStyle style;
	private CookingMethod method;
	
	private Recipe recipe;

	public CookingMagazine(String name, String titleOfMagazine) {
		this.name = name;
		this.titleOfMagazine = titleOfMagazine;
		
	}
	
	public CookingMagazine(String name, String titleOfMagazine,LocalDateTime monthPublished, String author, CookingCategory category,CookingStyle style, 
		CookingMethod method,Recipe recipe) {
	this.name = name;
	this.titleOfMagazine=titleOfMagazine;
	this.monthPublished = monthPublished;
	this.author = author;
	this.category = category;
	this.style=style;
	this.method=method;
	this.recipe=recipe;
	}
	
	public String getName() {
		return this.name;
	}

	public String getTitleOfMagazine() {
		return this.titleOfMagazine;
	}
	
	public CookingCategory getCategory() {
		return this.category;
	}
	
	
	public void printIngredients() {
		this.recipe.getIngredients().forEach(System.out :: println);
	}
	
	
	@Override
	public String toString() {
		return "CookingMagazine [name=" + name + ", monthPublished=" + monthPublished + ", author=" + author
				+ ", titleOfMagazine=" + this.getTitleOfMagazine() + ", category=" + category + ", style=" + style + ", method="
				+ method + ", recipe=" + recipe + "]";
	}

	@Override
	public int compareTo(CookingMagazine cookingMagazine) {
		return this.name.compareTo(cookingMagazine.name); 
		
	}

	
	
	
}
