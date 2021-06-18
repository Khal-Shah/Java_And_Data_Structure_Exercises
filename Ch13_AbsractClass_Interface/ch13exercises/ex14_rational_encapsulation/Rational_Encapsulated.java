package ch13exercises.ex14_rational_encapsulation;

/** Chapter 13 - Exercise 14:
 * (Demonstrate the benefits of encapsulation) Rewrite the Rational class in Listing 13.13 using a new 
 * internal representation for the r[0 and r[1.
 * 
 * Create an array of two integers as follows:
 * private long[] r = new long[2];
 * 
 * Use r[0] to represent the r[0 and r[1] to represent the r[1.
 * The signatures of the methods in the Rational class are not changed, so a client application that uses the previous 
 * Rational class can continue to use this new Rational class without being recompiled.
 * 
 * @author Khaled
 */

public class Rational_Encapsulated extends Number implements Comparable<Rational_Encapsulated>
{
    final private long[] r = new long[2];

    public Rational_Encapsulated()
    {
        this(1, 0);
    }

    public Rational_Encapsulated(long numerator, long denominator)
    {
        this.r[0] = numerator;
        this.r[1] = denominator;
        long gcd = gcd(r[0], r[1]);
        this.r[0] = ((r[1] > 0)? 1 : -1) * r[0] / gcd;
        this.r[1] =  Math.abs(r[1]) / gcd;
    }

    //(a/b) + (c/d) = (ad + bc)/ bd
    public Rational_Encapsulated add(Rational_Encapsulated secondRational)
    {
        long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();

        return new Rational_Encapsulated(n, d);
    }

    //(a/b) - (c/d) = (ad - bc)/ bd
    public Rational_Encapsulated subtract(Rational_Encapsulated secondRational)
    {
        long n = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();

        return new Rational_Encapsulated(n, d);
    }

    //(a/b) * (c/d) = ac/bd
    public Rational_Encapsulated multiply(Rational_Encapsulated secondRational)
    {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();

        return new Rational_Encapsulated(n, d);
    }

    //(a/b) / (c/d) = ad/bc
    public Rational_Encapsulated divide(Rational_Encapsulated secondRational)
    {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.getNumerator();

        return new Rational_Encapsulated(n, d);
    }

    @Override
    public String toString()
    {
        return ((r[1] == 1)? "" + r[0] : "" + (r[0] + "/" + r[1]));
    }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Rational_Encapsulated)
        {
            return (this.subtract((Rational_Encapsulated) other).getNumerator() == 0);

        }
        return false;
    }

    public long getNumerator()
    {
        return r[0];
    }

    public long getDenominator()
    {
        return r[1];
    }

    //needed to bring the rational number to its lowest fractional terms
    private long gcd(long n, long d)
    {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for(int i = 2; i <= n1 && i <= n2; i++)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
            }
        }

        return gcd;
    }

    @Override
    public int compareTo(Rational_Encapsulated o)
    {
        if(this.subtract(o).getNumerator() > 0)
        {
            return 1;
        }

        else if(this.subtract(o).getNumerator() < 0)
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
        return r[0] * 1.0 / r[1];
    }
}
