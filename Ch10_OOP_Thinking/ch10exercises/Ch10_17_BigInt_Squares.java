package ch10exercises;

/* Chapter 10 - Exercise 17:
(Square numbers) Find the first ten square numbers that are greater than Long.MAX_VALUE.
A square number is a number in the form of n^2. For example, 4, 9, and 16 are square numbers.
Find an efficient approach to run your program fast.
 */
    //By Khaled Shah

import java.math.BigInteger;

public class Ch10_17_BigInt_Squares
{
    static final long MAX = Long.MAX_VALUE;

    public static void main(String[] args)
    {
        //starting number = sqrt(MAX), increment starting number and store the squares as BigInt
        System.out.println("The long max value is: " + MAX);

        String startingNum = "" + Math.round(Math.sqrt(MAX));
        BigInteger n = new BigInteger(startingNum);

        BigInteger[] squares = new BigInteger[10];
        int i = 0;

        while(i < squares.length)
        {
            squares[i++] = n.multiply(n);
            n = n.add(BigInteger.ONE);
        }

        System.out.println("The first 10 square numbers greater than LONG.MAX are:");

        for (BigInteger e: squares)
        {
            System.out.println(e);
        }
    }
}
