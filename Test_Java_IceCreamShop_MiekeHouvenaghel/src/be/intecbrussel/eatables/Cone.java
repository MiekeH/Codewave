package be.intecbrussel.eatables;

import java.util.Arrays;

import be.intecbrussel.eatables.Cone.Flavor;

public class Cone implements Eatable {
	//Comment MSH: used balls.length to capture number of balls ordered per cone...not sure if also had to add another count for
	// calculating the number of Cones instantiated, added this in the constructor, but not used.
	
	Flavor[] balls;
	int countOfCones = 1;

	public Cone () {
		
	}
	
	public Cone (Flavor[] balls) {
		this.balls = new Flavor[Flavor.values().length];
		this.balls = balls;
		countOfCones++;
	}
	
	
	public void eat() {
		System.out.println("You are eating a Cone with " +
	this.balls.length +" balls" +" with the exotic flavours of" + Arrays.toString(this.balls));
		
	}
		
	public int getCountOfCones () {
		return this.countOfCones;
	}
	
	public enum Flavor {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
		
	
		
	}

	
	
	
	
	
}
