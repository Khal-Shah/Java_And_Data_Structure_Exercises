package ch10exercises;

/* Chapter 10 - Exercise 21:
(Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 */
    //By Khaled Shah

import java.math.BigInteger;

public class Ch10_21_BigInt_Divisibility
{
    static final long MAX = Long.MAX_VALUE;

    public static void main(String[] args)
    {
        BigInteger number = new BigInteger("" + MAX);
        number = number.add(BigInteger.ONE);
        System.out.println("Long.MAX_VALUE = " + MAX + "\nThe first 10 numbers greater than this that are" +
                           " divisible by 5 or 6 are:");

        BigInteger[] divisibleNumbers = new BigInteger[10];
        int i = 0;

        while (i < divisibleNumbers.length)
        {
            if(isDivisible(number))
            {
                divisibleNumbers[i++] = number;
            }

            number = number.add(BigInteger.ONE);
        }

        for(BigInteger n: divisibleNumbers)
        {
            System.out.println(n);
        }
    }

    static boolean isDivisible(BigInteger num)
    {
        return num.mod(new BigInteger("5")).equals(BigInteger.ZERO)
                || num.mod(new BigInteger("6")).equals(BigInteger.ZERO);

    }
}
