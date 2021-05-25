package ch18exercises;

import java.util.Scanner;

/** Chapter 18 (Recursion) - Exercise 25:
 * (String permutation) Write a recursive method to print all the permutations of a string
 * For example, for the string abc, the permuation is
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 *
 * (Hint: Define the following two methods. The second is a helper method.)
 * public static void displayPermutation(String s)
 * public static void displayPermutation(String s1, String s2)
 *
 * The first method simply invokes displayPermutation(" ", s).
 * The second method uses a loop to move a character from s2 to s1 and recursively invokes it with a new s1 and s2.
 * The base case is that s2 is empty and prints s1 to the console.
 * Write a test program that prompts the user to enter a string and displays all its permutations.
 *
 * @author Khaled
 */

public class Ch18_25_StringPermutations
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        String msg = kb.nextLine();

        displayPermutation(msg);

    }

    public static void displayPermutation(String s)
    {
        displayPermutation(" ", s);
    }

    public static void displayPermutation(String s1, String s2)
    {
        //base case: s2 is empty -> print s1
        if(s2.length() == 0)
        {
            System.out.print(s1);
        }

        //use loop to move a character from s2 to s1
        else
        {
            for(int i = 0; i < s2.length(); i++)
            {
                //System.out.println((s1 + s2.charAt(i) + s2.substring(0, i) + s2.substring(i + 1)));
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
            }
        }
    }
}
