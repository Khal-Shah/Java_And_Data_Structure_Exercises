package ch11exercises.ch11_01_Triangle;

import java.util.ArrayList;
import java.util.Scanner;

/** Chapter 11 - Exercise 1 (Controller)
 *  * Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes.
 *  * Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to
 *  * indicate whether the triangle is filled. The program should create a Triangle object with these sides and set the
 *  * color and filled properties using the input. The program should display the area, perimeter, color, and true
 *  * or false to indicate whether it is filled or not.
 * @author Khaled Shah
 */

public class Controller
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Better to use array instead of ArrayList but just getting some practice.
        ArrayList<Double> sides = new ArrayList<>();
        getSides(sides);

        String color = getColor();
        boolean triangleFilled = false;

        //Create Triangle object
        Triangle triangle = new Triangle(sides.get(0), sides.get(1), sides.get(2));
        triangle.setFilled(triangleFilled);
        triangle.setColor(color);

        //Display info
        System.out.printf(triangle.toString() + "\nArea = " + Math.round(triangle.getArea() * 1000) / 1000.0 + "\nPerimeter = " + triangle.getPerimeter() +
                "\nColor: " + triangle.getColor() + "\nFilled: " + triangle.isFilled());


    }

    public static String getColor()
    {
        System.out.printf("Enter a color: ");
        return kb.next();
    }

    public static ArrayList<Double> getSides(ArrayList<Double> list)
    {
        System.out.println("Enter 3 sides of the triangle below.");

        do
        {
            System.out.printf("Side: ");
            list.add(kb.nextDouble());
        } while (list.size() < 3);

        return list;
    }
}
