package exercises.ex02_names_sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/** Chapter 21 (Sets and Maps) - Exercise 2:
 *
 * (Display nonduplicate names in ascending order) Given one or more text files, each representing a
 * day’s attendance in a course and containing the names of the students who attended the course on
 * that particular day, write a program that displays, in ascending order, the names of those
 * students who have attended at least one day of the course.
 *
 * @author Khaled
 */

public class Names_Sorting_Set
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.print("Enter the path of the file: ");
        String path = kb.next();
        //Resources/Text_Files/last-names.txt

        File file = new File(path);

        while(!file.exists())
        {
            System.out.print("Invalid path, please try again: ");
            path = kb.nextLine();
            file = new File(path);
        }

        kb.close();
        Scanner input = new Scanner(file);

        //Create Set
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());

        while(input.hasNext())
        {
            //make it uppercase in case there are same names with mix of lower and uppercase
            set.add(input.next().toUpperCase());
        }

        System.out.println("Size: " + set.size());
        System.out.println("\n" + set);

    }
}
