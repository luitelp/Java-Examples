
import java.util.Scanner;

public class OddEven {

public static void main(String args[]){

//Scanner to read user input 

Scanner sc = new Scanner(System.in);

//To read three input start a loop from 0 to 2

for(int i=0; i<3; i++){

System.out.println("Enter integer " + (i+1));

int input = sc.nextInt();

//if number modulo 2 is equal to 0 then input number is even else it will be odd

if(input %2 == 0){

System.out.println(input + " is Even");

}else{

System.out.println(input + " is Odd");

}//end if

}//end for

}//end main

}//end class