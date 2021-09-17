package Ch23_Sorting.ch23_notes.ch23_notes.ex01_generic_bubble_sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Chapter 23 (Sorting) - Exercise 1:
 *
 * (Generic bubble sort) Write the following two generic methods using bubble sort.
 *
 * The first method sorts the elements using the Comparable interface, and the second uses the Comparator interface.
 * public static <E extends Comparable<E>> void bubbleSort(E[] list)
 * public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
 *
 * @author Khaled
 */

public class Generic_BubbleSort
{
    public static void main(String[] args)
    {
        Integer[] numbers = {10, -5, 42, 3};
        String[] names = {"Denmark", "Canada", "America", "Bulgaria"};
//        bubbleSort(numbers);
//        bubbleSort(names);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        bubbleSort(names, Comparator.comparing(String::valueOf));
        bubbleSort(numbers, Comparator.comparing(Integer::valueOf));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));

    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list)
    {
        boolean needNextPass = false;

        for(int i = 1; i < list.length; i++)
        {
            for(int j = 0; j < list.length - i; j++)
            {
                //if j > j+1
                if(list[j].compareTo(list[j + 1]) > 0)
                {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }

                if(!needNextPass)
                {
                    break;
                }
            }
        }
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
    {
        boolean needNextPass = false;

        for(int i = 1; i < list.length; i++)
        {
            for(int j = 0; j < list.length - i; j++)
            {
                if(comparator.compare(list[j], list[j + 1]) > 0)
                {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }

            if(!needNextPass)
            {
                break;
            }
        }
    }
}
