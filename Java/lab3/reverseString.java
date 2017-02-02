import java.util.Scanner; 
class reverseString
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		char current;
		int index;
		int noOfChar;
		
		System.out.println("Enter any String:" );  
        String sentence = in.nextLine();// need to use nextLine
		
		noOfChar=sentence.length();
		
		
		for(index=noOfChar;index>0;index--)
		{
			current=sentence.charAt(index-1);
			System.out.print(current);
		}
		
		System.out.println("");
		
	}
}
		