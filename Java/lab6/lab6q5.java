import java.util.Scanner; 
public class lab6q5
{
   public static void main(String args[])
   {
	Scanner input = new Scanner(System.in);

	final double prodOne= 2.98;
	final double prodTwo= 4.50;
	final double prodThree= 9.98;
	final double prodFour= 4.49;
	final double prodFive= 6.87;
	
	
	
		System.out.println("Enter product number");
		int product=input.nextInt();
	
	switch (product)
	{
		
		case 1:
				System.out.print("Please enter Quantity sold for Product 1 : ");
 				int quantity = input.nextInt();
				double price = (prodOne*quantity);
				System.out.println("Retail value of goods sold is : "+price);
 				break;
		case 2:
				System.out.print("Please enter Quantity sold for Product 2 : ");
 				quantity = input.nextInt();
				price = (prodTwo*quantity);
				System.out.println("Retail value of goods sold is : "+price);
 				break;
		case 3:
				System.out.print("Please enter Quantity sold for Product 3 : ");
 				quantity = input.nextInt();
				price = (prodThree*quantity);
				System.out.println("Retail value of goods sold is : "+price);
 				break;
		case 4:
				System.out.print("Please enter Quantity sold for Product 4 : ");
 				quantity = input.nextInt();
				price = (prodFour*quantity);
				System.out.println("Retail value of goods sold is : "+price);
 				break;
		case 5:
				System.out.print("Please enter Quantity sold for Product 5 : ");
 				quantity = input.nextInt();
				price = (prodFive*quantity);
				System.out.println("Retail value of goods sold is : "+price);
 				break;
		default:
					System.out.println("You entered an invalid number");	
   }
   }
}