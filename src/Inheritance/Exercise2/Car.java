package Inheritance.Exercise2;

public class Car extends Vehicle {

	     Car() {
	    	 System.out.println("Building a car...");
	     }

		@Override
		public void drive() {
			System.out.println("Driving a car");
			//super.drive();
		}
	     
	     

		
	     
}
