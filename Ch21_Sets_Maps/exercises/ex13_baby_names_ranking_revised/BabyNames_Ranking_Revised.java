package exercises.ex13_baby_names_ranking_revised;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Chapter 21 (Sets and Maps) - Exercise 13:
 *
 * (Baby name popularity ranking) Revise Programming Exercise 21.11 to prompt the user to enter year,
 * gender, and name and display the ranking for the name.
 * Prompt the user to enter another inquiry or exit the program.
 * <p>
 * Here is a sample run:
 * Enter the year: 2010
 * Enter the gender: M
 * Enter the name: Javier
 * Boy name Javier is ranked #190 in year 2010
 * Enter another inquiry? Y
 * Enter the year: 2001
 * Enter the gender: F
 * Enter the name: Emily
 * Girl name Emily is ranked #1 in year 2001
 * Enter another inquiry? N
 *
 * @author Khaled
 */

public class BabyNames_Ranking_Revised
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        char inquiry;
        char gender;

        do
        {
            File file = getFile();
            System.out.print("Enter the gender: ");
            gender = kb.next().toUpperCase().charAt(0);

            Map<String, Integer> map = getMap(gender, file);

            displayRanking(map, gender);

            System.out.print("\nEnter another inquiry (Y for Yes or N for No)? - ");
            inquiry = kb.next().toUpperCase().charAt(0);
        }
        while(inquiry == 'Y');

        System.out.println("***End of Program***");
    }

    private static void displayRanking(Map<String, Integer> map, char gender)
    {
        System.out.print("Enter the name: ");
        String name = kb.next();

        System.out.println(((gender == 'M')? "Boy" : "Girl") + " named " + name + " is ranked #" +
                           map.get(name) + " for the year you've chosen.");
    }

    private static Map<String, Integer> getMap(char gender, File file) throws FileNotFoundException
    {
        Map<String, Integer> map = new HashMap<>();
        Scanner read = new Scanner(file);
        String[] line;

        if(gender == 'F')
        {
            while(read.hasNext())
            {
                line = read.nextLine().split("\\s+");
                map.put(line[3], Integer.valueOf(line[0]));
            }
        }

        else if(gender == 'M')
        {
            while(read.hasNext())
            {
                line = read.nextLine().split("\\s+");
                map.put(line[1], Integer.valueOf(line[0]));
            }
        }

        else
        {
            System.out.println("Invalid gender. Program will terminate.");
            System.exit(0);
        }

        return map;
    }
    private static File getFile()
    {
        System.out.print("Enter the year (2002 or 2010): ");
        int year = kb.nextInt();

        while(!(year == 2002 || year == 2010))
        {
            System.out.print(year + " is an invalid year. Choose from 2002 or 2010: ");
            year = kb.nextInt();
        }

        return new File((year == 2002) ? "Resources/Text_Files/babynamesranking2002.txt" :
                                "Resources/Text_Files/babynamesranking2010.txt");
    }
}
