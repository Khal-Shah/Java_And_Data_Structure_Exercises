package ch10exercises;

/* Chapter 10 - Exercise 20:
(Approximate e) Programming Exercise 5.26 approximates e using the following series:

   "Chapter 5 - Exercise 26:
  (Compute e) You can approximate e using the following series:
e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! +...+ 1 / i!
Write a program that displays the e value for i = 10000, 20000, …, and 100000.
(Hint: Because i! = i * (i - 1) * ... * 2 * 1, then 1/i! is 1/i*(i-1)!
Initialize e and item to be 1 and keep adding a new item to e.
The new item is the previous item divided by i for i = 2, 3, 4, . . . .)"

 In order to get better precision, use BigDecimal with 25 digits of precision in the computation.
 Write a program that displays the e value for i = 100, 200, . . . , and 1000.
 */
    //By Khaled shah


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ch10_20_BigDecimal_Approximate_E
{
    static final int DENO_MAX = 10;

    public static void main(String[] args)
    {
        BigDecimal e = new BigDecimal("1");
        e = approximateE(e);
        System.out.println("The actual value of E is " + Math.E);
        System.out.println("With the series of sum approximate with i = " + DENO_MAX + ", E is " + e);
    }

    static BigDecimal approximateE(BigDecimal e)
    {
        //e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! +...+ 1 / i!
       BigDecimal numerator = BigDecimal.ONE;
       BigDecimal denominator = BigDecimal.ONE;

       while(denominator.compareTo(new BigDecimal(DENO_MAX)) < 1)
       {
           numerator = numerator.divide(denominator, 25, RoundingMode.UP);
           e = e.add(numerator);
           denominator = denominator.add(BigDecimal.ONE);
       }

       return e;
    }

}
