package ch19exercises.ex03_arraylist_distinct_elements;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Chapter 19 (Generics) - Exercise 3:
 * (Distinct elements in ArrayList) Write the following method that returns a new ArrayList.
 * <p>
 * The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 *
 * @author Khaled
 */

public class Distinct_GenericArrayList
{
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> newList = new ArrayList<>();

        for (E element : list)
        {
            if (!newList.contains(element))
            {
                newList.add(element);
            }
        }

        return newList;
    }

    @Test
    public void testRemoveDuplicates()
    {
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Cooper", "Kucherov", "Stamkos", "Point", "Stamkos", "Palat", "Kucherov", "Cooper");
        System.out.println("The unique names are: " + removeDuplicates(names));

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 5, 3, 1, 6, 3, 8);
        System.out.println("The unique numbers are: " + removeDuplicates(numbers));
    }
}
