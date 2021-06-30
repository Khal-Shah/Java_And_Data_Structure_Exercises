package ch19exercises.ex07_generic_binary_search;

import ch19notes.sect_5_6_sorting_objects_raw_types.GenericSort;

/**
 * Chapter 19 (Generics) - Exercise 7:
 * (Generic binary search) Implement the following method using binary search.
 * public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
 *
 * @author Khaled
 */

public class BinarySearch_Generic
{
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
    {
        //elements need to be sorted for binary search
        GenericSort.sort(list);
        int low = 0;
        int high = list.length - 1;
        int mid;
        int keyIndex = -1;

        while(high >= low)
        {
            mid = (low + high) / 2;

            if(key.compareTo(list[mid]) < 0)
            {
                high = mid - 1;
            }

            else if(key.compareTo(list[mid]) > 0)
            {
                low = mid + 1;
            }

            else
            {
                return mid;
            }
        }

        return keyIndex;
    }


}
