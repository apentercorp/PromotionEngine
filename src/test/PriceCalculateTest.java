package test;
import java.util.HashMap;

import org.junit.Test;

import main.PriceCalculate;
import main.Product;

public class PriceCalculateTest {

    @Test
    public void priceCalculateTestWithScenarioA() {
        
	    Product p1 = new Product("A", 1);
		Product p2 = new Product("B", 1);
		Product p3 = new Product("C", 1);

    	HashMap<String, Product> proMap = new HashMap<String, Product>();
		proMap.put("A", p1);
		proMap.put("B", p2);
		proMap.put("C", p3);
		
    	PriceCalculate pc = new PriceCalculate(proMap);
		
		float expected = 100;
		
		if(expected == pc.calculateTotalDiscountedPrice()) {
			System.out.println("Test ScenarioA passed");
		}
    }
    
    
    @Test
    public void priceCalculateTestWithScenarioB() {
        
	    Product p1 = new Product("A", 5);
		Product p2 = new Product("B", 5);
		Product p3 = new Product("C", 1);

    	HashMap<String, Product> proMap = new HashMap<String, Product>();
		proMap.put("A", p1);
		proMap.put("B", p2);
		proMap.put("C", p3);
		
    	PriceCalculate pc = new PriceCalculate(proMap);
		
		float expected = 370;
		
		if(expected == pc.calculateTotalDiscountedPrice()) {
			System.out.println("Test ScenarioB passed");
		}
    }
    
    @Test
    public void priceCalculateTestWithScenarioC() {
        
	    Product p1 = new Product("A", 3);
		Product p2 = new Product("B", 5);
		Product p3 = new Product("D", 1);

    	HashMap<String, Product> proMap = new HashMap<String, Product>();
		proMap.put("A", p1);
		proMap.put("B", p2);
		proMap.put("C", p3);
		
    	PriceCalculate pc = new PriceCalculate(proMap);
		
		float expected = 265;
		
		if(expected == pc.calculateTotalDiscountedPrice()) {
			System.out.println("Test ScenarioC passed");
		}
    }

    
}