package ch19exercises.ex10_largest_element_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * * Chapter 19 (Generics) - Exercise 10:
 * (Largest element in ArrayList) Write the following method that returns the largest element
 * in an ArrayList:
 * public static <E extends Comparable<E>> E max(ArrayList<E> list)
 *
 * @author Khaled
 */

public class LargestElement_List
{
    public static <E extends Comparable<E>> E max(ArrayList<E> list)
    {
        return Collections.max(list);
    }

    @Test
    public void testMax()
    {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Montreal", "Tampa", "Los Vegas", "Long Island", "Boston", "Winnipeg");

        System.out.println("The largest element is: " + max(cities));

        ArrayList<Double> numbers = new ArrayList<>(5);
        Collections.addAll(numbers, 90.3, -27.2, 111.0, 39.9, 101.1);
        System.out.println("\nThe largest element is: " + max(numbers));

    }
}
