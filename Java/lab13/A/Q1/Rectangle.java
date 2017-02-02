public class Rectangle extends TwoDShape
{
	private double length;
	private double breadth;
	private String colour;

  	public Rectangle(String name,String c, double length, double breadth)
  	{ 
  		super(name);
		setColour(c);
  		setLength(length); 
  		setBreadth(breadth); 
  	}

	public String getColour()
	{
		return colour;
	}
	public void setColour(String c)
	{
		colour = c;
	}
  	public double getLength()
  	{ 
  		return length; 
  	}

  	public void setLength(double length)
  	{ 
  		this.length = length; 
  	}

	public double getBreadth()
  	{ 
  		return breadth; 
  	}
	
  	public void setBreadth(double breadth)
  	{ 
  		this.breadth = breadth; 
  	}
  	
  	public double area()
  	{ 
  		return length * breadth; 
  	}
  	
  	public String toString()
  	{
  		return (super.toString()+ "\nShape Colour = " + colour + "\nLength = " + length + "\nBreadth = " + breadth);
  	}
}