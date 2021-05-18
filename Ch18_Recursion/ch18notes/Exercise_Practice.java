package ch18notes;

import org.junit.Test;

import java.util.Scanner;

/*

 **/

public class Exercise_Practice
{
    static Scanner kb = new Scanner(System.in);
    static int charCount = 0;

    @Test
    public void countTest()
    {
        int totalCount = count("welcome", 'e');
        System.out.println(totalCount);
    }

    public static int count(String str, char a)
    {
        System.out.println(str);
        if(str.length() == 1)
        {
            if(str.charAt(0) == a)
            {
                charCount++;
            }
            return charCount;
        }

        else if(str.charAt(0) == a)
        {
            charCount++;
            //System.out.println(charCount);
        }

        return count(str.substring(1), a);
    }


}
