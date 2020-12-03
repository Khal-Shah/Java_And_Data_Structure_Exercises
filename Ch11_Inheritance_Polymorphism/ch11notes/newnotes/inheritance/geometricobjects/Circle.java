package ch11notes.newnotes.inheritance.geometricobjects;

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

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);                //method inherited from parent class
        setFilled(filled);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }


    public String printCircle()
    {
        return "The circle was created on: " + getDateCreated() + "\nThe radius is: " + radius;
    }
}
