package be.intecbrussel.eatables;

public class Magnum implements Eatable {
	MagnumType type;
	
	
	public Magnum() {
		
	}
	
	public Magnum(MagnumType type) {
		
		this.type = type;
	}
	
	public void eat() {
		System.out.println("You are eating a Magnumtype:" +getType() + " with extra pricefactor of " +this.type.getMagnumTypeExtraPrice());
	}
	
	
	public MagnumType getType() {
		//Magnum.MagnumType type = MagnumType.values();
		//return this.type = Magnum.MagnumType.valueOf(type);
		return this.type;
			
	}
	
	
	public enum MagnumType {
						
		MILKCHOCOLATE(1.20),WHITECHOCOLATE(1.30),BLACKCHOCOLATE(1.50),ALPINENUTS(1.25),ROMANTICSTRAWBERRIES(1.6);
		
		private double magnumTypeExtraPrice;
		
		private MagnumType(double magnumTypeExtraPrice) {
			this.magnumTypeExtraPrice=magnumTypeExtraPrice;
		}

		public double getMagnumTypeExtraPrice() {
			return magnumTypeExtraPrice;
		}
		
		
		
	}


		
	
	
	
}
