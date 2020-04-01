package be.intecbrussel.sellers;

public class IceCreamCar implements IceCreamSeller {

	private PriceList pricelist;
	private Stock stock;
	private double profit;
	
	public IceCreamCar(PriceList pricelist, Stock stock) {
		this.pricelist = pricelist;
		this.stock = stock;
	}
	
	///CHECK TO COMPLETE/////
	public Cone orderCone (Flavor[] balls) {
		return -1;
	}
	
	private Cone prepareCone (Flavor[] balls) {
	return -1;	
	}
	
	public IceRocket orderIceRocket() {
	return -1;	
	}
	
	private IceRocket prepareIceRocket() {
		return -1;
	}
	
	public Magnum orderMagnum(MagnumType type) {
		
	}
	
	private Magnum prepareMagnum(MagnumType type) {
		
	}
	
	public double getProfit() {
		
	}
}

