public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name)
  	{ 
  		super(name); 
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}