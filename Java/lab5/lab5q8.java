public class lab5q8
{
   public static void main(String args[])
   {
      double temp=32;
	  String com=" ";
      
	System.out.println("Fahren	Celsius	Comment");
      while ( temp<=212)
      {
		double fahren=temp;
		double cels= (fahren-32)*5/9;
		cels=Math.round(cels);
		if (cels<=20)
		{
			com="Cold";
		}
		else if ((cels>=20)&&(cels<=50))
		{
			com="Warm";
		}
		else if (cels>50)
		{
			com="Hot";
		}
		System.out.println(temp+"	"+cels+"	"+com);
		temp=temp+12;
      }
   }
}