package ch10exercises.Ch10_04_MyPoint;

public class MyPoint
{
    private double x;
    private double y;

    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    // A method named distance that returns the distance from this point to a
    //specified point of the MyPoint type.

    public double distance(MyPoint obj)
    {
        //distance formula: Sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double xDifference = obj.x - this.x;
        double yDifference = obj.y - this.y;
        double xPowered    = Math.pow(xDifference, 2);
        double yPowered    = Math.pow(yDifference, 2);
        double distance    = Math.pow((xPowered + yPowered), 0.5);
        return distance;
    }

    //    ■ A method named distance that returns the distance from this point to
//    another point with specified x- and y-coordinates.
    public double distance(double x, double y)
    {
        double xDifference = x - this.x;
        double yDifference = y - this.y;
        double xPowered    = Math.pow(xDifference, 2);
        double yPowered    = Math.pow(yDifference, 2);
        double distance    = Math.sqrt(xPowered + yPowered);
        return distance;
    }


}
