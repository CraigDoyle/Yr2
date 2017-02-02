import java.util.Scanner; 
class lab4b3
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		final int hour=3600;
		final int minute=60;
		final int sec=1;
	
		int hours;
		int minutes;
		int secs;
		int totalSecs;
			
		System.out.println("Enter number of Hours");  
		hours= in.nextInt();
		
		System.out.println("Enter number of Minutes"); 
		minutes= in.nextInt();
		
		System.out.println("Enter number of Seconds"); 
		secs= in.nextInt();
		
		totalSecs=((hours*hour) + (minutes*minute) +(secs*sec));
	
		System.out.println("Total number of Seconds is "+totalSecs); 
	}
}