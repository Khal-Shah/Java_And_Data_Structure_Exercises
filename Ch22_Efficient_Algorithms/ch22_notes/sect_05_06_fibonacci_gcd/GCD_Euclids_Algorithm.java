package ch22_notes.sect_05_06_fibonacci_gcd;

import org.junit.Test;

public class GCD_Euclids_Algorithm
{
    @Test
    public void testGCD()
    {
        int n1 = 60;
        int n2 = 150;

        System.out.println("The GCD between " + n1 + " and " + n2 + " is " + getGCDRegular(n1, n2));

        System.out.println("\n==========A slightly more effecient algo==========\n");
        System.out.println("The GCD between " + n1 + " and " + n2 + " is " + getGCDImproved(n1, n2));

        System.out.println("\n==========Euclid's Algorithm==========\n");
        System.out.println("The GCD between " + n1 + " and " + n2 + " is " + getGCDEuclid(n1, n2));


    }

    public int getGCDRegular(int n1, int n2)
    {
        int gcd = 1;

        for(int i = 1; i <= (Math.min(n1, n2)); i++)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
            }
        }

        return gcd;
    }

    public int getGCDImproved(int n1, int n2)
    {
        int gcd = 1;

        if(n1 % n2 == 0)
        {
            return n2;
        }

        for(int i = (n2 / 2); i >= 2; i--)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    private int getGCDEuclid(int m, int n)
    {
        System.out.println(m + ", " + n);

        //base case when smaller number divides into the bigger number evenly (return smaller number)
        if(m % n == 0)
        {
            return n;
        }

        //Continously shrink the bigger number and send it to smaller number's position
        return getGCDEuclid(n, m % n);
    }

}
