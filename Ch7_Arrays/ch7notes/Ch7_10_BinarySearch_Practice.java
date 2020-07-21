package ch7notes;

/*  The Binary Search:
    The array has to be sorted in ascending order first.
    Same concept as before, we have an array (sorted), and we're looking for a key in this array.
    Step 1) Compare key with the element in the middle.
        Three possibilities
        a) Match
        b) Key > middle element: look for elements on the right of middle
        c) key < middle element: look for elements on the left of middle.
 */

import java.util.Arrays;

public class Ch7_10_BinarySearch_Practice
{
    public static void main(String[] args)
    {
//        int[] sortedArray = {1, 4, 7, 12, 19, 22, 29, 51, 55, 78, 83, 91, 101};
//        int key = 12;
//        int keyIndex = performBinarySearch(sortedArray, key);
//        System.out.println(keyIndex);

        int[] unsortedArray = {22, 42, 1, 31, 11, -3, 5, -31, 33, 901, 99, 11, 10};

        System.out.print("Before sorting, the list is: ");
        for(int e: unsortedArray)
        {
            System.out.print(e + ", ");
        }

        System.out.print("\nAfter sorting it's: ");
        unsortedArray = performSelectionSorting(unsortedArray);

        for(int e: unsortedArray)
        {
            System.out.print(e + ", ");
        }
//        Arrays.sort(unsortedArray);     //sorts it
//        for(int e: unsortedArray)
//        {
//            System.out.print(e + ", ");     //Will return it sorted
//        }
    }

    static int[] performSelectionSorting(int[] unsortedList)
    {
        int currentMinIndex;
        int currentMinVal;

        for(int i = 0; i < unsortedList.length; i++)
        {
            currentMinIndex = i;
            currentMinVal = unsortedList[i];

            for(int j = i + 1; j < unsortedList.length; j++)
            {
                if(unsortedList[j] < currentMinVal)
                {
                    currentMinVal = unsortedList[j];
                    currentMinIndex = j;
                }
            }
            //Action occured^ so currentMinIndex is no longer i (needs swapping)
            if(currentMinIndex != i)
            {
                unsortedList[currentMinIndex] = unsortedList[i];    //put the E we started with (i) where we found min
                unsortedList[i] = currentMinVal;   //put smallest E to where i started
            }
        }
        return unsortedList;
    }

    static int performBinarySearch(int[] sortedArray, int key)
    {
        int keyIndex = -1;
        int lowIndex = 0;
        int highIndex = sortedArray.length - 1;

        while (highIndex >= lowIndex)
        {
            int midIndex = (highIndex + lowIndex) / 2;
            System.out.println(sortedArray[midIndex]);

            if(sortedArray[midIndex] == key)
            {
                keyIndex = midIndex;
                break;
            }

            else if(key < sortedArray[midIndex])
            {
                highIndex = midIndex - 1;
            }

            else if(key > sortedArray[midIndex])
            {
                lowIndex = midIndex + 1;
            }

        }
        return keyIndex;
    }
}
