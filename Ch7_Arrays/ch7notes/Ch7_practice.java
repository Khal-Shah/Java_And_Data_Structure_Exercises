package ch7notes;
import java.util.*;

/* Chapter 7 - Exercise 16:
 * (Execution time) Write a program that randomly generates an array of 100,000 integers and a key.
 * Estimate the execution time of invoking the linearSearch method in Listing 7.6.
 * Sort the array and estimate the execution time of invoking the binarySearch method in Listing 7.7.
 * You can use the following code template to obtain the execution time:
long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
 *
 */
//By Khaled Shah


public class Ch7_practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{

		int[] randomArray = getRandomArr(100_000);
		int key = getKey(randomArray);

		long startTime = System.currentTimeMillis();
		performLinearSearch(randomArray, key);

		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;

		System.out.println("The execution time for linear search is " + executionTime + "ms.");
		//showArr(randomArray);
		System.out.println();
		//Now do binary search.
		randomArray = sortRandomArr(randomArray);
		//showArr(randomArray);
		startTime = System.currentTimeMillis();
		performBinarySearch(randomArray, key);

		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;

		System.out.println("The execution time for binary search is " + executionTime + "ms.");
	}

	static void performBinarySearch(int[] list, int key)
	{
		//list = now sorted
		int low = 0;
		int high = list.length - 1;
		int mid;
		int keyIndex = -1;

		while(high >= low)
		{
			mid = (low + high) / 2;

			if(key == list[mid])
			{
				keyIndex = mid;
				break;
			}

			else if(key > list[mid])
			{
				low = mid + 1;
			}

			else
			{
				high = mid - 1;
			}
		}

		if (keyIndex != -1)
		{
			System.out.println("The key value of " + key + " belongs in the index position " + keyIndex + " of the array.\n" +
							   "list[" + keyIndex + "] = " + list[keyIndex]);
		}

		else
		{
			System.out.println("The key does not exist in this array.");
		}
	}

	static int[] sortRandomArr(int[] list)
	{
		int currentMinVal;
		int currentMinIndex;

		for(int i = 0; i < list.length; i++)
		{
			currentMinIndex = i;
			currentMinVal = list[i];

			for(int j = i + 1; j < list.length; j++)
			{
				if(list[j] < currentMinVal)
				{
					currentMinIndex = j;
					currentMinVal = list[j];
				}
			}

			if(currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMinVal;
			}
		}
		return list;
	}

	static void showArr(int[] list)
	{
		for(int e: list)
		{
			System.out.print(e + ", ");
		}
	}

	static void performLinearSearch(int[] list, int key)
	{
		int keyIndex = -1;

		for(int i = 0; i < list.length; i++)
		{
			if(key == list[i])
			{
				keyIndex = i;
				break;
			}
		}

		if (keyIndex != -1)
		{
			System.out.println("The key value of " + key + " belongs in the index position " + keyIndex + " of the array.\n" +
							   "list[" + keyIndex + "] = " + list[keyIndex]);
		}

		else
		{
			System.out.println("The key does not exist in this array.");
		}

	}

	static int getKey(int[] list)
	{
		int keyIndex = (int) (Math.random() * list.length);
		return list[keyIndex];
	}

	static int[] getRandomArr(int size)
	{
		int[] randomArr = new int[size];

		for(int i = 0; i < size; i++)
		{
			randomArr[i] = (int) (-100 + Math.random() * 201);
		}
		return randomArr;
	}
}

