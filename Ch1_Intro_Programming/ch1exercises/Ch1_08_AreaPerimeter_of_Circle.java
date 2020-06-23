package ch1exercises;

	/* Chapter 1 - Exercise 8:
	 * (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius 
	 * of 5.5 meter using the following formula:
	 * perimeter = 2 * radius * pi 
	 * area = radius * radius * pi
	 */
			//By Khaled Shah

public class Ch1_08_AreaPerimeter_of_Circle
{
	static final double radius = 5.5;

	public static void main(String[] args)
	{
		double area, perimeter;
		
		perimeter = 2 * radius * Math.PI;
		area = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("The perimeter is %.3f m and the area is %.3f m",perimeter, area); 

	}

}
