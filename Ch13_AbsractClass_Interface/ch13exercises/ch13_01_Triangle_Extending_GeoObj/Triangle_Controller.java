package ch13exercises.ch13_01_Triangle_Extending_GeoObj;

import ch13notes.Ch13_2_AbstractClasses.GeometricObject;

import java.util.Scanner;


/**
 * Write a test program that prompts the user to enter three sides of the triangle, a color,
 * and a Boolean value to indicate whether the triangle is filled.
 *
 * The program should create a Triangle object with these sides and set the color and filled properties
 * using the input. The program should display the area, perimeter, color, and true or false to
 * indicate whether it is filled or not.
 * @author Khaled Shah
 */

public class Triangle_Controller
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        double[] sides;
        sides = getSides();

        GeometricObject triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor("Blue");
        triangle.setFilled(true);
        System.out.println(triangle.toString());

        triangle.displayGeometricObject(triangle);

    }

    static double[] getSides()
    {
        double[] side = new double[3];
        int i = 0;

        System.out.println("Enter the 3 sides of the triangle below.");

        while(i < 3)
        {
            System.out.print("Side " + (i + 1) + ": ");
            side[i++] = kb.nextDouble();
        }
        return side;
    }
}
