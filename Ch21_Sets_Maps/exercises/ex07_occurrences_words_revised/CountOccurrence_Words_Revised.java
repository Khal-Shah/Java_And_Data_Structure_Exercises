package exercises.ex07_occurrences_words_revised;

import ch21_notes.sect_06_occurrences_words.CountOccurrenceOfWords;

import java.util.*;

/**
 * Chapter 21 (Sets and Maps) - Exercise 7:
 *
 * (Revise Listing 21.9, CountOccurrenceOfWords.java) Rewrite Listing 21.9 to display the words in
 * ascending order of occurrence counts.
 *
 * @author Khaled
 */

public class CountOccurrence_Words_Revised implements Comparable<CountOccurrence_Words_Revised>
{
    private String word;
    private Integer count;

    CountOccurrence_Words_Revised(String word, Integer count)
    {
        this.word = word;
        this.count = count;
    }

    @Override
    public int compareTo(CountOccurrence_Words_Revised o)
    {
        if(o.count.compareTo(this.count) > 0)
        {
            return -1;
        }

        else if(o.count.compareTo(this.count) < 0)
        {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString()
    {
        return String.format("%-8s \t %5d", word, count);
    }

    public static void main(String[] args)
    {
        CountOccurrenceOfWords countOccurrenceOfWords = new CountOccurrenceOfWords();
//        countOccurrenceOfWords.setText("Welcome to Java. This is not a drill, I repeat this is NOT a drill!");
        Map<String, Integer> map = countOccurrenceOfWords.getMap();

        List<CountOccurrence_Words_Revised> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            list.add(new CountOccurrence_Words_Revised(entry.getKey(), entry.getValue()));
        }

        Collections.sort(list);
        for(CountOccurrence_Words_Revised countOccurrence_words_revised : list)
        {
            System.out.println(countOccurrence_words_revised);
        }
    }
}
