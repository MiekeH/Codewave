package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

	public static void main(String[] args) {
		//Comment MSH: Flavor [] balls = {Cone.Flavor.STRACIATELLA,Cone.Flavor.MOKKA,Cone.Flavor.MOKKA};
		//Cone myCone = new Cone(balls);
		//Eatable array not complete;
		PriceList priceList = new PriceList(1, 2, 3);
		IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList,50);
		IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList,50);
				
		iceCreamSalon.orderCone(new Flavor[]{Cone.Flavor.STRACIATELLA, Cone.Flavor.MOKKA}).eat();
		iceCreamSalon.orderIceRocket().eat();
		iceCreamSalon.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES).eat();
				
		//Eatable[] eatable = new Eatable[]{cone,magnum,iceRocket};
			
		System.out.println(iceCreamSeller.getProfit());	
		
		
		
	}

}
