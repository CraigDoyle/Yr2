import java.util.Scanner; 
public class lab5q9
{
   public static void main(String args[])
   {
	Scanner in = new Scanner(System.in);
	
	int index=0, current=0, high=0;
	
	for(index=0;index<10;index++)
		{
			System.out.println("Enter any Integer:" );  
			current = in.nextInt();
			
			if (current>high)
			{
				high=current;
			}
	 	
		}
		
	System.out.println("The largest number you entered was: "+high ); 
   
   }
}