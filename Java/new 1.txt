public abstract class Shape
{
	private String name;
	
	public Shape(String name)
  	{ 
  		this.name = name; 
  	} 
  	
  	public String toString()
  	{
  		return ("---\nShape Name = " + this.name);
  	}
  	
  	public abstract double area();
}