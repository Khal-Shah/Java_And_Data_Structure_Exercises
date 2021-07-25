package ch20exercises.ex19_geo_obj_comp;

import ch13notes.sect_2_abstract_classes.Circle;
import ch13notes.sect_2_abstract_classes.GeometricObject;
import ch13notes.sect_2_abstract_classes.Rectangle;
import ch20notes.sect_6_comparator.GeometricObjectComparator;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** Chapter 20 (Lists, Stacks, & Queues) - Exercise 19:
 *
 * (Use Comparator) Write the following generic method using selection sort and a comparator:
 * public static <E> void selectionSort(E[] list, Comparator<? super E> comparator)
 * <p>
 * Write a test program that creates an array of 10 GeometricObjects and invokes this method using
 * the GeometricObjectComparator introduced in Listing 20.4 to sort the elements.
 * <p>
 * Display the sorted elements. Use the following statement to create the array:
 * GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5), new Circle(5.5), new Rectangle(2.4, 5),
 * new Circle(0.5), new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1), new Circle(6.5),
 * new Rectangle(4, 5)};
 *
 * @author Khaled
 */

public class Test_GeoObj_Comp
{
    @Test
    public void testGeoObject()
    {
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5), new Circle(5.5), new Rectangle(2.4, 5),
                                   new Circle(0.5), new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1), new Circle(6.5),
                                   new Rectangle(4, 5)};


        selectionSort(list1, new GeometricObjectComparator());
    }

    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator)
    {
        System.out.println("Before sorting array:");

        //to use List after sorting array
        GeometricObject[] originalList = (GeometricObject[]) list.clone();


        displayGeometricObjects(list);

        //sort array using selection sort
        E   currentMin;
        int currentMinIndex;

        //use compare method (from GeometricComparator class) to compare each object
        for(int i = 0; i < list.length - 1; i++)
        {
            currentMin = list[i];
            currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++)
            {
                //if current element is greater than any of the e to the right, make the right e current e
                if(comparator.compare(currentMin, list[j]) > 0)
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i)
            {
                list[currentMinIndex] = list[i];    //put bigger e where we found current e
                list[i] = currentMin;
            }
        }

        System.out.println("\nAfter sorting array:");
        displayGeometricObjects(list);

        System.out.println("\nConverting to List...");

        System.out.println("\nOriginal array:");
        displayGeometricObjects(originalList);

        //sorting list as oppose to the arduous process of selection sorting an array
        List<GeometricObject> geoObjList = Arrays.asList(originalList);
        geoObjList.sort(Comparator.comparing(GeometricObject::getArea));

        System.out.println("\nSorted using \"Comparator.comparing(GeometricObject:: getArea()\" " +
                           "after converting to list: ");
        displayGeometricObjects(geoObjList);

    }

    private static<E> void displayGeometricObjects(E[] list)
    {
        int index = 0;

        for(E o : list)
        {
            System.out.printf("%d) %s: %.2f\t\t", ++index, o.getClass().getSimpleName(),
                              ((GeometricObject) o).getArea());

            System.out.print((index % 5 == 0) ? "\n" : "");
        }
    }

    //overloaded method
    private static<E> void displayGeometricObjects(List<E> list)
    {
        int index = 0;

        for(E o : list)
        {
            System.out.printf("%d) %s: %.2f\t\t", ++index, o.getClass().getSimpleName(),
                              ((GeometricObject) o).getArea());

            System.out.print((index % 5 == 0) ? "\n" : "");
        }
    }


}
