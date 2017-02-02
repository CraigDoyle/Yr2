public class Sphere extends ThreeDShape
{
  	private double radius;
  	private String colour;

  	public Sphere(String name, String c, double radius)
  	{ 
    	super(name);
    	setColour(c);
    	setRadius(radius);    	
  	}

	public String getColour()
	{
		return colour;
	}
	public void setColour(String c)
	{
		colour = c;
	}
	public double getRadius()
  	{ 
  		return radius; 
  	}

  	public void setRadius(double r)
  	{ 
  		radius = r; 
  	}
  	
  	public double area()
  	{ 
  		return 4 * Math.PI *  Math.pow(radius, 2); 
  	}
  	
	public double volume()
	{
		return 4.0/3.0 * Math.PI *  Math.pow(radius, 3);
	}
	
	public String toString()
  	{
  		return (super.toString() +"\nShape Colour = " + colour + "\nRadius = " + radius);
  	}

}