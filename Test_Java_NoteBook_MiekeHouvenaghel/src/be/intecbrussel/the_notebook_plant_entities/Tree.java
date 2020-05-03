package be.intecbrussel.the_notebook_plant_entities;

public class Tree extends Plant {
	private LeafType leafType;
		
	public Tree(String name) {
		super(name);
	}
	
	public Tree(String name, double height) {
		super(name, height);
	}

	public LeafType getLeafType() {
		return this.leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}
	
	@Override
	public String toString() {
		return String.format("Tree '%s'%n%s",
        		name, " with a " + getLeafType() +" leafType and " + "height of " +height + " m.");
	}
	
	

}
