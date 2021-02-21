package test;
import org.junit.Test;

import main.Product;
import main.Promotion;
import main.Promotion3;

public class Promotion3Test {

    @Test
    public void Promotion3TestWithSampleValues() {
        
		Product p1 = new Product("C", 1);
		Product p2 = new Product("D", 1);
		Promotion promotion = new Promotion3(p1,p2);
		
		float expected = 30;
		
		if(expected == promotion.applyPromotion()) {
			System.out.println("Test 3 passed");
		}
    }
}