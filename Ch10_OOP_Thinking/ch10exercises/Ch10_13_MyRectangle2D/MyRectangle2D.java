package ch10exercises.Ch10_13_MyRectangle2D;

/* Chapter 10 - Exercise 13:
Two double data fields named x and y that specify the center of the rectangle with getter and setter methods.
(Assume that the rectangle sides are parallel to x- or y- axes.)
■ The data fields width and height with getter and setter methods.
■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
1 for both width and height.
■ A constructor that creates a rectangle with the specified x, y, width, and
height.
A method getArea() that returns the area of the rectangle.
■ A method getPerimeter() that returns the perimeter of the rectangle.
■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this rectangle (see Figure 10.24a).
■ A method contains(MyRectangle2D r) that returns true if the speci-
fied rectangle is inside this rectangle (see Figure 10.24b).
■ A method overlaps(MyRectangle2D r) that returns true if the speci-
fied rectangle overlaps with this rectangle (see Figure 10.24c).
 */
        //By Khaled Shah

public class MyRectangle2D
{
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D()
    {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    //A method getArea() that returns the area of the rectangle.
    public double getArea()
    {
        return (width * height);
    }

    //A method getPerimeter() that returns the perimeter of the rectangle.

    public double getPerimeter()
    {
        return (2 * (width + height));
    }

    //A method contains(double x, double y) that returns true if the
    //specified point (x, y) is inside this rectangle

    public boolean contains(double x, double y)
    {
        return ((distance(this.x, x) < (width / 2)) && (distance(this.y, y) < (height / 2)));
    }

    //A method contains(MyRectangle2D r) that returns true if the specified rectangle is inside this rectangle

    public boolean contains(MyRectangle2D r)
    {
        boolean condition1 = (distance(this.x, r.x) + (r.width / 2)) < (this.width / 2);
        boolean condition2 = (distance(this.y, r.y) + r.height / 2) < this.height / 2;
        boolean condition3 = ((height / 2) + (r.height / 2)) < this.height;
        boolean condition4 = ((width / 2) + (r.width / 2)) < this.width;

        return condition1 && condition2 && condition3 && condition4;
    }

    //A method overlaps(MyRectangle2D r) that returns true if the speci-
    //fied rectangle overlaps with this rectangle
    //return !contains(r) &&
    //				 ((x + width / 2 > r.getX() - r.getWidth()) ||
    //				 (y + height / 2 > r.getY() - r.getHeight())) &&
    //		  		 (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
    //				 (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    public boolean overlaps(MyRectangle2D r)
    {
        boolean condition1 = (x + width / 2) > (r.x - r.width);
        boolean condition2 =  (y + height / 2) > (r.y - r.height);
        boolean condition3 = (distance(this.x, r.x)) < ((width / 2) + (r.width / 2));
        boolean condition4 = (distance(this.y, r.y)) < ((height / 2) + (r.height / 2));

        return condition1 || condition2 && condition3 && condition4 && !contains(r);
    }

    //distance between = sqrt(p2 - p1)^2;

    private double distance(double point1, double point2)
    {
        return (Math.sqrt(Math.pow(point1 - point2, 2)));
    }

}


