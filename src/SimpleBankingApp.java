import java.util.Scanner;

public class SimpleBankingApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String UserName;
		int StartBal;
		int UserChoice;
		int addAmount;
		int transferAmount;
		int totalAmount;
		
	
		System.out.print("Enter User Name: ");
		UserName = input.next();
		System.out.print("Enter Starting Balance: ");
		StartBal = input.nextInt();
		
		totalAmount = StartBal;
		
	
		do {
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Please Choose:");
			System.out.println("1--Check Balance");
			System.out.println("2--Add Funds");
			System.out.println("3--Transfer Funds");
			System.out.println("4--Exit the Program");
			System.out.print("Choice: ");
			UserChoice = input.nextInt();
			
				switch (UserChoice) {
				case 1: {
	                    System.out.println("User Name: " + UserName);
	                    System.out.println("Remaining amount: " + totalAmount);
	                    break;
	                    }
				case 2: {
					    System.out.print("Enter New Amount: ");
					    addAmount = input.nextInt();
					    totalAmount =totalAmount + addAmount;
					    System.out.println("Total Amount: " + totalAmount);
					    break;
				        }
				case 3: {
					    System.out.print("Enter Transfer Fund Amount: ");
				        transferAmount = input.nextInt();
				        totalAmount =totalAmount - transferAmount;
				        System.out.println("Total Amount: " + totalAmount);
				        break;
				        }
				
				
			
			    }
				
				
		}while(UserChoice < 4);
		System.out.println("Thank You!");
		

	}

}
