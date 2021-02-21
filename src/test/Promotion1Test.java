package test;
import org.junit.Test;

import main.Product;
import main.Promotion;
import main.Promotion1;

public class Promotion1Test {

    @Test
    public void Promotion1TestWithSampleValues() {
        
		Product p = new Product("A", 5);
		Promotion promotion = new Promotion1(p);
		
		float expected = 230;
		
		if(expected == promotion.applyPromotion()) {
			System.out.println("Test 1 passed");
		}
    }
}