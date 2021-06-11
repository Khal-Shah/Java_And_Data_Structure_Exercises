package ch13notes.sect_2_abstract_classes;

public class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    public Rectangle()
    {

    }

    public Rectangle(double width, double height)
    {
        this.width =width;
        this.height = height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * width + 2 * height;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

}
