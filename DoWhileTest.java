//creating do...while

public class DoWhileTest {
	
	public static void main (String [] args) {
	
	int counter=1; //control variable
	
	do {
		
		System.out.printf("%d%n", counter);
		//the body executes at least once
		counter++;
		
	}
	while (counter<=10);
	System.out.println();
	
	}
}