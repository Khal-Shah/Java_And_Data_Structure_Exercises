package exercises.ex09_country_capital_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Chapter 21 (Sets and Maps) - Exercise 9:
 *
 * (Guess the capitals using maps) Rewrite Programming Exercise 8.37 to store pairs of each state
 * and its capital in a map.
 * Your program should prompt the user to enter a state, and should display the capital for the state.
 *
 * Modified to have country and capital (text file) instead.
 *
 * @author Khaled
 */

public class CountryCapital_Pair
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        //path
        String path = "Resources/Text_Files/country_list.txt";

        //File
        File file = new File(path);

        //read file
        Scanner read = new Scanner(file);

        //Map
        Map<String, String> map = new HashMap<>();

        String[] line;

        while(read.hasNext())
        {
            //read the entire line and remove quotations and split by comma
            line = read.nextLine().replaceAll("\"", "").split(",");

            //First element in line will be country and second element will be capital
            map.put(line[0], line[1]);
        }

        System.out.print("Enter the country you would like to know the capital of: ");
        String userCountry = kb.nextLine();

        while(!map.containsKey(userCountry))
        {
            System.out.print(userCountry + " is invalid. Enter a valid country: ");
            userCountry = kb.nextLine();
        }

        System.out.println("The capital of " + userCountry + " is " + map.get(userCountry) + "!");
    }
}
