import java.util.Scanner; 
class lab4a
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int noOfChar1;
		int noOfChar2;
		char firstInitial;
		char secondInitial;
		char char1;
		char char2;
		String charA;
		char current;
		int index;
	
		
		
		
		System.out.println("Enter your first name:" );  
        firstName = in.nextLine();
		
		System.out.println("Enter your surname:" );  
        lastName = in.nextLine();
		
		noOfChar1=firstName.length();
		noOfChar2=lastName.length();
		
		firstInitial=firstName.charAt(0);
		secondInitial=lastName.charAt(0);
		
		char1=firstName.charAt(noOfChar1-1);
		char2=lastName.charAt(noOfChar2-1);
		
		
		
		System.out.println(firstName.toUpperCase()+" "+lastName.toUpperCase());
		System.out.println("The Lenght of your first name is "+noOfChar1+" characters");
		System.out.println("The Lenght of your surname is "+noOfChar2+" characters");
		System.out.println("Your Initials are "+firstInitial+secondInitial);
		System.out.println("Last Characters are  "+char1+char2);
		
		for(index=0;index<noOfChar1;index++)
		{
			current=firstName.charAt(index);
			
			if (current=='a' || current == 'A')
			{
				charA="yes";
				System.out.println("Index position of a is  "+index);
			}
				charA="no";
				
		}
	}
	
	
}