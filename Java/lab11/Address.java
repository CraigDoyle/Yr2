import java.util.Scanner;
public class Address
{

	String street;
	String town;
	String county;
	
	public Address()												//constructor
	{
		
	}
	public Address(String street, String town, String county)
	{
		this.street = street;
		this.town = town;
		this.county = county;
	}

	public void setStreet(String street)							//setter
	{
		this.street = street;
	}
	
	public void setTown(String town)
	{
		this.town = town;
	}
	
	public void setCounty(String county)
	{
		this.county = county;
	}
	
	public String getStreet()										//getter
	{
		return street;
	}
	
	public String getTown()
	{
		return town;
	}
	
	public String getCounty()
	{
		return county;
	}
	
	
	public String toString()
	{
		return getStreet() + ", " + getTown() + ", " + getCounty();
	}
}