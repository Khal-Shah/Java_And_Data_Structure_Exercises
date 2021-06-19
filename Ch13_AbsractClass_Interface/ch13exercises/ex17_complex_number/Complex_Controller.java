package ch13exercises.ex17_complex_number;

import java.util.Scanner;

/**
 * Write a test program that prompts the user to enter two complex numbers and displays the
 * result of their addition, subtraction, multiplication, division, and absolute value.
 * Here is a sample run:
 * Enter the first complex number: 3.5 5.5
 * Enter the second complex number: -3.5 1
 * (3.5 + 5.5i) + (-3.5 + 1.0i) = 0.0 + 6.5i
 * (3.5 + 5.5i) - (-3.5 + 1.0i) = 7.0 + 4.5i
 * (3.5 + 5.5i) * (-3.5 + 1.0i) = -17.75 + -13.75i
 * (3.5 + 5.5i) / (-3.5 + 1.0i) = -0.5094 + -1.7i
 * |(3.5 + 5.5i)| = 6.519202405202649
 */

public class Complex_Controller
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the first complex number: ");
        double num1a = kb.nextDouble();
        double num1b = kb.nextDouble();

        System.out.print("Enter the second complex number: ");
        double num2a = kb.nextDouble();
        double num2b = kb.nextDouble();

        Complex num1 = new Complex(num1a, num1b);
        Complex num2 = new Complex(num2a, num2b);

        //add
        System.out.print(num1 + " + " + num2 + " = ");
        num1.add(num2.getReal(), num2.getImaginary());

        //subtract
        System.out.print(num1 + " - " + num2 + " = ");
        num1.subtract(num2.getReal(), num2.getImaginary());

        //multiply
        System.out.print(num1 + " * " + num2 + " = ");
        num1.multiply(num2.getReal(), num2.getImaginary());

        //absolute value
        num1.getAbsVal();
    }
}
