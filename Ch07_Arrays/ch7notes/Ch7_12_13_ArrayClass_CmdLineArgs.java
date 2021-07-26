package ch7notes;
import java.util.Arrays;	//NEEDED TO USE THE ARRAYS. CLASS

/* THE ARRAY CLASS:
 * The java.util.Arrays class contains various static methods for sorting and searching arrays, comparing arrays, 
 * filling array elements, and returning a string representation of the array. 
 * These methods are overloaded for all primitive types.
You can use the sort or parallelSort method to sort a whole array or a partial array. 
They (sort and // sort) do the same thing but parallelSort is more efficient if your computer has multiple processors.
For example, the following code sorts an array of numbers and an array of characters.
 */

public class Ch7_12_13_ArrayClass_CmdLineArgs
{
	
	public static void main(String[] args)
	{
		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.7, 3.5};
		//Arrays.sort(numbers);
		
		/*System.out.println("Whole list sorted: ");
		for (double e: numbers)
		{
			System.out.println(e);
		}*/
		
	//	System.out.println("The first 4 items sorted (omitting 3.7 and 3.5");
		Arrays.sort(numbers, 0, 4);
				// (beginning index, last index exclusive)
		
	//	for (double e: numbers)
		{
			//System.out.println(e);			//sorts the first 4 numbers, last two are left as is (still part of the array)
		}
		
		//char [] chars = {'a', 'A', '4', 'F', 'D', 'P'};
		//Arrays.parallelSort(chars, 3, 6);		//Sorts between F D P could've also used Arrays.sort(chars)...same thing
		
		//for (char e: chars)
		{
		//	System.out.println(e);				//first 3 elements will print as is, last 3 will be sorted (D, then F then P)
		}
		
		/* BINARY SEARCH (there is no linear search method)
		 * You can use the binarySearch method to search for a key in an array. The array must be pre-sorted in 
		 * increasing order. If the key is not in the array, the method returns –(insertionIndex + 1). 
		 * For example, the following code searches the keys in an array of integers and an array of characters.
		 */
		int [] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		//System.out.println(Arrays.binarySearch(list, 66));		// index of value 66 in the list (9)
		
		char [] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
		//System.out.println("\"g\" index lies at position " + Arrays.binarySearch(chars, 'g'));	//2
		
		/* THE EQUAL METHOD
You can use the equals method to check whether two arrays are strictly equal. 
Two arrays are strictly equal if their corresponding elements are the same. 
In the following code, list1 and list2 are equal, but list2 and list3 are not.
		 */
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {2, 4, 7, 7, 7, 10};
		
		System.out.println("list1 and list2 are " + ((Arrays.equals(list1, list2))? "equal." : "not equal."));
		System.out.println("list1 and list3 are " + ((Arrays.equals(list1, list3))? "equal." : "not equal."));
		
		/* THE FILL METHOD	
		 * Syntax: Arrays.fill(arrName, begIndex, endIndex, valToFillWith)
		 * You can use the fill method to fill in all or part of the array. For example, the following code fills list1 with 5 
		 * and fills 8 into elements list3 [1] through list3 [5-1].
		 */
		
		Arrays.fill(list1, 5);	//will replace every element in the list with 5
		
		for (int e: list1)
		{
			//System.out.println(e);
		}
		
		Arrays.fill(list3, 2, 5, 8);			//Fills list3 with "8" from index [2, 5)...the three 7s turn into three 8s (rest aren't effected)
		
		for (int e: list3)
		{
			//System.out.println(e);
		}
		
		/* TOSTRING method:
		 * You can also use the toString method to return a string that represents all elements in the array. 
		 * This is a quick and simple way to display all elements in the array. For example, the following code prints list2
		 */
		System.out.println(Arrays.toString(list2));		//converts all the (int) elements of list2 into a string
		
		//Recall list2===> 	int[] list2 = {2, 4, 7, 10};
	}

}
