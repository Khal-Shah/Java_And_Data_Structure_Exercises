package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 22:
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a point (x, y) and checks whether the point 
 * is within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle, 
 * as shown in Figure 3.7a.
(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
The formula for computing the distance is ((x2 - x1)^2 + (y2 - y1)^2.)^0.5 
Test your program to cover all cases.) 

Two sample runs are shown below.
Enter a point with two coordinates: 4 5
Point (4.0, 5.0) is in the circle
Enter a point with two coordinates: 9 9
Point (9.0, 9.0) is not in the circle
 */
		//By Khaled Shah

public class Ch3_22_Point_In_Circle
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter a point with two coordinates below. \nX coordinate: ");
		double xPoint = kb.nextDouble();
		System.out.print("Y coordinate: ");
		double yPoint = kb.nextDouble();
		
		double distance = Math.pow((Math.pow(xPoint, 2) + (Math.pow(yPoint, 2))), 0.5);

		System.out.println("The point is " + ((distance <= 10)? "in the circle": "not in the circle."));
	}

}
