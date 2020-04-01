package be.intecbrussel.eatables;

import java.util.Arrays;

import be.intecbrussel.eatables.Cone.Flavor;

public class Cone implements Eatable {
	//Comment MSH: added a countOfBalls, as assumed one cone can have multiple balls,...	
	Flavor[] balls;
	int countOfBalls = 1;
	
//	{
//		countOfBalls++;
//	}
	
	public Cone () {
		
	}
	
	public Cone (Flavor[] balls) {
		this.balls = new Flavor[Flavor.values().length];
		this.balls = balls;
		countOfBalls++;
	}
	
	
	public void eat() {
		System.out.println("You are eating a Cone with " +this.countOfBalls +" balls" +" with the exotic flavours of" + Arrays.toString(this.balls));
		
	}
	
	
	
	
	
	public int getCountOfBalls () {
		return this.countOfBalls;
	}
	
	public enum Flavor {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
		
		public Flavor[] getValues() {
			return Flavor.values();
		}
	}

	
	
	
	
	
}
