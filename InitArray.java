public class InitArray {
	public static void main (String [] args) {
		int [] myArray = new int [10];
		System.out.printf("%s%8s%n", "Index", "Value");
		//loop
		for (int control=0; control < myArray.length; control++)
			
		{System.out.printf("%5d%8d%n", control, myArray[control]);
		}//end for
	}//end main
}//end class