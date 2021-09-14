package ch22_exercises.ex08_store_all_primes;

import java.io.*;

/**
 * Chapter 22 (Developing Efficient Algorithms) - Exercise 8:
 * <p>
 * (All prime numbers up to 10,000,000,000) Write a program that finds all prime numbers up to 10,000,000,000.
 * There are approximately 455,052,511 such prime numbers.
 * <p>
 * Your program should meet the following requirements:
 * ■■ Your program should store the prime numbers in a binary data file, named PrimeNumbers.dat.
 * When a new prime number is found, the number is appended to the file.
 * <p>
 * ■■ To find whether a new number is prime, your program should load the prime numbers from the file
 * to an array of the long type of size 10000.
 * If no number in the array is a divisor for the new number, continue to read the next 10000 prime
 * numbers from the data file, until a divisor is found or all numbers in the file are read.
 * If no divisor is found, the new number is prime.
 * <p>
 * ■■ Since this program takes a long time to finish, you should run it as a batch job from a UNIX machine.
 * If the machine is shut down and rebooted, your program should resume by using the prime numbers
 * stored in the binary data file rather than start over from scratch.
 *
 * @author Khaled
 */

public class All_Primes
{
    //up to N prime numbers
    static final int N = 1000;

    public static void main(String[] args) throws IOException
    {
        //append prime numbers to .txt file first

        FileOutputStream file = new FileOutputStream("Ch22_Efficient_Algorithms/ch22_exercises/ex08_store_all_primes/primes.txt");
        try(DataOutputStream output = new DataOutputStream(file))
        {
            for(int i = 2; i <= N; i++)
            {
                if(isPrime(i))
                {
                    output.writeInt(i);
                }
            }

        }

        //read
        FileInputStream fileIn = new FileInputStream("Ch22_Efficient_Algorithms/ch22_exercises/ex08_store_all_primes/primes.txt");
        try(DataInputStream input = new DataInputStream(fileIn))
        {
            while(true)
            {
                try
                {
                    System.out.println(input.readInt());
                }
                catch(EOFException ex)
                {
                    System.out.println("Done reading all data.");
                    break;
                }
            }
        }


    }

    private static boolean isPrime(int number)
    {
        for(int i = 2; i <= (number / 2.0); i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
