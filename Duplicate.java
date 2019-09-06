import java.util.Scanner;

public class Duplicate

{
	public static void main(String[] args)

	{

		// An array of six numbers 
		int numbers[] = new int[6];
	
		//This variable stores how many unique values are in the array 
		int index = 0;
	
		//Scanner object 
		Scanner s = new Scanner(System.in);
	
		//This loop runs 6 times 
		for(int j=0;j<6;j++)

		{
	
			//Read input from the user 

			System.out.print("Enter number:");

			int t = s.nextInt();

			//This variable is used to check whether the above read variable is in the array or not 

			boolean exists = false;
			//If the element is out of bounds 

			if(t<20 || t>200){
				//Print a warning 

				System.out.printf("Warning: The given number is %d and it is not between the range 20-200\n",t);

				//continue 

				continue;
			}

			//Iterating over the array from 0 to index 

			for(int i=0;i<index;i++)

			{

				//If the number exists in the array 

				if(numbers[i]==t)

				{

					//Print to the console that element already exists 

					System.out.printf("%d has already been entered\n",t);

					//Element exists 

					exists=true;

					//Break the loop 

					break;

				}

			}
			
			//If the element doesn't exist in the element 
			

			if(!exists)

			{

				//Store the element at the index i in the numbers array 

				numbers[index]=t;

				//Pre incrementing the index 

				++index;

				//Printing the values into the array 

				for(int i=0;i<index;i++)

				{

					System.out.print(numbers[i]+" ");

				}

				//New line 

				System.out.println();

			}//end if
		}//end for
	}//end main
}//end class
