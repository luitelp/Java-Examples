class AccountSavingsTest{

   public static void main(String[] args){

      AccountSavings saver1=null,saver2=null;//initialise the objects

      try{

          //create objects in try-catch so that if exception is thrown, program doesn't terminates

          saver1=new AccountSavings(2000);

          saver2=new AccountSavings(3000);

      }

      catch(Exception e){

          System.out.println("Not valid balance to begin with");

      }

      try{

          //modify interest rate in try-catch to not suddenly terminate the program with exception

          saver1.modifyInterestRate(0.04);

      }

      catch(Exception e){

          System.out.println("Rate should be within 0 to 1 or 0% to 100%");

      }

      //print the data

      System.out.println("Monthly balances at 0.04 interest rate");

      //use printf to modify how we want to print

      //Doing to maintain a fixed column size for better presentation

      System.out.printf("%-20s%-20s%-20s\n","","saver1","saver2");

      System.out.printf("%-20s%-20s%-20s\n","Base","$2000.00","$3000.00");

      //Loop for next 12 months and print

      for(int i=1;i<=12;i++){

          saver1.calculateMontlyInterest();

          saver2.calculateMontlyInterest();

          //Since we want the balance in two decimals digits, we round it off with code below

          double saver1Balance=Math.round(Double.parseDouble(saver1.toString()) * 100.0) / 100.0;

          double saver2Balance=Math.round(Double.parseDouble(saver2.toString()) * 100.0) / 100.0;

          //print it

          System.out.printf("%-20s%-20s%-20s\n","Month "+i,"$"+saver1Balance,"$"+saver2Balance);

      }//end for

   }//end main

}//end class