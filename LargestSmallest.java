//importing scanner for input
import java.util.Scanner;
public class LargestSmallest{//declaring class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 15 numbers one by one");//prompt for user to input 15 numbers
		int number = sc.nextInt();
		int max = number, min = number, counter = 1;//allocating values to the inputs

		while(counter < 15)//there are 15 numbers

		{
			number = sc.nextInt();
			if(number < min)
				min = number;//finding the smallest
			if(number > max)
				max = number;//finding the largest
			counter++;

		}

		System.out.println("Largest is "+max);//printing the largest number
		System.out.println("Smallest is "+min);//printing the smallest number

		}//end main

}//end class