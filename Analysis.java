//creating iteration with nested control statements
import java.util.Scanner;

public class Analysis {
	
	public static void main (String [] args) {
		
		Scanner input= new Scanner (System.in);
		
		int studentGrade=1; //control variable
		int passes=0;
		int fails=0;
		
		//create loop
		
		while (studentGrade <=10) {
			
			System.out.print ("Enter (1) for passes or enter (2) for fails: ");
			//ask for an input
			int grade= input.nextInt();//read the input
			
			if (grade==1) {
				passes=passes+1; //increment passes
			}//end if
			
			else {
				fails=fails+1; //increment fails
			}//end else
			
			studentGrade= studentGrade+1; //increment control variable
		
		}//end while

			System.out.printf ("Number of passes is: %d%n", passes);
			System.out.printf ("Number of fails is: %d%n", fails);
			
			
			if (passes> 8) {
				System.out.print ("Bonus to instructor");
			}//end if

	}// end main
}//end class
				