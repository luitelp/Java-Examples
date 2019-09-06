public class AccountSavings{

   static double annualInterestRate;

   double savingsBalance;

   //constructor for class which creates object(account) with given balance

   AccountSavings(double balance) throws Exception{
      //validation whether the balance is greater than 0.0
      if(balance>0){

          savingsBalance=balance;

      }

      else{
          //If it is less than 0.0 then throw an exception
          throw new Exception();

      }

   }

   //calculates the monthly interest and modifies the savingsBalance

   void calculateMontlyInterest(){
      //method to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12 
      double montlyInterest=(savingsBalance*annualInterestRate)/12;

      savingsBalance=savingsBalance+montlyInterest;

   }

   //modifies the interest rate, if valid, else throws exception

   static void modifyInterestRate(double rate) throws Exception{

      if(rate>0&&rate<=1){

          annualInterestRate=rate;

      }

      else{

          throw new Exception();

      }

   }

   //overriding the toString method

   public String toString(){

      return ""+savingsBalance;

   }//end main

}//end class



