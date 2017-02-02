/*Develop a java class called HotelRoom which will be used to manage the 
rooms in a Hotel. 
The class should contain a private integer value called roomNumber, and a 
private string called roomType (which can be either Single or Double). 
Write the getter and setter methods for each of these variables. 
You will also need to write the necessary constructor method which takes no arguments.
Write a driver program which instantiates 2 room objects from this class as follows:
roomA (room number is 200, type is Single)
roomB (room number is 201, type is Double).
The program should then print out the details for these rooms by calling the appropriate getter methods.*/
import java.util.Scanner;
public class lab9q1
{
   public static void main(String args[])
   {
	  Scanner in = new Scanner(System.in);
	  
		String type1="Single";
		String type2="Double";

		int number=200;
		String type="";

		HotelRoom roomA;
		HotelRoom roomB;

		
		roomA = new HotelRoom(type2,200);
		//roomA = new HotelRoom();
		//roomA.setType(type2);
		//roomA.setNumber(number);

		//roomB = new HotelRoom(type1,201);
		

		System.out.println("Room A: Number is " +roomA.getNumber() + " and it is a " +roomA.getType()+" room");
		System.out.println("Room B: Number is " +roomB.getNumber() + " and it is a " +roomB.getType()+" room");
	}

}