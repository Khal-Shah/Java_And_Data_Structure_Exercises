package ch23_exercises.ex02_generic_merge_sort;

import org.junit.Test;

import java.util.*;

/**
 * (Generic merge sort) Write the following two generic methods using merge sort.
 *
 * The first method sorts the elements using the Comparable interface and the second uses the Comparator interface.
 * public static <E extends Comparable<E>> void mergeSort(E[] list)
 * public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
 */

public class Generic_MergeSort
{
    @Test
    public void testMergeSort()
    {
         Integer[] numbers = {26, 0, 30, 12, -9, 6, -9};

//        System.out.println("Before sorting: " + Arrays.toString(numbers));
//        mergeSort(numbers);
//        System.out.println("After sorting: " + Arrays.toString(numbers));

        String[] names = {"John", "Brandy", "Gemstone", "Abby", "Dylan"};
        Comparator<? super String> comparator = Comparator.comparing(String::valueOf);
        System.out.println("Before sorting: " + Arrays.toString(names));
        mergeSort(names, comparator);
        System.out.println("After sorting: " + Arrays.toString(names));

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Comparator<? super Integer> comparator2 = Comparator.comparing(Integer::intValue);
        mergeSort(numbers, comparator2);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    private <E extends Comparable<E>> void mergeSort(E[] list)
    {
        //merge sort: recursively divide into first half and second half then merge
        if(list.length > 1)
        {
                                //cast to E[] and use new Comparable
            E[] firstHalf = (E[]) new Comparable[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
            mergeSort(firstHalf);

            int secondHalfSrcPos = firstHalf.length;
            E[] secondHalf = (E[]) new Comparable[list.length - secondHalfSrcPos];
            System.arraycopy(list, secondHalfSrcPos, secondHalf, 0, secondHalf.length);
            mergeSort(secondHalf);

            //merge
            merge(list, firstHalf, secondHalf);
        }
    }

    private <E extends Comparable<E>> void merge(E[] list, E[] firstHalf, E[] secondHalf)
    {
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        int listIndex = 0;

        while(firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length)
        {
            if(firstHalf[firstHalfIndex].compareTo(secondHalf[secondHalfIndex]) > 0)
            {
                list[listIndex++] = secondHalf[secondHalfIndex++];
            }
            else
            {
                list[listIndex++] = firstHalf[firstHalfIndex++];
            }
        }

        while(firstHalfIndex < firstHalf.length)
        {
            list[listIndex++] = firstHalf[firstHalfIndex++];
        }

        while(secondHalfIndex < secondHalf.length)
        {
            list[listIndex++] = secondHalf[secondHalfIndex++];
        }
    }

    private static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
    {
        //first half second half then merge
        if(list.length > 1)
        {
            E[] firstHalf = (E[]) new Comparable[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
            mergeSort(firstHalf, comparator);

            int secondHalfSrcPos = list.length / 2;
            E[] secondHalf = (E[]) new Comparable[list.length - secondHalfSrcPos];
            System.arraycopy(list, secondHalfSrcPos, secondHalf, 0, secondHalf.length);
            mergeSort(secondHalf, comparator);

            merge(list, firstHalf, secondHalf, comparator);
        }
    }

    private static <E> void merge(E[] list, E[] first, E[] second, Comparator<? super E> comparator)
    {
        int firstIndex = 0;
        int secondIndex = 0;
        int listIndex = 0;

        while(firstIndex < first.length && secondIndex < second.length)
        {
            if(comparator.compare(first[firstIndex], second[secondIndex]) > 0)
            {
                list[listIndex++] = second[secondIndex++];
            }
            else
            {
                list[listIndex++] = first[firstIndex++];
            }
        }

        while(firstIndex < first.length)
        {
            list[listIndex++] = first[firstIndex++];
        }

        while(secondIndex < second.length)
        {
            list[listIndex++] = second[secondIndex++];
        }
    }
}
