package ch12exercises.ex10_outofmemory;

/** Chapter 12 - Exercise 10:
 * (OutOfMemoryError) Write a program that causes the JVM to throw an OutOfMemoryError
 * and catches and handles this error.
 *
 * @author khaled Shah
 */

public class MemoryExceptionController
{
    public static void main(String[] args)
    {
        int [] arr = new int[100000000];

        try
        {
            System.out.println("Size before: " + arr.length);
            arr = new int[arr.length * arr.length];
            System.out.println("Size after: " + arr.length);
        }
        catch (OutOfMemoryError error)
        {
            System.out.println("Caught OutOfMemoryError");
            error.printStackTrace();
            System.out.println(error.getMessage());
        }

        System.out.println("End of program");
    }
}
