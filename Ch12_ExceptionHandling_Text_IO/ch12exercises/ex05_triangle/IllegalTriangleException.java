package ch12exercises.ex05_triangle;

import ch11exercises.ch11_01_triangle.Triangle;

/**
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
 * @author Khaled Shah
 */

public class IllegalTriangleException extends Exception
{
    public static void main(String[] args)
    {
        Object triangle1 = new Triangle();

    }

}
