package ch13exercises.ex09_circle_comparable;

import ch13notes.sect_2_abstract_classes.GeometricObject;

/** Chapter 13 - Exercise 9:
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend GeometricObject
 * and implement the Comparable interface. Override the equals method in the Object class.
 *
 * Two Circle objects are equal if their radii are the same.
 * Draw the UML diagram that involves Circle, GeometricObject, and Comparable.
 *
 * @author Khaled
 */

public class Circle extends GeometricObject implements Comparable<Circle>, Cloneable
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o)
    {
        if(this.getArea() > o.getArea())
        {
            return 1;
        }

        else if(this.getArea() < o.getArea())
        {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object o)
    {
        return (this.compareTo((Circle) o) == 0);
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        GeometricObject circle1 = new Circle(3);
        GeometricObject circle2 = new Circle(3, "Green", true);

        System.out.println("circle1 == circle2? " + circle1.equals(circle2));

        GeometricObject circle3 = (GeometricObject) ((Circle) circle2).clone();
        System.out.println("circle2 == circle3? " + circle2.equals(circle3));

    }
}
