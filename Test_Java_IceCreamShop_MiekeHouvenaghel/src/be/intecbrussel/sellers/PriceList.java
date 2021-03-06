package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;


public class PriceList {

	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;
	
	public PriceList() {
		
	}
	
	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
		this.setBallPrice(ballPrice);
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
	}
	
	public void setBallPrice(double ballPrice) {
		this.ballPrice=ballPrice;
	}
	
	
	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice=rocketPrice;
	}
	
	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice=magnumStandardPrice;
	}
	
	
	
	public double getBallPrice() {
		return this.ballPrice;
	}
	
	public double getRocketPrice() {
		return this.rocketPrice;
	}
	
	public double getMagnumPrice(MagnumType magnumType) {
		double priceOfMagnum;
		priceOfMagnum = magnumType.getMagnumTypeExtraPrice()*this.magnumStandardPrice;
		//System.out.println("Magnum" +magnumType+ "=" +magnumType.getMagnumTypeExtraPrice()*this.magnumStandardPrice);
		return priceOfMagnum;
		}
		
	
	}
	

