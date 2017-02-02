import java.util.Scanner; 
class numbers
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter any String:" );  
        String sentence = in.nextLine();// need to use nextLine
		
		System.out.println("Enter any Integer:" );  
        int number = in.nextInt();
		
		System.out.println("Enter any Float:" );  
        float flo = in.nextFloat();
		
		System.out.println("Enter any Long:" );  
        long lon = in.nextLong();
		
		System.out.println("Enter any Double:" );  
        double dub = in.nextDouble();
	//inputs
		System.out.println("Integer : " + number);
		System.out.println("Float : " + flo);
		System.out.println("Long : " + lon);
		System.out.println("Double : " + dub);
		System.out.println("String : " + sentence);
		//additions
		System.out.println("Integer + Float = " + (number + flo));
		System.out.println("Integer + Long = " + (number + lon));
		System.out.println("Integer + Double = " + (number + dub));
		System.out.println("Integer + String = " + (number + sentence));
		System.out.println("Float + Long = " + (flo + lon));
		System.out.println("Float + Double = " + (flo + dub));
		System.out.println("Float + String = " + (flo + sentence));
		System.out.println("Long + Double = " + (lon + dub));
		System.out.println("Long + String = " + (lon + sentence));
		System.out.println("String + Double = " + (sentence + dub));
		
	}
}
