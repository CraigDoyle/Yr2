import java.util.Scanner;
class lab3q1
{
	
	public static void main(String args[])
	{
		//to get input from user
		Scanner in = new Scanner(System.in);
        
		System.out.println("Enter any String:" );  
        String sentence = in.nextLine();// need to use nextLine
        
		System.out.println("Enter any integer:" );
		int number = in.nextInt();
		
		System.out.println("Enter any float:" );
		float flo = in.nextFloat();
		
		System.out.println("Enter any long :" );
		long lon = in.nextLong();
		
		System.out.println("Enter any integer:" );
		double Double = in.nextDouble();
		//inputs
		System.out.println("Integer is : " + number);
		System.out.println("Float is : " + flo);
		System.out.println("Long is : " + lon);
		System.out.println("Double is : " + Double);
		System.out.println("String is : " + sentence);
		//additions
		System.out.println("Integer + Float = " + (number + flo));
		System.out.println("Integer + Long = " + (number + lon));
		System.out.println("Integer + Double = " + (number + Double));
		System.out.println("Integer + String = " + (number + sentence));
		System.out.println("Float + Long = " + (flo + lon));
		System.out.println("Float + Double = " + (flo + Double));
		System.out.println("Float + String = " + (flo + sentence));
		System.out.println("Long + Double = " + (lon + Double));
		System.out.println("Long + String = " + (lon + sentence));
		System.out.println("String + Double = " + (sentence + Double));
		
		
		
		
	}
}
