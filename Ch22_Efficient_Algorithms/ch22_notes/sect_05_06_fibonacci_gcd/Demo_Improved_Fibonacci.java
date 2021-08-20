package ch22_notes.sect_05_06_fibonacci_gcd;

import org.junit.Test;

public class Demo_Improved_Fibonacci
{
    @Test
    public void testImprovedFibo()
    {
        System.out.println("The fibonacci number for index 5 is " + getFibonacci(5));
        System.out.println("The fibonacci number for index 6 is " + getFibonacciImproved(6));

        System.out.println("The fibonacci number for index 7 is " + getFibonacciImproved(7));

        System.out.println("The fibonacci number for index 1 is " + getFibonacciImproved(1));

    }

    //Linear complexity: O(n)
    private int getFibonacciImproved(int n)
    {
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;

        if(n == 0)
        {
            return f0;
        }

        else if(n == 1)
        {
            return f1;
        }

        for(int i = 2; i <= n; i++)
        {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }

        return f2;
    }


    //Exponential complexity: O(2^n)
    private int getFibonacci(int n)
    {
        //base cases: n = 0 and n = 1
        if(n == 0)
        {
            return 0;
        }

        else if(n == 1)
        {
            return 1;
        }

        //leftmost gets called first
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
