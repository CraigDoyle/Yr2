public class lab5q2
{
   public static void main(String args[])
   {
      int power = 11, result;
      final int MAX = 10;

      while ( power <= MAX )
      {
         result = (int) Math.pow(2,power);
         System.out.println( "2 to the power of " + power + "= " + result);
         power++;
      }
   }
}
