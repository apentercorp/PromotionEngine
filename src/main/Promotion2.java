package main;

public class Promotion2 extends Promotion{

	Product product;
	
	public Promotion2(Product product) {
		this.product = product;
	}

	// Apply Promotion2 logic (2 of B's for 45)
	public float applyPromotion() {
		
		float itemPrice = product.getProductUnitPrice();
		discountedPrice = (product.pQty / 2) * 45 + (product.pQty % 2 * itemPrice);
		
		return discountedPrice;
	}
}
