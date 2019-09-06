public class InitArray3 {
	public static void main (String [] args) {
		final int myArrayLength=10;//constatnt(final) cannot be changed
		
		int [] myArray = new int [myArrayLength];
		//the length is 10
		
		//calculate value of each element 
		
		for (int control=0; control < myArray.length; control++)
		{
		myArray[control]=2+2*control; }

		System.out.printf("%s%8s%n", "Index", "Value");
		
		//display the results 
		
		for (int control=0; control<myArray.length; control++)
		{System.out.printf("%5d%8d%n", control, myArray[control]);
		}
	}
}