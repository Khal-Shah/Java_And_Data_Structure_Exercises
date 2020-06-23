/*
 * (Display patterns) Write a method to display a pattern as follows:
				1 	
			2  1 
	   3 	2  1
       ...
       n n-1 ... 3 2 1
 */
		//By Khaled Shah

package ch6exercises;


public class Ch6_06_DisplayPattern
{

	public static void main(String[] args)
	{
		int i = 1;
		displayPattern(5, i);

	}
	

public static int displayPattern(int n, int i)
{
	
	if (i == (n + 1))
	{
		return -1;
	}
	
	for (int j = i; j >= 1; j--)
	{
		System.out.print(j + "\t");
	}
	
	System.out.println();
	return (displayPattern(n, i + 1));
}
	

}


