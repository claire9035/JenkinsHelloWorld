import java.util.Scanner;

public class CommandLineCalculator {

	public static void main(String[] args) {
		
		Scanner EnterNumber = new Scanner(System.in);
		int function;
		int FirstInput;
		int SecondInput;
		
		do {
			
			System.out.println("Please Enter Selected Function.");
			System.out.println("1--Add");
			System.out.println("2--Subtract");
			System.out.println("3--Multiply");
			System.out.println("4--Divide");
			System.out.println("5--Exit the program");
			System.out.print("Please Enter Selected Function: ");
			function = EnterNumber.nextInt();
			
			while(function != 5) {
				System.out.print("Enter First Number: ");
				FirstInput = EnterNumber.nextInt();
				System.out.print("Enter Second Number: ");
				SecondInput = EnterNumber.nextInt();
				
				switch (function) {
				case 1: {
					System.out.println("The sum is: "+ (FirstInput + SecondInput));
					break;
				    }
				case 2: {
					System.out.println("The difference is: "+ (FirstInput - SecondInput));
					break;
				    }
				case 3: {
					System.out.println("The product is: "+ (FirstInput * SecondInput));
					break;
				    }
				case 4: {
					System.out.println("The quotient is: "+ (FirstInput / SecondInput));
					break;
				    }
				}
				break;
			 }
			
			   
			}while(function < 5);
		    System.out.println("Thank You!");
		
		
		
		    
		   
			
		
		
	}
		

}


