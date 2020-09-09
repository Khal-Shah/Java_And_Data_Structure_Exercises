package ch10exercises;
import java.math.BigInteger;

/* Chapter 10 - Exercise 18:
(Large prime numbers) Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 */
        //By Khaled Shah

public class Ch10_18_BigInt_Primes
{
    static final long MAX = Long.MAX_VALUE;

    public static void main(String[] args)
    {
        System.out.println("The LONG.MAX value is: " + MAX + "\n5 prime numbers larger than this number are:");

        String startingValue = "" + MAX + 1;
        BigInteger prime = new BigInteger(startingValue);

        BigInteger[] primes = new BigInteger[5];
        int i = 0;

       do
       {
           if(isPrime(prime))
           {
               primes[i++] = prime;
           }

           prime = prime.add(BigInteger.ONE);

       }while(i < primes.length);


       display(primes);

    }

    public static void display(BigInteger[] primes)
    {
        for(BigInteger e: primes)
        {
            System.out.println(e);
        }
    }

    public static boolean isPrime(BigInteger value)
    {
//        BigInteger limit = new BigInteger("100");
//
//        for(BigInteger divisor = BigInteger.TWO; divisor.compareTo(limit) <= 0; divisor = divisor.add(BigInteger.ONE))
//        {
//            if(value.mod(divisor).equals(BigInteger.ZERO))
//            {
//                return false;
//            }
//        }
//
//        return true;

        //^Takes too long...
        //Quicker way of doing it using isProbablePrime(int certainty): 1 - (1/2)^certainty

        if(value.isProbablePrime(100))
        {
            return true;
        }

        return false;
    }
}
