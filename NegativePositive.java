import java.util.Scanner;
public class NegativePositive 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int num1;	// first integer user input
		int num2;	// second integer user input
		int num3;	// third integer user input
		int num4;	// fourth integer user input
		int num5;	// fifth integer user input
		int totalNegative=0;	// counts the total negative numbers input
		int totalPositive=0;	// counts the total positive numbers input
		int totalZero=0;	// counts the total numbers of zero input
		
	
		System.out.print("Enter 1st integer: ");	
		num1 = input.nextInt();	// read first integer
		
		System.out.print("Enter 2nd integer: ");	
		num2 = input.nextInt();	// read second integer
		
		System.out.print("Enter 3rd integer: ");	
		num3 = input.nextInt();	// read third integer
		
		System.out.print("Enter 4th integer: ");	
		num4 = input.nextInt();	// read fourth integer
		
		System.out.print("Enter 5th integer: ");	
		num5 = input.nextInt();	// read fifth integer
		
		// if any integer input is a negative number, add 1
		if (num1 < 0)
			totalNegative = totalNegative + 1;	
		
		if (num2 < 0)
			totalNegative = totalNegative + 1;
		
		if (num3 < 0)
			totalNegative = totalNegative + 1;
	
		if (num4 < 0)
			totalNegative = totalNegative + 1;
		
		if (num5 < 0)
			totalNegative = totalNegative + 1;
		
		// if any integer input is a positive number, add 1
		if (num1 > 0)
			totalPositive = totalPositive + 1;
		
		if (num2 > 0)
			totalPositive = totalPositive + 1;
		
		if (num3 > 0)
			totalPositive = totalPositive + 1;
		
		if (num4 > 0)
			totalPositive = totalPositive + 1;
		
		if (num5 > 0)
			totalPositive = totalPositive + 1;
		
		// if any integer input is zero, add 1
		if (num1 == 0)
			totalZero = totalZero + 1;
		
		if (num2 == 0)
			totalZero = totalZero + 1;
		
		if (num3 == 0)
			totalZero = totalZero + 1;
		
		if (num4 == 0)
			totalZero = totalZero + 1;
		
		if (num5 == 0)
			totalZero = totalZero + 1;
		
		System.out.println();
		System.out.printf("Total negative numbers: %d\n", totalNegative);	// display total input of negative numbers
		System.out.printf("Total postive numbers: %d\n", totalPositive);	// display total input of positive numbers
		System.out.printf("Total zeros: %d\n", totalZero);	// display total input of zero numbers

	} // end main

} // end class 