package ch13notes.sect_8_rational_class;

public class Rational extends Number implements Comparable<Rational>
{
    private final long numerator;
    private final long denominator;

    public Rational()
    {
        this(0, 1);
    }

    public Rational(long numerator, long denominator)
    {
        //to simplify the numerator/denominator to their lowest terms
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0)? 1 : -1) * numerator/gcd;
        this.denominator =  Math.abs(denominator) / gcd;
    }

    //(a/b) + (c/d) = (ad + bc)/ bd
    public Rational add(Rational secondRational)
    {
        long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();

        return new Rational(n, d);
    }

    //(a/b) - (c/d) = (ad - bc)/ bd
    public Rational subtract(Rational secondRational)
    {
        long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();

        return new Rational(n, d);
    }

    //(a/b) * (c/d) = ac/bd
    public Rational multiply(Rational secondRational)
    {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();

        return new Rational(n, d);
    }

    //(a/b) / (c/d) = ad/bc
    public Rational divide(Rational secondRational)
    {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();

        return new Rational(n, d);
    }

    @Override
    public String toString()
    {
        return ((denominator == 1)? "" + numerator : "" + (numerator + "/" + denominator));
    }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Rational)
        {
            return (this.subtract((Rational) other).getNumerator() == 0);

        }
        return false;
    }

    public long getNumerator()
    {
        return numerator;
    }

    public long getDenominator()
    {
        return denominator;
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
    public int compareTo(Rational o)
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
        return numerator * 1.0 / denominator;
    }
}
