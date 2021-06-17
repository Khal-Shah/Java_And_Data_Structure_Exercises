package ch13exercises.ex12_sum_area_geo_obj;

import ch13exercises.ex01_Triangle_Extending_GeoObj.Triangle;
import ch13exercises.ex07_colorable_interface.Square;
import ch13exercises.ex11_octagon_comparable_cloneable.Octagon;
import ch13notes.sect_2_abstract_classes.Circle;
import ch13notes.sect_2_abstract_classes.GeometricObject;
import ch13notes.sect_2_abstract_classes.Rectangle;

/** Chapter 13 - Exercise 12:
 * (Sum the areas of geometric objects) Write a method that sums the areas of all the geometric objects in an array.
 * The method signature is:
 *  public static double sumArea(GeometricObject[] a)
 *
 * Write a test program that creates an array of four objects (two circles and two
 * rectangles) and computes their total area using the sumArea method.
 *
 * @author Khaled
 */

public class SumAreas
{

    public static double sumArea(GeometricObject[] a)
    {
        double sum = 0;

        for(GeometricObject object: a)
        {
            sum += object.getArea();
        }

        return sum;
    }

    public static void main(String[] args)
    {
        GeometricObject[] figures = new GeometricObject[5];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(2, 4);
        figures[2] = new Square(5);
        figures[3] = new Octagon(2);
        figures[4] = new Triangle(3, 2, 4);

        for(GeometricObject object: figures)
        {
            System.out.println(object.getClass().getSimpleName() + ": ");
            GeometricObject.displayGeometricObject(object);
        }

        System.out.printf("The sum of all the areas is %.2f", SumAreas.sumArea(figures));
    }

}
