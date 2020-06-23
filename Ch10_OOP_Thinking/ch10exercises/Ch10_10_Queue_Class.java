package ch10exercises;

/* Chapter 10 - Exercise 10:
 * (The Queue class) Section 10.6 gives a class for Stack. Design a class named Queue for storing integers. Like a stack, 
 * a queue holds elements. In a stack, the elements are retrieved in a last-in first-out fashion. In a queue, the elements are 
 * retrieved in a first-in first-out fashion. The class contains:
■ An int[] data field named elements that stores the int values in the queue.
■ A data field named size that stores the number of elements in the queue.
■ A constructor that creates a Queue object with default capacity 8.
■ The method enqueue(int v) that adds v into the queue.
■ The method dequeue() that removes and returns the element from the queue.
■ The method empty() that returns true if the queue is empty.
■ The method getSize() that returns the size of the queue.
Draw an UML diagram for the class. Implement the class with the initial array size set to 8. The array size will be doubled 
once the number of the elements exceeds the size. After an element is removed from the beginning of the array, you need 
to shift all elements in the array one position the left. Write a test program that adds 20 numbers from 1 to 20 into the 
queue and removes these numbers and displays them.
 */

class Queue
{
	private int [] elements;
	private int size;
	public static final int DEFAULT_CAP = 8;
	
	Queue()
	{
		this (DEFAULT_CAP);
	}
	
	Queue  (int size)
	{
		elements = new int [size];
	}
	
	public int getSize ()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	public void enqueue (int value)
	{
		if (size >= elements.length)
		{
			int [] moreE = new int [elements.length * 2];
			System.arraycopy(elements, 0, moreE, 0, elements.length);
			elements = moreE;
		}
		elements[size++] = value;
	}
	
	public int dequeue()
	{
		int out = elements [0];
		int [] lessE = new int [elements.length];
		System.arraycopy(elements, 1, lessE, 0, size);
		elements = lessE;
		--size;
		return out;
	}
	
}
public class Ch10_10_Queue_Class
{

	public static void main(String[] args)
	{
		Queue queue = new Queue ();
		
		for (int i = 0; i < 20; i++)
		{
			queue.enqueue(i);
		}
		
		int [] removedNums = new int [20];
		
		for (int i = 0; i < 20; i++)
		{
			removedNums [i] = queue.dequeue();
		}
		
		for (int e: removedNums)
		{
			System.out.println(e);
		}
 
	}

}
