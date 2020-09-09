package ch10notes;
import java.util.Scanner;

/* Chapter 10.11: THE STRINGBUILDER AND STRINGBUFFER CLASS:
 * The StringBuilder and StringBuffer classes are similar to the String class except that the String class is immutable.
 * In general, the StringBuilder and StringBuffer classes can be used wherever a string is used. StringBuilder and 
 * StringBuffer are more flexible than String. You can add, insert, or append new contents into StringBuilder and 
 * StringBuffer objects, whereas the value of a String object is fixed once the string is created. 

 
 */

public class Ch10_11_StringBuilder_Buffer
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		/*  * Modifying Strings in the StringBuilder
 * You can append new contents at the end of a string builder, insert new contents at a specified position in a string builder, 
 * and delete or replace characters in a string builder, 
		 */
		char [] letters = {'a', 'b','c'};
		StringBuilder sb = new StringBuilder();					//create StringBuilder object				**IMPORTANT**
		
		System.out.println(sb.append(letters)); 					//sb initially was null, now it has abc
		sb.append("ABC");
		System.out.println(sb);											//abcABC
		
		//Deleting characters by their indices: sb.delete(begIndex, endIndex+1)
		System.out.println(sb.delete(3, 6));
		sb.append("Cdef");								//deleting chars at specific index				(now we've appended to make it abcCdef
		System.out.println(sb.deleteCharAt(3));			//abc
		
		//Inserting data/value at specific index:
		sb.insert(3, "...");										//abc...def
		System.out.println(sb); 							//	^^^
		
		//Reversing characters:
		System.out.println(sb.reverse()); 			//fed...cba
		
		//Replacing data with new data at specific index
		sb.replace(3, 9, " alive");
		System.out.println(sb);						//fed alive
		
		//setting a char val at a specified index
		sb.setCharAt(4, 'o');							//replaces the char at index 4 with char o
		System.out.println(sb);						//fed olive
		
		//Furthermore...
		/* If you wanna return a STRING from a StringBuilder (such as the sb object made from it), thats when you'd use toString
		 */
		System.out.println(sb.capacity());		//16
		/*
		 * The capacity() method returns the current capacity of the string builder. The capacity is the number of characters the 
		 * string builder is able to store without having to increase its size. The length() method returns the number of 
		 * characters actually stored in the string builder. 
		 */
			sb.setLength(32);
			System.out.println(sb.capacity()); 		//32
		 /*
		 * The setLength(newLength) method sets the length of the string builder. If the newLength argument is less than the 
		 * current length of the string builder, the string builder is truncated to contain exactly the number of characters given 
		 * by the newLength argument. If the newLength argument is greater than or equal to the current length, sufficient null 
		 * characters (\u0000) are appended to the string builder so that length becomes the newLength argument. The 
		 * newLength argument must be greater than or equal to 0.
		 * 
		 * The length of the string is always less than or equal to the capacity of the builder. The length is the actual size of the 
		 * string stored in the builder, and the capacity is the current size of the builder. The builder’s capacity is automatically 
		 * increased if more characters are added to exceed its capacity. Internally, a string builder is an array of characters, 
		 * so the builder’s capacity is the size of the array. If the builder’s capacity is exceeded, the array is replaced by a new
		 * array. The new array size is 2 * (the previous array size + 1).

		 */
			System.out.println("Enter a string below:");
			String userStr = kb.nextLine();
			
			PallindromeChecker msg1 = new PallindromeChecker (userStr);
			
			System.out.println("The string " + msg1.getNewMsg() + " is" + ((msg1.isPalindrome())? "" : " not") + " a palindrome.");
			
	}
	
	

}

	/* Write a new program that ignores nonalphanumeric characters in checking whether a string is a palindrome.
Here are the steps to solve the problem:
1. Filter the string by removing the nonalphanumeric characters. This can be done by creating an empty string builder, 
adding each alphanumeric character in the string to a string builder, and returning the string from the string builder. 
You can use the isLetterOrDigit(ch) method in the Character class to check whether character ch is a letter or a digit.
2. Obtain a new string that is the reversal of the filtered string. Compare the reversed string with the filtered string using 
the equals method.
	 */

class PallindromeChecker
{
	private String userStr;
	private String newMsg;
	
	PallindromeChecker(String userStr)
	{
		this.userStr = userStr;
	}
	
	/*public char [] convertToCharArr()
	{
		char [] chars = userStr.toCharArray();
		return chars;
	} */																			//no need for this because you can use it directly (See below if statement
	
	public String getNewMsg ()
	{
		//char [] chars = convertToCharArr();
		StringBuilder sb1 = new StringBuilder();
		
		for (int i = 0; i < userStr.length(); i ++)
		{
			if (Character.isLetterOrDigit(userStr.charAt(i)))
			{
				sb1.append(userStr.charAt(i));
			}
		}
		return sb1.toString();
	}
	
	public boolean isPalindrome()																		//FOR STRING, you have to use EQUAL METH
	{																																// == WONT WORK!!!!!
	
		StringBuilder sb2 = new StringBuilder();								
		sb2.append(getNewMsg());
		sb2.reverse();
		return (getNewMsg().equals(sb2.toString()));
	}
}
