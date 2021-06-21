package ch13exercises.ex20_quadratic_eq;

import ch13exercises.ex17_complex_number.Complex;

/** Chapter 13 - Exercise 20:
 * (Algebra: solve quadratic equations) Rewrite Programming Exercise 3.1 to obtain imaginary
 * roots if the determinant is less than 0 using the Complex class in Programming Exercise 13.17.
 *
 * r1 = [-b + (b^2 - 4ac]^(1/2) / 2a &
 * r2 = [-b - (b^2-4ac)^1/2] / 2a
 *
 *  Here are some sample runs.
 * Enter a, b, c: 1 3 1
 * The roots are -0.381966 and -2.61803
 *
 * Enter a, b, c: 1 2 1
 * The root is -1
 *
 * Enter a, b, c: 1 2 3
 * The roots are -1.0 + 1.4142i and -1.0 + -1.4142i
 *
 * @author Khaled
 */

public class Quadratic_Equations
{
    private final double a;
    private final double b;
    private final double c;

    public Quadratic_Equations()
    {
        this(0, 0, 0);
    }

    public Quadratic_Equations(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant()
    {
        //(b^2 - 4ac]^(1/2)
        return ((b * b) - (4 * a * c));
    }

    public void computeRoots()
    {
        double discriminant = getDiscriminant();
        double r1;
        double r2;

        if(discriminant >= 0)
        {
            r1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            r2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

            System.out.println(((discriminant == 0)? "The only real root is " + r1 : "The two real roots are " +
                   r1 + " and " + r2));
        }

        else if(discriminant < 0)
        {
            double realVal = -b / (2.0 * a);
            double imaginaryVal = Math.sqrt(-discriminant) / (2.0 * a);

            Complex imaginaryRoot1 = new Complex(realVal, imaginaryVal);

            System.out.print("The two imaginary roots are: ");
            System.out.println(imaginaryRoot1);

            System.out.print(" and ");
            Complex imaginaryRoot2 = new Complex(realVal, -imaginaryVal);
            System.out.println(imaginaryRoot2);
        }

    }

}
