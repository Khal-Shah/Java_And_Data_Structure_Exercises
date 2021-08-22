package ch22_notes.sect_07_effecient_primes;

import java.util.Scanner;

public class Demo_Primes
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Find all prime numbers <= n, enter n: ");
        int n = kb.nextInt();

        getAllPrimesRegular(n);
    }

    private static void getAllPrimesRegular(int n)
    {
        System.out.println("All prime numbers less than n are: ");
        int count = 0;

        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.print((i + "\t") + ((count % 10 == 0)? "\n" : ""));
            }
        }

        System.out.println("\n" + count + " prime numbers less than or equal to " + n);
    }

    private static boolean isPrime(int n)
    {
        int squareRoot = (int) Math.sqrt(n);
        for(int i = 2; i <= squareRoot; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
