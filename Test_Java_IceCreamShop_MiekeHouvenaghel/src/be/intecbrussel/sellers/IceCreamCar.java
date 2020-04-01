package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller {
	/* MSH comment: to be completed - exception thread in preparemethods if getStock data below 0.
	 * add Constructor to capture profit
	 */
	private PriceList priceList;
	private Stock stock;
	private double profit;
	
	public IceCreamCar(PriceList priceList, Stock stock) {
		this(priceList,stock,0.00);
		}
	
	public IceCreamCar(PriceList priceList, Stock stock, double profit) {
		this.priceList = priceList;
		this.stock = stock;
		this.profit = profit;
	}
	
	public Cone orderCone (Flavor[] balls) {
		prepareCone(balls);
		Cone cone = new Cone(balls);
		return cone;
	}
	
	private Cone prepareCone (Flavor[] balls) {
//	if (getBalls()) == 0 {
//		
//	}
//	else 
		return null;	
	}
	
	public IceRocket orderIceRocket() {
		prepareIceRocket();
		IceRocket iceRocket = new IceRocket();
		return iceRocket;
	}
	
	private IceRocket prepareIceRocket() {
		return null;
	}
	
	public Magnum orderMagnum(MagnumType type) {
		prepareMagnum(type);
		Magnum magnum = new Magnum(type);
		return magnum;
	
	}
	
	private Magnum prepareMagnum(MagnumType type) {
	return null;	
	}
	
	public double getProfit() {
		return this.profit;
	}
}

