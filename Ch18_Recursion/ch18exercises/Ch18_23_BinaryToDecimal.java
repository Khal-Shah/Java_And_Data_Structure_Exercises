package ch18exercises;

import org.junit.Assert;
import org.junit.Test;

/** Chapter 18 (Recursion) - Exercise 23:

 * (Binary to decimal) Write a recursive method that parses a binary number as a string into a decimal integer.
 *
 * The method header is:
 * public static int bin2Dec(String binaryString)
 * Write a test program that prompts the user to enter a binary string and displays its decimal equivalent.
 *
 * @author Khaled
 */
public class Ch18_23_BinaryToDecimal
{
    static int decimalValue;

     public static int bin2Dec(String binaryString)
     {
         //Ex 1101: last 1 -> 10^0 (expo starting with 0) * 1 then pass 0 as last and 1 as expo and add previous result
         int expo = 0;
         decimalValue = 0;

         return bin2Dec(binaryString, expo, binaryString.length() - 1);
     }

      public static int bin2Dec(String binaryString, int expo, int high)
      {
          if(high < 0)
          {
              return decimalValue;
          }

          decimalValue += Math.pow(2, expo) * Integer.valueOf("" + binaryString.charAt(high));

          return bin2Dec(binaryString, ++expo, --high);
      }

      @Test
      public void bin2DecTest()
      {
          //System.out.println("11001 from binary to decimal is = " + bin2Dec("11001"));
          Assert.assertEquals("11001 from binary to decmial should be 25", 25, bin2Dec("11001"));
      }

}
