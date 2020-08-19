package ch10exercises;
import java.util.Scanner;

/* Chapter 10 - Exercise 5:
 * (Displaying the prime factors) Write a program that prompts the user to enter a positive integer and displays all its 
 * smallest factors in decreasing order. For example, if the integer is 120, the smallest factors are displayed as 
 * 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in 
 * reverse order.
 */
		//By Khaled Shah

public class Ch10_05_PrimeFactors
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a positive integer: ");
		int userNum = kb.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers(userNum);		
		
		int factor = 2; 	//smallest
		
		while (factor <= userNum)
		{
			if (userNum % factor == 0)
			{
				stack.push(factor);
			}
			factor++;
		}
		
		//no need to revere cuz in stack it's first in last out
		System.out.println("The factors are...");
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

	}

}

class StackOfIntegers
{
	private int [] elements; 				//An array to store integers in the stack. The number of integers in the stack.
	private int size;							//The number of integers in the stack.
	public static final int DEFAULT_CAP = 16;
	
	//Constructs an empty stack with a default capacity of 16. 
	StackOfIntegers()
	{
		this (DEFAULT_CAP);				//assigns 16 to both
	}
	
	//Constructs an empty stack with a specified capacity. 
	StackOfIntegers (int size)
	{
		elements = new int [size];
	}
	
	//Returns true if the stack is empty.
	public boolean isEmpty ()
	{
		return (size == 0);
	}
	
	//Returns the integer at the top of the stack without removing it from the stack.
	public int peek()
	{
		return (elements[size-1]);
	}
	
	//Stores an integer into the top of the stack.
	/* To implement push(int value), assign value to elements[size] if size < capacity. If the stack is full (i.e., size >= capacity), 
	 * create a new array of twice the current capacity, copy the contents of the current array to the new array, and assign 
	 * the reference of the new array to the current array in the stack. Now you can add the new value to the array. 
	 */
	public void push (int value)
	{
		if (size >= elements.length)
		{
			int [] temp = new int [elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	
	//Removes the integer at the top of the stack and returns it.
	public int pop()
	{
		return (elements [--size]);
	}
	
	//Returns the number of elements in the stack
	public int getSize()
	{
		return size;
	}
	
	public void displayStack ()
	{
		for (int i = 0; i < elements.length; i++)
		{
			System.out.println(elements [i]);
		}
	}
	
}