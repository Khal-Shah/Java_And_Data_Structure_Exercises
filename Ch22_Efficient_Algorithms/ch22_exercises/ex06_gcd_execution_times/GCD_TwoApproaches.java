package ch22_exercises.ex06_gcd_execution_times;

/**
 * Chapter 22 (Developing Efficient Algorithms) - Exercise 6:
 *
 * (Execution time for GCD) Write a program that obtains the execution time for finding the GCD of
 * every two consecutive Fibonacci numbers from the index 46 to index 50 using the algorithms in
 * Listings 22.3 and 22.4.
 *
 * Your program should print a table like this:
 * row1: _ |  46 47 48 49 50
 * row2: Listing22.3 GCD |
 * row3: Listing22.4 GCD |
 *
 * @author Khaled
 */

public class GCD_TwoApproaches
{
    public static void main(String[] args)
    {
        int fiboIndex = 46;
        int timeIndex = 0;

        long[] fiboNums = getFiboNums();     //Fibo numbers from 0 to 51
        long   fibo1, fibo2;
        long   gcd;

        do
        {
            fibo1 = fiboNums[fiboIndex];
            fibo2 = fiboNums[fiboIndex + 1];

            System.out.print("Listing 22.3 (regular): \nGCD(" + fibo1 + ", " + fibo2 + ") = ");
            long start = System.currentTimeMillis();
            gcd = getGCD223(fibo1, fibo2);
            System.out.println(gcd);
            long end = System.currentTimeMillis();
            System.out.println("Execution time: " + (end - start) + " ms.\n");

            System.out.print("Listing 22.4 (euclidean): \nGCD(" + fibo1 + ", " + fibo2 + ") = ");
            start = System.currentTimeMillis();
            gcd = getGCD224(fibo1, fibo2);
            System.out.println(gcd);
            end = System.currentTimeMillis();
            System.out.println("Execution time: " + (end - start) + " ms.");
            fiboIndex++;
            System.out.println("\n==========================\n");
        }
        while(++timeIndex < 5);
    }

    private static long getGCD223(long m, long n)
    {
        long gcd = 1;

        if(m % n == 0)
        {
            return n;
        }

        for(int i = (int) (n / 2); i >= 1; i--)
        {
            if(m % i == 0 && n % i == 0)
            {
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    private static long getGCD224(long m, long n)
    {
        //base case when smaller number divides into the bigger number evenly (return smaller number)
        if(m % n == 0)
        {
            return n;
        }

        //Continously shrink the bigger number and send it to smaller number's position
        return getGCD224(n, m % n);
    }


    private static long[] getFiboNums()
    {
        long[] fibo = new long[52];

        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i < fibo.length; i++)
        {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }

}
