package ch6exercises;
import java.util.*;

/* Chapter 6 - Exercise 17:
 * (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that
prompts the user to enter n and displays an n-by-n matrix. 

Here is a sample run:
Enter n: 3
0 1 0 
0 0 0
1 1 1
 */
		//By Khaled Shah

public class Ch6_17_Matrix_Algebra_Display
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter n: ");
		int n = kb.nextInt();
		
		printMatrix(n);
		
	}
	
	public static void printMatrix (int n)
	{
		int elementCount = 0;
		
		for (int rows = 1; rows <= (n * n) ; rows++)
		{
			System.out.print(getElement() + " ");
			elementCount++;
			
			System.out.print((elementCount % n == 0)? "\n" : "");
		}
	}
	
	public static int getElement()
	{
		return (int) (Math.random() * 2);
	}

}
