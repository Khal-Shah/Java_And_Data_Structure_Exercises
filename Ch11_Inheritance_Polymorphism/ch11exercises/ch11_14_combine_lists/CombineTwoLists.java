package ch11exercises.ch11_14_combine_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** Chapter 11 - Exercise 14:
 * (Combine two lists) Write a method that returns the union of two array lists of integers using the following header:
 * public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2)
 *
 * For example, the union of two array lists {2,3,1,5} and {3,4,6} is {2, 3, 1, 5, 3, 4, 6}.
 *
 * Write a test program that prompts the user to enter two lists, each with five integers,
 * and displays their union. The numbers are separated by exactly one space in the output.
 *
 * Here is a sample run:
 * Enter five integers for list1: 3 5 45 4 3
 * Enter five integers for list2: 33 51 5 4 13
 * The combined list is 3 5 45 4 3 33 51 5 4 13
 *
 * @author Khaled Shah
 */
public class CombineTwoLists
{
    static Scanner kb = new Scanner(System.in);
    static final int LIMIT = 5;

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter " + LIMIT + " integers for list1 and list2 below.");
        int i = 0;

        while(i < LIMIT)
        {
            System.out.print("\nList1 integer " + (i + 1) + ": ");
            list1.add(i, kb.nextInt());

            System.out.print("List2 integer " + (i + 1) + ": ");
            list2.add(i, kb.nextInt());
            i++;
        }

        System.out.print("The combined list is: ");

        for(Integer E: union(list1, list2))
        {
            System.out.print(E + " ");
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        Integer[] list2Array = new Integer[list2.size()];
        list2.toArray(list2Array);

        list1.addAll(Arrays.asList(list2Array));
        //Could also just do list1.addAll(list2);
//        list1.addAll(list2);
        return list1;
    }
}
