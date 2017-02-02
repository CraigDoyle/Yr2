public class Circle extends TwoDShape
{
	private double radius;
	private String colour;

  	public Circle(String name, double r, String c)
  	{ 
  		super(name);
  		setRadius(r);
  		setColour(c);
  	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String c)
	{
		colour = c;
	}

  	public void setRadius(double r)
  	{ 
  		radius = r; 
  	}


  	public double area()
  	{ 
  		return Math.PI * Math.pow(radius, 2); 
  	}
  	
  	public String toString()
  	{
  		return (super.toString()+ "\nShape Colour = " + colour + "\nRadius = " + radius);
  	}
}