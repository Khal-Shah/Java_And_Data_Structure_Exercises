package ch22_exercises.ex01_squares;

import java.util.Scanner;

/**
 * Chapter 22 (Developing Efficient Algorithms) - Exercise 1:
 *
 * (Natural numbers and their squares) Knowing that (x + 1)^2 = x^2 + 2x + 1, and that multiplication
 * is more time-consuming than addition, write an efficient program that displays the first ten
 * natural numbers and their squares.
 * Knowing that (x + 1)^3 = x^3 + 3x^2 + 3x + 1, the same process can be followed to display the cubes
 * of these numbers.
 *
 * Here is a sample run:
 * 0^2 = 0
 * 1^2 = 1
 * 2^2 = 4
 * ...
 * 8^2 = 64
 * 9^2 = 81
 * 10^2 = 100
 *
 * @author Khaled
 */

public class NaturalNumbers_Squares
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter n for the the amount of squares (0 to n): ");
        int n = kb.nextInt();

        displaySquares(n);
    }

    //Complexity: O(n)
    private static void displaySquares(int n)
    {
        //square of a number = square of previous number + previous number + number
        //Ex: 6^2 = 25 + 6 + 5
        //Ex: 7^2 = 36 + 7 + 6 = 49

        int square = 0;
        int prevX = 0;

        for(int x = 0; x <= n; x++)
        {
            square += x + prevX;
            System.out.printf("%3d^2 = %3d\n", x, square);
            prevX = x;
        }

    }
}
