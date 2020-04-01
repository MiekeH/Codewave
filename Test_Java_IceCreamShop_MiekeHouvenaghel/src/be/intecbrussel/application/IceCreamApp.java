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
		
		PriceList priceList = new PriceList(2.20, 3.25, 3.50);
		IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
		IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);
		//ijsjes bestellen
		Magnum myMagnum = new Magnum(MagnumType.MILKCHOCOLATE);
		myMagnum.eat();
		iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE).eat();
				
		Flavor [] balls = {Cone.Flavor.STRACIATELLA,Cone.Flavor.MOKKA,Cone.Flavor.MOKKA};
		Cone myCone = new Cone(balls);
		myCone.eat();
		iceCreamSalon.orderCone(new Flavor[]{Cone.Flavor.STRACIATELLA, Cone.Flavor.MOKKA}).eat();
				
		IceRocket iceRocket = new IceRocket();
		iceCreamSalon.orderIceRocket();
		iceRocket.eat();

		
		System.out.println(priceList.getBallPrice());
		System.out.println(priceList.getRocketPrice());
		System.out.println(priceList.getMagnumPrice(Magnum.MagnumType.ROMANTICSTRAWBERRIES));		
		//call up toStringmethod in iceCreamSalon
		System.out.println(iceCreamSalon);
		//Array of Eatable
		Eatable[] eatable = new Eatable[]{myCone,myMagnum,iceRocket};
		//print out the Profit of the IceCreamSeller
		System.out.println(iceCreamSeller.getProfit());	
		

		
	}

}
