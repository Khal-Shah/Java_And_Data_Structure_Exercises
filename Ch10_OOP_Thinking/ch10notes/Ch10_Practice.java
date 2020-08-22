package ch10notes;


public class Ch10_Practice
{

    public static void main(String[] args)
    {

//        System.out.println(stack.empty());
//        stack.push(10);
//        System.out.println(stack.empty() + ", " + stack.peek());

        //push 1-5 then display in reverse order

//        for(int i = 1; i <= 5; i++)
//        {
//            stack.push(i);
//        }
//
//        while (!stack.empty())
//        {
//            System.out.println(stack.pop());
//        }

        /*
         * Chapter 10 - Exercise 6:
         * (Displaying the prime numbers) Write a program that displays all the prime numbers less than 120 in decreasing order.
         * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
         */

//        StacksOfIntegers primeStack = new StacksOfIntegers();
//
//        int i = 1;
//        do
//        {
//            if(isPrime(i))
//            {
//                primeStack.push(i);
//            }
//        } while (i++ < 120);
//
//        System.out.println("There are " + primeStack.getSize() + " prime numbers less than 120. These are:" );
//
//        while (!primeStack.empty())
//        {
//            System.out.println(primeStack.pop());
//        }
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
