package ch22_exercises.ex02_effecient_polynomials;

import java.util.Scanner;

/**
 * Chapter 22 (Developing Efficient Algorithms) - Exercise 2:
 *
 * (Efficient polynomial calculation) For a polynomial f(x) = an x^n + a(n-1) x^(n-1) + a(n-2) x^(n-2)
 * +...+ a1x + a0, write an efficient program that prompts the user to enter the degree n,
 * the coefficients a0 to an, and the value for x, and computes and displays ƒ(x).
 * <
 * Here is a sample run:
 * Enter n: 3
 * Enter x: 2
 * Enter a0: 1
 * Enter a1: 2
 * Enter a2: 3
 * Enter a3: 4
 * f(2.000000) = 49.000000
 *
 * @author Khaled
 */

public class PolynomialFunction_Output
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter n: ");
        int n = kb.nextInt();

        System.out.print("Enter x: ");
        int x = kb.nextInt();

        int[] a = new int[n + 1];

        for(int i = 0; i < a.length; i++)
        {
            System.out.print("Enter a" + i + ": ");
            a[i] = kb.nextInt();
        }

        showOutput(n, x, a);
    }

    private static void showOutput(int n, int x, int[] a)
    {
        //f(x) = an x^n + a(n-1) x^(n-1) + a(n-2) x^(n-2) +...+ a1x + a0
        //Ex if n = 3 and x = 2: (a3 * x^3) + (a2 * x^2) + (a1 * x) + a0

        double term = 0;

        for(int i = a.length - 1; i >= 0; i--)
        {
            term += (a[i] * Math.pow(x, n--));
        }

        System.out.printf("f(%d) = %.2f", x, term);
    }
}
