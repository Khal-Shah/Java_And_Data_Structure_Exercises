package ch11exercises.ch11_07_shuffle_arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/** Chapter 11 - Exercise 7:
 * (Shuffle ArrayList) Write the following method that shuffles the elements in an ArrayList of integers.
 * public static void shuffle(ArrayList<Integer> list)
 *
 * @author Khaled Shah
 */

public class Shuffle_ArrayList
{
    public static void main(String[] args)
    {
        System.out.println("Before shuffling, the arraylist contains: ");

        ArrayList<Integer> list = getList();

        for(Integer e: list)
        {
            System.out.printf("%-10d", e);
        }

        System.out.println("\n\nAfter shuffling, the arraylist contains:");

        shuffle(list);

        for(Integer e: list)
        {
            System.out.printf("%-10d", e);
        }

    }

    public static void shuffle(ArrayList<Integer> list)
    {
        Collections.shuffle(list);
    }

    public static ArrayList<Integer> getList()
    {
        ArrayList<Integer> lst = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++)
        {
            lst.add(i, random.nextInt() % 1000);
        }

        return lst;
    }
}
