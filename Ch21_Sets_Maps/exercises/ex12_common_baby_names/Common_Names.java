package exercises.ex12_common_baby_names;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** Chapter 21 (Sets and Maps) - Exercise 12:
 *
 * (Name for both genders) Write a program that prompts the user to enter one of the
 * filenames described in Programming Exercise 12.31 and displays the names that
 * are used for both genders in the file.
 * Use sets to store names and find common names in two sets.
 * <p>
 * Here is a sample run:
 * Enter a file name for baby name ranking: babynamesranking2001.txt
 * 69 names used for both genders
 * They are Tyler Ryan Christian ...
 *
 * @author Khaled
 */

public class Common_Names
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = getFile();
        HashSet<String> boySet = new HashSet<>();
        Set<String> girlSet = new HashSet<>();

        Scanner read = new Scanner(file);
        String[] line;

        while(read.hasNext())
        {
            line = read.nextLine().split("\\s");
            boySet.add(line[2]);
            girlSet.add(line[5]);
        }

        Set<String> commonSet = (Set<String>) boySet.clone();
        commonSet.retainAll(girlSet);

        System.out.println(commonSet.size() + " used in both genders. They are: ");
        int i = 0;

        for(String name : commonSet)
        {
            System.out.printf("%10s", name + ((++i % 10 == 0)? "\n" : "\t"));
        }

    }

    private static File getFile()
    {
        System.out.print("Enter the year (2002 or 2010) for baby name ranking: ");
        int year = kb.nextInt();

        while(!(year == 2002 || year == 2010))
        {
            System.out.print("Only available years in the database are 2002 and 2010. Please" +
                    " select one of those years: ");
            year = kb.nextInt();
        }

        return new File(((year == 2002) ? "Resources/Text_Files/babynamesranking2002.txt" :
                "Resources/Text_Files/babynamesranking2010.txt"));
    }
}
