package ch23_notes.sect_4_merge_sort;

import org.junit.Test;

import java.util.Arrays;

public class Demo_1_MergeSort
{
    @Test
    public void testMergeSort()
    {
        int[] list = {2, 9, 5, 4, 8, 1, 6, 7};
        System.out.print("Before sorting: " + Arrays.toString(list) +"\nAfter sorting: ");
        mergeSort(list);

        System.out.println(Arrays.toString(list));
    }

    private void mergeSort(int[] list)
    {
        if(list.length > 1)
        {
            //merge sort first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
            mergeSort(firstHalf);

            //merge sort second half
            int   startingPosSrc = list.length / 2;
            int[] secondHalf     = new int[list.length - startingPosSrc];
            System.arraycopy(list, startingPosSrc, secondHalf, 0, secondHalf.length);
            mergeSort(secondHalf);

            //merge the two halves together
            merge(firstHalf, secondHalf, list);
        }
    }

    //
    private int[] merge(int[] firstHalf, int[] secondHalf, int[] list)
    {
        int firstIndex = 0;
        int secondIndex = 0;
        int listIndex = 0;

        while(firstIndex < firstHalf.length && secondIndex < secondHalf.length)
        {
            if(firstHalf[firstIndex] < secondHalf[secondIndex])
            {
                list[listIndex++] = firstHalf[firstIndex++];
            }
            else
            {
                list[listIndex++] = secondHalf[secondIndex++];
            }
        }

        while(firstIndex < firstHalf.length)
        {
            list[listIndex++] = firstHalf[firstIndex++];
        }

        while(secondIndex < secondHalf.length)
        {
            list[listIndex++] = secondHalf[secondIndex++];
        }

        return list;
    }

}
