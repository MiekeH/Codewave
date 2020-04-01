package be.intecbrussel.eatables;

public class Magnum implements Eatable {
	MagnumType type;
	
	
	public Magnum() {
		
	}
	
	public Magnum(MagnumType type) {
		
		this.type = type;
	}
	
	public void eat() {
		System.out.println("You are eating a Magnum " +getType());
	}
	
	
	public MagnumType getType() {
		return this.type;
			
	}
	
	
	public enum MagnumType {
						
		MILKCHOCOLATE(1.20),WHITECHOCOLATE(1.30),BLACKCHOCOLATE(1.50),ALPINENUTS(1.25),ROMANTICSTRAWBERRIES(1.5);
		
		private double magnumTypeExtraPrice;
		
		private MagnumType(double magnumTypeExtraPrice) {
			this.magnumTypeExtraPrice=magnumTypeExtraPrice;
		}

		public double getMagnumTypeExtraPrice() {
			return magnumTypeExtraPrice;
		}
		
		
		
	}


		
	
	
	
}
