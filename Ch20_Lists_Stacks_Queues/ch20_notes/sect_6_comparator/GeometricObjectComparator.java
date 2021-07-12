package ch20_notes.sect_6_comparator;

import ch13exercises.ex01_Triangle_Extending_GeoObj.Triangle;
import ch13exercises.ex07_colorable_interface.Square;
import ch13exercises.ex11_octagon_comparable_cloneable.Octagon;
import ch13notes.sect_2_abstract_classes.Circle;
import ch13notes.sect_2_abstract_classes.GeometricObject;
import ch13notes.sect_2_abstract_classes.Rectangle;
import org.junit.Test;

import java.io.Serializable;
import java.util.*;

//Comparators should implement Serializable so they can be serialized.
public class GeometricObjectComparator implements Comparator<GeometricObject>, Serializable
{
    //Compares based on area of every instance of GeometricObject
    public int compare(GeometricObject o1, GeometricObject o2)
    {

        if(o1.getArea() > o2.getArea())
        {
            return 1;
        }

        else if(o1.getArea() < o2.getArea())
        {
            return -1;
        }

        return 0;
    }

    @Test
    public void testComparator()
    {
        GeometricObject rectangle = new Rectangle(5, 5);
        GeometricObject circle = new Circle(10);

        //We compare the above two objects and print out the object with the larger area
        Comparator<GeometricObject> comparator = new GeometricObjectComparator();

        System.out.println("The area of the larger object is: \n" + (((comparator.compare(rectangle,
                                                                                circle)) > 0)?
                                   rectangle.getClass().getSimpleName() + ": " + rectangle.getArea() :
                                   circle.getClass().getSimpleName() + ": " + circle.getArea()));

        System.out.println("===================================================================");

        //Below is a better use case:

        //If we use the GeometricObjectComparator class (that implements Comparator), we can have
        // any shape as actual type:
        List<GeometricObject> shapes = new LinkedList<>();

        //populate shapes LinkedList
        Collections.addAll(shapes, new Circle(3), new Rectangle(3, 5), new Square(3),
                           new Octagon(4), new Triangle(4, 7, 6));

        System.out.println("Before sorting: ");

        for(GeometricObject o: shapes)
        {
            System.out.println(o.getClass().getSimpleName() + ": " + o.getArea());
        }

        System.out.println("\nAfter sorting: ");

        //Comparator object was already declared
        //Now sort:
        shapes.sort(comparator);

        for(GeometricObject o: shapes)
        {
            System.out.println(o.getClass().getSimpleName() + ": " + o.getArea());
        }

    }


//More examples: (word size)
    public static class MyComparator implements Comparator<String>
    {
        //Needs @Override because String implements Comparable
        @Override
        public int compare(String o1, String o2)
        {
            //return -# if o1 is smaller, +# if bigger
            return o1.length() - o2.length();
        }
    }

    public static void main(String[] args)
    {
        String[] cities = {"New York", "Las Vegas", "Ottawa", "Tampa Bay", "Montreal", "Dallas"};
        MyComparator myComparator = new MyComparator();

        //With Arrays
//        Arrays.sort(cities, myComparator);
//
//        for(String city: cities)
//        {
//            System.out.printf("%s\t", city);
//        }

//        System.out.println("\n===============================================================");

        //With List
        List<String> citiesList = new LinkedList<>(Arrays.asList(cities));
        citiesList.sort(myComparator);

        System.out.println(citiesList);

    }
}
