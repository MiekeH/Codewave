package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2 {

	public static void main(String[] args) throws NoMoreIceCreamException {
	/*Comments MSH: Eatable array; no need to use anonymous class, just initializing link with classes that implements interface 
	 *Comments MSH: IceRocket: initial stock=1, order then stock=0 and replenished to 10. If initial stock value= 0 
	 * exception thrown and program stops.
	 *Comments MSH: for orderCone and orderMagni used a different coding in IceCreamCar-directly exception thrown if stock too low 
	 */ 
		
	PriceList priceList = new PriceList(2.5,3.4,3.8);
	Stock stock = new Stock(1,3,3,5);
	IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock,100);
	
	iceCreamCar.orderCone(new Cone.Flavor[] {Cone.Flavor.CHOCOLATE,Cone.Flavor.STRACIATELLA}).eat();
	iceCreamCar.orderIceRocket().eat();
	iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();
	
	Eatable[] eatable = new Eatable[3];
	eatable[0] = new Cone();
	eatable[1] = new IceRocket();
	eatable[2] = new Magnum();
	
	System.out.println(iceCreamCar.getProfit());
	
	}

}
