package ch18exercises;

import java.util.ArrayList;
import java.util.Scanner;

/** Chapter 18 (Recursion) - Exercise 17:
 *(Occurrences of a specified character in an array) Write a recursive method that finds the number
 * of occurrences of a specified character in an array.
 *
 * You need to define the following two methods.
 * The second one is a recursive helper method.
 *
 * public static int count(char[] chars, char ch)
 * public static int count(char[] chars, char ch, int high)
 *
 * Write a test program that prompts the user to enter a list of characters in one line,
 * and a character, and displays the number of occurrences of the character in the list.
 *
 * @author Khaled
 */

public class Ch18_17_Occurrence_inArray
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a list of characters (0 to end): ");
        ArrayList<Object> list = new ArrayList<>();

        char userChar;
        do
        {
            userChar = kb.next().charAt(0);
            list.add(userChar);
        } while(userChar != '0');

        //remove last 0
        list.remove((Object) '0');

        //convert list to char array
        char[] chars = new char[list.size()];
        int i = 0;

        System.out.print("You've entered: ");

        for(Object o: list)
        {
            chars[i++] = (char) o;
            System.out.print(o + "\t");
        }

        char ch;
        System.out.print("\nWhich character out of these would you like to count the occurrence of? ");
        ch = kb.next().charAt(0);

        System.out.println(ch + " occurs " + count(chars, ch) + " times.");
    }

    public static int count(char[] chars, char ch)
    {
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int high)
    {
        if(high < 0)
        {
            return 0;
        }
       return ((chars[high--] == ch)? 1 : 0) + count(chars, ch, high);
    }
}
