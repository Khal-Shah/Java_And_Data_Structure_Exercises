package ch10exercises;

/* Chapter 10 - Exercise 19:
(Mersenne prime) A prime number is called a Mersenne prime if it can be written in the form 2^p - 1
for some positive integer p. Write a program that finds all Mersenne primes with p ≤ 100 and displays
the output as shown below.
p   2^p – 1
2       3
3       7
5       31
...
(Hint: You have to use BigInteger to store the number, because it is too big to be stored in long.
Your program may take several hours to run.)
 */
        //By Khaled Shah

import ch10exercises.Ch10_03_MyInteger.MyInteger;

import java.math.BigInteger;

public class Ch10_19_BigInt_MersennePrimes
{
    public static void main(String[] args)
    {
        int p = 2;
        //System.out.println(MyInteger.isPrime(p));

        BigInteger mersenneP = new BigInteger("" + p);


        int i = 0;

        System.out.println("Prime#\t\t\tp\t\t\t\t2^p - 1");

        while (i < 100)
        {
            if(isMersennePrime(getMersennePrime(p)) && MyInteger.isPrime(p))
            {
                System.out.printf("%2d %14d \t\t\t\t%-22d\n",i + 1, p, getMersennePrime(p));
                i++;
            }
            p++;
            mersenneP = mersenneP.add(BigInteger.ONE);
        }

    }

    static BigInteger getMersennePrime(int mp)
    {
        //return 2^mp - 1
        return BigInteger.TWO.pow(mp).subtract(BigInteger.ONE);
    }

    static boolean isMersennePrime(BigInteger mp)
    {
        return (mp.isProbablePrime(5));
    }
}
