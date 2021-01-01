package ch12exercises.ex05_triangle;

import ch11exercises.ch11_01_triangle.Triangle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Chapter 12 - Exercise 5:
 * (IllegalTriangleException) Programming Exercise 11.1 defined the Triangle class with three sides.
 * In a triangle, the sum of any two sides is greater than the other side.
 * The Triangle class must adhere to this rule.
 * Create the IllegalTriangleException class, and modify the constructor of the Triangle class
 * to throw an IllegalTriangleException object if a triangle is created with sides that
 * violate the rule, as follows:
 *   Construct a triangle with the specified sides
 *public Triangle(double side1,double side2,double side3)throws IllegalTriangleException{
        * // Implement it
 * }
 *
 * Input :  a = 7, b = 10, c = 5
 * Output : Valid
 *
 * Input : a = 1 b = 10 c = 12
 * Output : Invalid
 *
 * @author Khaled Shah
 */

public class IllegalTriangleException extends Exception
{
    static Scanner kb = new Scanner(System.in);

    //Constructor for the Exception
    public IllegalTriangleException(double s1, double s2, double s3)
    {
        super("The sides " + s1 + " , " + s2 + ", " + s3 + " are invalid for a Triangle.");
    }

    public static void main(String[] args) throws IllegalTriangleException
    {
        ArrayList<Double> sides = new ArrayList<>();
        try
        {
            System.out.print("Side 1: ");
            sides.add(kb.nextDouble());
            System.out.print("Side 2: ");
            sides.add(kb.nextDouble());
            System.out.print("Side 3: ");
            sides.add(kb.nextDouble());

            Triangle triangle = new Triangle(sides.get(0), sides.get(1), sides.get(2));
            System.out.println("Successfully created triangle object with the sides " + sides.toString());
        }
        catch(IllegalTriangleException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("You did not enter a double value.");
        }


    }

}
