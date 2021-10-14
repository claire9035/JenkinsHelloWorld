package Inheritance.Exercise2;

public class Parking {

	public static void main(String[] args) {
		
	    Vehicle vehicle = new Vehicle();
	    
		Vehicle vehicle2 = new Vehicle(0, 0, 0);
		System.out.println("      number of doors = " + vehicle2.getDoors());
		System.out.println("      number of seats = " + vehicle2.getSeats());
		System.out.println("      number of wheels = " + vehicle2.getWheels());
		System.out.println("  ");
		
	
		Car car = new Car();
		
	    Vehicle vehicle3 = new Vehicle(4, 5, 4);
        System.out.println("     number of doors = " + vehicle3.getDoors());
        System.out.println("     number of seats = " + vehicle3.getSeats());
        System.out.println("     number of wheels = " + vehicle3.getWheels());
		
		car.drive();
		
		
		
		
		

	}

}
