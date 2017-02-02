public class Triangle extends TwoDShape
{
    private double base;
    private double height;
    private String colour;

    public Triangle(String name,String c, double base, double height)
    {
        super(name);
        setColour(c);
        setBase(base);
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
    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double area()
    {
        return 0.5 * base * height;
    }

    public String toString()
    {
        return (super.toString()+ "\nShape Colour = " + colour + "\nBase = " + base + "\nHeight = " + height);
    }
}