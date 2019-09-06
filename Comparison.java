import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
        //declare string variables
		String String1, String2;
		Scanner sc = new Scanner(System.in);
		int index1, index2, n;
        
		//read the first string
		System.out.print("Enter the First string: ");
		String1= sc.nextLine();
        
		//read the second string
		System.out.print("\nEnter the Second string: ");
		String2 = sc.nextLine();
  
		//read the start index from where to start comparision
		System.out.print("\nEnter the index in String1 from where to compare: ");
		index1 = sc.nextInt();
		System.out.print("\nEnter the index in String2 from where to compare: ");
		index2 = sc.nextInt();
  
		//read number of characters to be compared
		System.out.print("\nHow many characters do you want to compare? ");
		n = sc.nextInt();
		
		
		if(String1.regionMatches(true, index1, String2, index2, n))
		//if the compared characters match
		System.out.println("\n"+n + " character starting at " + index1 + " of s1 MATCH " + n + " characters starting at " + index2 + " of s2");
		else
		 //If not match
		System.out.println("\n"+n + " character starting at " + index1 + " of s1 DO NOT match " + n + " characters starting at " + index2 + " of s2");
  
	}//end main

}//end class