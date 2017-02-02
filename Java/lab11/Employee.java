import java.util.Scanner;
public class Employee
{
	
	private static int counter;
	int empNum=1000;
	Address address;
	String name;
	String car;
	//boolean manager = false;
	//boolean staff = false; 

	public Employee()										//constructor
	{
		empNum = empNum + counter;
		counter++;
	}
	public Employee(String name)
	{
		this.name = name;
		empNum = empNum + counter;
		counter++;
	}
	
	public void setName(String name)						//setter
	{
		this.name = name;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public void setCar(String car)
	{
		this.car = car;
	}
	
	
	public String getName()									//getter
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getCar()
	{
		return car;
	}
	
	public String toString()
	{
		return getName() + ", " + getAddress() + ", " + getCar();
	}
}

