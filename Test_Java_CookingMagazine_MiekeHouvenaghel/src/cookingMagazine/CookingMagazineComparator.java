package cookingMagazine;

import java.util.Comparator;

public class CookingMagazineComparator implements Comparator<CookingMagazine> {

	//hoe sorteren op object? namelijk op CookingMagazine Category 
	
	@Override
	public int compare(CookingMagazine cm1, CookingMagazine cm2) {
		return cm1.getCategory()-cm2.getCategory();

	}
	
	
	
}
