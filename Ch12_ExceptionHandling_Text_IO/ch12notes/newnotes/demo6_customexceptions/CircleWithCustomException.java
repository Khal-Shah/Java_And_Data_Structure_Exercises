package ch12notes.newnotes.demo6_customexceptions;

public class CircleWithCustomException
{
    private double radius;
    public static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException
    {
        this(1.0);
    }

    public CircleWithCustomException(double radius) throws InvalidRadiusException
    {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException
    {
        if(radius > 0)
        {
            this.radius = radius;
        }
        else
        {
            throw new InvalidRadiusException(radius);
        }
    }

    @Override
    public String toString()
    {
        return "CircleWithCustomException{" +
               "radius=" + radius +
               "numberOfObjects = " + numberOfObjects +
               '}';
    }
}
