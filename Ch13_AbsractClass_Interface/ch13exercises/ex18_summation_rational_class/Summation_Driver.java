package ch13exercises.ex18_summation_rational_class;

import ch13exercises.ex15_rational_biginteger.Rational_BigInt;
import ch13notes.sect_8_rational_class.Rational;

import java.math.BigDecimal;
import java.math.BigInteger;

/** Chapter 13 - Exercise 18:
 * (Use the Rational class) Write a program that computes the following summation series using the Rational class:
 * 1/2 + 2/3 + 3/4 +...+ 98/99 + 99/100
 * You will discover that the output is incorrect because of integer overflow (too large).
 * To fix this problem, see Programming Exercise 13.15.
 *
 * @author Khaled
 */

public class Summation_Driver
{
    public static void main(String[] args)
    {
        int numerator = 1;
        int denominator = 2;
        Rational[] rationals = new Rational[99];
        Rational_BigInt[] rational_bigInt = new Rational_BigInt[99];
        int i = 0;

        do
        {
            rational_bigInt[i] = new Rational_BigInt(BigInteger.valueOf(numerator), BigInteger.valueOf(denominator));
           rationals[i++] = new Rational(numerator, denominator);
        } while(++numerator <= 99 && ++denominator <= 100);

        double sum = 0;

        for(i = 0; i < rationals.length; i++)
        {
            if(i % 10 == 0)
            {
                System.out.println();
            }

            System.out.print(rationals[i].toString() + ((i == rationals.length - 1)? " = " : " + "));
            sum += rationals[i].doubleValue();
        }

        System.out.println(sum);

        System.out.println("Now using Rational BigInteger class...");

        sum = 0;
        i = 0;
        BigDecimal bigDecimalSum = new BigDecimal(0);

        while(i < rational_bigInt.length)
        {
            if(i % 10 == 0)
            {
                System.out.println();
            }

            System.out.print(rational_bigInt[i].toString() + ((i == rational_bigInt.length - 1)? " = " : " + "));
            bigDecimalSum = bigDecimalSum.add(BigDecimal.valueOf(rational_bigInt[i++].doubleValue()));
        }

        System.out.println(bigDecimalSum);
    }
}
