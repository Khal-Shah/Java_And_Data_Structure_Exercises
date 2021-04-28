package ch11notes.newnotes.arraylist.treemap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class YT_TreeMap_2
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a text: ");
        String userInput = kb.nextLine();

        System.out.println("You entered: " + userInput);

        String[] words = userInput.split("[ \t\n\r,!,?]");

        //traversing keys in a sorted order
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        for(int i = 0; i < words.length; i++)
        {
            String key = words[i].toLowerCase();

            //if word length is > 1 char
            if(words[i].length() > 1)
            {
                if(map.get(key) == null)
                {
                    map.put(key, 1);
                }
                else
                {
                    //get current key and its accompanied int value
                    int val = map.get(key).intValue();
                    map.put(key, ++val);
                }
            }
        }

        System.out.println(map);
        //map.clear();
        System.out.println(map.values());

        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println(key + ", " + val);
        }
    }
}
