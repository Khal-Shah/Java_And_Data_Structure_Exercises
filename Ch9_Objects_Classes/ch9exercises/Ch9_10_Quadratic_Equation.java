package ch9exercises;

/* Chapter 9 - Exercise 10:
(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
■ Private data fields a, b, and c that represent three coefficients.
■ A constructor for the arguments for a, b, and c.
■ Three getter methods for a, b, and c.
■ A method named getDiscriminant() that returns the discriminant, which is
b2 - 4ac.
■ The methods named getRoot1() and getRoot2() for returning two roots of
the equation: The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained
		 * using the following formula: r1 = [-b + (b^2 - 4ac]^(1/2) / 2a & r2 = [-b - (b^2-4ac)^1/2] / 2a

These methods are useful only if the discriminant is nonnegative. Let these methods return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to enter values for a,
b, and c and displays the result based on the discriminant. If the discriminant is positive, display the two roots. If the
discriminant is 0, display the one root. Otherwise, display “The equation has no roots.” See Programming Exercise 3.1 for sample runs.
 */

//Here are some sample runs.
//        * Enter a, b, c: 1.0 3 1
//        The equation has two roots -0.381966 and -2.61803
//
//        Enter a, b, c: 1 2.0 1
//        The equation has one root -1
//
//        Enter a, b, c: 1 2 3
//        The equation has no real roots

     //By Khaled Shah

import java.util.Scanner;

public class Ch9_10_Quadratic_Equation
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a: ");
        double a = kb.nextDouble();

        System.out.print("Enter b: ");
        double b = kb.nextDouble();

        System.out.print("Enter c: ");
        double c = kb.nextDouble();

       QuadraticEquation eq = new QuadraticEquation(a, b, c);
       int count = getRootCount(eq);
       showRoots(eq, count);


    }

    static void showRoots(QuadraticEquation eq, int count)
    {
        //disc > 0: 2 roots, disc = 0: 1 root, disc < 0: 0 root

        if (count == 0)
        {
            System.out.println("The equation has no real roots.");
        }

        if (count == 1)
        {
            System.out.println("The equation has one root: " + ((!Double.isNaN(eq.getRoot1()))? eq.getRoot1() : eq.getRoot2()));
        }

        else if (count == 2)
        {
            System.out.println("The equation has two real roots: " + eq.getRoot1() + " and " + eq.getRoot2());
        }

    }

    static int getRootCount(QuadraticEquation eq)
    {
        int count = 0;

        //disc > 0: 2 roots, disc = 0: 1 root, disc < 0: 0 root
        if(eq.getDiscriminant() > 0)
        {
            count = 2;
        }

        else if(eq.getDiscriminant() == 0)
        {
            count = 1;
        }

        return count;
    }
}

class QuadraticEquation
{
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA()
    {
        return this.a;
    }

    public double getB()
    {
        return this.b;
    }

    public double getC()
    {
        return this.c;
    }

    public double getDiscriminant()
    {
        return (Math.pow(b, 2) - (4 * a * c));
    }

    public double getRoot1()
    {
        if(getDiscriminant() < 0)
        {
            return 0;
        }

        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2()
    {
        if(getDiscriminant() < 0)
        {
            return 0;
        }

        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
