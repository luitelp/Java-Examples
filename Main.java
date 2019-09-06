public class Main {

	public static void main(String[] args) {

		//System.out.println("Hello World");

		AccountSavings saver1=new AccountSavings();

		AccountSavings saver2=new AccountSavings();

		saver1.setSavingsBalance(2000);

		saver2.setSavingsBalance(3000);

		System.out.println("Balances: ");

		System.out.println("\t\t Saver1\t\t\t\tSaver2");

		System.out.println("base\t\t"+saver1.getBalance()+"\t\t\t\t"+saver2.getBalance());

		for(int i = 0; i < 12; i++){

			saver1.calculateMonthlyInterest();

			saver2.calculateMonthlyInterest();

			System.out.println("Month"+(i+1)+" : \t"+saver1.toString()+"\t\t"+saver2.toString());

		}

	}

}