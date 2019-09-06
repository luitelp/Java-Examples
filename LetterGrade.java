import java.util.Scanner;

public class LetterGrade{
	public static void main (String [] args){
		
		int total=0; //sum of grades
		int gradeCounter=0; //number of grades entered
		int aCount=0;
		int bCount=0;
		int cCount=0;
		int dCount=0;
		int fCount=0;
		
		Scanner input= new Scanner (System.in);
		
		System.out.printf("%s%n%s%n %s%n %s%n",
		"Enter the integer grades in the range of 0-100:",
		"Type the end of the file indicator to terminate the input",
		"On UNIX/LINUX/macOS type <ctrl> d and then press Enter",
		"On Windows type <ctrl> z and then press Enter");
		
		//loop
		while (input.hasNext()) {
			//determine wether there is an input or not
			
			int grade = input.nextInt(); //read input 
			total= total +grade;
			gradeCounter++;//to find the number of inputs entered
			
			switch (grade/10) {
				case 9: //grade was between 90 and 99
				case 10: // grade was 100
				
				aCount++;
				break; //exits the switch
				
				case 8: //grade was between 80 and 89
				bCount++;
				break;
				
				case 7: //grade was between 70 to 79
				cCount++;
				break;
				
				case 6: //grade was between 60 to 69
				dCount++;
				break;
			
				default:
				fCount++;
				break;
				
			}// end switch
		}//end while
		
		if (gradeCounter !=0) {
			
			double average = (double)total/gradeCounter;
			
			System.out.printf ("Total number of grades entered is: %d%n",
			gradeCounter);
			System.out.printf ("The total of grades is: %d%n", total);
			System.out.printf ("The average is: %.2f", average);
			
			System.out.printf ("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
			"The number of students who received each grade",
			"A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount,
			"F: ", fCount);
			
		}//end if
		
		else {
			System.out.print ("No grades entered");
		}//end else
	}
}
				
			