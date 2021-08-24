package ch22_exercises.ex05_fill_sort_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Chapter 22 (Developing Efficient Algorithms) - Exercise 5:
 *
 *  (Fill and sort array) Write a program that randomly fills an array of integers and
 * then sorts it. The array size is entered by the user and the values are chosen at random
 * in {-1, 0, 1}. Analyze the time complexity of your program.
 *
 * Here is a sample run:
 * Enter the size: 10
 * 1 0 1 −1 0 1 −1 0 0 0
 * −1 −1 0 0 0 0 0 1 1 1
 *
 * @author Khaled Shah
 */

public class Complexity_Random_Array
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        //ask for array size
        System.out.print("Enter the size: ");
        int n = kb.nextInt();

        int[] numbersArray = getNumbersArray(n);

        System.out.println("Unsorted: " + (Arrays.toString(numbersArray)));

        Arrays.sort(numbersArray);
        System.out.println("Sorted complexity O(n) where n is the size of the array:\n" +
                        (Arrays.toString(numbersArray)));
    }

    //Complexity: O(n)
    private static int[] getNumbersArray(int n)
    {
        //Random values [-1, 1]
        Random random = new Random();
        int[] nums = new int[n];

        //populate:
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = (-1 + random.nextInt(3));
        }
        return nums;
    }
}
