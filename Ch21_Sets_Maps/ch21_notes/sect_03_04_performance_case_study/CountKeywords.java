package ch21_notes.sect_03_04_performance_case_study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeywords
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        //ask user to enter path of a .java file, if file exists, invoke countKeywords method
        System.out.print("Enter a java source file (path): ");
        String filePath = kb.next();

        kb.close();
        File srcFile = new File(filePath);
        boolean fileExists = srcFile.exists();

        if(fileExists)
        {
            int total = countKeywords(srcFile);
            System.out.println("Total unique keywords present in \"" + filePath + "\" is " + total);
            System.exit(0);
        }

        System.out.println(filePath + " isn't a valid source file path.");

    }

    /**
     *
     *   Scans through each word in the file and if it is present in keywords set then it is added
     *   to presentInFile set, whose length is returned at the end for the unique count of keywords.
     *
     * @param file (accepts a File object)
     * @return int
     * @throws FileNotFoundException (because of the param)
     */
    private static int countKeywords(File file) throws FileNotFoundException
    {
        //store all keywords in a hashset
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

        Scanner input = new Scanner(file);

        //Create another set that will add entry if it's a keyword
        Set<String> presentInFile = new HashSet<>();

        while(input.hasNext())
        {
            String word = input.next();
//            count += (keywords.contains(input.next())? 1 : 0);

            if(keywords.contains(word))
            {
                presentInFile.add(word);
            }

        }
        input.close();

        return presentInFile.size();
    }
}
