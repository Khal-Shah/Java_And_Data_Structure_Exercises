package ch18exercises;

import org.junit.Test;

/** Chapter 18 (Recursion) - Exercise 15:
 * (Occurrences of a specified character in a string) Rewrite Programming Exercise 18.10 using a helper method
 * to pass the substring high index to the method.
 *
 * The helper method header is:
 * public static int count(String str, char a, int high)
 *
 * @author Khaled
 */

public class Ch18_15_Occurrences_Helper
{

    public static int count(String str, char a)
    {
        return count(str.toLowerCase(), Character.toLowerCase(a), str.length());
    }

    public static int count(String str, char a, int high)
    {
        high--;

        if(high < 0)
        {
            return 0;
        }

        else
        {
            return ((str.charAt(high) == a)? 1 : 0) + count(str.substring(0, high), a, high);
        }
    }

    @Test
    public void testCount()
    {
        String str = "Welcome To Java Edition Eleven";
        char letter = 'e';
        int totalOccurrences = count(str, letter);
        System.out.println(letter + " occurs " + totalOccurrences + " times.");
    }
}
