package ch19exercises.ex09_generic_list_sort;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Chapter 19 (Generics) - Exercise 9:
 * (Sort ArrayList) Write the following method that sorts an ArrayList:
 * public static <E extends Comparable<E>> void sort(ArrayList<E> list)
 *
 * @author Khaled
 */
public class Generic_Sort_List
{
    //method (header) slightly altered to make it more interesting (return cloned list instead of void)
    public static <E extends Comparable<E>> ArrayList<E> sort(ArrayList<E> list)
    {
        @SuppressWarnings("unchecked")
        ArrayList<E> clonedSortedList = (ArrayList<E>) list.clone();
        Collections.sort(clonedSortedList);
        return clonedSortedList;
    }

    private static final int CAPACITY = 10;

    @Test
    public void testSort()
    {
        Random random = new Random();
        ArrayList<Double> numbers = new ArrayList<>(CAPACITY);

        int i = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        while(i < CAPACITY)
        {
            numbers.add(Double.parseDouble(df.format((-9 + random.nextDouble() * 19))));
            i++;
        }

        System.out.println("Before sorting: " + numbers + "\nAfter sorting: " + sort(numbers));

        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Montreal", "Tampa", "Los Vegas", "Long Island", "Boston", "Winnipeg");

        System.out.println("\nBefore sorting: " + cities + "\nAfter sorting: " + sort(cities));
    }
}
