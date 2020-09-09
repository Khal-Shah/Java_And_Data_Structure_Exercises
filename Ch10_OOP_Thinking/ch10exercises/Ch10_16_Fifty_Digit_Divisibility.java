package ch10exercises;
import java.math.BigInteger;

/* Chapter 10 - Exercise 16:
(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 */
    //By Khaled Shah


public class Ch10_16_Fifty_Digit_Divisibility
{
    public static void main(String[] args)
    {
        String bigValStr = "1";
        for(int i = 0; i < 49; i++)
        {
            bigValStr = bigValStr.concat("0");
        }  //Creating smallest 50 decimal digit: 10000000000000000000000000000000000000000000000000

        BigInteger bigValue = new BigInteger(bigValStr);

        BigInteger[] divisibleBigValues = new BigInteger[10];
        int i = 0;

        do
        {
            if(isDivisible(bigValue))
            {
                divisibleBigValues[i] = bigValue;
                bigValue = bigValue.add(BigInteger.ONE);
                i++;
            }

            else
            {
                bigValue = bigValue.add(BigInteger.ONE);
            }

        }while(i < divisibleBigValues.length);

        System.out.println("The first 10 Big Integers (> 50 decimal digits) that are divisible by 2 or 3 are: ");

        for(BigInteger e: divisibleBigValues)
        {
            System.out.println(e);
        }

    }

    public static boolean isDivisible(BigInteger val)
    {
        if(val.mod(BigInteger.TWO).equals(BigInteger.ZERO) || val.mod(new BigInteger("3")).equals(BigInteger.ZERO))
        {
            return true;
        }

        return false;
    }
}
