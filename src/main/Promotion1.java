package main;

public class Promotion1 extends Promotion{

	Product product;
	
	public Promotion1(Product product) {
		this.product = product;
	}
	
	// Apply Promotion1 logic (3 of A's for 130)
	public float applyPromotion() {
		
		float itemPrice = product.getProductUnitPrice();
		discountedPrice = (product.pQty / 3) * 130 + (product.pQty % 3 * itemPrice);
		
		return discountedPrice;
	}
}
