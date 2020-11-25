package ch13notes.Ch13_2_AbstractClasses;

public class Circle extends GeometricObject
{
    private double radius;

    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    //Override cuz they're abstract methods in GeometricObject.java

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle()
    {
        System.out.println("The circle is/was created on" + getDateCreated() +
                           ". The radius is " + radius + ". The color is " + getColor());
    }
}
