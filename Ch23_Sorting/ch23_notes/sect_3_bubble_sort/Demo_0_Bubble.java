package ch23_notes.sect_3_bubble_sort;
import org.junit.Test;

import java.util.Arrays;

public class Demo_0_Bubble
{
    @Test
    public void testBubbleSort()
    {
        int[] list = {2, 9, 5, 4, 8, 1};
        boolean needNextPass = true;

            for(int i = 1; i < list.length && needNextPass; i++)
            {
                needNextPass = false;
                for(int j = 0; j < list.length - i; j++)
                {
                    if(list[j] > list[j + 1])
                    {
                        //swap
                        int next = list[j + 1];
                        list[j + 1] = list[j];
                        list[j] = next;
                        needNextPass = true;
                    }
                }
            }

        System.out.println(Arrays.toString(list));
    }
}
