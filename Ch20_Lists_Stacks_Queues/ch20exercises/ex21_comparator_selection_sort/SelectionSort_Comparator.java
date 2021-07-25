package ch20exercises.ex21_comparator_selection_sort;

import ch13notes.sect_2_abstract_classes.Circle;
import ch13notes.sect_2_abstract_classes.GeometricObject;
import ch13notes.sect_2_abstract_classes.Rectangle;
import ch20notes.sect_6_comparator.GeometricObjectComparator;
import org.junit.Test;

import java.util.*;

/** Chapter 20 (Lists, Stacks, & Queues) - Exercise 21:
 *
 * (Use Comparator) Write the following generic method using selection sort and a comparator:
 * public static <E> void selectionSort(E[] list, Comparator<? super E> comparator)
 *
 * Write a test program that creates an array of 10 GeometricObjects and invokes this method using the
 * GeometricObjectComparator introduced in Listing 20.5 to sort the elements.
 *
 * Display the sorted elements. Use the following statement to create the array:
 * GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5), new Circle(5.5), new Rectangle(2.4, 5),
 * new Circle(0.5), new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1), new Circle(6.5), new Rectangle(4, 5)};
 *
 * Also in the same program, write the code that sorts six strings by their last character. Use the following statement
 * to create the array:
 * String[] list2 = {"red", "blue", "green", "yellow", "orange", "pink"};
 *
 * @author Khaled
 */

public class SelectionSort_Comparator
{
    public static void main(String[] args)
    {
        //Create object
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5), new Circle(5.5), new Rectangle(2.4, 5),
                                   new Circle(0.5), new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                                   new Circle(6.5), new Rectangle(4, 5)};

        GeometricObjectComparator comparator = new GeometricObjectComparator();
        selectionSort(list1, comparator);
    }

    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator)
    {
        List<E> geometricObjects = new LinkedList<>(Arrays.asList(list));
        System.out.println("Before sorting:");
        displayGeometricObjects(geometricObjects);

        //sort our list (pass comparator as arg)
        geometricObjects.sort(comparator);

        System.out.println("\nAfter sorting:");
        displayGeometricObjects(geometricObjects);
    }


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

    //Program to sort an array of string based on their last character
    @Test
    public void testString()
    {
        String[] colors = {"red", "blue", "green", "yellow", "orange", "pink"};
        System.out.println("Before sorting:");
        for(String color : colors)
        {
            System.out.print(color + " \t");
        }

        //sort by last character: red, blue, orange, pink, green, yellow
        Arrays.sort(colors, Comparator.comparing(e -> e.charAt(e.length() - 1)));

        System.out.println("\n\nAfter sorting:");
        for(String color : colors)
        {
            System.out.print(color + "\t");
        }
    }
}
