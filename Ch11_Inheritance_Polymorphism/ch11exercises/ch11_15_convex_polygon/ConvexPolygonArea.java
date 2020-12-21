package ch11exercises.ch11_15_convex_polygon;

import java.util.Scanner;

/** Chapter 11 - Exercise 15:
 * (Area of a convex polygon) A polygon is convex if it contains any line segments that connects two
 * points of the polygon. Write a program that prompts the user to enter the number of points in a convex polygon,
 * then enter the points clockwise, and display the area of the polygon.
 *
 * Here is a sample run of the program:
 * Enter the number of the points: 7
 * Enter the coordinates of the points:
 * -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
 * The total area is 232.58 (book has the wrong value of ~250).
 *
 *  Convex Polygon Area = 1/2(x_1y_2 - x_2y_1 + x_2y_3 - x_3y_2 +...+ x_(n-1)y_n-x_ny_(n-1) + x_ny_1-x_1y_n),
 *  1/2 | [ (x1y2 + x2y3 + ... + xn-1yn + xny1) -
 *          (x2y1 + x3y2 + ... + xnyn-1 + x1yn) ] |
 *
 * @author Khaled Shah
 */

public class ConvexPolygonArea
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the number of points: ");
        final int POINTS = kb.nextInt();

        double[] x = new double[POINTS];
        double[] y = new double[POINTS];

        System.out.println("Enter the coordinates of the points:");

        for(int i = 0; i < POINTS;)
        {
            System.out.print("Enter x" + (++i) + ": ");
            x[i - 1] = kb.nextDouble();

            System.out.print("Enter y" + (i) + ": ");
            y[i - 1] = kb.nextDouble();
        }

        System.out.printf("The total area is %.2f", Math.abs(getPolygonArea(x, y)));
    }

    public static double getPolygonArea(double[] x, double[] y)
    {
        double area = 0;

        //Sshoelace formula
        int j = x.length - 1;

        for (int i = 0; i < x.length; i++)
        {
            area += (x[j] + x[i]) * (y[j] - y[i]);

            j = i;
        }

        return (0.5) * area;
    }
}
