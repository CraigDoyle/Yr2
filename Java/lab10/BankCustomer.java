class BankCustomer
{

	private int noAccount;
	static int counter;
	private SavingsAccount[] accounts = new SavingsAccount [3];
	private String name;
	private String address;

	//constructor

	public BankCustomer()
	{
		name = "";
		address = "";
	}

	public BankCustomer(String theName, String theAddress)
	{
		name = theName;
		address = theAddress;
	}

	public void addAccount(SavingsAccount account)

    {

        account.setBalance(120);
        counter++;
        noAccount=counter;
    }

    public void addAccount(SavingsAccount account, double balance)
    {
        accounts[counter] = account;
        accounts[counter].setBalance(balance);
        counter++;
        noAccount=counter;
    }

	//getter

	public int getNoAccounts()
	{
		return noAccount;
	}

	public double getBalance()

	{
        double totalBalance=0;

        for(int i=0;i<noAccount;i++)
		{
            totalBalance+=accounts[i].getBalance();
        }
		return totalBalance;
	}

	public double getBalance2(SavingsAccount account)
	{
		return account.getBalance();
	}

}