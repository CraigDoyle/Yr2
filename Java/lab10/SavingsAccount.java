class SavingsAccount
{
int accNo = 0;
static int counter = 0;
static double annualInterestRate;
double savingsBalance;


public SavingsAccount()							// constructor
{
	
}
public SavingsAccount(double balance)
{
	counter = counter+1;
	accNo = counter;
	savingsBalance = 0;
}

public void setBalance(double balance)				//setters
{
	savingsBalance = balance;
}

public static void setRate(double rate)
{
	annualInterestRate = (rate/100);
	
}

public double getBalance()
{
	return savingsBalance;
}

public int getAccNo()
{
	return accNo;
}

public double getRate()
{
	return annualInterestRate;
}

public double calculateMonthlyInterest()
{
	return Math.round((savingsBalance*(annualInterestRate/12))*100)/100.00;
}

}