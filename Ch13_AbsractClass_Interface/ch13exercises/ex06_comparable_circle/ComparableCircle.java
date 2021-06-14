package ch13exercises.ex06_comparable_circle;

import ch13notes.sect_2_abstract_classes.Circle;
import ch13notes.sect_2_abstract_classes.GeometricObject;

/** Chapter 13 - Exercise 6:
 * (The ComparableCircle class) Define a class named ComparableCircle that extends Circle and implements Comparable.
 * Draw the UML diagram and implement the compareTo method to compare the circles on the basis of area.
 *
 * Write a test class to find the larger of two instances of ComparableCircle objects.
 *
 * @author Khaled
 */

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
    ComparableCircle(double radius)
    {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o)
    {
        return ((getArea() > o.getArea())? 1 : ((getArea() < o.getArea())? -1 : 0));
    }

    public static ComparableCircle max(ComparableCircle obj1, ComparableCircle obj2)
    {
        return ((obj1.compareTo(obj2) > 0)? obj1 : obj2);
    }

    public static void main(String[] args)
    {
        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(2);

        System.out.println("Circle1 area: " + circle1.getArea());
        System.out.println("Circle2 area: " + circle2.getArea());
        System.out.println("The bigger circle is: ");
        GeometricObject.displayGeometricObject(ComparableCircle.max(circle1, circle2));

    }
}
