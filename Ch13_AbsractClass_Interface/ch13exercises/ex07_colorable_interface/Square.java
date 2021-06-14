package ch13exercises.ex07_colorable_interface;

import ch13notes.sect_2_abstract_classes.GeometricObject;

public class Square extends GeometricObject implements Colorable
{
    private double side;

    protected Square(double side)
    {
        this.side = side;
    }

    protected Square(double side, String color, boolean filled)
    {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return side * side;
    }

    @Override
    public double getPerimeter()
    {
        return side * 4;
    }

    @Override
    public void howToColor()
    {
        System.out.println("Shade along each of the four sides of the square");
    }
}
