package ch13exercises.ch13_01_Triangle_Extending_GeoObj;

import ch13notes.Ch13_2_AbstractClasses.GeometricObject;

/** Chapter 13 - Exercise 1:
 * (Triangle class) Design a new Triangle class that extends the abstract GeometricObject class.
 * Draw the UML diagram for the classes Triangle and GeometricObject and then implement the Triangle class.
 *
 * ch13notes.Ch13_2_AbstractClasses.GeometricObject modified to make it an abstract class with abs method area and perimeter
 *
 * Triangle of an area with Heron's formula.
 * Let a,b,c be the lengths of the sides of a triangle.
 * The area is given by:
 * Area	=	 √	 p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)
 * where p is half the perimeter, or
 * (a	+	b	+	c)  /   2
 *
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

    //Triangle area (Using Heron's formula)
    @Override
    public double getArea()
    {
        // Area	=	 √	 p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)
        double p = getPerimeter() / 2;
        double area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return area;
    }

    @Override
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public String toString()
    {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
