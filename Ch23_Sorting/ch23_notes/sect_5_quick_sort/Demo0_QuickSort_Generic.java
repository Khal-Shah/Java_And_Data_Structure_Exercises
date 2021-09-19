package ch23_notes.sect_5_quick_sort;

import org.junit.Test;

import java.util.Arrays;

public class Demo0_QuickSort_Generic
{
    @Test
    public void testQuickSort()
    {
        Integer[] numbers = {4, 16, 42, 16, 8, 15, 23};
        System.out.println("Before sorting: " + Arrays.toString(numbers));

        quickSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    private <E extends Comparable<E>> void quickSort(E[] list)
    {
        quickSort(list, 0, list.length - 1);
    }

    private <E extends Comparable<E>> void quickSort(E[] list, int first, int last)
    {
        if(last > first)
        {
            int pivotIndex = partition(list, first, last);

            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    private <E extends Comparable <E>> int partition(E[] list, int first, int last)
    {
        //choose first as pivot
        E pivot = list[first];
        int low = first + 1;        //right of pivot
        int high = last;

        while(high > low)
        {
            while(low <= high && list[low].compareTo(pivot) <= 0)
            {
                low++;
            }

            while(low <= high && list[high].compareTo(pivot) > 0)
            {
                high--;
            }

            if(high > low)
            {
                E temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while(high > first && list[high].compareTo(pivot) >= 0)
        {
            high--;
        }

        if(pivot.compareTo(list[high]) > 0)
        {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else
        {
            return first;
        }
    }
}
