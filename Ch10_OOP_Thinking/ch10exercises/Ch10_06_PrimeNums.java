package ch10exercises;

/* Chapter 10 - Exercise 6:
 * (Displaying the prime numbers) Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 */
	//By Khaled Shah

public class Ch10_06_PrimeNums
{
	static final int MAX = 120;

	public static void main(String[] args)
	{
		StackOfIntegers primeStack = new StackOfIntegers();

		int i = 1;
        do
        {
            if(isPrime(i))
            {
                primeStack.push(i);
            }
        } while (i++ < 120);

		System.out.println("Not in reverse order:");		//Do this first because we're using pop() for reverse
		primeStack.displayStackBottomToTop();

        System.out.println("\nThere are " + primeStack.getSize() + " prime numbers less than 120. These are:" );

        while (!primeStack.empty())
        {
            System.out.println(primeStack.pop());
        }

	}

	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
		for (int j = 2; j <= (i / 2); j++)
		{
			if(i % j == 0)
			{
				return false;
			}
		}
		return isPrime;
	}
}

