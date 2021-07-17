package ch20exercises.ex06_get_vs_iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Chapter 20 (Lists, Stacks, & Queues) - Exercise 6:
 * Use iterators on ArrayList) Write a test program that stores 10 million integers
 * in ascending order (i.e., 1,2, . . ., 10m) in an ArrayList, displays the execution
 * time taken to traverse the list, and searches for the 10 millionth element using
 * the get(index) vs using the iterator method.
 *
 * @author khaled
 */

public class List_10million_Items_Time
{
    @Test
    public void testExecutionTime()
    {
        //Create and populate ArrayList
        List<Integer> numbers = new ArrayList<>();

        for(int i = 1; i <= 10_000_000; i++)
        {
            numbers.add(i);
        }

        //Execution time to traverse the list and find last item using getIndex:
        long execTimeGet = getExecTimeGet(numbers);
        System.out.println("It took " + execTimeGet + "ms using the .get method.\n");

        //Execution time to traverse the list and find last item using iterator:
        long execTimeIterator = getExecTimeIterator(numbers);
        System.out.println("It took " + execTimeIterator + "ms using the iterator method.");

    }

    private long getExecTimeGet(List<?> nums)
    {
        long startingTime = System.currentTimeMillis();
        long endTime;

        System.out.println("The 10 millionth element is: " + nums.get(nums.size() - 1));
        endTime = System.currentTimeMillis();

        return endTime - startingTime;
    }

    private long getExecTimeIterator(List<?> nums)
    {
        long startingTime = System.currentTimeMillis();
        long endTime;

        ListIterator<?> iterator = nums.listIterator(nums.size());
        System.out.println("The 10 millionth element is: " + iterator.previous());
        endTime = System.currentTimeMillis();

        return endTime - startingTime;
    }

}
