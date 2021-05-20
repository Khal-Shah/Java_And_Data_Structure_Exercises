package ch18exercises;

import java.util.Scanner;

/** Chapter 18 - Exercise 11:
 * (Sum the digits in an integer using recursion) Write a recursive method that computes the sum of the digits in an integer.
 * Use the following method header:
 * public static int sumDigits(long n)
 *
 * For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
 * that prompts the user to enter an integer and displays its sum.
 *
 * @author Khaled
 */

public class Ch18_11_Sum_Digits
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        long num = kb.nextLong();

        System.out.println("\nThe sum of the digits for the number you entered is " + sumDigits(num));
    }

    private static int sumDigits(long n)
    {
        //extract and remove last number while adding it each time

        if(n == 0)
        {
            return 0;
        }
        return (int) (n % 10 + sumDigits(n / 10));
    }
}
