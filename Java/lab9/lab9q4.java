/*We want to be sure that we don’t allow double booking of a room. 
Write a new method called isOccupied() which returns a Boolean of True if the room is already 
occupied and False otherwise. 
Demonstrate this in the driver program by trying to set roomB to occupied a second time. 
You should call the setOccupied() method only if the isOccupied() method returns False.*/

import java.util.Scanner;
public class lab9q4
{
   public static void main(String args[])
   {
	  Scanner in = new Scanner(System.in);
	  
		String type1="Single";
		String type2="Double";

		
		

		HotelRoom roomA;
		//HotelRoom roomB;
		//HotelRoom roomC;

		
		roomA = new HotelRoom(type2,200,100,1);
		if(roomA.isOccupied()==true)
		{
			System.out.println("Room is already Occupied");
		}
		else 
		{
			roomA = new HotelRoom(type2,200,100,1);
		}

		//roomB = new HotelRoom(type1,201,80,0);
		//roomC = new HotelRoom(type1,202,90,0);
		
		

		System.out.println("Room A: Number is " +roomA.getNumber() + " and it is a " +roomA.getType()+" room");
		System.out.println("Room A: Has a rate of " +roomA.getCost() + " per night and its status is " +roomA.getOccupied());
		//System.out.println("Room B: Number is " +roomB.getNumber() + " and it is a " +roomB.getType()+" room");
		//System.out.println("Room B: Has a rate of " +roomB.getCost() + " per night and its status is " +roomB.getOccupied());
		//System.out.println("Room C: Number is " +roomC.getNumber() + " and it is a " +roomC.getType()+" room");
		//System.out.println("Room C: Has a rate of " +roomC.getCost() + " per night and its status is " +roomC.getOccupied());
		//System.out.println("\t0=Unoccupied, 1=Occupied");
	}	
}