package main;

public class Product {
	
	String pType;
	int pQty;
	float price; 
    
    public Product(String pType, int pQty) {
        this.pQty = pQty;
        this.pType = pType;
    }

    // Returns price of a single unit of a specific product type
    public float getProductUnitPrice() {
        switch (pType)
        {
            case "A":
            	price = 50;
                break;
            case "B":
                price = 30;
                break;
            case "C":
                price = 20;
                break;
            case "D":
                price = 15;
        }  
        
        return price;
    }
    
   
    // Returns total price of a specific product type
    public float getProductTotalPrice(){
    	
    	return price * pQty;
    }
    
}
