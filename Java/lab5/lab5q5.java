public class lab5q5
{
   public static void main(String args[])
   {
      double temp=32;
      
	System.out.println("Fahren	Celsius");
      while ( temp<=212)
      {
		double fahren=temp;
		double cels= (fahren-32)*5/9;
		cels=Math.round(cels);
		System.out.println(temp+"	"+cels);
		temp=temp+12;
      }
   }
}