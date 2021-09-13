package ch23_notes.sect_2_insertion_sort;

import java.util.Arrays;

/**
 * Chapter 23 - Section 2: Insertion Sort
 */

public class Demo1_InsertionSort
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 9, 4, 6, 5, -4};
        insertionSort(numbers);
    }

    public static void insertionSort(int[] list)
    {
        for(int i = 1; i < list.length; i++)
        {
            int currentElement = list[i];

            for(int j = i; j > 0; j--)
            {
                //if any of the previous are bigger
                if(list[j - 1] > currentElement)
                {
                    //shift previous E to right
                    list[j] = list[j - 1];
                    //place currentE in previous position
                    list[j - 1] = currentElement;
                }
            }
        }
        System.out.println("The sorted array is: " + Arrays.toString(list));
    }
}
