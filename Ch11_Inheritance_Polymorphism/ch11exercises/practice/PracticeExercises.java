package ch11exercises.practice;


import java.util.ArrayList;

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

public class PracticeExercises
{

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(45);
        list1.add(4);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(33);
        list1.add(51);
        list1.add(5);
        list1.add(4);
        list1.add(13);

        ArrayList<Integer> combinedList = union(list1, list2);

        System.out.println("The combined list is " + combinedList);

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> combined = new ArrayList<>();
        combined.addAll(list1);
        combined.addAll(list2);
        return combined;
    }

}
