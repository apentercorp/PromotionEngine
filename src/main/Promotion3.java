package main;

public class Promotion3 extends Promotion{

	Product productC;
	Product productD;
	
	public Promotion3(Product productC, Product productD) {
		this.productC = productC;
		this.productD = productD;
	}
	
	// Calculate discount in case C & D are purchased together
	public float calculateDiscount() {
		int lower = 0;
		float dis = 0;
		
		if(productC != null && productD != null) {
		  lower = Math.min(productC.pQty,productD.pQty);
		
		  float totalUnitPrice = productC.getProductUnitPrice() + productD.getProductUnitPrice();
		
 		  if(lower > 0) {
			dis = ((totalUnitPrice) * lower) - (30 * lower);
		  }
		
		}
		
		return dis;
	}
	
	// Apply Promotion3 logic (C & D for 30)
	public float applyPromotion() {
		
		float cPrice = 0, dPrice = 0;
		
		if(productC != null) {
			productC.getProductUnitPrice();
			cPrice = productC.getProductTotalPrice(); 
		}		
		
		if(productD != null) {
			productD.getProductUnitPrice();
			dPrice = productD.getProductTotalPrice();
		}
		
		totalPrice = cPrice + dPrice;
		
		// Calculate applicable discount
		discount = calculateDiscount();
		
		discountedPrice = totalPrice - discount;

		return discountedPrice;
	}
	
}
