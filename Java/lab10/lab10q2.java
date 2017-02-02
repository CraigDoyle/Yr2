import java.util.Scanner;
public class lab10q2
{
   public static void main(String args[])
   {
	  Scanner in = new Scanner(System.in);
	  
		
		SavingsAccount saver1;
		SavingsAccount saver2;

		saver1 = new SavingsAccount();
		saver2 = new SavingsAccount();
		
		saver1.setBalance(2000);
		saver2.setBalance(3000);
		saver1.setRate(4);
		saver2.setRate(4);

		System.out.println("Month 1: Account 1 has a balance of " +(saver1.getBalance() +saver1.calculateMonthlyInterest()));
		System.out.println("Month 2: Account 2 has a balance of " +(saver2.getBalance() +saver2.calculateMonthlyInterest()));
		
		saver1.setBalance(saver1.getBalance() +saver1.calculateMonthlyInterest());
		saver2.setBalance(saver2.getBalance() +saver2.calculateMonthlyInterest());
		saver1.setRate(5);
		saver2.setRate(5);
		
		System.out.println("Month 1: Account 1 has a balance of " +(saver1.getBalance() +saver1.calculateMonthlyInterest()));
		System.out.println("Month 2: Account 2 has a balance of " +(saver2.getBalance() +saver2.calculateMonthlyInterest()));
	
   }

}