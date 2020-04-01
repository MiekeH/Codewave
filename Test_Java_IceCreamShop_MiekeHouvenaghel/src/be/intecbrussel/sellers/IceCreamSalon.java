package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements IceCreamSeller {
	//??? number of ijsjes countOfIceCreamCordered
	
	private PriceList priceList;
	private double totalProfit;
	
	public IceCreamSalon(PriceList priceList) {
		this.priceList = priceList;
	}
	
	public double getProfit() {
		int coneProfit = this.orderCone(cone).getCountOfBalls()*priceList.getBallPrice();
		int iceRocketProfit = orderIceRocket()*priceList.getRocketPrice();
		int magnumProfit = orderMagnum(magnum)*priceList.getMagnumPrice(magnum);
		double totalProfit = coneProfit + iceRocketProfit + magnumProfit;
		return this.totalProfit;
	}
		
	
	//TO DO add price from order using profitList to totalProfit
	public Cone orderCone(Flavor[] balls) {
		Flavor [] flavor = new Flavor[Cone.Flavor.values().length];
		Cone cone = new Cone(flavor);
		
//		double increaseProfit(PriceList priceList) {
//		int coneBalls = this.orderCone(flavor).getCountOfBalls();
//		double coneProfit = coneBalls*priceList.getBallPrice();
//		}
//		public double coneProfit(PriceList priceList){
//		double coneProfit = getProfit() + this.orderCone(balls).getCountOfBalls()*priceList.getBallPrice();
//		return coneProfit;
//		}
//		
		return cone;
		}

	
	public IceRocket orderIceRocket() {
		IceRocket iceRocket = new IceRocket();
		return iceRocket;
		
		
	}
	
	public Magnum orderMagnum(MagnumType magnumType) {
		Magnum magnum = new Magnum(magnumType);
		//Magnum.MagnumType magnumType = Magnum.MagnumType.values();
		return magnum;
	}

	
	
	@Override
	public String toString() {
		return "IceCreamSalon [priceList=" + priceList + ", totalProfit=" + totalProfit + "]";
	}
	
	
	
	
}
