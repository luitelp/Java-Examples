public class MultidimensonalArray {
	public static void main (String [] args) {
		
	int [][] array1= {1,2,3}, {4,5,6}};
	int [][] array2= {{1,2}, {3}, {4,5,6}};
	
	//int [][] array1=new int [3][4];
	//int [][] array2=new int [2][];//create 2 rows
	//int [0] array2=new int [3];//create 3 columns for the first row
	//int [1] array2=new int [2];//create 2 columns for the second row
	
	System.out.println("The values of array1");
	outputArray(array1);
	
	System.out.println("The value of array2");
	outputArray(array2);
	
	}//end main

public static void outputArray (int [][]array) {
	//loop 
	for (int counter=0; counter < array.length; row++)
		{ for(int column=0; column< array[row].length; column++)
			{System.out.printf("%d",array[row][column];}//end loop
			System.out.println();
		}//end loop
	}//end method
}//end class
			