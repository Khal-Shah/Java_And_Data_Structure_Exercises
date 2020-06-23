package ch18notes;

/* Recursion is everywhere. It is fun to think recursively. Consider drinking coffee. 
 * You may describe the procedure recursively as follows:
public static void drinkCoffee(Cup cup) 
{ 
if (!cup.isEmpty()) 
{
      cup.takeOneSip(); // Take one sip
      drinkCoffee(cup);
    }
}

All recursive methods have the following characteristics:
■ The method is implemented using an if-else or a switch statement that leads to different cases.
■ One or more base cases (the simplest case) are used to stop recursion.
■ Every recursive call reduces the original problem, bringing it increasingly closer to a
base case until it becomes that case.

 * 
 */

public class _04_05_RecursiveThinking_HelperMeths
{

	public static void main(String[] args)
	{
		System.out.println("Is \"moon\" a palindrome? - " + isPalindrome("moon"));
		System.out.println("Is \"noon\" a palindrome? - " + isPalindrome("noon"));
		System.out.println("Is \"racecar\" a palindrome? - " + isPalindrome("racecar"));
		
		/* Helper methods are very useful in designing recursive solutions for problems involving strings and arrays. 
		 * The sections that follow give two more examples.
		 */
		
		double [] unorderedList = {2, 9, 5, 4, 8, 1, 6};
		sort(unorderedList);

		for (double e: unorderedList)
		{
			System.out.print(e + " ");
		}
	}
	/* The recursive isPalindrome method is not efficient, because it creates a new string for every recursive call. 
	 * To avoid creating new strings, you can use the low and high indices to indicate the range of the substring. 
	 * These two indices must be passed to the recursive method. Since the original method is isPalindrome(String s), 
	 * you have to create the new method isPalindrome(String s, int low, int high) to accept additional information 
	 * on the string, as shown
	 */
	public static boolean isPalindrome(String s)
	{
		return (isPalindrome(s, 0, s.length() - 1));
	}
	/* It is a common design technique in recursive programming to define a second method that receives additional 
	 * parameters. Such a method is known as a recursive helper method.
	 */
	private static boolean isPalindrome(String s, int low, int high)			//helper method
	{
		if (high <= low)			//base case
		{
			return true;				//done
		}
		
		else if(s.charAt(low) != s.charAt(high))		//base case
		{
			return false;
		}
		
		else
		{
			return (isPalindrome(s, low+1, high - 1));		//changing the indices to check rather than making new strings
		}
	}
	
	/* Recursive selection sort:
	 * Recall that it finds the smallest element in the list and swaps it with the first element. It then finds the smallest 
	 * element remaining and swaps it with the first element in the remaining list, and so on until the remaining list 
	 * contains only a single element. The problem can be divided into two subproblems:
		■ Find the smallest element in the list and swap it with the first element.
		■ Ignore the first element and sort the remaining smaller list recursively.
	The base case is that the list contains only one element
	 */
	
	/* Two overloaded sort methods are defined. The first method, sort(double[] list), sorts an array in 
	 * list[0..list.length - 1] and the second method, sort(double[] list, int low, int high), sorts an array in list[low..high]. 
	 * The second method can be invoked recursively to sort an ever-shrinking subarray.
	 */
	
	public static void sort(double [] list)
	{
		sort(list, 0, list.length - 1);
	}																		//0			//length - 1
	public static void sort(double [] list, int low, int high)
	{
		if (low < high)		//base case
		{						//	Find the smallest number and its index in list[low .. high]
			int indexOfMin = low;		//0
			double min = list[low];		//list[0]
			
			for (int i = low + 1; i <= high; i++)		//+1 cuz min is already assigned to 0
			{
				if (list[i] < min)
				{
					indexOfMin = i;
					min = list[i];
				}
			}
		//// Swap the smallest in list[low .. high] with list[low]
			list[indexOfMin] = list[low];	//low[0]
			list[low] = min;
			// Sort the remaining list[low+1 .. high] 23 sort(list, low + 1, high);
			sort(list, low + 1, high);
		}

	}

}
