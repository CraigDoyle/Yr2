public class Point{

    protected int x;
    protected int y;
    public Point()
    {
        x=0;
        y=0;
    }

    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;

    }


    //setter

    void setX(int x)
    {
        this.x=x;
    }

    void setY(int y)
    {
        this.y=y;
    }

    //getter

    int getX()
    {
        return x;
    }

    int getY()
    {
        return y;
    }

    //other

    public String toString()
    {
        return "X coordinate is " + x + " and Y coordinate is " + y;
    }
}