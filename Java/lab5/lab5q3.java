import java.util.Scanner; 
class lab5q3
{
	public static void main(String[] args)
	{
	//to get input from user
		Scanner in = new Scanner(System.in);
		
		int num = 0;
        int sum   = 0;
        
        
        System.out.print("Enter a Number: ");
        num = in.nextInt();
        
		if (num<2)
		{
			System.out.println();
			System.out.println("Please enter an interger greater than 1");
		}
		else
		{
        for (int index = 0; index <= num; index++)
        {
            // Only add if even
            
            if(index%2==0)
            {
                sum+=index;
            }
        }
		
		System.out.println();
        System.out.println("The sum of the even numbers between 2 and " + num + " are: "+sum);
		}
        
    }
		
	
	
	
}