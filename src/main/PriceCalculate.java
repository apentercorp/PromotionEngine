package main;

import java.util.HashMap;

public class PriceCalculate {

	HashMap<String, Product> proMap;
	float dp1=0, dp2=0, dp3=0;
	String msg;
	
	public PriceCalculate(HashMap<String, Product> proMap) {
		this.proMap = proMap;
	}
	
	// Returns price of A after applying promotion 
	public float applyPromotion1() {
			
		 Promotion promotion = new Promotion1(proMap.get("A"));
		 return promotion.applyPromotion();
	 }
	 
	// Returns price of B after applying promotion
	 public float applyPromotion2() {
			
		Promotion promotion = new Promotion2(proMap.get("B"));
		return promotion.applyPromotion();
	 }

	// Returns price of C & D after applying promotion
	 public float applyPromotion3() {
			
		 Promotion promotion = new Promotion3(proMap.get("C"),proMap.get("D"));
		 return promotion.applyPromotion();
	 }

	// Returns aggregate final price after applying all promotions
	public float calculateTotalDiscountedPrice() {
		
		// Check if Promotion 1 applies and calculate price for A
		if(proMap.containsKey("A")) {
			dp1 = applyPromotion1();
		}
		
		// Check if Promotion 2 applies and calculate price for B
		if(proMap.containsKey("B")) {
			dp2 = applyPromotion2();
		}
		
		// Check if Promotion 3 applies and calculate price for C and D
		if(proMap.containsKey("C") || proMap.containsKey("D")) {
			dp3= applyPromotion3();
		}
		
		return dp1+dp2+dp3;
	}

}
