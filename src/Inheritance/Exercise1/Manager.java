package Inheritance.Exercise1;

public class Manager extends Employee {

	       int numberOfReportees;
	       
	       @Override
	       public void printDetails() {
	    	   super.printDetails();
	    	   System.out.println("Number of Reportess : " + numberOfReportees);
	       }
	       
}
