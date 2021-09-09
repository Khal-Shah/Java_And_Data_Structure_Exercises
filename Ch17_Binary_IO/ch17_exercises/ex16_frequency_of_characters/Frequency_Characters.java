package ch17_exercises.ex16_frequency_of_characters;

import java.io.*;
import java.util.ArrayList;

/**
 * Chapter 17 (Binary I/O) - Exercise 16:
 *
 * (Frequency of characters) Write a program that prompts the user to enter the name of an ASCII text
 * file and displays the frequency of the characters in the file.
 *
 * @author Khaled
 */

public class Frequency_Characters
{
    public static void main(String[] args) throws IOException
    {
        //count characters of paragraph.txt
        int totalCharacters = getTotalCharacters();

        System.out.println("Total characters: " + totalCharacters);

    }

    private static int getTotalCharacters() throws IOException
    {
        int count = 0;

        try(FileInputStream file = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex16_frequency_of_characters/paragraph.txt");
            BufferedInputStream bufferedIn = new BufferedInputStream(file))
        {
            ArrayList<Integer> values = new ArrayList<>();
            int valTemp;
            int[] frequency = new int[128];

            while((valTemp = bufferedIn.read()) != -1)
            {
                count++;
                values.add(valTemp);
            }

            //There are 128 total ASCII characters:
            System.out.println("Frequency of each character...:\n\t\tASCII\t\t\tFrequency");

            //add the
            for(Integer value : values)
            {
                frequency[value]++;
            }

            for(int i = 0; i < frequency.length; i++)
            {
                //ASCII 0 = null, 32 = space
                if(frequency[i] != 0)
                {
                    System.out.printf("%10d\t\t%10d\n", i, frequency[i]);
                }
//                System.out.println("i = " + i);
            }
        }

        return count;
    }
}
