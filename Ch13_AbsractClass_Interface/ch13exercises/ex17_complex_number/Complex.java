package ch13exercises.ex17_complex_number;

/** Chapter 13 - Exercise 17:
 * (Math: The Complex class) A complex number is a number in the form a + bi, where a and b
 * are real numbers and i is 2-1. The numbers a and b are known as the real part and
 * imaginary part of the complex number, respectively. You can perform addition, subtraction,
 * multiplication, and division for complex numbers using the following formulas:
 *
 * a + bi + c + di = (a + c) + (b + d)i
 * a + bi - (c + di) = (a - c) + (b - d)i
 * (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
 * (a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc - ad)i/(c^2 + d^2)
 *
 * You can also obtain the absolute value for a complex number using the following formula:
 * |a + bi| = sqrt(a^2 + b^2)
 * (A complex number can be interpreted as a point on a plane by identifying the (a,b) values
 * as the coordinates of the point. The absolute value of the complex number corresponds to the
 * distance of the point to the origin, as shown in Figure 13.10b.)
 *
 * Design a class named Complex for representing complex numbers and the
 * methods add, subtract, multiply, divide, and abs for performing complex number operations,
 * and override toString method for returning a string representation for a complex number.
 * The toString method returns (a + bi) as a string. If b is 0, it simply returns a.
 * Your Complex class should also implement the Cloneable interface. Provide three constructors
 * Complex(a, b), Complex(a), and Complex().
 * Complex() creates a Complex object for number 0 and Complex(a) creates a Complex object
 * with 0 for b. Also provide the getRealPart() and getImaginaryPart() methods for returning
 * the real and imaginary part of the complex number, respectively.
 *
 * @author Khaled
 */

public class Complex implements Cloneable
{
    private final double a;
    private final double b;

    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public Complex(double a)
    {
        this(a, 0);
    }

    public Complex()
    {
        this(0);
    }

    public double getReal()
    {
        return a;
    }

    public double getImaginary()
    {
        return b;
    }

    public void add(double otherReal, double otherImg)
    {
        double realSum = this.a + otherReal;
        double imgSum = this.b + otherImg;

        System.out.println(realSum + " + " + imgSum + "i");
    }

    public void subtract(double otherReal, double otherImg)
    {
        double realDiff = this.a - otherReal;
        double imgDiff = this.b - otherImg;

        System.out.println(realDiff + " - " + imgDiff + "i");
    }
                                  //c                d
    public void multiply(double otherReal, double otherImg)
    {
        //(a + bi)*(c + di) = (ac - bd) + (bc + ad)i
        double realProd = this.a * otherReal - this.b * otherImg;
        double imgProd = this.b * otherReal + this.a * otherImg;

        System.out.println(realProd + " * " + imgProd + "i");
    }

    public void getAbsVal()
    {
        double val = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("|" + this + "| = " + val);
    }

    @Override
    public String toString()
    {
        if(b == 0)
        {
            return "" + a;
        }

        else
        {
            return ("(" + a + " + " + b + "i)");
        }
    }
}
