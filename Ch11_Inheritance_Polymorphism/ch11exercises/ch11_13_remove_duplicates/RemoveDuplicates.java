package ch11exercises.ch11_13_remove_duplicates;

import java.util.ArrayList;
import java.util.Scanner;


/** Chapter 11 - Exercise 13:
 * (Remove duplicates) Write a method that removes the duplicate elements from an array list
 * of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 *
 * Write a test program that prompts the user to enter 10 integers to a list and dis-
 * plays the distinct integers separated by exactly one space.
 *
 * Here is a sample run:
 * Enter ten integers: 34 5 3 5 6 4 33 2 2 4
 * The distinct integers are 34 5 3 6 4 33 2
 *
 * @author Khaled Shah
 */

public class RemoveDuplicates
{
    //Use Number because Integer extends it
    private ArrayList<Integer> list;

    public RemoveDuplicates(ArrayList<Integer> list)
    {
        this.list = new ArrayList<>();
        this.list = list;
    }

    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> copyList = new ArrayList<>();

        for(Integer integer : list)
        {
            if(!copyList.contains(integer))
            {
                copyList.add(integer);
            }

        }
        list.clear();
        list.addAll(copyList);
    }
    // Second approach:
    // Construct a new list from the set constructed from element of the original list
    //List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

    @Override
    public String toString()
    {
        return "RemoveDuplicates{" +
               "list=" + list +
               '}';
    }

    static Scanner kb = new Scanner(System.in);
    static final int LIMIT = 10;

    public static void main(String[] args)
    {
        System.out.println("Enter " + LIMIT + " integers:");
        int i = 0;
        ArrayList<Integer> nums = new ArrayList<>();

        while(i < LIMIT)
        {
            System.out.print("Integer " + (i + 1) + ": ");
            nums.add(i++, kb.nextInt());
        }

        System.out.println("You've entered: " + new RemoveDuplicates(nums));
        RemoveDuplicates.removeDuplicate(nums);
        System.out.print("The distinct integers are: " + nums);
    }
}
