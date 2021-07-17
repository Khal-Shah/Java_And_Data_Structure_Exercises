package ch20exercises.ex01_words_order;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Chapter 20 (Lists, Stacks, & Queues) - Exercise 1:
 * (Display words in descending alphabetical order) Write a program that reads words from a text file
 * and displays all the words (duplicates allowed) in descending alphabetical order.
 * The words must start with a letter. The text file is passed as a command-line argument.
 *
 * Note: exercise modified to read a text-file containing words
 *
 * @author Khaled
 */

public class Descending_Order_Words
{
    public static void main(String[] args) throws FileNotFoundException
    {

        List<String> words = (List<String>) getWords();
        Collections.shuffle(words);
        System.out.println("Before sorting the words are:");
        displayWords(words);

        System.out.println("\n\n" + "============================================================\n");

        //Sort by descending: ascending and then reversed
        words.sort(String::compareToIgnoreCase);
        Collections.reverse(words);

        System.out.println("\nAfter sorting (descending order) the words are:");
        displayWords(words);

    }

    public static void displayWords(List<String> words)
    {
        int i = 0;
        for(String word: words)
        {
            System.out.printf("%s" + ((++i % 10 == 0)? "\n" : ", "), word);
        }
    }

    public static List<? extends String> getWords() throws FileNotFoundException
    {
        File file = new File("Resources/Text_Files/wordlist.10000.txt");
        List<String> word = new ArrayList();

        try(Scanner input = new Scanner(file))                                  // Create the resource
        {
            while(input.hasNext())                                       // while there's still data
            {
                word.add(input.next());
            }
        }

        return word;
    }
}
