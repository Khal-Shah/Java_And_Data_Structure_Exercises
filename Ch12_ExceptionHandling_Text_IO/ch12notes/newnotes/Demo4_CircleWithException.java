package ch12notes.newnotes;

public class Demo4_CircleWithException
{
    private double radius;
    private static int numberOfObjects = 0;

    public Demo4_CircleWithException()
    {
        //default radius of 1:
        this(1.0);
    }

    public Demo4_CircleWithException(double radius)
    {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius()
    {
        return radius;
    }

    //throws vs throw: throws is to declare exc, throw is to throw it
    public void setRadius(double radius) throws IllegalArgumentException
    {                                    //^don't have to explicitly define it cuz it's RuntimeExc
        if(radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
    }

    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }

    public double findArea()
    {
        return this.radius * this.radius * Math.PI;
    }

    public static void main(String[] args)
    {
        //Test the CircleWithException Class
        try
        {
            Demo4_CircleWithException c1 = new Demo4_CircleWithException(5);
            Demo4_CircleWithException c2 = new Demo4_CircleWithException(-5);
            Demo4_CircleWithException c3 = new Demo4_CircleWithException(0);
        }
        catch (IllegalArgumentException exception)
        {
            exception.printStackTrace();        //method calls: 1) setRadius    2) Constructor  3)Main (c2)
            System.out.println(exception);  //java.lang.IllegalArgumentException: Radius cannot be negative.
            //System.out.println(exception.getMessage());          //Radius cannot be negative
        }

        System.out.println("Number of objects created: " + Demo4_CircleWithException.getNumberOfObjects());
    }
}
