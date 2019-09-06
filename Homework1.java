import java.util.Scanner;

public class Homework1 
{
	public static void main(String[] args) 
	{
		// creating Scanner to obtain input 
		Scanner input = new Scanner(System.in);

	    int num;	// an integer for user input
		
		System.out.print("Enter an integer: ");
		num = input.nextInt();	// read an integer from user
		
		// if remainder is 0 after divide by 2, the number is an even number
		if (num % 2 == 0)
			System.out.printf("%d is an even number", num);	// display the integer as even number
		
		// if remainder is not zero after divide by 2, the number is an odd number
		if (num % 2 != 0)
			System.out.printf("%d is an odd number", num);	// display the integer as odd number
	
	}	// end main method

}//end class