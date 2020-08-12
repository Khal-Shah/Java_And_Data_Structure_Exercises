package ch9notes;
import java.util.Random;

/* Chapter 9 - Exercise 5:
 * (Use the GregorianCalendar class) Java API has the GregorianCalendar class in the java.util package, which you can use to
 * obtain the year, month, and day of a date. The no-arg constructor constructs an instance for the current date, and the
 * methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH)
 * return the year, month, and day. Write a program to perform two tasks:
■ Display the current year, month, and day.
■ The GregorianCalendar class has the setTimeInMillis(long), which
can be used to set a specified elapsed time since January 1, 1970.
Set the value to 1234567898765L and display the year, month, and day.
 */
//By Khaled Shah

public class Ch9_Practice
{
	public static void main(String[] args)
	{
//		CirclePractice c1 = new CirclePractice(2);
//		System.out.println("A circule with radius " + c1.getRadius() + " has area of " + c1.getArea());
//
//		CirclePractice c2 = new CirclePractice(5);
//		System.out.println("A circule with radius " + c2.getRadius() + " has area of " + c2.getArea());
//		System.out.println("Total obj created: " + CirclePractice.getObjectCount());
//
//		System.out.println();
//		//print area for radius 1 up to 5;
//		int n = 5;
//		printCircle(c1, n);

		//Array of objects:
		//Create 10 circle objects:
		CirclePractice circleArray[] = new CirclePractice[10];
		initializeCircleArray(circleArray);

		System.out.println("Total obj created: " + CirclePractice.getObjectCount());	//5

		// program creates circleArray, an array composed of five Circle objects; it then initializes circle
		// radii with random values and displays the total area of the circles in the array.
		System.out.println("--------------------------------------------------------------------");

		int size = 5;
		CirclePractice randomCircles[] = new CirclePractice[size];
		setRandomCircles(randomCircles, size);

		for(CirclePractice c: randomCircles)
		{
			System.out.println("A circle with radius " + c.getRadius() + " has area of " + c.getArea());
		}

		System.out.println("Total obj created: " + CirclePractice.getObjectCount());		//15

	}

	static CirclePractice[] setRandomCircles(CirclePractice[] c, int size)
	{
		Random r = new Random();

		for(int i = 0; i < size; i++)
		{
			c[i] = new CirclePractice(r.nextDouble() * 10);		//random double radius between 0 and 10
		}

		return c;
	}



	static CirclePractice[] initializeCircleArray(CirclePractice[] c)
	{
		for(int i = 0; i < 10; i++)
		{
			c[i] = new CirclePractice();
		}
		return c;
	}

	static void printCircle(CirclePractice c, int n)
	{
		while (n >= 1)
		{
			c.setRadius(Double.valueOf("" + n));
			System.out.println("A circule with radius " + c.getRadius() + " has area of " + c.getArea());
			n--;
		}
	}
}

class CirclePractice
{
	private double radius;
	private static int objectCount = 0;

	CirclePractice ()
	{
		radius = 1;																		//default value
		objectCount++;
	}

	//Construct a circle with a specified radius					(second constructor)
	CirclePractice (double newRadius)
	{
		radius = newRadius;
		objectCount++;
	}

	//Following are methods:
	//Return the area of this circle */
	double getArea ()
	{
		return (radius * radius * Math.PI);
	}

	//Return the perimeter of this circle */

	double getPerimeter ()
	{
		return (2 * radius * Math.PI);
	}

	//Set a new radius for this circle
	void setRadius (double newRadius)
	{
		radius = newRadius;
	}

	static int getObjectCount()
	{
		return objectCount;
	}

	double getRadius()
	{
		return radius;
	}

}





