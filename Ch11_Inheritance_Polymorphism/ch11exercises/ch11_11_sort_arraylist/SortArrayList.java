package ch11exercises.ch11_11_sort_arraylist;

import java.util.ArrayList;
import java.util.Collections;

/** Chapter 11 - Exercise 11:
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Integer> list)
 *
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays them in increasing order.
 *
 * @author Khaled Shah
 */

public class SortArrayList
{

    private ArrayList<Integer> list;

    public SortArrayList(ArrayList<Integer> list)
    {
        this.list = new ArrayList<>();
        this.list = list;
    }

    public static void sort(ArrayList<Integer> list)
    {
        Collections.sort(list);
        System.out.print("list = [");
        for(Object e: list)
        {
            System.out.print(e + ", ");
        }
        System.out.println("]");
    }

    @Override
    public String toString()
    {
        return "SortArrayList{" +
               "list=" + list +
               '}';
    }

}
