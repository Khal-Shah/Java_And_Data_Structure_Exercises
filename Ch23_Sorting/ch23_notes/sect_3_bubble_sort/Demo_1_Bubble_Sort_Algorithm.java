package ch23_notes.sect_3_bubble_sort;

import java.util.ArrayList;
import java.util.Random;

public class Demo_1_Bubble_Sort_Algorithm
{
    public static void main(String[] args)
    {
        //Using ArrayList instead of array
        ArrayList<Integer> numbers = getNumbers();
        System.out.println("Before sorting: " + numbers);

        bubbleSort(numbers);
        System.out.println("After sorting: " + numbers);

    }

    private static void bubbleSort(ArrayList<Integer> list)
    {
        boolean needNextPass = false;

        for(int i = 1; i < list.size(); i++)
        {
            //Inner loop starts at 0 always
            for(int j = 0; j < list.size() - i; j++)
            {
                if(list.get(j) > list.get(j + 1))
                {
                    //swap
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    needNextPass = true;
                }
            }
            if(!needNextPass)
            {
                break;
            }
        }
    }


    private static ArrayList<Integer> getNumbers()
    {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        //add 10 random 3 digit integers:
        for(int i = 0; i < 10; i++)
        {
            list.add((-999 + random.nextInt(1999)));
        }

        return list;
    }
}
