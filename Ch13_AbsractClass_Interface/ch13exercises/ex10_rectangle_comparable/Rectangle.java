package ch13exercises.ex10_rectangle_comparable;

import ch13notes.sect_2_abstract_classes.GeometricObject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to extend
 * GeometricObject and implement the Comparable interface. Override the equals method in
 * the Object class. Two Rectangle objects are equal if their areas are the same.
 *
 * Draw the UML diagram that involves Rectangle, GeometricObject, and Comparable.
 *
 * @author Khaled
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle>
{
    private double length;
    private double width;

    public Rectangle()
    {
        this(1, 1);             //default rectangle with length and width of 1
    }

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled)
    {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return length * width;
    }

    @Override
    public double getPerimeter()
    {
        return (2 * length) + (2 * width);
    }

    @Override
    public int compareTo(Rectangle o)
    {
        return (Double.compare(this.getArea(), o.getArea()));
    }

    @Override
    public boolean equals(Object o)
    {
        return (this.getArea() == ((Rectangle) o).getArea());
    }

    public static void main(String[] args)
    {
        ArrayList<Object> rectangles = new ArrayList<>();
        Collections.addAll(rectangles, new Rectangle(3, 5, "blue", true),
                new Rectangle(3, 5));

        System.out.println("The two rectangles are equal? --> " +
                rectangles.get(0).equals(rectangles.get(1)));

        for (Object o: rectangles)
        {
            GeometricObject.displayGeometricObject((GeometricObject) o);
        }
    }
}
