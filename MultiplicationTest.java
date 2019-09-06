import java.util.Scanner;

public class MultiplicationTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Multiplication mul = new Multiplication();
		String question = mul.createQuestion();
		
		do {
			//Display the question and get user's response
			System.out.print(question + "(Type 0 to quit) ");
			int userAnswer = input.nextInt();
			
			//With 0 as sentinel - lets break out of this loop
			if(userAnswer == 0) {
				break;
			}
			//Check if the user's input matches the answer, else repeat the question
			boolean isCorrect = mul.checkResponse(userAnswer);
			if(isCorrect) {
				System.out.println("Very Good");
				question = mul.createQuestion(); //Get the next question
			} else {
				System.out.println("No, please try again.");
			}
		} while (true);
		
		input.close(); //Close the scanner
	}//end main
}//end class