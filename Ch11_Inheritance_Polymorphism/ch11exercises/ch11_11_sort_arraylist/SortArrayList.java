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

    private ArrayList<Object> list = new ArrayList<>();

    public SortArrayList(ArrayList list)
    {
        this.list = list;
    }

    public static void sort(ArrayList<Integer> list)
    {
        Collections.sort(list);
    }

    @Override
    public String toString()
    {
        return "SortArrayList{" +
               "list=" + list +
               '}';
    }

}
