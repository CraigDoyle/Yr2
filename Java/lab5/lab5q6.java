import java.util.Scanner; 
public class lab5q6
{
   public static void main(String args[])
   {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter your Age");
	int age = in.nextInt();
	
	if (age>=18)
	{
		System.out.println("You are eligable to vote");
	}
	else
	{
		System.out.println("You are too young to vote");
	}
   }

}