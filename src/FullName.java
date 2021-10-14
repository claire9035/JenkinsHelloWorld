import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		
		String Firstname;
		String Lastname;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		Firstname = input.next();
		System.out.print("Enter last name: ");
		Lastname = input.next();
		System.out.println("Your full name is " + Firstname + " " + Lastname);
		
		String newName = Firstname.concat(" " + Lastname);
		System.out.println(newName);
		System.out.println("Claire Rodriguez");
		
	}

}
