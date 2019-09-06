import java.util.Scanner;
 
public class Multiple {
    
	public static void main (String [] args) 
	{
 
 Scanner input = new Scanner (System.in); //creating scanner to take input       
 
 int num1;
        int num2; 
        int check;
         
        System.out.print ("Enter First Number: ");//taking input for first number
        num1 = input.nextInt();
        System.out.print ("Enter Second Number: ");//taking input for second number
        num2 = input.nextInt();
        check = num2%num1;//checking if multiple or not
         
        System.out.println ();
         
        if (check == 0)//checking if the remainder is zero
            System.out.printf ("The Number %d is a multiple of %d", num1, num2);
        else
            System.out.printf ("The Number %d is not a multiple of %d", num1, num2);
 
    }//end main
}//end class 