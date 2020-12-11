package ch11exercises.ch11_04_max_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/** Chapter 11 - Exercise 4:
 * (Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers.
 * The method returns null if the list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list)
 *
 * @author Khaled Shah
 */

public class ArrayList_Max
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        //No concise way of adding many vals at once to arraylist
        //Integer[] temp = {25, 892, 95, 26, 926, 63, 693};

        //10 random Integers:
        Integer[] temp = new Integer[10];
        temp = getNums(temp);

        list.addAll(Arrays.asList(temp));

        int maxValue = max(list);

        System.out.println("The max value out of the following:");

        for(Integer e: list)
        {
            System.out.printf("%-9d", e);
        }

        System.out.printf("\nIs " + maxValue);
    }

    public static Integer max(ArrayList<Integer> list)
    {
        if(list.size() == 0 || list == null)
        {
            return null;
        }

        else
        {
            return Collections.max(list);
        }

    }

    public static Integer[] getNums(Integer[] num)
    {
        Random random = new Random();
        for(int i = 0; i < num.length; i++)
        {
            num[i] = random.nextInt() % 1000;       //3 digit Int
        }
        return num;
    }
}

