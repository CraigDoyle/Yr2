import java.util.Scanner; 
public class lab6q2
{
   public static void main(String args[])
   {
	Scanner input = new Scanner(System.in);

		System.out.println("Enter no. of stars:" );  
        int number = input.nextInt();
		
		while (number!=-1)
		{
		
		 for(int i = 1; i <= number; i++) 
		 {
                System.out.print("*");
		 }
		 System.out.println("\nEnter no. of stars:" );  
        number = input.nextInt();
		}
   }
}