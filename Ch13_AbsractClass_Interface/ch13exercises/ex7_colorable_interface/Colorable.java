package ch13exercises.ex7_colorable_interface;

import ch13exercises.ex01_Triangle_Extending_GeoObj.Triangle;
import ch13notes.sect_2_abstract_classes.Circle;
import ch13notes.sect_2_abstract_classes.GeometricObject;
import ch13notes.sect_2_abstract_classes.Rectangle;

/** Chapter 13 - Exercise 7:
 * (The Colorable interface) Design an interface named Colorable with a void method named howToColor().
 * Every class of a colorable object must implement the Colorable interface.
 *
 * Design a class named Square that extends GeometricObject and implements Colorable.
 * Implement howToColor to display the message Color all four sides. Draw a UML diagram that
 * involves Colorable, Square, and GeometricObject.
 *
 * Write a test program that creates an array of five GeometricObjects.
 * For each object in the array, display its area and invoke its howToColor method if it is colorable.
 *
 * @author Khaled
 */

public interface Colorable
{
    void howToColor();

    static void main(String[] args)
    {
        GeometricObject[] geometricObjects = new GeometricObject[5];

        geometricObjects[0] = new Circle(2);
        geometricObjects[1] = new Square(3, "red", true);
        geometricObjects[2] = new Triangle(2, 4, 3);
        geometricObjects[3] = new Rectangle(2, 4);
        geometricObjects[4] = new Square(10, "blue", false);

        for(GeometricObject object: geometricObjects)
        {
            System.out.print(object.getClass().getSimpleName() + ": ");

            if(object instanceof Colorable)
            {
                ((Colorable) object).howToColor();
            }

            GeometricObject.displayGeometricObject(object);
        }
    }
}
