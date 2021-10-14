package Inheritance.Exercise1;


public class CompanyDemo {

	public static void main(String[] args) {
		   
		  
		  // Employee employee = new Employee();
		   Manager manager = new Manager();
		   
		   manager.id = 101234;
		   manager.ename = "John Peter";
		   manager.email = "john.peter@accenture.com";
		   manager.vacationDays = 20;
		   manager.numberOfReportees = 10;
		   
		  // employee.printDetails();
		   manager.printDetails();

	}

}
