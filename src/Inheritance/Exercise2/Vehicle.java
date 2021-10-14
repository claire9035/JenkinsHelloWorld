package Inheritance.Exercise2;

public class Vehicle {

      int doors;
      int seats;
      int wheels;
      
     Vehicle() {
    	  System.out.println("Building a vehicle...");
     }
      
      public Vehicle(int d, int s, int w) {
    	 this.setDoors(d);
    	 this.setSeats(s);
    	 this.setWheels(w);
      }
      

	public void drive() {
		 System.out.println("Driving a Vehicle");
		
        }

    

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	
	
 
	
}
