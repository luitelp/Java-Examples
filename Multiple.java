import java.util.Scanner;//importing scanner for input

public class Multiple {

    public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");//prompt for first number
       
	   int n1 = in.nextInt();
        System.out.print("Enter second number: ");//prompt for second number
        
		int n2 = in.nextInt();
        
		if(n1 % n2 == 0) {//if the remainder is zero 
            System.out.println(n1 +  " is a multiple of " + n2);
        } else {
            System.out.println(n1 +  " is not a multiple of " + n2);
        }//end if
    }//end main

}//end class