package exercises.ex08_count_occurrence_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/** Chapter 21 (Sets and Maps) - Exercise 8:
 *
 * (Count the occurrences of words in a text file) Rewrite Listing 21.9 to read the text from a text file.
 * The text file is passed as a command-line argument. Words are delimited by whitespace characters,
 * punctuation marks (,;.:?), quotation marks ('"), and parentheses.
 *
 * Count words in case-insensitive fashion (e.g., consider Good and good to be the same word).
 * The words must start with a letter. Display the output in alphabetical order of words,
 * with each word preceded by its occurrence count.
 *
 * @author Khaled
 */

public class CountOccurrence_File
{
    static Scanner kb  = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        //Enter path of text file: Resources/Text_Files/paragraph.txt
        System.out.print("Enter path of file: ");
        String path = kb.next();

        //Create file
        File file = new File(path);

        //Create Map
        Map<String, Integer> map = new TreeMap<>();

        //Add word (lowercase) to map:
        Scanner read = new Scanner(file);
        String line;
        String[] words;
        String word;

        List<String> wordList = new ArrayList<>();

        while(read.hasNext())
        {
            //delimited by whitespace characters, punctuation marks (,;.:?), quotation marks ('"), and parentheses.
            line = read.nextLine();
            words = line.replaceAll("[^ a-zA-Z@!~{}\\\\[\\\\]$#^&*\\n\\t\\r.,;?'\\]]", "").split("\\s");

            for(String s : words)
            {
                word = s.toLowerCase();
                wordList.add(word);

                map.put(word, (Collections.frequency(wordList, word)));
            }
        }

        System.out.print(map);
    }
}
