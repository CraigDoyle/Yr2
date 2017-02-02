import java.util.Scanner; 
class lab4b4
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		int hours;
		int minutes;
		int seconds;
		int remainder;
		int input;
	 

	 
	 System.out.println("Enter a numerical value in seconds: ");
	 input = in.nextInt();
		 
		hours = input / 3600;
		remainder = input % 3600;
		minutes = remainder / 60;
		seconds = remainder % 60;
	 
	 System.out.println(input + " seconds is equivalent to " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s).");  
	 
	 }
}