package ch13exercises.ex15_rational_biginteger;

import java.math.BigInteger;

/** Chapter 13 - Exercise 15:
 * (Use BigInteger for the Rational class) Redesign and implement the Rational class in Listing 13.13
 * using BigInteger for the numerator and denominator.
 *
 * @author Khaled
 */

public class Rational_BigInt extends Number implements Comparable<Rational_BigInt>
{
    private final BigInteger numerator;
    private final BigInteger denominator;

    public Rational_BigInt()
    {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational_BigInt(BigInteger numerator, BigInteger denominator)
    {
        BigInteger gcd = gcd(numerator, denominator);

        this.numerator = ((denominator.intValue() > 0)? BigInteger.ONE : BigInteger.ONE.negate()).multiply(numerator.divide(gcd));
        this.denominator = (denominator.abs().divide(gcd));
    }

    //(a/b) + (c/d) = (ad + bc)/ bd
    public Rational_BigInt add(Rational_BigInt secondRational)
    {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational_BigInt(n, d);
    }

    //(a/b) - (c/d) = (ad - bc)/ bd
    public Rational_BigInt subtract(Rational_BigInt secondRational)
    {
//        long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();

        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational_BigInt(n, d);
    }

    //(a/b) * (c/d) = ac/bd
    public Rational_BigInt multiply(Rational_BigInt secondRational)
    {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational_BigInt(n, d);
    }

    //(a/b) / (c/d) = ad/bc
    public Rational_BigInt divide(Rational_BigInt secondRational)
    {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());

        return new Rational_BigInt(n, d);
    }

    @Override
    public String toString()
    {

        if(denominator.equals(BigInteger.ONE))
        {
            return numerator.toString();
        }

        else
        {
            return numerator.toString() + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Rational_BigInt)
        {
            return (this.subtract((Rational_BigInt) other).getNumerator().equals(BigInteger.ZERO));

        }
        return false;
    }

    public BigInteger getNumerator()
    {
        return numerator;
    }

    public BigInteger getDenominator()
    {
        return denominator;
    }

    //needed to bring the rational number to its lowest fractional terms
    private BigInteger gcd(BigInteger n, BigInteger d)
    {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();
        BigInteger gcd = BigInteger.ONE;

        BigInteger i = BigInteger.TWO;

        while(i.intValue() <= n1.intValue() && i.intValue() <= n2.intValue())
        {
            if(n1.mod(i).equals(BigInteger.ZERO) && n2.mod(i).equals(BigInteger.ZERO))
            {
                gcd = i;
            }
//            System.out.println("i = " + i);
            i = i.add(BigInteger.ONE);
        }
        return gcd;
    }

    @Override
    public int compareTo(Rational_BigInt o)
    {
        if(this.subtract(o).getNumerator().intValue() > 0)
        {
            return 1;
        }

        else if(this.subtract(o).getNumerator().intValue() < 0)
        {
            return -1;
        }

        return 0;
    }

    //Following are implementations of Number abstract methods.
    @Override
    public int intValue()
    {
        return (int) doubleValue();
    }

    @Override
    public long longValue()
    {
        return (long) doubleValue();
    }

    @Override
    public float floatValue()
    {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue()
    {
        //return numerator * 1.0 / denominator;
        return this.numerator.multiply(BigInteger.ONE).doubleValue() / this.denominator.doubleValue();
    }
}
