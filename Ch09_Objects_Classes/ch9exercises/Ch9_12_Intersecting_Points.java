package ch9exercises;

import ch9exercises.Ch9_11_Linear_Equation.LinearEquation;

import java.util.Scanner;

/* Chapter 9 - Exercise 12:
(Geometry: intersecting point) Suppose two line segments intersect. The two end- points for the first line segment
are (x1, y1) and (x2, y2) and for the second line segment are (x3, y3) and (x4, y4). Write a program that prompts
the user to enter these four endpoints and displays the intersecting point. As discussed in Program- ming Exercise 3.25,
the intersecting point can be found by solving a linear equa- tion. Use the LinearEquation class in Programming
Exercise 9.11 to solve this equation. See Programming Exercise 3.25 for sample runs.

/* Chapter 3 - Exercise 25:
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4),
 * as shown in Figure 3.8a–b.
The intersecting point of the two lines can be found by solving the following linear equation:
(y1 -y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
(y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3

This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3).

 ax + by=e		 					x= ed - bf /ad - bc
	cx + dy = f							y= af-ec /  ad - bc


If the equation has no solutions, the two lines are parallel (Figure 3.8c).

Sample runs:
Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
The intersecting point is at (2.88889, 1.1111)

Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
The two lines are parallel
 */
 //By Khaled Shah
public class Ch9_12_Intersecting_Points
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("The first line segments have points (x1, y1) and (x2, y2). " +
                           "Enter these values (in the order mentioned): ");
        double x1 = kb.nextDouble();
        double y1 = kb.nextDouble();
        double x2 = kb.nextDouble();
        double y2 = kb.nextDouble();

        System.out.println("The second line segments have points (x3, y3) and (x4, y4). " +
                           "Enter these values (in the order mentioned): ");
        double x3 = kb.nextDouble();
        double y3 = kb.nextDouble();
        double x4 = kb.nextDouble();
        double y4 = kb.nextDouble();

        //The intersecting point of the two lines can be found by solving the following linear equation:
        //(y1 -y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
        //(y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation intersection = new LinearEquation(a, b, c, d, e, f);

        System.out.println((intersection.isSolvable())? "The intersection point is at " +
                                                        getIntersectingPoints(intersection) : "Two lines are parallel");
    }

    static String getIntersectingPoints(LinearEquation eq)
    {
        String intersection = "(" + eq.getX() + ", " + eq.getY() + ")";
        return intersection;
    }
}
