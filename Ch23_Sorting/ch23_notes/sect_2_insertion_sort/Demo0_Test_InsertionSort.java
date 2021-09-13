package ch23_notes.sect_2_insertion_sort;

import org.junit.Test;

import java.util.Arrays;

public class Demo0_Test_InsertionSort
{
    @Test
    public void testInsertionSort()
    {
        //originalList = 7 3 1 2 4 6
        int[] list = {7, 3, 1, 2, 4, 6};

        for(int i = 1; i < list.length; i++)
        {
            int currentElement = list[i];

//                        while(j > 0)
//            {
//                if(list[j - 1] > currentElement)
//                {
//                    //everything has to shift by 1
//                    list[j] = list[j - 1];
//                    list[j - 1] = currentElement;
//                }
//                j--;
//            }

//^works, below is with for loop

            for(int j = i; j > 0; j--)
            {
                //if any of the previous elements are bigger
                if(list[j - 1] > currentElement)
                {
                    //swap
                    list[j] = list[j - 1];      //shift
                    list[j - 1] = currentElement;
                }
            }
        }

        System.out.println("Sorted list: " + Arrays.toString(list));
    }
}

