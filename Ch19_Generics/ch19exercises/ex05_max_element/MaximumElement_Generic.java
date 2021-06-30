package ch19exercises.ex05_max_element;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Chapter 19 (Generics) - Exercise 5:
 * (Maximum element in an array) Implement the following method that returns the maximum element in an array.
 * public static <E extends Comparable<E>> E max(E[] list)
 *
 * @author Khaled
 */

public class MaximumElement_Generic
{
     public static <E extends Comparable<E>> E max(E[] list)
     {
         E maxE = list[0];

         for(E element: list)
         {
             if(element.compareTo(maxE) > 0)
             {
                 maxE = element;
             }
         }

         return maxE;
     }

    public static void main(String[] args)
    {
        String[] cities = {"Montreal", "Washington", "Atlanta", "Toronto", "Boston"};
        System.out.println("The city with the highest starting letter is " + max(cities));

        ArrayList<Double> numbers = new ArrayList<>(5);
        Collections.addAll(numbers, 90.3, -27.2, 111.0, 39.9, 101.1);

        //ArrayList to Array:
        Double[] nums = new Double[numbers.size()];
        numbers.toArray(nums);

        System.out.println("The max number is " + max(nums));

    }

}
