//counter-controlled iteration statement
import java.util.Scanner;

public class ClassAverage {
	public static void main (String [] args) {
		
		Scanner input= new Scanner (System.in);
		
		int gradeCounter= 1;
		int totalGrade= 0;
		
		//counter-controlled iteration
		while (gradeCounter <=10) {
			System.out.print ("Enter a grade: ");
			int mygrade= input.nextInt();
			
			totalGrade= totalGrade + mygrade; //update total grade
			gradeCounter= gradeCounter+1; //increase counter
		} //end while
		
		int myaverage= totalGrade/10; //find the average
		
		//display the result
		System.out.printf ("Total grade is %d%n", totalGrade);
		System.out.printf ("Average is %d%n", myaverage);
	}//end main
}//end class
