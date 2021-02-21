package main;
import java.util.HashMap;
import java.util.Scanner;

//Main class to run
public class App {
	
	public enum ProductType {
	      A, B, C, D
	    }
	
	// Function to check if value exists in enum ProductType
	public static boolean contains(String val) {

	    for (ProductType pt : ProductType.values()) {
	        if (pt.name().equalsIgnoreCase(val)) {
	            return true;
	        }
	    }

	    return false;
	}

	public static void main(String[] args) 
			               throws Exception {
		
		HashMap<String, Product> proMap = new HashMap<String, Product>();

		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many types of products would you like to purchase?");
		
		int pCount = scan.nextInt();
		
		for (int i = 0; i < pCount; i++) {
			scan = new Scanner(System.in);
			System.out.print("Enter product type A/B/C/D:");
			String pType = scan.nextLine().toUpperCase();
			
			if(contains(pType)) {
	  		  System.out.println("Quanty of product type " + pType +":");
			  int pQty = scan.nextInt();
			  
			  Product p = new Product(pType, pQty);
			  proMap.put(pType, p);
			}
			else {
				System.out.println("Invalid product type!");
			}
		}
		
		scan.close();
		
		PriceCalculate pc = new PriceCalculate(proMap);
		System.out.println("Price of A after discount: "+pc.applyPromotion1());
		System.out.println("Price of B after discount: "+pc.applyPromotion2());
		System.out.println("Price of C & D after discount: "+pc.applyPromotion3());
		System.out.println("The total amount after discount is => "+pc.calculateTotalDiscountedPrice()); //Displays the total price of the items selected
  }

}
