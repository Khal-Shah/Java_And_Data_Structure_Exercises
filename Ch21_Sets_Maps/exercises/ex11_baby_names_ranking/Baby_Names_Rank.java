package exercises.ex11_baby_names_ranking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Chapter 21 (Sets and Maps) - Exercise 11:
 *
 * Baby name popularity ranking) Use the data files from Programming Exercise 12.31
 * to write a program that enables the user to select a year, gender, and enter a
 * name to display the ranking of the name for the selected year and gender, as
 * shown in Figure 21.9. To achieve the best efficiency, create two arrays for boy’s
 * names and girl’s names, respectively. Each array has 10 elements for 10 years.
 * Each element is a map that stores a name and its ranking in a pair with the name
 * as the key.
 *
 * @author Khaled
 */

public class Baby_Names_Rank
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        //Create file
        File file = getFile();

        //name is key, ranking is value
        //user enters (year already in getFile), gender and name. Output is the ranking
        Map<String, Integer> boyMap = new HashMap<>();
        Map<String, Integer> girlMap = new HashMap<>();
        Scanner read = new Scanner(file);

        String[] line;

        while(read.hasNext())
        {
            line = read.nextLine().split("\\s");
//            System.out.println(Arrays.asList(line));
            boyMap.put(line[2], Integer.valueOf(line[0]));
            girlMap.put(line[5], Integer.valueOf(line[0]));
        }

        displayRanking(boyMap, girlMap);
    }

    private static void displayRanking(Map<String, Integer> boy, Map<String, Integer> girl)
    {
        char gender;
        System.out.print("Enter gender (M or F): ");
        gender = kb.next().toUpperCase().charAt(0);

        System.out.print("Enter name: ");
        String name = kb.next();

        while(boy.get(name) == null && girl.get(name) == null)
        {
            System.out.print(name + " doesn't exist in the database. Enter another name: ");
            name = kb.next();
        }

        System.out.println(((gender == 'M')? "Boy " : "Girl ") + "named " + name + " is ranked #" + ((gender == 'F')
                ? girl.get(name) : boy.get(name)) + " for the year you've chosen.");
    }

    private static File getFile()
    {
        System.out.print("Enter a year (either 2002 or 2010): ");
        int year = kb.nextInt();

        while(year != 2002 && year != 2010)
        {
            System.out.print("The baby names data available are from 2002 and 2010 only. Choose either: ");
            year = kb.nextInt();
        }

        String path = ((year == 2002)? "Resources/Text_Files/babynamesranking2002.txt" : "Resources/Text_Files" +
                "/babynamesranking2010.txt");

        return new File(path);
    }
}
