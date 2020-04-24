package cookingMagazine;

import java.util.Comparator;

public class CookingMagazineComparator implements Comparator<CookingMagazine> {

	//sorteren op object van ENUM klasse CookingMagazine Category  een int index/element toevoegen in ENUM klasse 
	
	@Override
	public int compare(CookingMagazine cm1, CookingMagazine cm2) {
		System.out.println("check in CookingMagazineComparator" + cm1.getCategory() +" check in Cooking"
				+ "MagazineComparator cm2:" +cm2.getCategory());
		return cm1.getCategory().getOrderNumber()-cm2.getCategory().getOrderNumber();

	}
	
	
	
}
