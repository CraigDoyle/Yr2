import java.util.Scanner; 
public class lab5q11
{
   public static void main(String args[])
   {
	Scanner input = new Scanner(System.in);

		for(int i=32; i<=126;i++)
		{
			input.nextLine(); //code for requesting enter to be hit before rest of code
			System.out.println("Unicode Value\tCharacter");
			System.out.println(i + ":\t\t"  + (char)i +"   "); 	//":\t" inserting a tab
		}
	
   }
}