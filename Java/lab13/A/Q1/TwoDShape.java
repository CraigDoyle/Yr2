public abstract class TwoDShape extends Shape
{
	public TwoDShape(String name)
  	{ 
  		super(name); 
  	}
 
  	public abstract double area();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}