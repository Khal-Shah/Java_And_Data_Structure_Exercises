package ch21_notes.sect_06_occurrences_words;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/** 21.6:
 * This program creates a Map of words and their corresponding count (number of times they occurred) in
 * a string.
 */

public class CountOccurrenceOfWords
{
    //        TreeMap to hold words and their count
    public  Map<String, Integer> map = new TreeMap<>();
    public String text = "Good morning. Have a good class. " +
                         "Have a good visit. Have fun!";

    public void setText(String text)
    {
        this.text = text;
    }

    public Map<String, Integer> getMap()
    {
        //Replace everything that is NOT character or (white)space with "" then split them by whitespace
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");
        String key;

        for(String word: words)
        {
//            convert it to lowercase
            key = word.toLowerCase();

//            add it only if the word isn't already in the map (with count as 1 cuz it's the first)
            if(!map.containsKey(key))
            {
                map.put(key, 1);
            }

//            else: key is already in Map
            else
            {
//                get the value corresponding to the current key
                int value = map.get(key);
                map.put(key, ++value);
            }
        }
        return map;
    }

    @Test
    public void testCountOccurrence()
    {
        CountOccurrenceOfWords countOccurrenceOfWords = new CountOccurrenceOfWords();
        Map<String, Integer>   map                    = countOccurrenceOfWords.getMap();
        System.out.printf("%8s \t %5s \n", "Key", "Value");
        map.forEach((k, v) ->
                            System.out.printf("%8s \t %5s \n", k, v));
    }
}




