import java.util.Scanner; 
public class lab6q1
{
   public static void main(String args[])
   {
	Scanner input = new Scanner(System.in);

		System.out.println("Enter any Integer:" );  
        int number = input.nextInt();
		 for(int i = 1; i <= number; i++) 
		 {
                System.out.print("*");
		 }
   }
}