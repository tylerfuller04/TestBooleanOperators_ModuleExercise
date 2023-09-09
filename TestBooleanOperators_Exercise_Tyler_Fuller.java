import java.util.Scanner; // Import Scanner for user input

public class TestBooleanOperators_Exercise_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Define variables
		int number;
		
		// Prompt the user for a number
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		// Test whether a number is divisible by 2 AND 3
		if (number % 2 == 0 && number % 3 == 0)
			System.out.print(number + " is divisible by both 2 and 3");
		
		// Test whether a number is divisible by 2 OR 3
		// else if (number % 2 == 0 || number % 3 == 0)
			// System.out.print(number + " is divisible by 2 or 3");
		
		// Test whether a number is divisible by 2 or 3 BUT not by both
		else if (number % 2 == 0 ^ number % 3 == 0)
			System.out.print(number + " is divisible by 2 or 3, but not by both");
		
		// Number is not divisible 2 or 3
		else
			System.out.print(number + " is divisible by neither 2 nor 3");
	}
}