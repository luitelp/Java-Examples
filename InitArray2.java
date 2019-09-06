public class InitArray2 {
	public static void main (String [] args) {
		int [] myArray= {32,27,64,18,95,14,90,70,60,37};
		//length is 10
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		//loop
		for(int control=0; control < myArray.length; control++)
			{
			System.out.printf ("%5d%8d%n", control, myArray[control]);
			
			}//end for
	}//end main
}//end class