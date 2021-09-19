package ch23_notes.sect_5_quick_sort;

import java.util.Arrays;

public class Demo1_QuickSort
{
    public static void main(String[] args)
    {
//        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        int[] list = {15, 108, 8, 16, 23, 4, 42};
        System.out.println("Before sorting: " + Arrays.toString(list));
        quickSort(list);
        System.out.println("After sorting: " + Arrays.toString(list));
    }

    //Sort method
    private static void quickSort(int[] list)
    {
        quickSort(list, 0, list.length - 1);
    }

    //    Helper method
    private static void quickSort(int[] list, int first, int last)
    {
        if(last > first)
        {
            int pivotIndex = partition(list, first, last);

//            Recursive call
            quickSort(list, first, pivotIndex - 1);     //left half
            quickSort(list, pivotIndex + 1, last);      //right half
        }
    }

    //Partition the array list [first...last] =>  find the correct position for the pivot
    private static int partition(int[] list, int first, int last)
    {
        //choose the first element as the pivot
        int pivot = list[first];
        //assign indices which will serve as counters
        int low = first + 1;    //everything after the pivot
        int high = last;

        //as long as the right counter is to the right
        while(high > low)
        {
            //search forward from left (less than or equal to pivot)
            while(low <= high && list[low] <= pivot)
            {
                //left counter increases/goes right
                low++;
            }

            //search backward from right
            while(low <= high && list[high] > pivot)
            {
                //right counter decreases/goes left
                high--;
            }

            //Swap two elements in the list (high with low)
            if(high > low)
            {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while(high > first && list[high] >= pivot)
        {
            high--;
        }

        //Swap pivot with list[high]
        if(pivot > list[high])        //if pivot value is greater than the item where the high index is
        {
            list[first] = list[high];
            list[high] = pivot;
            return high;        //return index of pivot
        }
        else
        {
            return first;
        }
    }
}
