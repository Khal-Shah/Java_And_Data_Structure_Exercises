package ch7notes;

/*
The linear search approach compares the key element key sequentially with each element in the array.
It continues to do so until the key matches an element in the array or the array is exhausted without a match being found.
If a match is made, the linear search returns the index (the first one that matches. If no match return -1
 */

public class Ch7_10_LinearSearch_Practice
{
    public static void main(String[] args)
    {
        int[] list = {3, 5, 99, 31, -3, -6, 20, 5, 20};
        int key = 9;
        int keyIndex = linearSearch(list, key);

        System.out.println("The key element" + key + " can be found in index " + keyIndex);
    }

    static int linearSearch(int[] list, int key)
    {
        int keyIndex = -1;

        for(int i = 0; i < list.length; i++)
        {
            if(key == list[i])
            {
                keyIndex = i;
                break;
            }
        }
        return keyIndex;
    }
}

/*

The linear search method compares the key with each element in the array. The elements can be in any order.
On average, the algorithm will have to examine half of the elements in an array before finding the key, if it exists.
Since the execution time of a linear search increases linearly as the number of array elements increases,
linear search is inefficient for a large array.
 */