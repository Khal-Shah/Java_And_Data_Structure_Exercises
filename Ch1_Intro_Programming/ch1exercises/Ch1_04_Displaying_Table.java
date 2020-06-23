package ch1exercises;

/* Chapter 1 - Exercise 4:
 * Write a program that displays the following table:
 * a	 		a^2 		a^3 
 * 1				1				1 
 * 2				4				8
    3	 			9 				27 
    4 				16			 64
 */

			//By Khaled Shah

public class Ch1_04_Displaying_Table
{

	public static void main(String[] args)
	{
		
		int a;
		
		System.out.println("a\t\ta^2\t\ta^3");
		for (a = 1;  a <= 4; a++)
		{
			System.out.println(a + "\t\t" + Math.pow(a, 2) + "\t\t" + Math.pow(a, 3));
		}
		
		
		/*
		
		
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		System.out.println("a\t\ta^2\t\t\ta^3\n" + a + "\t\t" + Math.pow(a, 2) + "\t\t\t" + Math.pow(a, 3));
		System.out.println(b + "\t\t" + Math.pow(b, 2) + "\t\t\t" + Math.pow(b, 3));
		System.out.println(c + "\t\t" + Math.pow(c, 2) + "\t\t\t" + Math.pow(c, 3));
		System.out.println(d + "\t\t" + Math.pow(d, 2) + "\t\t" + Math.pow(d, 3));
	*/	
	}

}
