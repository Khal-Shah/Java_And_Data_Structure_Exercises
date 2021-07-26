package ch9exercises.Ch9_09_Polygon;

public class Polygon
{
    private int n;                //default 3
    private double side;                //1
    private double x;                    //0
    private double y;                    //0

    public Polygon()
    {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public Polygon(int n, double side)
    {
        //this();				<= could put that instead of doing this for each attribute/data?
        this.n = n;
        this.side = side;
    }

    public Polygon(int n, double side, double x, double y)
    {//sends to the constructor with n and side as its parameter (above one)
        this(n, side);            //the already defined n and side of the object (previous constructor)
        this.x = x;
        this.y = y;
    }

    //mutators:

    public void setN(int n)
    {
        this.n = n;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    //accessors:

    public int getN()
    {
        return n;
    }

    public double getSide()
    {
        return side;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getPerimeter()
    {
        return (n * side);
    }

    public double getArea()
    {
        return ((n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));
    }


}
