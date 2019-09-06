//command line arguments
//java CommandLine 5 0 4
//the command line arguments are seperated by white space
//not command

public class CommandLine {
	public static void main (String [] args)
	
	{
		if(args.length !=3)
			{System.out.print("Error: Please re-enter the entire command,including an array size, initial value, and increment");
			}
		else {
			//get the array size from first command-line arguments
			
			int arrayLength=Integer.parseInt(args[0]);
			int [] myArray=new int [arrayLength];
			
			//get the initial value from the second command-line argument
			//get increment value from the third command-line argument
			
			int initialValue= Integer.parseInt(args[1]);
			int increment= Integer.parseInt(args[2]);
			
			for (int counter=0; counter<myArray.length; counter++)
				
				{myArray[counter]=initialValue+increment*counter;}
				
			System.out.printf("%s%8s%n", "Index", "Value");
			
			//display array index and value
			
			for (int counter=0; counter<myArray.length; counter++)
			{System.out.printf("5d%8d%n", counter, myArray[counter]);
			}//end for
		}
	}
			
}		
		