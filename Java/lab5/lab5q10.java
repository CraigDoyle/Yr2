import java.util.Scanner; 
public class lab5q10
{
   public static void main(String args[])
   {
	Scanner in = new Scanner(System.in);
	
	int current,count=0;

		
	System.out.println("Enter any Integer:" );  
	current = in.nextInt();
	
	int high=current;
	int low=current;
	
	
	
	while (current!=0)
		{
			
			
			if (current>high)
			{
				high=current;
			}
			else if (current<low)
			{
				low=current;
			}
	 	count++;
		
		System.out.println("Enter any Integer, zero to exit" );  
		current = in.nextInt();
		}
		
	System.out.println("The largest number you entered was: "+high ); 
	System.out.println("The smallest number you entered was: "+low ); 
	System.out.println("The amount of numbers you entered was: "+count ); 
   }
}