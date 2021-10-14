package ShoppingCart;

import java.util.List;
import java.util.Scanner;

public class ShoppingCart{
	
	private List<Item> items;
	
    public List<Item> getItems(List<Item> items){
    	
		  int i = 0 ; 
		  for(Item addCart: items) { 
			  System.out.println("["+i+"] " + addCart.getName() + "  " + addCart.getPrice()); 
			  
			  i++; 
		  }
		 
		  return items; 
    	 
    }   
    
    
	public void addItem(Item item) {
		
    }
    
	
    public void removeItem(Item item) {
    	
    }
    
    
    
 //  public double computeTotalPrice() {
	   
	// }

	
    	
    	

	
	
	
	
	
	
	
	
	
       
}
