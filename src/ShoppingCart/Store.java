package ShoppingCart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sound.sampled.Line;




public class Store {
	
	   public static void main(String[] args) {
		    
		   shop();
	   	}
	
	     private Customer customer;
	     private Cashier cashier;
	     private List<Item> storeItems;
	     
	     
	     public Store(Customer customer, Cashier cashier) {
	   	 
	     }
     
	     
	     public static void shop() {
	    	 
              readStoreItemsFromFile("C:src\\ShoppingCart\\store-items.csv");
              
	     }	     
	     
	     
	    public static void readStoreItemsFromFile(String filename) {
	    	 int num;
	    	 List<Item> itemStores = new ArrayList<>();
	    	 List<Item> items = new ArrayList<>();
	    	
             Scanner input = new Scanner(System.in);
	    	 ShoppingCart shoppingCart = new ShoppingCart();
	    	 LocalDate date = LocalDate.now();
	    	 double totalPrice = 0;
	    	
	    	 //-----ReadFile
	    	  try {
					Scanner contents = new Scanner(new File(filename));
				   
					while(contents.hasNext()) {
				        String line = contents.nextLine();
				        String[] columns = line.split(",");
				        itemStores.add(new Item(columns[0],Double.parseDouble(columns[1])));
				   }
					contents.close();
				   }catch (FileNotFoundException e) {
					e.printStackTrace();
				  }
	    	  //-----ReadFile
	    	  
	    	 do {
	    		  System.out.println("------------------------------------------------------------------");
			      System.out.println("Press [1] Add item | [2] Remove item | [3] Checkout | [0] Exit");
			      System.out.println("------------------------------------------------------------------");
		    	  num = input.nextInt(); 
	    	 if(num == 0) { 
	    		     break;
	    	    }else{
	    		 
	    	   switch(num) {
	    	   
	    	   case 1: {
	    		 //cart items=========================
	    		 	System.out.println("Store Items");
	    		 	System.out.println("------------------------------------------------------------------");
	    		
	    		 	int i = 0;
				    for(Item itemContent: itemStores) {
					   System.out.println("["+i+"] " + itemContent.getName() + "  " + itemContent.getPrice());
					 i++;		
		             } 
				    
				   System.out.println("------------------------------------------------------------------");
	               System.out.println("[0] - [6] to select items");
			 	   System.out.print("Select item to add: ");
			 	   int selectNum = input.nextInt();
			 	   System.out.println("------------------------------------------------------------------");
		 	       System.out.println("Cart Items");
			 	   System.out.println("------------------------------------------------------------------");
			 	
			 	   if(selectNum >=0 && selectNum <=6) {
			 	     int a = 0;
			 	     
				     for(Item itemContent: itemStores) {
					   if(a == selectNum) {
					      //   System.out.println("["+a+"] " + itemContent.getName() + "  " + itemContent.getPrice());
					         items.add(new Item(itemContent.getName(),itemContent.getPrice()));
					     }
				         a++;	
				      }
			
				      shoppingCart.getItems(items);
				    }else{
			 	      System.out.println("Invalid input");		
			 	    }
			 	 
			 	    break;
			      }//=========================cart items
	    	   
	    	      
	    	    case 2:{
	    	    	 //remove items======================
			    	 if(items.isEmpty()){ 
			    		 System.out.println("Cart is empty. No items to remove.");
			    		 
			    	 }else {
			    	 System.out.println("------------------------------------------------------------------");
			 	     System.out.println("Cart Items");
				 	 System.out.println("------------------------------------------------------------------");
				 	
				 	 shoppingCart.getItems(items);
				 	      
				 	 int totalItemList = items.size() - 1;
				     System.out.print("Select item to remove: "); 
				     int remove = input.nextInt(); 
				     if(remove > totalItemList) {
				    	 System.out.println("Invalid Input"); 
				     }else { 
				    	 items.remove(remove);
				    	 System.out.println("------------------------------------------------------------------");
				    	 System.out.println("Cart Items"); 
				    	 System.out.println("------------------------------------------------------------------");

				    	 shoppingCart.getItems(items); 
				     }
				     }
			    	 
			    	 break;
			     }//===========================remove item
			         
	    	      
	    	    case 3: {
	    	    	//checkout======================================
	    	    	  
	    	    	 // printReceipt();
	    	    	
    	    		for(Item addCart: items) { 
    	    	         totalPrice += addCart.getPrice();
    	    	      }
    	    		
    	    		
    	    		
    	    		
    	    		
	    	    	if(items.isEmpty()){ 
	    	    		System.out.println("Cart is empty. No items to checkout.");
	    	    	}else {
	    	    	System.out.println("------------------------------------------------------------------");
	    	    	System.out.println("                            RECEIPT                               ");
	    	    	System.out.println("------------------------------------------------------------------");
	    	    	System.out.println("Cashier:  Jonathan      Shift: 08:00  -  18:00" );
	    	    	System.out.println("Date: " + date);
	    	    	System.out.println("------------------------------------------------------------------");
	    	    	System.out.println("Items:");
	    	    	shoppingCart.getItems(items); 
	    	    	System.out.println("------------------------------------------------------------------");
	    	    	System.out.println("TOTAL: " + totalPrice);
	    	    	System.out.println("------------------------------------------------------------------");
	    	    	}  

	    	    	//for writing receipt=============
	    	    	try {
						BufferedWriter writer = new BufferedWriter(new FileWriter("src/ShoppingCart/CartItems"));
						
						writer.write("------------------------------------------------------------------\n");
						writer.write("                            RECEIPT                               \n");
						writer.write("------------------------------------------------------------------\n");
						writer.write("Cashier:  Jonathan      Shift: 08:00  -  18:00\n");
						writer.write("Date: " + date + "\n");
						writer.write("------------------------------------------------------------------\n");
						writer.write("Items: \n");
						int i = 0 ; 
						  for(Item addCart: items) { 
							  writer.write("["+i+"] " + addCart.getName() + "  " + addCart.getPrice()+ "\n");
							  i++; 
						  }
						writer.write("------------------------------------------------------------------\n");
						writer.write("TOTAL: " + totalPrice + "\n");
						writer.write("------------------------------------------------------------------\n");
						writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//==============================for writing receipt
	    	        num = 5;
	    	    	break;
	    	    	  
	    	      }//=======================================checkout
	    	       
	         } //switch end block
	    	   
	     }//end block of if num == 0
	    	   
	    	   
	    	}while(num < 5);
	    	  System.out.println("Thank You!"); 
	 }//readStoreItemsFromFile end block
	    
	  
	    
	    
	    
	   public static void printReceipt() {
		 
	     }
	     
    
	     public void saveReceiptToFile(String filename) {
	    	 
	    	 
    	 
	     }
	     
	
}
