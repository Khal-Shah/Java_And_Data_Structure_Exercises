package ch13exercises.ch13_01_Triangle_Extending_GeoObj;
//import packageName.className
import ch13notes.Ch13_2_AbstractClasses.GeometricObject;

/**
 * (Triangle class) Design a new Triangle class that extends the abstract GeometricObject class.
 * Draw the UML diagram for the classes Triangle and GeometricObject and then implement the Triangle class.
 * Write a test program that prompts the user to enter three sides of the triangle,
 * a color, and a Boolean value to indicate whether the triangle is filled.
 * The program should create a Triangle object with these sides and set the color and filled properties
 * using the input. The program should display the area, perimeter, color, and true or false to indicate
 * whether it is filled or not.
 @author Khaled Shah
 */

public class Triangle extends GeometricObject
{
    private double side1, side2, side3;

    public Triangle(double s1, double s2, double s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }


    @Override
    public double getArea()
    {
//        return 0.5 * length * height;
        return 0; // TODO: Find how to compute area of triangle (1/2) * b * h
    }

    @Override
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
}
