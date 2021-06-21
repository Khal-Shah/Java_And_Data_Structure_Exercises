package ch13exercises.ex20_quadratic_eq;

import java.util.Scanner;

/**
 * *  Here are some sample runs.
 *  * Enter a, b, c: 1 3 1
 *  * The roots are -0.381966 and -2.61803
 *  *
 *  * Enter a, b, c: 1 2 1
 *  * The root is -1
 *  *
 *  * Enter a, b, c: 1 2 3
 *  * The roots are -1.0 + 1.4142i and -1.0 + -1.4142i
 */

public class QuadraticEq_TestDriver
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a, b, c: ");
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        double c = kb.nextDouble();

        Quadratic_Equations roots = new Quadratic_Equations(a, b, c);
        roots.computeRoots();
    }
}
