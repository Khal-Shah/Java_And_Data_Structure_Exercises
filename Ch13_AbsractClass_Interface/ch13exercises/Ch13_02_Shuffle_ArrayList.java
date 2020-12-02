package ch13exercises;

import java.util.ArrayList;
import java.util.Collections;

/** Chapter 13 - Exercise 2:
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 * public static void shuffle(ArrayList<Number> list)
 *
 * @author Khaled Shah
 */
public class Ch13_02_Shuffle_ArrayList
{

    public static void shuffle(ArrayList<Number> list)
    {
        Collections.shuffle(list);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(3);
        list.add(3);
        list.add(8);
        list.add(5);

        for(Integer e: list)
        {
            System.out.println(e);
        }

        //shuffle(list);
        System.out.println("After shuffling:");
    }


}
