package ch7notes;
import java.util.Scanner;

public class Ch7_05_06_07_Copying_PassingToMeths
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		/* COPYING ARRAYS: To copy the contents of one array into another, you have to copy the array’s individual 
		 * elements into the other array.
		 * 
		 * There are three ways to copy arrays:
■ Use a loop to copy individual elements one by one. 
■ Use the static arraycopy method in the System class.
■ Use the clone method to copy arrays; this will be introduced in Chapter 13, Abstract Classes and Interfaces.

METHOD 2: The syntax for arraycopy is:
  System.arraycopy(sourceArray, srcPos, targetArray, tarPos, length);
	Ex below:	 */

		/*int [] srcArr = {1, 3, 5, 7, 9};
		
		//Initialize target array:
		int [] trgtArr = new int [srcArr.length];
		
		//now copy to target array:
		System.arraycopy(srcArr, 0, trgtArr, 0, srcArr.length);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		System.out.println("The elements of \"trgtArr\" are: ");
		for (int e: trgtArr)
		{
			System.out.print(e + "\t");
		}
		
		//METHOD 1: copy srcArray into simpleArr using loop
		int [] simpleArr = new int [srcArr.length];
		
		for (int i = 0; i < srcArr.length; i++)
		{
			simpleArr [i] = srcArr [i];
		}
		
		System.out.println("\nThe elements of \"simpleArr\" are: ");
		
		for (int e: simpleArr)
		{
			System.out.print(e + "\t");
		} */
		
		/* PASSING ARRAYS TO METHODS:
		 * When passing an array to a method, the REFERENCE of the array is passed to the method.
		 * 
		 * Ex: following invokes a method that displays the elements in an int array:
		 */
		//printArray(new int [] {3, 1, 2, 6, 4, 2});				//Creates an array using the syntax :
																						//new elementType [] {value0, value1, ..., valuek};
		//There is no explicit reference variable for the array. Such array is called an anonymous array.
		//It'll pass those values to printArray method and print them sequentially. 
		
		int x = 1;
		int [] y = new int [10];
		y [0] = 5;
		
		System.out.println("y[0] before invoking method is " + y [0] + "\nx before inkoving method is " + x);
		
		m (x, y);
		
		System.out.println("y[0] after invoking method is " + y [0] + "\nx after inkoving method is " + x);
		/*y[0] before invoking method is 5
x before inkoving method is 1
y[0] after invoking method is 5555
x after inkoving method is 1		  
		 */
		
		/* RETURNING AN ARRAY FROM A METHOD:
		 * When a method returns an array, the reference of the array is returned.
		 * Example: following program w/ method returns an array that is the reversal of another array.
		 */
		int [] list1 = {1, 2, 3, 4, 5, 6};
		int [] list2 = reverse(list1);	//reverses list1 and stores the reversed content in list2
		
		for (int e: list2)
		{
			System.out.println(e);
		}
		
		
			}
	
	public static void printArray (int [] array)
	{
		for (int e: array)
		{
			System.out.print(e + " ");
		}
	}
															  //  [] distinguishes primitive type from an array reference 
	public static void m (int num, int [] numbers)
	{
		num = 1001;						//primitive type doesn't change outside. 
		numbers [0] = 5555;
		/* This can be best described as pass-by-sharing, that is, the array in the method is the same as the array being 
		 * passed. Thus, if you change the array in the method, you will see the change outside the method.
		 *  y and numbers, although they are independent variables, reference the same array.
		 *  When m(x, y) is invoked, the values of x and y are passed to number and numbers. Since y contains the 
		 *  reference value to the array, numbers now contains the same reference value to the same array.
		 *  
		 *  HOWEVER, if instead of "int [] numbers" as the 2nd argument, we were to just do "int numbers" (primitive)
		 *  and instead of m (x, y), we were to do m (x, y [0]) then we'd be passing primtive values instead of referencing
		 *  the array variable. And thus the array value outside wouldn't change (would remain 5). 
		 */
	}
				//RETURN TYPE has to include [] 
	public static int [] reverse (int [] array)
	{
		int [] list2 = new int [array.length];
		int index = array.length - 1;
		
		for (int i = 0; i < array.length; i++)
		{
			list2 [i] = array[index];
			index--;
		}
		return list2; 
	}

}
