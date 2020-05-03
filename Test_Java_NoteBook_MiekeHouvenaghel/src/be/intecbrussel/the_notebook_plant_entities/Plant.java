package be.intecbrussel.the_notebook_plant_entities;

public class Plant {
	protected String name;
	protected double height;
				
	public Plant(String name) {
		this.name=name;
	}
	
	public Plant(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
}
