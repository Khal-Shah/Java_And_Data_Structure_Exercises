package ch19exercises.ex04_generic_linear_search;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Chapter 19 (Generics) - Exercise 4:
 * (Generic linear search) Implement the following generic method for linear search.
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 *
 * @author Khaled
 */

public class Generic_LinearSearch
{
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
    {
        int index = -1;

        //linear search: loop through list and return the index of key
        for(int i = 0; i < list.length; i++)
        {
            if(list[i].compareTo(key) == 0)
            {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        Integer[] list = {3, 4, 5, 1, -3, -5, -1};
        System.out.println(linearSearch(list, 2));
        System.out.println(linearSearch(list, 5));

        ArrayList<Double> doublesList = new ArrayList<>();
        Collections.addAll(doublesList, 2.5, 9.2, 15.5, 1.0, -5.5, 21.5);

        //convert arrayList to array:
        Double[] nums = new Double[doublesList.size()];
        doublesList.toArray(nums);

        System.out.println("The key of 1.0 can be found at index: " + linearSearch(nums, 1.0));
    }
}
