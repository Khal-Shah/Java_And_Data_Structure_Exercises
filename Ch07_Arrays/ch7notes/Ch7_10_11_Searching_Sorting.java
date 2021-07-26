package ch7notes;
import java.util.*;

	/* SEARCHING ARRAYS:
	 * Searching is the process of looking for a specific element in an array—for example, discovering whether a certain 
	 * score is included in a list of scores.
	 * 2 commonly used approaches: 1) linear search and 2) binary search (IF an array is SORTED, BINARY search is more 
	 * efficient than linear search for finding an element in the array.)
	 */

public class Ch7_10_11_Searching_Sorting
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		/*LINEAR SEARCH: 
		int [] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(list, 4);	// I wanna look for the value "4" in the list...so key here is 4 (the element I want). 
		//Method will return 1 (cuz it's the 2nd element in the list)
		int j = linearSearch(list, -4);	//method will return -1 cuz this element (key) wasn't found. 
		int k = linearSearch(list, -3); //will return 5 (cuz key is -3 and it's the 6th element (6-1 cuz index is at 0 in array)
	*/
		/* BINARY SEARCH: (better for larger arrays)
		 * For binary search to work, the elements in the array must already be ordered. 
		 * (Assume array is in ascending order)
		 * The binary search first compares the key with the element in the middle of the array. 
		 * Consider the following three cases:
■ If the key is less than the middle element, you need to continue to search for the key only in the first half of the array.
■ If the key is equal to the middle element, the search ends with a match.
■ If the key is greater than the middle element, you need to continue to search for the
key only in the second half of the array.

The portion of the array being searched shrinks by half after each comparison. 
Let low and high denote, respectively, the first index and last index of the array that is currently being searched. 
Initially, low is 0 and high is list.length–1. 
Let mid denote the index of the middle element, so mid is (low + high)/2.
Following program shows how to find key 11 in the list {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79} using binary search.
		 
		
		int [] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		int keyIndex = binarySearch(list, 11);	//I wanna search for the index of the key (element) 11
		System.out.println("The key index for 11 is " + keyIndex);
		*/
		/* SORTING ARRAYS: (selection sort)
		 * Suppose that you want to sort a list in ascending order. Selection sort finds the smallest number in the list and 
		 * swaps it with the first element. It then finds the smallest number remaining and swaps it with the second element, 
		 * and so on, until only a single number remains.
		 * Following program shows how to sort the list {2, 9, 5, 4, 8, 1, 6} using selection sort.
		 */
		double [] unorderedList = {2, 9, 5, 4, 8, 1, 6};
		double [] orderedList = selectionSort(unorderedList);
		
		for (double e: orderedList)
		{
			System.out.println(e);
		}
	}
	
	 /* The linear search method compares the key with each element in the array (thus inefficient for large arrays). 
	 * The elements can be in any order. 
	 */
	
															//(array, key)
	/*public static int linearSearch (int[] list, int key)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (key == list [i])
			{
				return i;
			}
		}
		return -1;
	}*/
	
	/*public static int binarySearch (int [] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low)
		{
			int mid = (low + high) / 2;	//6, 2, 4
			
			if (key == list [mid])		//match (11 = list [4])
			{
				return mid;		//returns 4
			}
			
			else if (key < list [mid])
			{
				high = mid - 1;	//5			//key must be to the left of mid
			}
			
			else
			{
				low = mid + 1; // 3, 			//key must be to the right of mid
			}
		}
		return -low -1; */
	//}
		//Need to use NESTED LOOPS for selection sorting
	public static double [] selectionSort (double [] list)
	{
		//recall I'm sending 2, 9, 5, 4, 8, 1, 6 (so index 0 to 6)
		int i;			//outer loop var...should go from 0 to length -1 (as many iteration as the length)
		int j; 			//inner loop var...should go from i to list length-1
		double minValue;
		int minIndex;
		double temp = 0;
		
		for (i = 0; i < list.length; i++)
		{
			minValue = list [i];		//Initialize the minValue and the minIndex to first unsorted item each time thru the outer loop
			minIndex = i;
			
			for (j = i; j < list.length; j++)
			{
				if (list [j] < minValue)	//checks the rest of the array to see if there are smaller values (than the one initialized^)
				{
					minValue = list [j];
					minIndex = j;
				}
			}
			//Now swap						//we're in the outer loop now. If the min value we got from inner loop is less than OG
			if (minValue < list [i])		//min value we initialized in the outer loop, that means we have to swap
			{
				temp = list [i];								//store the i'th (1st) item in temp to assign it to index minValue item was later
				list [i] = list [minIndex];				//give the 1st (i'th) item the minValue we found in inner loop
				list [minIndex] = temp;				// assign the element in the i'th (1st) item to the index of where we got the min val
															//^SWAP
			}	
		}
		return list; //returns the same (now sorted) list that came in
	}
	
}
//	Alternatively
//	static void sortScores(String[] names, double[] scores)
//	{
//		String name = "";
//		int currentMaxIndex = 0;
//		double currentMaxVal = scores[0];
//
//		for(int i = 0; i < scores.length; i++)
//		{
//			currentMaxIndex = i;
//			currentMaxVal = scores[i];
//
//			for(int j = (i + 1); j < scores.length; j++)
//			{
//				if(scores[j] > currentMaxVal)
//				{
//					currentMaxIndex = j;
//					currentMaxVal = scores[j];
//				}
//			}
//
//			if(currentMaxIndex != i)
//			{
//				name = names[currentMaxIndex];
//				names[currentMaxIndex] = names[i];
//				names[i] = name;
//				scores[currentMaxIndex] = scores[i];
//				scores[i] = currentMaxVal;
//			}
//		}
//
//		System.out.print("Names and scores in descending order below.\nNames\t\t\tScores");
//
//		for(int i = 0; i < scores.length; i++)
//		{
//			System.out.printf("\n%s\t\t\t%.1f", names[i], scores[i]);
//		}
//	}
