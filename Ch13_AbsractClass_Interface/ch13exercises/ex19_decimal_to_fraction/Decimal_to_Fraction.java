package ch13exercises.ex19_decimal_to_fraction;

import ch13exercises.ex15_rational_biginteger.Rational_BigInt;

import java.math.BigInteger;
import java.util.Scanner;

/** Chapter 13 - Exercise 19:
 * (Convert decimals to fractions) Write a program that prompts the user to enter a decimal number and displays
 * the number in a fraction. Hint: read the decimal number as a string, extract the integer part and fractional
 * part from the string, and use the BigInteger implementation of the Rational class in Programming Exercise 13.15
 * to obtain a rational number for the decimal number.
 *
 * Here are some sample runs:
 * Enter a decimal number: 3.25
 * The fraction number is 13/4
 *
 * Enter a decimal number: -0.45452
 * The fraction number is -11363/25000
 *
 * @author Khaled
 */

public class Decimal_to_Fraction
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a decimal number: ");
        String[] decimal = kb.next().split("\\.");

        //rational object for whole part
        Rational_BigInt whole = new Rational_BigInt(BigInteger.valueOf(Long.parseLong(decimal[0])), BigInteger.ONE);

        //rational object for fractional part
        Rational_BigInt fractional = new Rational_BigInt(BigInteger.valueOf(Long.parseLong(decimal[1])), BigInteger.valueOf((long) Math.pow(10, decimal[1].length())));

        System.out.println(whole.add(fractional));

    }
}
