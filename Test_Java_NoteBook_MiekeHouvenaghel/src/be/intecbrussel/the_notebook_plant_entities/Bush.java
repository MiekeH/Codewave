package be.intecbrussel.the_notebook_plant_entities;

public class Bush extends Plant  {
	private String fruit;
	private LeafType leafType;
		
	public Bush(String name) {
		super(name);
	}
	
	public Bush(String name, double height) {
		super(name,height);
	}

	public String getFruit() {
		return this.fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public LeafType getLeafType() {
		return this.leafType;
	}
	
	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return String.format("Bush '%s'%n%s",
        		name, " with fruits: "+ fruit + ", having " + getLeafType() +" leafType and " + "height of " +height + " m.");
	}
				
				




	
	
	
	
	
}
