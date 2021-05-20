package ch18exercises;

import java.util.ArrayList;
import java.util.Scanner;

/** Chapter 18 (Recursion) - Exercise 16:
 * (Find the number of uppercase letters in an array) Write a recursive method to return the number of uppercase
 * letters in an array of characters.
 *
 * You need to define the following two methods. The second one is a recursive helper method.
 * public static int count(char[] chars)
 * public static int count(char[] chars, int high)
 *
 * Write a test program that prompts the user to enter a list of characters in one line and displays the number of
 * uppercase letters in the list.
 *
 * @author Khaled
 */

public class Ch18_16_UpperCase_inArray
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a list of characters (a non alphabetic character will end the list): ");
        ArrayList<Character> list = new ArrayList<>();
        char                 in   = 'a';

        while(kb.hasNext())
        {
            in = kb.next().charAt(0);

            if(Character.isLetter(in))
            {
                list.add(in);
            }
            else
            {
                break;
            }
            kb.nextLine();
        }

        System.out.print("You've entered: ");

        for(char e: list)
        {
            System.out.print(e + "\t");
        }

        Character[] charsEntered = list.toArray(new Character[0]);


        System.out.println("\nTotal number of uppercases = " + count(charsEntered));
    }

    public static int count(Character[] chars)
    {
        return count(chars, chars.length - 1);
    }

    public static int count(Character[] chars, int high)
    {
        if(high < 1)
        {
            return 0;
        }

        else
        {
            return ((Character.isUpperCase(chars[high]))? 1 : 0) + count(chars, --high);
        }
    }

}
