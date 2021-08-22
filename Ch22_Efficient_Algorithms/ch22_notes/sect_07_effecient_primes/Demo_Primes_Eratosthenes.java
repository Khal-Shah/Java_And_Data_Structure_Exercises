package ch22_notes.sect_07_effecient_primes;

import java.util.Scanner;

public class Demo_Primes_Eratosthenes
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the prime numbers you want that are smaller or equal to this number: ");
        int n = kb.nextInt();

        System.out.println("All the prime numbers <=" + n + " are:");
        showEratosthenesPrimes(n);
    }

    /*
     * Algorithm: make a list of booleans from 0 to given number (index corresponding to the number)
     * We don't care about primes 0 and 1 so we mark them false right away. The rest are all true
     * Then mark all the numbers (indices) which are divisible by 2 and are greater than or equal to the square of it false.
     * Mark all number false that are divisible by 3 and >= (3)^2 same as above but with 3
     * Do the same for 5
     * Then 7
     */
    private static void showEratosthenesPrimes(int n)
    {
        boolean[] primes = new boolean[n + 1];
        //because primes[0] should be 0

        //initialize
        for(int i = 2; i < primes.length; i++)
        {
            primes[i] = true;
        }

        for(int k = 2; k * k <= n; k++)
        {
            if(primes[k])
            {
                //iterating over the multiples
                for(int i = k; i * k <= n; i++)
                {
                    primes[k * i] = false;      //mark all the multiples false
                }
            }
        }

        int count = 0;

        for(int i = 2; i < primes.length; i++)
        {
            if(primes[i])
            {
                count++;
                System.out.printf((count % 10 != 0)? "%-7d" : "%-7d\n", i, i);
            }
        }

        System.out.println("\n");
        System.out.print(count + " primes smaller than or equal to " + n);
    }
}
