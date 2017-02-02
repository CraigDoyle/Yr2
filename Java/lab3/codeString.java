import java.util.Scanner; 
class codeString
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		char character;
		int index ;
		int ascii;
		int noOfChar;
		char character2;
		
		
		System.out.println("Enter any Name:" );  
        String name = in.nextLine();
		
		noOfChar=name.length();
		
		for(index= 0; index < noOfChar ; index++)
		{        
			character = name.charAt(index); 
			ascii = (int) character +1;
			character2=(char) ascii;
			System.out.print(character2); 
			
		}
	}
}