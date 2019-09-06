import java.security.SecureRandom;
public class Multiplication {
	private int answer;
	//Create random multiplicands and generate the question
	public String createQuestion() {
		SecureRandom scr = new SecureRandom();
		int a = scr.nextInt(20-1 + 1) + 1; //rand.nextInt((max - min) + 1) + min;
		int b = scr.nextInt(20-1 + 1) + 1;
		
		answer = a * b;
		
		return "How much is " + a + " times " + b + " ?. ";
	}
	//Method returns true if the user's value matches the expected answer
	public boolean checkResponse(int value) {
		return value == answer;
	}//end main
}//end class
