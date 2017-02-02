import java.util.Scanner; 
public class lab5q7
{
   public static void main(String args[])
   {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter temperature");
	int temp = in.nextInt();
	
	if ((temp>=-10)&&(temp<=5))
	{
		System.out.println("Very Cold");
	}
	else if ((temp>=6)&&(temp<=15))
	{
		System.out.println("Cold");
	}
	else if ((temp>=16)&&(temp<=22))
	{
		System.out.println("Warm");
	}
	else if ((temp>=22)&&(temp<=30))
	{
		System.out.println("Hot");
	}
	else 
	{
		System.out.println("Error, temperature out of range");
	}
   }

}