package be.intecbrussel.eatables;

import java.util.Arrays;

import be.intecbrussel.eatables.Cone.Flavor;

public class Cone implements Eatable {
	//Comment/Question: MSH: added a countOfBalls, as assumed one cone can have multiple balls,...not sure if also had to add another count
	// calculating the number of Cones instantiated
	
	Flavor[] balls;
	int countOfBalls = 1;

	public Cone () {
		
	}
	
	public Cone (Flavor[] balls) {
		this.balls = new Flavor[Flavor.values().length];
		this.balls = balls;
		countOfBalls++;
	}
	
	
	public void eat() {
		System.out.println("You are eating a Cone with " +
	this.countOfBalls +" balls" +" with the exotic flavours of" + Arrays.toString(this.balls));
		
	}
		
	public int getCountOfBalls () {
		return this.countOfBalls;
	}
	
	public enum Flavor {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
		
	
		
	}

	
	
	
	
	
}
