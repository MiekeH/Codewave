package be.intecbrussel.the_notebook_animal_entities;

public class Animal {
	protected String name;
	protected double weight;
	protected double height;
	protected double length;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length =length;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

}
