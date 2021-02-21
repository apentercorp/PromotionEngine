package test;
import org.junit.Test;

import main.Product;
import main.Promotion;
import main.Promotion2;

public class Promotion2Test {

 	@Test
    public void Promotion2TestWithSampleValues() {
        
		Product p = new Product("B", 2);
		Promotion promotion = new Promotion2(p);
		
		float expected = 45;

		if(expected == promotion.applyPromotion()) {
			System.out.println("Test 2 passed");
		}
    }
}