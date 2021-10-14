import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		 int age;
		 boolean minor;
		 boolean adult;
		 boolean senior;
		 Scanner inputAge = new Scanner(System.in);
		 System.out.print("Age: ");
		 age = inputAge.nextInt();
		 
		 //message = (age2 < 18) ? "minor" : "adult";
			//System.out.println(message);
		 
			 minor = (age < 18) ? true : false;
			 System.out.println("minor ? " + minor);
		
		
			 adult = (age >= 18) ? true : false;
			 System.out.println("adult ? " + adult);
		
		
			 senior = (age >= 60) ? true : false;
			 System.out.println("senior ? " + senior); 
		
		 
	    /**if(age < 18) {
			 minor = (age < 18) ? true : false;
			 adult = (age < 18) ? false : true;
			 senior = (age < 18) ? false : true;
			 System.out.println("minor ? " + minor);
			 System.out.println("adult ? " + adult);
			 System.out.println("senior ? " + senior);
		 }else if(age < 60) {
			 minor = (age < 60) ? false : true;
			 adult = (age < 60) ? true : false;
			 senior = (age < 60) ? false : true;
			 System.out.println("minor ? " + minor);
			 System.out.println("adult ? " + adult);
			 System.out.println("senior ? " + senior); 
		 }else{
			 minor = (age >= 60) ? false : true;
			 adult = (age >= 60) ? true : false;
			 senior = (age >= 60) ? true : false;
			 System.out.println("minor ? " + minor);
			 System.out.println("adult ? " + adult);
			 System.out.println("senior ? " + senior);  
		 }*/
	

	}

}
