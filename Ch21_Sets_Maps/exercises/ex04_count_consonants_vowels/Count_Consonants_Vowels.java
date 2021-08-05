package exercises.ex04_count_consonants_vowels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**Chapter 21 (Sets and Maps) - Exercise 4:
 *
 * (Count consonants and vowels) Write a program that prompts the user to enter a text file name and
 * displays the number of vowels and consonants in the file. Use a set to store the vowels A, E, I, O, and U.
 *
 * @author Khaled
 */

public class Count_Consonants_Vowels
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        //enter path for text file
        System.out.print("Enter path of your text file: ");
        //Resources/Text_Files/paragraph.txt => Should be 183 vowels and 278 consonants
        String path = kb.nextLine();

        File file = new File(path);

        Set<Character> vowels = new HashSet<>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        int totalVowels = getVowelCount(vowels, file);
        int totalConsonants = getConsonantCount(vowels, file);

        System.out.println("Total vowels in your file: " + totalVowels);
        System.out.println("Total consonants in your file: " + totalConsonants);

    }

    private static <E> int getConsonantCount(Set<E> vowelSet, File file) throws FileNotFoundException
    {
        int count = 0;
        Scanner input = new Scanner(file);
        String word;

        while(input.hasNext())
        {
            word = input.next();

            for(int i = 0; i < word.length(); i++)
            {
                //increase count if the character is alphabetic but not a vowel
                if(Character.isAlphabetic(word.charAt(i)) && !vowelSet.contains(word.charAt(i)))
                {
                    count++;
                }
            }
        }
        return count;
    }


    private static <E> int getVowelCount(Set<E> vowelSet, File file) throws FileNotFoundException
    {
        Scanner input = new Scanner(file);
        int count = 0;
        String word;

        while(input.hasNext())
        {
            word = input.next();

            for(int i = 0; i < word.length(); i++)
            {
                if(vowelSet.contains(word.charAt(i)))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
