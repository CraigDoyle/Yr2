import java.util.Scanner; 
class lab4b
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		final double chipsBuy=0.30;
		final double chipsSell=0.75;
		int chipsSold;
		double chipsProfit;
		double chips;
		final double burgerBuy=0.40;
		final double burgerSell=0.96;
		int burgerSold;
		double burgers;
		double burgerProfit;
		double totalProfit;
		
		System.out.println("Chips Sold: " );  
        chipsSold= in.nextInt();
		System.out.println("Burgers Sold: " );  
        burgerSold= in.nextInt();
		
		chipsProfit=(chipsSell-chipsBuy);
		chips=(chipsProfit*chipsSold);
		
		burgerProfit=(burgerSell-burgerBuy);
		burgers=(burgerProfit*burgerSold);
		
		totalProfit=chips+burgers;
		
		System.out.println("Chips Profit: " +chips);  
		System.out.println("Burger Profit: " +burgers); 
		System.out.println("Total Profit: " +totalProfit); 
	}
}
		