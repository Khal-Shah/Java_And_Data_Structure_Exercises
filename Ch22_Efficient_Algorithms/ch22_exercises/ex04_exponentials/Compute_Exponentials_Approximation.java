package ch22_exercises.ex04_exponentials;

import org.junit.Test;

/**
 * Chapter 22 (Developing Efficient Algorithms) - Exercise 4:
 *
 * (Computing exponential) Write a method
 * public static double exp(double x, int n)
 * that computes exp(x, n), which is an approximation of the exponential of x to the order n.
 * exp(x, n) = x^0/0! + x^1/1! + x^2/2! +...+ x^n/n!
 *
 * Analyze the time complexity of your method.
 * Here is a sample run:
 * exp(1.0, 0) = 1.0
 * exp(1.0, 2) = 2.5
 * exp(1.0, 4) = 2.708333333333333
 * exp(1.0, 6) = 2.7180555555555554
 * exp(1.0, 8) = 2.71827876984127
 * exp(1.0, 10) = 2.7182818011463845
 *
 * @author Khaled
 */

public class Compute_Exponentials_Approximation
{
    @Test
    public void testExp()
    {
        System.out.println(exp(1, 0));
        System.out.println(exp(1, 2));
        System.out.println(exp(1, 4));
        System.out.println(exp(1, 6));
        System.out.println(exp(1, 8));
        System.out.println(exp(1, 10));
        System.out.println(exp(2, 3));
        System.out.println(exp(5, 2));
    }

    //exp(x, n) = x^0/0! + x^1/1! + x^2/2! +...+ x^n/n!
    //complexity O(n)
    public static double exp(double x, int n)
    {
        double expoResult = 0;

        int factorial = 1;

        for(int i = 0; i <= n; i++)
        {
            //square = prev square + prev number + number
            expoResult += (Math.pow(x, i)) / factorial;

            if(i >= 1)
            {
                factorial *= (i + 1);
            }
        }
            return expoResult;
    }

}
