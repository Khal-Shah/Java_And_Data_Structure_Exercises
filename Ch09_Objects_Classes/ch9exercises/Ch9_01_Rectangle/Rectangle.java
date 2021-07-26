package ch9exercises.Ch9_01_Rectangle;

public class Rectangle
{
    double width;
    double height;

    Rectangle()
    {
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeight)
    {
        width = newWidth;
        height = newHeight;
    }

    double getArea()
    {
        return (height * width);
    }

    double getPerimeter()
    {
        return (2 * width + 2 * height);
    }
}
