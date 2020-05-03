package be.intecbrussel.the_notebook_plant_entities;

public class Weed extends Plant {
	private double area;
		
	public Weed(String name) {
		super(name);
	}
	
	public Weed(String name, double height) {
		super(name, height);
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return String.format("Weed '%s'%n%s",
        		name, " with an area of " +area + "m and height of " +height + " m.");
	}
	
	
	
	
}
