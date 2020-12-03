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
//        setColor(color);                //method inherited from parent class
//        setFilled(filled);
        //can use super keyword instead to refer to parent constructor
        super(color, filled);
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
        //return "The circle was created on: " + getDateCreated() + "\nThe radius is: " + radius;
        //could also use super to explicitly call the method
        return "The circle was created on: " + super.getDateCreated() + "\nThe radius is: " + radius;
    }
}
