package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements IceCreamSeller {
	//Comment MSH: countOfIceCreamOrdered not captured; link methods with getProfit(); initial ProfitValue of the shop?
	//Constructor added to capture totalProfit to link with IceCreamSeller interface
	private PriceList priceList;
	private double totalProfit;
	
	public IceCreamSalon(PriceList priceList) {
		this.priceList = priceList;
	}

	public IceCreamSalon(PriceList priceList, double totalProfit) {
		this.priceList = priceList;
		this.setProfit(totalProfit);
	}

	public void setProfit(double totalProfit){
		this.totalProfit = totalProfit;
	}
		
	public double getProfit() {
		return this.totalProfit;
	}

	public Cone orderCone(Flavor[] balls) {
		Cone cone = new Cone(balls);
		this.totalProfit = (balls.length) * priceList.getBallPrice();
		return cone;
	}

	public IceRocket orderIceRocket() {
		IceRocket iceRocket = new IceRocket();
		this.totalProfit = priceList.getRocketPrice();
		return iceRocket;
	}
	
	public Magnum orderMagnum(MagnumType magnumType) {
		Magnum magnum = new Magnum(magnumType);
		this.totalProfit = priceList.getMagnumPrice(magnumType);
		return magnum;
	}

	

	
	
}
