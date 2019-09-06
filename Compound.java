//compound assignment operators
// c=c+1 or c+=1 they are same
// d=d-1 or d-=1 they are same
// c++ it uses the current value of c, and then increments c by 1
// ++c it increments c by 1, and then uses the current value of c
// d-- it uses the current value of d, and then decrements d by 1
// --d it decrements d by 1, and then uses the currentvalue of d

public class Compound {
	public static void main (String [] args) {
		
		int c=5;
		int d=3;
		
		System.out.printf ("c before post increment is: %d%n", c);
		System.out.printf ("post incrementing c is: %d%n", c++);
		System.out.printf ("the new value of c is: %d%n", c);
		System.out.printf ("c after incrementing is: %d%n", ++c);
		
		System.out.printf ("d before post increment is: %d%n", d);
		System.out.printf ("post incrementing d is: %d%n", d--);
		System.out.printf ("the new value of d is: %d%n", d);
		System.out.printf ("d after incrementing is: %d%n", --d);
		
	}//end main
}//end class