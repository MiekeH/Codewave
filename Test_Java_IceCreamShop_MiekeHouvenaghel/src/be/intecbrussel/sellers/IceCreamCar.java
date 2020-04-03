package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller {
	/* MSH comment: Used "Checked Exception" thrown in the order method, in the "finally block" link to preparemethod to ensure stock is 
	 * replenished, and that the order can be placed again; if no exception throw, then stock will be decreased when ordering; 
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
	
	public Cone orderCone (Flavor[] balls) throws NoMoreIceCreamException {
		try {
			if ((stock.getCones() == 0) || (balls.length) >= (stock.getBalls())) {
				throw new NoMoreIceCreamException("No more stock of cones or exotic balls,...prepare the stock");
			}

		} catch (NoMoreIceCreamException nmice) {
			System.out.println(nmice.getMessage());
			throw nmice;
		}

		finally {
		prepareCone(balls);
		}
		
		Cone cone = new Cone(balls);
		this.profit += (balls.length) * priceList.getBallPrice();
		stock.setBalls(stock.getBalls()-balls.length);
		stock.setCones(stock.getCones()-1);
		return cone;
	}

	private Cone prepareCone(Flavor[] balls) {
		Cone cone = new Cone(balls);
		if ((stock.getCones() == 0) || (balls.length) >= (stock.getBalls())) {
			stock.setBalls(stock.getBalls() + 25);
			stock.setCones(stock.getCones() + 10);
			System.out.println("Stock of Cones and Balls have been replenished, you can now place your order");
		}
		return cone;
	}

	public IceRocket orderIceRocket() throws NoMoreIceCreamException {
		try {
		prepareIceRocket();
		}
		
		catch (NoMoreIceCreamException nmice) {
		System.out.println(nmice.getMessage());
		throw nmice;
		}
		IceRocket iceRocket = new IceRocket();
		this.profit += priceList.getRocketPrice();
		stock.setIceRockets(stock.getIceRockets()-1);
		return iceRocket;
	}
	
	private IceRocket prepareIceRocket() throws NoMoreIceCreamException  {
		IceRocket iceRocket = new IceRocket();
		if (this.stock.getIceRockets() == 0) {
		throw new NoMoreIceCreamException("There are no more IceRockets in stock");
		}
		stock.setIceRockets(stock.getIceRockets() + 10);
		return iceRocket;
		
	}
	
	public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
		try {
		
		if (this.stock.getMagni() == 0) {
		throw new NoMoreIceCreamException("Damn, there are no more magni in stock, please supply immediately");
		}
		}
		
		catch (NoMoreIceCreamException nmice) {
			System.out.println(nmice.getMessage());
			throw nmice;
		}
		
		finally {
		prepareMagnum(type);
		}
		
		this.profit += priceList.getMagnumPrice(type);
		Magnum magnum = new Magnum(type);
		stock.setMagni(stock.getMagni()-1);
		return magnum;
	
	}
	
	private Magnum prepareMagnum(MagnumType type) {
		if(this.stock.getMagni() == 0) {
		stock.setMagni(stock.getMagni() + 15);
		}
		Magnum magnum = new Magnum(type);
		return magnum;	
	}
	
	public double getProfit() {
		return this.profit;
	}
}

