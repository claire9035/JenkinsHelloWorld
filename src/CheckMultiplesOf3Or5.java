import java.util.Scanner;

public class CheckMultiplesOf3Or5 {

	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner(System.in);
		int number;
		int multiple3;
		int multiple5;
		boolean isTrue;
		
		System.out.print("Enter a number: ");
		number =  inputNumber.nextInt();
		
		multiple3 = number % 3;
		multiple5 = number % 5;
		
		//isTrue = ((multiple3 == 0) || (multiple5 == 0)) ? true : false;
		isTrue = ((multiple3 == 0) || (multiple5 == 0));
		System.out.println("Is the number " + number + " either a multiple of 3 or 5? " + isTrue);
		
		//if(isTrue) {
		//System.out.println("Is the number " + number + " either a multiple of 3 or 5? " + isTrue);
	    //}else {
		//	System.out.println("Is the number " + number + " either a multiple of 3 or 5? " + isTrue);
	   // }
		
        
		
		

	}

}
