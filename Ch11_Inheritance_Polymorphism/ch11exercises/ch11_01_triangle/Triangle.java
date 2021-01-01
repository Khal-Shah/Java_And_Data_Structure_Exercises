package ch11exercises.ch11_01_triangle;

import ch11notes.newnotes.inheritance.geometricobjects.GeometricObject;
import ch12exercises.ex05_triangle.IllegalTriangleException;

/** Chapter 11 - Exercise 1:
 * (The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:
 * Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
 * A no-arg constructor that creates a default triangle.
 * A constructor that creates a triangle with the specified side1, side2, and side3.
 * The accessor methods for all three data fields. A method named getArea() that returns the area of this triangle.
 * A method named getPerimeter() that returns the perimeter of this triangle.
 * A method named toString() that returns a string description for the triangle.
 *
 * For the formula to compute the area of a triangle, see Programming Exercise 2.19.
 *  * area = s(s - side1)(s - side2)(s - side3) all square rooted.
 * 		 * s = (side1 + side2 + side3)/2;
 *
 * The toString() method is implemented as follows:
 * return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
 *
 * @author Khaled Shah
 */

public class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException
    {
        this(1.0, 1.0, 1.0);
    }

    //Modified for Chapter 12 - Exercise 5:
    // Construct a triangle with the specified sides
    // public Triangle(double side1,double side2,double side3)throws IllegalTriangleException
    public Triangle(double s1, double s2, double s3) throws IllegalTriangleException
    {
        if(sidesInvalid(s1, s2, s3))
        {
            IllegalTriangleException exception = new IllegalTriangleException(s1, s2, s3);
            throw exception;
        }

        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    private static boolean sidesInvalid(double s1, double s2, double s3)
    {
        return (((s1 + s2) <= s3) || ((s1 + s3) <= s2) || ((s2 + s3) <= s1));
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    /*
     * area = s(s - side1)(s - side2)(s - side3) all square rooted.
     * 		 * s = (side1 + side2 + side3)/2;
     */
    public double getArea()
    {
        double s = getPerimeter() / 2;

        double area = Math.sqrt(s * (s - side3) * (s - side2) * (s - side3));
        return area;
    }


    public String toString()
    {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
