public class lab10q3 

{
	public static void main(String[] args)
	{
		BankCustomer cust1 = new BankCustomer();
		BankCustomer cust2 = new BankCustomer();
		
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		SavingsAccount saver3 = new SavingsAccount();
		SavingsAccount saver4 = new SavingsAccount();
		
		cust2.addAccount(saver3,120);
		
		System.out.println("John has "+cust2.getNoAccounts()+" accounts");
		System.out.println("Total Balance is :"+cust2.getBalance());
		
		cust2.addAccount(saver4,140);
	
		System.out.println("John has "+cust2.getNoAccounts()+" accounts");
		System.out.println("Total Balance is :"+cust2.getBalance());

	}

}