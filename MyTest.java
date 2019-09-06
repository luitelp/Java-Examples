import java.util.Scanner;

public class MyTest {

   public static void main(String[] args) {
      
       boolean playAgain = true;
      
       //while loop is used to re-run the quiz if user wants to play again
       while (playAgain == true) {
          
           int numberCorrectAnswer = 0;// To keep track of number of correct answers

           System.out.println("This quiz includes three questions about the Java programming language");
           System.out.println("Each question has four possible answers");
           System.out.println("Type 0 whenever you want to exit the quiz"); 
           System.out.println();

           //Question 1
           System.out.println("Question 1: Which of the following file extension types store the source code?");
           System.out.println("1. .java ");
           System.out.println("2. .class");
           System.out.println("3. .source");
           System.out.println("4. .code");
           System.out.println();
           System.out.println("Enter your answer");

           Scanner scan1 = new Scanner(System.in);

           int optionChosen1 = scan1.nextInt();  //Option chosen by the user for question 1

           if(optionChosen1 == 0) {

               System.out.println("Exit ...");
               System.exit(0);

           }

           else if(optionChosen1 == 1) {
               System.out.println("The answer is correct");
               numberCorrectAnswer = numberCorrectAnswer + 1;
           }

           else {

               System.out.println("Correct answer: .java");

           }


           //Question 2
           System.out.println();
           System.out.println("Question 2: Which of the following commands is used to compile source code?");
           System.out.println("1. javac ClassName.java");
           System.out.println("2. java ClassName.java");
           System.out.println("3. javaw ClassName");
           System.out.println("4. javac ClassName");
           System.out.println("Enter your answer");

           Scanner scan2 = new Scanner(System.in);

           int optionChosen2 = scan2.nextInt();     ////Option chosen by the user for question 2

           if(optionChosen2 == 0) {

               System.out.println("Exit ...");
               System.exit(0);

           }

           else if(optionChosen2 == 1) {
               System.out.println("The answer is correct");
               numberCorrectAnswer = numberCorrectAnswer + 1;
           }

           else {

               System.out.println("Correct answer: javac ClassName.java");

           }

           //Question 3
           System.out.println();
           System.out.println("Question 3: Which of the following words is NOT a keyword in java?");
           System.out.println("1. public");
           System.out.println("2. void");
           System.out.println("3. static");
           System.out.println("4. String");
           System.out.println("Enter your answer");

           Scanner scan3 = new Scanner(System.in);

           int optionChosen3 = scan3.nextInt();       ////Option chosen by the user for question 3

           if(optionChosen3 == 0) {

               System.out.println("Exit ...");
               System.exit(0);

           }

           else if(optionChosen3 == 4) {
               System.out.println("The answer is correct");
               numberCorrectAnswer = numberCorrectAnswer + 1;
           }

           else {

               System.out.println("Correct answer: String");
               System.out.println();
           }
          
           if (numberCorrectAnswer == 3) {
               System.out.println("Excellent!");
           }
          
           else if (numberCorrectAnswer == 2) {
               System.out.println("Very Good");
           }
          
           else {
               System.out.println("It is time to start to learning Java");
           }
          
           System.out.println();
           System.out.println("Do you want to play again?");
          
           Scanner scan4 = new Scanner(System.in);
           playAgain = scan4.nextBoolean();  
          
       }
      
       System.out.println("Good Bye!");
      

   }//end main

}//end class