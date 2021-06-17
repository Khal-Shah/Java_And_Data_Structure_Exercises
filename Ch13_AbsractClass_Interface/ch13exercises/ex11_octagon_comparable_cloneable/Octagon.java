package ch13exercises.ex11_octagon_comparable_cloneable;

import ch13notes.sect_2_abstract_classes.GeometricObject;

/** Chapter 13 - Exercise 11:
 * (The Octagon class) Write a class named Octagon that extends GeometricObject
 * and implements the Comparable and Cloneable interfaces.
 *
 * Assume that all eight sides of the octagon are of equal length.
 * The area can be computed using the following formula: area = (2 + 4 / sqrt(2)) * side * side
 *
 * Draw the UML diagram that involves Octagon, GeometricObject, Comparable, and Cloneable.
 * Write a test program that creates an Octagon object with side value 5 and displays its
 * area and perimeter.
 * Create a new object using the clone method and compare the two objects using the compareTo method.
 *
 * @author Khaled
 */

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable
{
    private double side;

    public Octagon()
    {
        this(1);
    }

    public Octagon(double side)
    {
        this.side = side;
    }

    public Octagon(double side, String color, boolean filled)
    {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter()
    {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o)
    {
        return (Double.compare(this.getArea(), o.getArea()));
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public Object max(Object o)
    {
        return ((this.compareTo((Octagon) o) >= 0)? this : o);
    }

    @Override
    public String toString()
    {
        return "Octagon{" +
                "side=" + side +
                "area =" + getArea() +
                super.toString() +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Octagon octagon1 = new Octagon(5, "Indigo", true);
        Octagon octagon2 = (Octagon) octagon1.clone();
        GeometricObject octagon3 = new Octagon(5);

        System.out.println("Octagon 1 and 2 are equal: " + octagon1.compareTo(octagon2));
        System.out.println("Octagon 1 and 2 are equal: " + octagon1.equals(octagon3));

        System.out.println("The bigger of octagon 1 and 3 is \n" + octagon1.max(octagon3).toString());
    }
}
