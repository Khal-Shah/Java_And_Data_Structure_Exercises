package ch7exercises;

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

public class Ch7_16_Search_Execution_T
{

	public static void main(String[] args)
	{
		int [] largeArr = new int [100_000];
		
		for (int i = 0; i < 100_000; i++)
		{
			largeArr [i] = (int) (1 + Math.random() * 100_000);		//random num bet. 1 and 100000
		}
		
		int key = (largeArr [(int) (1 + Math.random() * 100_000)]);
		System.out.println("The key is " + key);
		
		long startTime = System.currentTimeMillis();
		int linearKeyIndex = linearSearch (largeArr, key);
		long endTime = System.currentTimeMillis();
		long execTime = endTime - startTime;
		System.out.println("The index of the key for linear search is " + linearKeyIndex + "\nExecution time: " + execTime + 
				" ms");
		System.out.println("Check: " + largeArr [linearKeyIndex]);
		
		key =  (largeArr [(int) (1 + Math.random() * 100_000)]);
		System.out.println("\nThe new key is " + key);
		
		largeArr = sortList(largeArr);
		
		startTime = System.currentTimeMillis();
		int binaryKeyIndex = binarySearch (largeArr, key);
		endTime = System.currentTimeMillis();
		execTime = endTime - startTime;
		System.out.println("The index of the key for binary search is " + binaryKeyIndex + "\nExecution time: " + execTime + 
				" ms");
		System.out.println("Check: " + largeArr [binaryKeyIndex]);

	}
	
	
	public static int linearSearch (int [] list, int key)
	{		
		for (int i = 0; i < list.length; i++)
		{
			if (key == list [i])
			{
				return i;
			}
		}
		return - 1;
	}
	
	
	public static int [] sortList (int [] unorderedList)
	{
		int temp = 0;
		int minVal;
		int minIndex;
		
		for (int i = 0; i < unorderedList.length; i++)
		{
			minVal = unorderedList [i];
			minIndex = i;
			
			for (int j = i; j < unorderedList.length; j++)
			{
				if (unorderedList [j] < minVal)
				{
					minVal = unorderedList [j];
					minIndex = j;
				}
			}
			
			if (minVal < unorderedList [i])
			{
				temp = unorderedList [i];
				unorderedList [i] = unorderedList [minIndex];		//bringing the min value over
				unorderedList [minIndex] = temp;	//putting the "bigger" val to where we got the min from
			}
		}
		return unorderedList; //but now ordered cuz we fixed it up here ^^^
	}
	
	public static int binarySearch (int [] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		int mid;
		
		while (high >= low)
		{
			mid = (low + high) / 2;
			
			if (key == list [mid])
			{
				return mid;
			}
			
			else if (key < list [mid])
			{
				high = mid - 1;
			}
			
			else
			{
				low = mid + 1;
			}	
		}
		return -low -1;
	}

}
