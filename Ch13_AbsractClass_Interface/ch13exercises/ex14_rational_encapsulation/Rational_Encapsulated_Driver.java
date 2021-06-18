package ch13exercises.ex14_rational_encapsulation;

public class Rational_Encapsulated_Driver
{
    public static void main(String[] args)
    {
        Rational_Encapsulated r1 = new Rational_Encapsulated(4, 2);
        Rational_Encapsulated r2 = new Rational_Encapsulated(2, 3);

        System.out.println("r1 = " + r1 + ", r2 = " + r2 + " (" + r2.doubleValue() + ")");
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    }
}
