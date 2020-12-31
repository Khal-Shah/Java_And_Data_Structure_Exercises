package ch12notes.newnotes.demo6_customexceptions;

import ch12notes.newnotes.Demo4_CircleWithException;

//This is a custom exception defined for invalid radius of circles
public class InvalidRadiusException extends Exception
{
    private double radius;

    //Construct an exception:
    public InvalidRadiusException(double radius)
    {
        super("Invalid radius: " + radius);             //invoking constructor of Exception
        this.radius = radius;                           //so that we can use try-catch and use the same methods
    }

    public double getRadius()
    {
        return radius;
    }

}
