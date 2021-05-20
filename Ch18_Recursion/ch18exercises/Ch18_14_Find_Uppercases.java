package ch18exercises;

import java.util.Scanner;

/** Chapter 18 (Recursion) - Exercise 14:
 * (Find the number of uppercase letters in a string) Write a recursive method to return the number of uppercase
 * letters in a string. Write a test program that prompts the user to enter a string and displays the number of
 * uppercase letters in the string.
 *
 * @author Khaled
 */
public class Ch18_14_Find_Uppercases
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        String userMsg = kb.nextLine();

        System.out.println("Total number of uppercase letters in your string is " + getTotalUppercase(userMsg));
    }

    private static int getTotalUppercase(String msg)
    {
        int count = 0;
        return getTotalUppercase(msg, 0, count);
    }

    private static int getTotalUppercase(String msg, int low, int count)
    {
        if(low >= msg.length() - 1)
        {
            return count;
        }

        else if (Character.isUpperCase(msg.charAt(low)))
        {
            count++;
        }

        return getTotalUppercase(msg, ++low, count);
    }
}
