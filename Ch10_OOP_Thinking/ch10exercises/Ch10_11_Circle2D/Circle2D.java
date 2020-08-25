package ch10exercises.Ch10_11_Circle2D;

/* Chapter 10 - Exercise 11:
(Geometry: the Circle2D class) Define the Circle2D class that contains:
Two double data fields named x and y that specify the center of the circle with getter methods.
■ A data field radius with a getter method.
■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
■ A constructor that creates a circle with the specified x, y, and radius.
■ A method getArea() that returns the area of the circle.
■ A method getPerimeter() that returns the perimeter of the circle.
■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
■ A method contains(Circle2D circle) that returns true if the speci-
fied circle is inside this circle (see Figure 10.21b).
■ A method overlaps(Circle2D circle) that returns true if the speci-
fied circle overlaps with this circle (see Figure 10.21c).
 */
        //By Khaled Shah

public class Circle2D
{
    private double x;
    private double y;
    private double radius;

    public Circle2D(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D()
    {
        this(0, 0, 1);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return (radius * radius * Math.PI);     //Apple Pie are square (Area of circle)
    }

    public double getPerimeter()        //2pi r
    {
        return (2 * Math.PI * radius);
    }

    //A method contains(double x, double y) that returns true if the
    //specified point (x, y) is inside this circle (see Figure 10.21a).
    public boolean contains(double x, double y) //true if distance to center is < R
    {
        return (distance(x, y) < this.radius);
    }

    public double distance(double x, double y)
    {
        double xDifference = x - this.x;
        double yDifference = y - this.y;
        double xPowered = Math.pow(xDifference, 2);
        double yPowered = Math.pow(yDifference, 2);
        double distance = Math.sqrt(xPowered + yPowered);
        return distance;
    }

    //A method contains(Circle2D circle) that returns true if the speci-
    //fied circle is inside this circle

    //One circle is inside each other if the distance between the centres is less than or equal to the absolute difference
    // between the two radii.

    public boolean contains(Circle2D circle)
    {
        return (distance(circle.x, circle.y) <= Math.abs(this.radius - circle.radius));
    }
    //A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle

    //Two circles overlap if the distance between the two centres is less than the sum of the two radii.

    public boolean overlaps(Circle2D circle)
    {
        return (distance(circle.x, circle.y) < (circle.radius) + this.radius);
    }

}

