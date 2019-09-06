//calculating compound interest
//formula is a=p(1+r)^n
//p is the original amound invested - 1000
//r is the interest rate - 0.05
//n is the number of years - 10
//a is the amount on deposit at the end of the nth years

public class CompoundInterest {
	public static void main (String [] args) {
		
		int principal = 1000;
		double rate = 0.05;
		
		//display header
		System.out.printf("%s%20s%n", "Year", "Amount on Deposit");
		//displays the value at least 20 characters position
		//right-justified
		
		//System.out.printf("%s%-20s%n", "Year", "Amount on Deposit");
		//left-justified
		
		//loop
		for (int year=1; year<=10; year++)
			
			{ double amount=principal*Math.pow(1+rate, year);
			
			System.out.printf("%4d%,20.2f%n", year, amount);
			//, is called formatting flag- grouping seperator
			}//end for
		
		
	}//end main
}//end class