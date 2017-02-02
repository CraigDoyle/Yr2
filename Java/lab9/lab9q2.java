/*To enhance our room management system we want to know if the room is occupied or vacant. 
Add a new private integer which can be either 0 or 1 (0 means vacant, 1 means occupied). 
In addition, we need to know what the nightly rate for each room is. Add a double variable called rate. 
Write the necessary methods to set and get this new variable. 
In the driver program set roomA to be occupied with a rate of 100, and roomB to be unoccupied with a rate of 80 
by calling the appropriate method.
Add these values to the output statements.*/
import java.util.Scanner;
public class lab9q2
{
   public static void main(String args[])
   {
	  Scanner in = new Scanner(System.in);
	  
		String type1="Single";
		String type2="Double";

		int number=200;
		

		HotelRoom roomA;
		HotelRoom roomB;

		
		roomA = new HotelRoom(type2,200,100,1);
		//roomA = new HotelRoom();
		//roomA.setType(type2);
		//roomA.setNumber(number);
		//roomA.setCost(100);
		//roomA.setOccupied(1);
		

		roomB = new HotelRoom(type1,201,80,0);
		

		System.out.println("Room A: Number is " +roomA.getNumber() + " and it is a " +roomA.getType()+" room");
		System.out.println("Room A: Has a rate of " +roomA.getCost() + " per night and its status is " +roomA.getOccupied());
		System.out.println("Room B: Number is " +roomB.getNumber() + " and it is a " +roomB.getType()+" room");
		System.out.println("Room B: Has a rate of " +roomB.getCost() + " per night and its status is " +roomB.getOccupied());
		System.out.println("\t0=Unoccupied, 1=Occupied");
	}	
}