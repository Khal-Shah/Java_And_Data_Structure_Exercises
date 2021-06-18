package ch13exercises.ex15_rational_biginteger;

import java.math.BigInteger;

public class RationalBigInt_Driver
{
    public static void main(String[] args)
    {
        Rational_BigInt r1 = new Rational_BigInt(new BigInteger("4"), BigInteger.TWO);
        Rational_BigInt r2 = new Rational_BigInt(BigInteger.TWO, new BigInteger("3"));

        System.out.println("r1 = " + r1.toString() + ", r2 = " + r2.toString() + " (" + r2.doubleValue() + ")");
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    }
}
