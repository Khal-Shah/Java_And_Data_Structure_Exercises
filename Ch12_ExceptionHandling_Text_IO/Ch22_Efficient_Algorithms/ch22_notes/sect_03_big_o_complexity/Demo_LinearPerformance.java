package Ch22_Efficient_Algorithms.ch22_notes.sect_03_big_o_complexity;

import org.junit.Test;

/**
 *
 */

public class Demo_LinearPerformance
{
    private static final int INPUT_1 = 1_000_000;
    private static final int INPUT_2 = 10_000_000;
    private static final int INPUT_3 = 100_000_000;
    private static final int INPUT_4 = 1_000_000_000;

    @Test
    public void testLinearPerformance()
    {
        getTime(INPUT_1);       //n = 1 mill
        getTime(INPUT_2);       //n = 10 mill
        getTime(INPUT_3);       //n = 100 mill
        getTime(INPUT_4);       //n = 1 bill
    }

    private void getTime(int n)
    {
        long startTime = System.currentTimeMillis();

        long k = 0;
        for(int i = 1; i <= n; i++)
        {
            k += 5;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Execution time for n = " + n + " is " + (endTime - startTime) + " ms");
    }
}
