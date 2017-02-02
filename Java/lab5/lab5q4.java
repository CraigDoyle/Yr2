public class lab5q4
{
   public static void main(String args[])
   {
      int index=1;
      
	System.out.println("Number	Square	cube");
      while ( index<6 )
      {
         int num=index;
		 int square=index*index;
		 int cube=square*index;
		 index++;
		 System.out.println(num+"	"+square+"	"+cube);
      }
   }
}