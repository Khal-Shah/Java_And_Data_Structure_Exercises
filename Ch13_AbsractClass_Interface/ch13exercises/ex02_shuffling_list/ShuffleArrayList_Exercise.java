package ch13exercises.ex02_shuffling_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/** Chapter 13 - Exercise 2:
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 *
 * public static void shuffle(ArrayList<Number> list)
 *
 * @author Khaled Shah
 */
public class ShuffleArrayList_Exercise
{

    public static void shuffle(ArrayList<Number> list)
    {
        ArrayList<Number> shuffledList = new ArrayList<>();
        shuffledList.addAll(list);                                  //og elements to new list

        Collections.shuffle(shuffledList);

        for(Number e: shuffledList)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args)
    {
        ArrayList<Number> list = new ArrayList<>(3);
        list.add(3.3);
        list.add(8);
        list.add(5.5);
        list.add(-4);

        System.out.println("Before shuffling: ");
        for(Object e: list)
        {
            System.out.println(e);
        }

        System.out.println("After shuffling:");
        shuffle(list);
    }


}
