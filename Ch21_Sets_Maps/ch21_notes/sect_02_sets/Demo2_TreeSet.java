package ch21_notes.sect_02_sets;

import ch13exercises.ex07_colorable_interface.Square;
import ch13notes.sect_2_abstract_classes.Circle;
import ch13notes.sect_2_abstract_classes.GeometricObject;
import ch13notes.sect_2_abstract_classes.Rectangle;
import ch20notes.sect_6_comparator.GeometricObjectComparator;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo2_TreeSet
{
    //test treeset using comparable (default)
    @Test
    public void testTreeSet()
    {
        //Since there are some new methods, use TreeSet declared type
        TreeSet<String> cities = new TreeSet<>();
        Collections.addAll(cities, "Tampa Bay", "Montreal", "Las Vegas", "Long Island",
                           "Milwaukee", "Phoenix");
        //by default gets sorted alphabetically
        System.out.println(cities);
        System.out.println("first: " + cities.first());
        System.out.println("last: " + cities.last());

        //headset (left): all e < provided
        System.out.println(cities.headSet("Montreal"));
        //tailset (right): all e >= provided
        System.out.println(cities.tailSet("Milwaukee"));

        //Now test with Double
        TreeSet<Double> numbers = new TreeSet<>();
        Collections.addAll(numbers, 22.5, 11.2, -5.3, 9.0, -33.1, 20.2);
        System.out.println("\n===================================================\n" + numbers);
        System.out.println("tailset(9.0): " + numbers.tailSet(9.0));
        System.out.println("higher(9.0): " + numbers.higher(9.0));
        System.out.println("lower(9.0): " + numbers.lower(9.0));

        System.out.println("floor(9.0): " + numbers.floor(9.0));
        System.out.println("ceiling(9.1): " + numbers.ceiling(9.1));

        System.out.println("pollFirst(): " + numbers.pollFirst());
        System.out.println(numbers);

    }

    //Test treeset using comparator
    @Test
    public void testTreeSetComparator()
    {
        //Make a treeset of GeometricObjects
        TreeSet<GeometricObject> geometricObjects = new TreeSet<>(new GeometricObjectComparator());
        //need to specify Comparator since it's a custom class and it won't know how to sort
        // TreeSet without it...this Comparator sorts by area

        Collections.addAll(geometricObjects, new Rectangle(5, 5), new Square(5), new Circle(3),
                           new Rectangle(4, 1), new Circle(10));
//        System.out.println("Geometric Objects added: " + geometricObjects);
        for(GeometricObject o: geometricObjects)
        {
            System.out.println(o.getClass().getSimpleName() + ": " + o.getArea());
        }
        System.out.println("\nSize: " + geometricObjects.size());
        //will be 4 even though we added 5 elements because one of them was duplicate (same area)
    }

    //Use comparator to "define" what is considered a duplicate (same length)
    @Test
    public void testTreeSetComparatorString()
    {
        TreeSet<String> countries = new TreeSet<>(Comparator.comparing(String::length));
        Collections.addAll(countries, "Belgium", "Venezuela", "Canada", "USA", "Zimbabwe", "China", "Mexico");

        System.out.println(countries);
    }

}
