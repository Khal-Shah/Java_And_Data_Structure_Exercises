package ch13exercises.ex05_geometric_comparable;

/** Chapter 13 - Exercise 5
 * (Enable GeometricObject comparable) Modify the GeometricObject class to implement
 * the Comparable interface, and define a static max method in the GeometricObject
 * class for finding the larger of two GeometricObject objects. Draw the UML diagram
 * and implement the new GeometricObject class.
 *
 * Write a test program that uses the max method to find the larger of two circles
 * and the larger of two rectangles.
 *
 * @author Khaled
 */

public class TestGeometricComparable
{
    public static void main(String[] args)
    {
        GeometricObject circle1 = new Circle(4);
        circle1.setColor("red");
        circle1.setFilled(true);

        GeometricObject circle2 = new Circle(2);

        System.out.println("Circle1 area: " + circle1.getArea() + "\nCircle2 area: " + circle2.getArea());
        System.out.println("The larger of two circle is ");
        //We have a static displayGeometricObject method that takes in a GeometricObject object in the parent abstract class
        GeometricObject.displayGeometricObject(GeometricObject.max(circle1, circle2));

        GeometricObject rectangle1 = new Rectangle(2, 3);
        rectangle1.setFilled(true);
        rectangle1.setColor("blue");

        GeometricObject rectangle2 = new Rectangle(3, 5);

        System.out.println("Rectangle1 size: " + rectangle1.getArea() + "\nRectangle2 size: " + rectangle2.getArea());
        System.out.println("The larger of the two rectangle is: ");
        GeometricObject.displayGeometricObject(GeometricObject.max(rectangle1, rectangle2));
    }
}
