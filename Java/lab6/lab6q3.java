import java.util.Scanner; 
public class lab6q3
{
   public static void main(String args[])
   {
	Scanner input = new Scanner(System.in);

		System.out.println("Enter any Integer:" );  
        int number = input.nextInt();
		 for(int i = number; i>=1; i--) 
		 {
			 System.out.println("");
			for(int j = i; j >= 1; j--) 
				{
					System.out.print("* ");
				}
            
            System.out.print("\n");
		 }
   }
}