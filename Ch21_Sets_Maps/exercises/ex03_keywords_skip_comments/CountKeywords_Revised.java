package exercises.ex03_keywords_skip_comments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/** Chapter 21 (Sets and Maps) - Exercise 3:
 *
 * (Count the keywords in Java source code) Revise the program in Listing 21.7. If a keyword is in
 * a comment or in a string, don’t count it.
 *
 * Pass the Java file name from the command line. Assume that the Java source code is correct and
 * line comments and paragraph comments do not overlap.
 *
 * @author Khaled
 */

public class CountKeywords_Revised
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.print("Enter path of file: ");
        String path = kb.nextLine();

        File file = new File(path);

        while(!file.exists())
        {
            path = kb.nextLine();
            file = new File(path);
        }

        //file is now ready
        kb.close();
        List<String> keywordsFound = getKeywords(file);
        System.out.println("Keywords found: " + keywordsFound + "\nTotal: " + keywordsFound.size());
    }

    private static <E> ArrayList getKeywords(File file) throws FileNotFoundException
    {
        Scanner input = new Scanner(file);

        //possible keywords
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

        //Create TreeSet to return with the matched keywords
        List<String> foundKeywords = new ArrayList<>();

        String word = "";

        while(input.hasNext())
        {
            word = input.next();

            if(word.contains("(for"))
            {
                System.out.println(word);
            }

            //skip to the next line if there's a single line comment
            if(word.contains("//"))
            {
                input.nextLine();
                continue;
            }

            //if there's opening quotation for string, skip everything until next quotation "
            else if(word.contains("\""))
            {
                String next;

                do
                {
                    next = input.next();
                }while(!next.contains("\""));
            }

            //if there's opening multiline comment then skip everything until closing multiline comment
            else if(word.contains("/*"))
            {
                String next;

                do
                {
                    next = input.next();
                }while(!next.contains("*/"));
            }

            else if(keywords.contains(word))
            {
                foundKeywords.add(word);
            }
        }
        input.close();
        return (ArrayList) foundKeywords;
    }
}
