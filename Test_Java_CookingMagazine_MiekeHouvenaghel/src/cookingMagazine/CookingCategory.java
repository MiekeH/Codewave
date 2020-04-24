package cookingMagazine;

public enum CookingCategory {
	STARTER(1), SOUP(2), MAINDISH(3), DESSERT(4), APERO(5);
	
	private int orderNumber;
	
	CookingCategory(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getOrderNumber() {
		return this.orderNumber;
	}
	
	
	
	
}
