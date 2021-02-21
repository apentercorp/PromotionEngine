package main;

public abstract class Promotion {
	
	float discount = 0, totalPrice = 0, discountedPrice = 0;

	public float applyPromotion() {
		return discountedPrice;
	}

}
