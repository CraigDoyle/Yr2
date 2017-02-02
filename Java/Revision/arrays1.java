/* Cillian o Criothaile
 * c00139896
 * Group C
 * 1)	Write a program that reads in an array of integers and then displays the number of odd and even numbers in the array. 
 */
 
 class Jlab71
 {
 	public static void isEven(int number)
	{
		if (number % 2 == 0)
			{
				System.out.println("even");
			}
	
		else 
			{
				System.out.println("odd");
			}	
	}
	
	public static void main(String[] args)
	{
		int marks[] ;
		int index;
		
		marks = new int[5];
		
		for (index = 0; index < marks.length; index++)
			{
				System.out.print("enter number: ");
				marks[index] = EasyIn.getInt();
			}
		
		for (index = 0; index < marks.length; index++)
			{
				System.out.print("Number " + marks[index] + " at array index " + index + " is ");
				isEven(marks[index]);
			}
	}
}