package ch1exercises;

/* Chapter 1 - Exercise 9:
 * (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a rectangle with the 
 * width of 4.5 and height of 7.9 using the following formula:
 * area = width * height
 */
		// By Khaled Shah 

public class Ch1_09_Rectangle_AreaandPerimeter
{
	static final double width = 4.5;
	static final double height = 7.9;

	public static void main(String[] args)
	{
		double area = width * height;
		double perimeter = (2*width) + (2*height);
		System.out.printf("The perimeter of the rectangle is %.2f m and the area is %.2f m", perimeter, area);
	}

}
