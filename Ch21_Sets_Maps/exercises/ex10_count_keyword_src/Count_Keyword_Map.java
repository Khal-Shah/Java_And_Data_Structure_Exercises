package exercises.ex10_count_keyword_src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/** Chapter 21 (Sets and Maps) - Exercise 3:
 *
 * Count the occurrences of each keyword) Rewrite Listing 21.7, CountKeywords.
 * java to read in a Java source-code file and count the occurrence of each keyword
 * in the file, but don’t count the keyword if it is in a comment or in a string literal.
 *
 * @author Khaled
 */

public class Count_Keyword_Map
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.print("Enter the path of a source file: ");
        String path = kb.nextLine();

        File file = new File(path);

        Map<String, Integer> map = getMap(file);

        map.forEach((k, v) ->
                System.out.println(k + " appears " + v + " times."));
    }

    private static Map<String, Integer> getMap(File file) throws FileNotFoundException
    {
        Set<String> keywords = new HashSet<>();
        Collections.addAll(keywords, "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null");

        Map<String, Integer> map = new HashMap<>();

        Scanner read = new Scanner(file);
        String word;

        while(read.hasNext())
        {
            word = read.next();

            //skip to the next line if there's a single line comment
            if(word.contains("//"))
            {
                read.nextLine();
            }

            //if there's opening quotation for string, skip everything until next quotation "
            else if(word.contains("\""))
            {
                String next;

                do
                {
                    next = read.next();
                }while(!next.contains("\""));
            }

            //if there's opening multiline comment then skip everything until closing multiline comment
            else if(word.contains("/*"))
            {
                String next;

                do
                {
                    next = read.next();
                }while(!next.contains("*/"));
            }

            else if(keywords.contains(word))
            {
                if(!map.containsKey(word))
                {
                    map.put(word, 1);
                }

                else
                {
                    map.put(word, (map.get(word) + 1));
                }
            }
        }

        return map;
    }
}
