public class Cylinder extends ThreeDShape
{
  	private double height;
  	private double radius;
	private String colour;

  	public Cylinder(String name,String c, double radius, double height)
  	{ 
    	super(name);
		setColour(c);
    	setRadius(radius);
    	setHeight(height);
  	}

	public String getColour()
	{
		return colour;
	}
	public void setColour(String c)
	{
		colour = c;
	}

  	public void setHeight(double height)
  	{ 
  		this.height = height; 
  	}

  	public double getHeight()
  	{ 
  		return height; 
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
  		return 2 * Math.PI * radius * height; 
  	}
  	
	public double volume()
	{
		return Math.PI * Math.pow(radius, 2) * height; 
	}
	
	public String toString()
  	{
  		return (super.toString() +"\nShape Colour = " + colour +  "\nRadius = " + radius + "\nHeight = " + height);
  	}

}