/*Q7. Write a Java application that will teach the user basic multiplication 
(up as far as 12 times tables). Use Math.random() to produce two positive one-digit 
integers. It should then display a question as follows:

How much is 6 times 7 (-1 to quit) ? 43
No, please try again.
How much is 6 times 7 (-1 to quit) ? 42
Very good!
How much is 12 times 12 (-1 to quit) ? 145
No, please try again.
How much is 12 times 12 (-1 to quit) ? -1
Goodbye…
*/
import java.util.Scanner;
public class lab6q7
{
   public static void main(String args[])
   {
	  Scanner in = new Scanner(System.in);
      final int min=1;
	  final int max=12;
	  
	  int x = (min+(int)(Math.random() * (( max - min )+1)));
	  int y = (min+(int)(Math.random() * (( max - min )+1)));
	  
	  System.out.println("How much is "+ x +"times "+ y +"(-1 to quit) ?");
	  int n = in.nextInt();
	  while (n!=-1)
	  {
		  if (n==(x*y))
			{
				System.out.println("Very good!");
				x = (min+(int)(Math.random() * (( max - min )+1)));
				y = (min+(int)(Math.random() * (( max - min )+1)));
				System.out.println("How much is "+ x +"times "+ y +"(-1 to quit) ?");
				n = in.nextInt();
			}
		  else
			{ 
			System.out.println("No, please try again");
			System.out.println("How much is "+ x +"times "+ y +"(-1 to quit) ?");
			n = in.nextInt();
			}
	  }
   }
}