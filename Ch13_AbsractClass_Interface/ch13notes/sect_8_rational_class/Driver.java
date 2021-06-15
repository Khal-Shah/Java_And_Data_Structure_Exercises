package ch13notes.sect_8_rational_class;

public class Driver
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);

        System.out.println("r1 = " + r1 + ", r2 = " + r2 + " (" + r2.doubleValue() + ")");
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    }


}
