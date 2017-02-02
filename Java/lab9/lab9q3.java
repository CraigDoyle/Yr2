/*Add a second constructor method which takes the 4 values as arguments (roomNumber, roomType, occupied, rate) 
and instantiates the instance variables with these values. Demonstrate this by creating a roomC object with 
roomNumber=202, roomType=Single, occupied=0, rate=90).*/

import java.util.Scanner;
public class lab9q3
{
   public static void main(String args[])
   {
	  Scanner in = new Scanner(System.in);
	  
		String type1="Single";
		String type2="Double";

		int number=200;
		

		HotelRoom roomA;
		HotelRoom roomB;
		HotelRoom roomC;

		
		roomA = new HotelRoom(type2,200,100,1);
		//roomA = new HotelRoom();
		//roomA.setType(type2);
		//roomA.setNumber(number);
		//roomA.setCost(100);
		//roomA.setOccupied(1);
		

		roomB = new HotelRoom(type1,201,80,0);
		roomC = new HotelRoom(type1,202,90,0);
		

		System.out.println("Room A: Number is " +roomA.getNumber() + " and it is a " +roomA.getType()+" room");
		System.out.println("Room A: Has a rate of " +roomA.getCost() + " per night and its status is " +roomA.getOccupied());
		System.out.println("Room B: Number is " +roomB.getNumber() + " and it is a " +roomB.getType()+" room");
		System.out.println("Room B: Has a rate of " +roomB.getCost() + " per night and its status is " +roomB.getOccupied());
		System.out.println("Room C: Number is " +roomC.getNumber() + " and it is a " +roomC.getType()+" room");
		System.out.println("Room C: Has a rate of " +roomC.getCost() + " per night and its status is " +roomC.getOccupied());
		System.out.println("\t0=Unoccupied, 1=Occupied");
	}	
}